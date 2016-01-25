
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/play-2.4.6/play-java/conf/routes
// @DATE:Mon Jan 25 08:35:14 COT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Inicio_3: controllers.Inicio,
  // @LINE:8
  Application_1: controllers.Application,
  // @LINE:10
  DiretorCRUD_2: controllers.DiretorCRUD,
  // @LINE:19
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Inicio_3: controllers.Inicio,
    // @LINE:8
    Application_1: controllers.Application,
    // @LINE:10
    DiretorCRUD_2: controllers.DiretorCRUD,
    // @LINE:19
    Assets_0: controllers.Assets
  ) = this(errorHandler, Inicio_3, Application_1, DiretorCRUD_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Inicio_3, Application_1, DiretorCRUD_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Inicio.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sobre""", """controllers.Application.sobre()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """play""", """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """diretores""", """controllers.DiretorCRUD.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """diretor/novo""", """controllers.DiretorCRUD.novoDiretor()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>""", """controllers.DiretorCRUD.detalhar(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>""", """controllers.DiretorCRUD.alterar(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """diretor/$id<[^/]+>/remover""", """controllers.DiretorCRUD.remover(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """diretor/""", """controllers.DiretorCRUD.gravar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Inicio_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Inicio_index0_invoker = createInvoker(
    Inicio_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Inicio",
      "index",
      Nil,
      "GET",
      """ Home page
GET     /                            controllers.Application.index()""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_sobre1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sobre")))
  )
  private[this] lazy val controllers_Application_sobre1_invoker = createInvoker(
    Application_1.sobre(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sobre",
      Nil,
      "GET",
      """""",
      this.prefix + """sobre"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("play")))
  )
  private[this] lazy val controllers_Application_index2_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """play"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_DiretorCRUD_lista3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("diretores")))
  )
  private[this] lazy val controllers_DiretorCRUD_lista3_invoker = createInvoker(
    DiretorCRUD_2.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiretorCRUD",
      "lista",
      Nil,
      "GET",
      """""",
      this.prefix + """diretores"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_DiretorCRUD_novoDiretor4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("diretor/novo")))
  )
  private[this] lazy val controllers_DiretorCRUD_novoDiretor4_invoker = createInvoker(
    DiretorCRUD_2.novoDiretor(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiretorCRUD",
      "novoDiretor",
      Nil,
      "GET",
      """""",
      this.prefix + """diretor/novo"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DiretorCRUD_detalhar5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("diretor/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiretorCRUD_detalhar5_invoker = createInvoker(
    DiretorCRUD_2.detalhar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiretorCRUD",
      "detalhar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """diretor/$id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_DiretorCRUD_alterar6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("diretor/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiretorCRUD_alterar6_invoker = createInvoker(
    DiretorCRUD_2.alterar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiretorCRUD",
      "alterar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """diretor/$id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DiretorCRUD_remover7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("diretor/"), DynamicPart("id", """[^/]+""",true), StaticPart("/remover")))
  )
  private[this] lazy val controllers_DiretorCRUD_remover7_invoker = createInvoker(
    DiretorCRUD_2.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiretorCRUD",
      "remover",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """diretor/$id<[^/]+>/remover"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_DiretorCRUD_gravar8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("diretor/")))
  )
  private[this] lazy val controllers_DiretorCRUD_gravar8_invoker = createInvoker(
    DiretorCRUD_2.gravar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiretorCRUD",
      "gravar",
      Nil,
      "POST",
      """""",
      this.prefix + """diretor/"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Inicio_index0_route(params) =>
      call { 
        controllers_Inicio_index0_invoker.call(Inicio_3.index())
      }
  
    // @LINE:8
    case controllers_Application_sobre1_route(params) =>
      call { 
        controllers_Application_sobre1_invoker.call(Application_1.sobre())
      }
  
    // @LINE:9
    case controllers_Application_index2_route(params) =>
      call { 
        controllers_Application_index2_invoker.call(Application_1.index())
      }
  
    // @LINE:10
    case controllers_DiretorCRUD_lista3_route(params) =>
      call { 
        controllers_DiretorCRUD_lista3_invoker.call(DiretorCRUD_2.lista())
      }
  
    // @LINE:11
    case controllers_DiretorCRUD_novoDiretor4_route(params) =>
      call { 
        controllers_DiretorCRUD_novoDiretor4_invoker.call(DiretorCRUD_2.novoDiretor())
      }
  
    // @LINE:12
    case controllers_DiretorCRUD_detalhar5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiretorCRUD_detalhar5_invoker.call(DiretorCRUD_2.detalhar(id))
      }
  
    // @LINE:13
    case controllers_DiretorCRUD_alterar6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiretorCRUD_alterar6_invoker.call(DiretorCRUD_2.alterar(id))
      }
  
    // @LINE:14
    case controllers_DiretorCRUD_remover7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiretorCRUD_remover7_invoker.call(DiretorCRUD_2.remover(id))
      }
  
    // @LINE:15
    case controllers_DiretorCRUD_gravar8_route(params) =>
      call { 
        controllers_DiretorCRUD_gravar8_invoker.call(DiretorCRUD_2.gravar())
      }
  
    // @LINE:19
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_0.versioned(path, file))
      }
  }
}