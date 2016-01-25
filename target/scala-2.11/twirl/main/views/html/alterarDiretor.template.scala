
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object alterarDiretor_Scope0 {
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

class alterarDiretor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Diretor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id:Long, diretorForm: Form[Diretor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Alterar Diretor")/*5.25*/{_display_(Seq[Any](format.raw/*5.26*/("""
        """),format.raw/*6.9*/("""<div class="header">
            <ul class="nav nav-pills pull-right">
                <li class="active"><a href="/">Home</a></li>
            </ul>
        </div>
        <h1>Alterar diretor</h1>
        """),_display_(/*12.10*/form(action=routes.DiretorCRUD.alterar(id))/*12.53*/{_display_(Seq[Any](format.raw/*12.54*/("""
            """),format.raw/*13.13*/("""<fieldset>
                """),_display_(/*14.18*/inputText(diretorForm("nome"), '_label -> "Nome do Diretor")),format.raw/*14.78*/("""
            """),format.raw/*15.13*/("""</fieldset>
                <div class="control-group">
                    <div class="actions">
                        <input type="submit" value="Gravar" class="btn btn-primary"/>
                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.DiretorCRUD.lista()),format.raw/*19.61*/("""" class="btn btn-primary">Cancelar</a>
        """)))}),format.raw/*20.10*/("""
                        """),_display_(/*21.26*/form(routes.DiretorCRUD.remover(id))/*21.62*/{_display_(Seq[Any](format.raw/*21.63*/("""
                            """),format.raw/*22.29*/("""<input type="submit" value="Remover esse diretor" class="btn danger"/>
                        """)))}),format.raw/*23.26*/("""
                    """),format.raw/*24.21*/("""</div>
                </div>
""")))}))
      }
    }
  }

  def render(id:Long,diretorForm:Form[Diretor]): play.twirl.api.HtmlFormat.Appendable = apply(id,diretorForm)

  def f:((Long,Form[Diretor]) => play.twirl.api.HtmlFormat.Appendable) = (id,diretorForm) => apply(id,diretorForm)

  def ref: this.type = this

}


}

/**/
object alterarDiretor extends alterarDiretor_Scope0.alterarDiretor
              /*
                  -- GENERATED --
                  DATE: Fri Jan 22 15:58:37 COT 2016
                  SOURCE: F:/play-2.4.6/play-java/app/views/alterarDiretor.scala.html
                  HASH: 4d3f63057de4c9fe697ddafee5ab35c6b69e7396
                  MATRIX: 775->1|922->38|950->57|977->59|1008->82|1046->83|1081->92|1315->299|1367->342|1406->343|1447->356|1502->384|1583->444|1624->457|1869->675|1884->681|1925->701|2004->749|2057->775|2102->811|2141->812|2198->841|2325->937|2374->958
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|42->12|42->12|42->12|43->13|44->14|44->14|45->15|49->19|49->19|49->19|50->20|51->21|51->21|51->21|52->22|53->23|54->24
                  -- GENERATED --
              */
          