
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object novoDiretor_Scope0 {
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

class novoDiretor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Diretor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(diretorForm: Form[Diretor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Novo Diretor")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="header">
            <ul class="nav nav-pills pull-right">
                <li class="active"><a href="/">Home</a></li>
            </ul>
        </div>
        """),_display_(/*10.10*/helper/*10.16*/.form(action = routes.DiretorCRUD.gravar())/*10.59*/{_display_(Seq[Any](format.raw/*10.60*/("""
            """),format.raw/*11.13*/("""<form class="form-horizontal">
                <fieldset>
                    <legend>Novo Diretor</legend>
                </fieldset>
                    <div class="control-group">
                        <div class="controls">
                            """),_display_(/*17.30*/helper/*17.36*/.inputText(diretorForm("Nome"))),format.raw/*17.67*/("""
                                """),format.raw/*18.33*/("""<p class="help-block">Informe o nome do diretor</p>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="singlebutton"></label>
                        <div class="controls">
                            <button id="singilebutton" name="singlegutton" class="btn btn-primary">Gravar</button>
                        </div>
                    </div>
            </form>
        """)))}),format.raw/*28.10*/("""
    """),format.raw/*29.5*/("""</div>
""")))}))
      }
    }
  }

  def render(diretorForm:Form[Diretor]): play.twirl.api.HtmlFormat.Appendable = apply(diretorForm)

  def f:((Form[Diretor]) => play.twirl.api.HtmlFormat.Appendable) = (diretorForm) => apply(diretorForm)

  def ref: this.type = this

}


}

/**/
object novoDiretor extends novoDiretor_Scope0.novoDiretor
              /*
                  -- GENERATED --
                  DATE: Fri Jan 22 14:21:44 COT 2016
                  SOURCE: F:/play-2.4.6/play-java/app/views/novoDiretor.scala.html
                  HASH: dedd1ab36e3c2c1ff3a96e818dd349304d8feda0
                  MATRIX: 764->1|887->29|915->32|943->52|981->53|1012->58|1245->264|1260->270|1312->313|1351->314|1392->327|1679->587|1694->593|1746->624|1807->657|2326->1145|2358->1150
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|41->10|41->10|41->10|41->10|42->11|48->17|48->17|48->17|49->18|59->28|60->29
                  -- GENERATED --
              */
          