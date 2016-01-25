
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object diretor_Scope0 {
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

class diretor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Diretor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(diretores: List[Diretor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/main("Diretores")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
            """),format.raw/*4.13*/("""<div class="header">
                <ul class="nav nav-pills pull-right">
                    <!-- Aqui criamos a rota para o cadastro de novo diretor-->
                    <li class="active"><a href=""""),_display_(/*7.50*/routes/*7.56*/.DiretorCRUD.novoDiretor()),format.raw/*7.82*/("""">Novo Diretor</a></li>
                    <li class="active"><a href="/">Home</a></li>
                </ul>
                <h3 class="text-muted">Diretores</h3>
            </div>
            
            <table class="table table-striped table-bordered" id="example" cellpadding="0" cellspacing="0" border="0" width="100%">
                <tfoot>
                    """),_display_(/*15.22*/for(diretor <- diretores) yield /*15.47*/{_display_(Seq[Any](format.raw/*15.48*/("""
                        """),format.raw/*16.25*/("""<tr>
                            <th><a href=""""),_display_(/*17.43*/routes/*17.49*/.DiretorCRUD.detalhar(diretor.id)),format.raw/*17.82*/("""">"""),_display_(/*17.85*/diretor/*17.92*/.nome),format.raw/*17.97*/("""</a></th>
                        </tr>
                    """)))}),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""</tfoot>
            </table>
""")))}))
      }
    }
  }

  def render(diretores:List[Diretor]): play.twirl.api.HtmlFormat.Appendable = apply(diretores)

  def f:((List[Diretor]) => play.twirl.api.HtmlFormat.Appendable) = (diretores) => apply(diretores)

  def ref: this.type = this

}


}

/**/
object diretor extends diretor_Scope0.diretor
              /*
                  -- GENERATED --
                  DATE: Fri Jan 22 14:17:52 COT 2016
                  SOURCE: F:/play-2.4.6/play-java/app/views/diretor.scala.html
                  HASH: 0a1f80755f5de141f09be745f44e9426e134911e
                  MATRIX: 756->1|877->27|905->30|930->47|968->48|1008->61|1238->265|1252->271|1298->297|1699->671|1740->696|1779->697|1832->722|1906->769|1921->775|1975->808|2005->811|2021->818|2047->823|2139->884|2184->901
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|46->15|46->15|46->15|47->16|48->17|48->17|48->17|48->17|48->17|48->17|50->19|51->20
                  -- GENERATED --
              */
          