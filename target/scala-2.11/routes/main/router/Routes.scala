
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chaoqunzhu/Documents/webserver/workspace/firsttry/conf/routes
// @DATE:Tue Jul 21 23:48:53 PDT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:7
  Services_2: controllers.Services,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:7
    Services_2: controllers.Services,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Services_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Services_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services""", """controllers.Services.list()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services/new""", """controllers.Services.addService()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services""", """controllers.Services.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services/$code<[^/]+>""", """controllers.Services.info(code:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """services/$code<[^/]+>""", """controllers.Services.delete(code:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Napa""", """controllers.Application.index2()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Services_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services")))
  )
  private[this] lazy val controllers_Services_list1_invoker = createInvoker(
    Services_2.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Services",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """services"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Services_addService2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services/new")))
  )
  private[this] lazy val controllers_Services_addService2_invoker = createInvoker(
    Services_2.addService(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Services",
      "addService",
      Nil,
      "GET",
      """""",
      this.prefix + """services/new"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Services_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services")))
  )
  private[this] lazy val controllers_Services_save3_invoker = createInvoker(
    Services_2.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Services",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """services"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Services_info4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services/"), DynamicPart("code", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Services_info4_invoker = createInvoker(
    Services_2.info(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Services",
      "info",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """services/$code<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Services_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("services/"), DynamicPart("code", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Services_delete5_invoker = createInvoker(
    Services_2.delete(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Services",
      "delete",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """services/$code<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_Application_index27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Napa")))
  )
  private[this] lazy val controllers_Application_index27_invoker = createInvoker(
    Application_1.index2(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index2",
      Nil,
      "GET",
      """""",
      this.prefix + """Napa"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:7
    case controllers_Services_list1_route(params) =>
      call { 
        controllers_Services_list1_invoker.call(Services_2.list())
      }
  
    // @LINE:8
    case controllers_Services_addService2_route(params) =>
      call { 
        controllers_Services_addService2_invoker.call(Services_2.addService())
      }
  
    // @LINE:9
    case controllers_Services_save3_route(params) =>
      call { 
        controllers_Services_save3_invoker.call(Services_2.save())
      }
  
    // @LINE:10
    case controllers_Services_info4_route(params) =>
      call(params.fromPath[String]("code", None)) { (code) =>
        controllers_Services_info4_invoker.call(Services_2.info(code))
      }
  
    // @LINE:11
    case controllers_Services_delete5_route(params) =>
      call(params.fromPath[String]("code", None)) { (code) =>
        controllers_Services_delete5_invoker.call(Services_2.delete(code))
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_Application_index27_route(params) =>
      call { 
        controllers_Application_index27_invoker.call(Application_1.index2())
      }
  }
}