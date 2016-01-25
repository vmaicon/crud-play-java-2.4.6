
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/play-2.4.6/play-java/conf/routes
// @DATE:Mon Jan 25 08:35:14 COT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseInicio(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Inicio.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseDiretorCRUD(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def alterar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiretorCRUD.alterar",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:11
    def novoDiretor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiretorCRUD.novoDiretor",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/novo"})
        }
      """
    )
  
    // @LINE:15
    def gravar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiretorCRUD.gravar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/"})
        }
      """
    )
  
    // @LINE:14
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiretorCRUD.remover",
      """
        function(id) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/remover"})
        }
      """
    )
  
    // @LINE:10
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiretorCRUD.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretores"})
        }
      """
    )
  
    // @LINE:12
    def detalhar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiretorCRUD.detalhar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "diretor/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def sobre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.sobre",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sobre"})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play"})
        }
      """
    )
  
  }


}