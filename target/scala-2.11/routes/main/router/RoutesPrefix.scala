
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chaoqunzhu/Documents/webserver/workspace/firsttry/conf/routes
// @DATE:Tue Jul 21 23:48:53 PDT 2015


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
