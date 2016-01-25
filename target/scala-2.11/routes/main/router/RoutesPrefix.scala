
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/play-2.4.6/play-java/conf/routes
// @DATE:Mon Jan 25 08:35:14 COT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
