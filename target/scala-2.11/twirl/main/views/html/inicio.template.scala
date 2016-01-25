
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inicio_Scope0 {
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

class inicio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Top 100 filmes Cult")/*1.29*/ {_display_(Seq[Any](format.raw/*1.31*/("""

    """),format.raw/*3.5*/("""<style>
        body"""),format.raw/*4.13*/("""{"""),format.raw/*4.14*/("""
            """),format.raw/*5.13*/("""padding-top:50px;
        """),format.raw/*6.9*/("""}"""),format.raw/*6.10*/("""
        """),format.raw/*7.9*/(""".starter-template"""),format.raw/*7.26*/("""{"""),format.raw/*7.27*/("""
            """),format.raw/*8.13*/("""padding:40px 15px;
            text-align: center;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
    """),format.raw/*11.5*/("""</style>
    </head>
        <body>
            <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle"></button>
                    <a class="navbar-brand" href="/">Top 100 filmes Cult</a>
                </div>
                <div class="cllapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="/diretores">Diretores</a></li>
                        <li><a href="/sobre">Sobre o sistema</a></li>
                        <li><a href="/play">Sobre o Play Framework</a></li>
                        <li><a href="http://getbootstrap.com/">Sobre o Bootstrap</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="container">
            <h1>Top 100 filmes Cult</h1>
        <p class="lead">O melhor do cinema est&aacute; aqui !</p>
        </div>
    
""")))}),format.raw/*35.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object inicio extends inicio_Scope0.inicio
              /*
                  -- GENERATED --
                  DATE: Fri Jan 22 14:42:44 COT 2016
                  SOURCE: F:/play-2.4.6/play-java/app/views/inicio.scala.html
                  HASH: 0d232298594fc1a73accb7185ea46dcc05a06065
                  MATRIX: 829->1|864->28|903->30|935->36|982->56|1010->57|1050->70|1102->96|1130->97|1165->106|1209->123|1237->124|1277->137|1363->196|1392->197|1424->202|2458->1206
                  LINES: 32->1|32->1|32->1|34->3|35->4|35->4|36->5|37->6|37->6|38->7|38->7|38->7|39->8|41->10|41->10|42->11|66->35
                  -- GENERATED --
              */
          