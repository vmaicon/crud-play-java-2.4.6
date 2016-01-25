
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sobre_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class sobre extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sistema: String)(versaoDoPlay: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*6.17*/sistema),format.raw/*6.24*/("""</title>
        <link href=""""),_display_(/*7.22*/routes/*7.28*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*7.80*/("""" rel="stylesheet" media="screen">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortchut icon" type="image/png" href=""""),_display_(/*9.60*/routes/*9.66*/.Assets.versioned("images/favicon.png")),format.raw/*9.105*/("""">
    
        <script 
            src=""""),_display_(/*12.19*/routes/*12.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*12.66*/("""" type="text/javascript">
        </script>
    </head>
    
    <body>
        <div class="container">
            <div class="header">
                <ul class="nav nav-pills pull-right">
                    <li class="active"><a href="/">Home</a></li>
                </ul>
                <h3 class="text-muted">"""),_display_(/*22.41*/sistema),format.raw/*22.48*/("""</h3>
            </div>
            <div class="jumbotron">
                <p><a class="btn btn-lg btn-success" href="#">
                    powered by Play Framework """),_display_(/*26.48*/versaoDoPlay),format.raw/*26.60*/("""
                """),format.raw/*27.17*/("""</a></p>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(sistema:String,versaoDoPlay:String): play.twirl.api.HtmlFormat.Appendable = apply(sistema)(versaoDoPlay)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (sistema) => (versaoDoPlay) => apply(sistema)(versaoDoPlay)

  def ref: this.type = this

}


}

/**/
object sobre extends sobre_Scope0.sobre
              /*
                  -- GENERATED --
                  DATE: Tue Jan 12 15:07:10 COT 2016
                  SOURCE: F:/play-2.4.6/play-java/app/views/sobre.scala.html
                  HASH: 313d03b57c29c6496e3fc15d3c6dd189a72f2226
                  MATRIX: 752->1|886->40|914->42|990->92|1017->99|1073->129|1087->135|1159->187|1273->275|1287->281|1349->322|1437->384|1451->390|1511->429|1581->472|1596->478|1658->519|2003->837|2031->844|2229->1015|2262->1027|2307->1044
                  LINES: 27->1|32->1|34->3|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|43->12|43->12|43->12|53->22|53->22|57->26|57->26|58->27
                  -- GENERATED --
              */
          