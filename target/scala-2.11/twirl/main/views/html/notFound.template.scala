
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notFound_Scope0 {
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

class notFound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main("Pagina não encontrada")/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""
        """),format.raw/*4.9*/("""<h1>Opps!!!, página não encontrada """),_display_(/*4.45*/url),format.raw/*4.48*/("""</h1>
        <p class="lead"><a href="/">Inicio</a></p>
""")))}))
      }
    }
  }

  def render(url:String): play.twirl.api.HtmlFormat.Appendable = apply(url)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (url) => apply(url)

  def ref: this.type = this

}


}

/**/
object notFound extends notFound_Scope0.notFound
              /*
                  -- GENERATED --
                  DATE: Fri Jan 22 14:16:24 COT 2016
                  SOURCE: F:/play-2.4.6/play-java/app/views/notFound.scala.html
                  HASH: a46edfe1d3d1b2dc2ccd43493065b4e416fd4d4c
                  MATRIX: 751->1|858->13|886->16|923->45|961->46|996->55|1058->91|1081->94
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4
                  -- GENERATED --
              */
          