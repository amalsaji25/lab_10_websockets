package actors;

import akka.actor.AbstractActorWithTimers;
import akka.actor.ActorRef;
import akka.actor.Props;
import scala.concurrent.duration.Duration;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TimeActor extends AbstractActorWithTimers {

    private static final class Tick{ }
    public static class RegisterMsg{ }

    private final Set<ActorRef> userActors = new HashSet<>();

    @Override
    public void preStart(){
        getTimers().startPeriodicTimer("Timer",new Tick(), Duration.create(5, TimeUnit.SECONDS));
    }

    public static Props getProps(){
        return Props.create(TimeActor.class);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(RegisterMsg.class, msg -> userActors.add(sender()))
                .match(Tick.class, msg -> notifyClients())
                .build();
    }

    private void notifyClients(){
        UserActor.TimeMessage tMsg = new UserActor.TimeMessage(LocalDateTime.now().toString());

        userActors.forEach(ar -> ar.tell(tMsg,self()));
    }
}
