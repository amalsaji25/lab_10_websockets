package controllers;

import actors.TimeActor;
import actors.UserActor;
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import com.google.inject.Inject;
import play.libs.streams.ActorFlow;
import play.mvc.*;
import views.html.index;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    @Inject private ActorSystem actorSystem;
    @Inject private Materializer materializer;

    @Inject
    public HomeController(ActorSystem actorSystem){
        actorSystem.actorOf(TimeActor.getProps(),"timeActor");
    }

//    public Result index(Http.Request request){
//        return ok(index.render(request));
//    }

    public Result index(){
        return ok(views.html.index.render());
    }

    public WebSocket ws(){
        return WebSocket.Json.accept(request -> ActorFlow.actorRef(UserActor::getProps, actorSystem, materializer));
    }

}
