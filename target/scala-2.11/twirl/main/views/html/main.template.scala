
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/if(flash.containsKey("sucesso"))/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""
    """),format.raw/*4.5*/("""<div class="alert alert-success">
        """),_display_(/*5.10*/flash/*5.15*/.get("sucesso")),format.raw/*5.30*/("""
    """),format.raw/*6.5*/("""</div>
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/if(flash.containsKey("erro"))/*9.31*/{_display_(Seq[Any](format.raw/*9.32*/("""
    """),format.raw/*10.5*/("""<div class="alert alert-danger">
        """),_display_(/*11.10*/flash/*11.15*/.get("erro")),format.raw/*11.27*/("""
    """),format.raw/*12.5*/("""</div>
""")))}),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*19.17*/title),format.raw/*19.22*/("""</title>
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*20.80*/("""" rel="stylesheet" media="screen">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*22.59*/routes/*22.65*/.Assets.versioned("images/favicon.png")),format.raw/*22.104*/("""">
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*23.70*/("""" type="text/javascript"></script>
    
        <div class="container">
            <div class="starter-template">
                """),_display_(/*27.18*/content),format.raw/*27.25*/("""
            """),format.raw/*28.13*/("""</div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Jan 22 14:42:59 COT 2016
                  SOURCE: F:/play-2.4.6/play-java/app/views/main.scala.html
                  HASH: ba2d918e5cebc81219a4c81e4877a295c517a0fd
                  MATRIX: 748->1|873->31|901->34|941->66|979->67|1010->72|1079->115|1092->120|1127->135|1158->140|1195->148|1223->151|1260->180|1298->181|1330->186|1399->228|1413->233|1446->245|1478->250|1516->258|1545->260|1633->321|1659->326|1716->356|1731->362|1804->414|1919->502|1934->508|1997->549|2085->610|2100->616|2161->655|2213->680|2228->686|2290->727|2449->859|2477->866|2518->879
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|38->7|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|46->15|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|58->27|58->27|59->28
                  -- GENERATED --
              */
          