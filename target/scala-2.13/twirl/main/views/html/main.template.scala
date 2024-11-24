
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*8.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*13.58*/("""
    """),format.raw/*14.5*/("""<title>"""),_display_(/*14.13*/title),format.raw/*14.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("images/favicon.png")),format.raw/*16.100*/("""">
</head>
<body>
"""),format.raw/*20.23*/("""
"""),_display_(/*21.2*/content),format.raw/*21.9*/("""

"""),format.raw/*23.1*/("""<script src=""""),_display_(/*23.15*/routes/*23.21*/.Assets.versioned("javascripts/main.js")),format.raw/*23.61*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 1a7842294720f1e6b178e43038e4af3ab0d71b39
                  MATRIX: 1160->256|1284->287|1312->288|1384->385|1416->390|1451->398|1477->403|1562->461|1577->467|1639->508|1723->565|1738->571|1799->610|1845->709|1873->711|1900->718|1929->720|1970->734|1985->740|2046->780
                  LINES: 32->8|37->9|38->10|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|47->20|48->21|48->21|50->23|50->23|50->23|50->23
                  -- GENERATED --
              */
          