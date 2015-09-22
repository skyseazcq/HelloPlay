
package views.html.services

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object info_Scope0 {
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

class info extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Service],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(serviceForm : Form[Service]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Service Information")/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""
    """),format.raw/*5.5*/("""<h1>Service Information</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.Services.save())/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""
        """),format.raw/*7.9*/("""<fieldset>
            <legend>Service ("""),_display_(/*8.31*/serviceForm/*8.42*/.field("description").valueOr("Adding")),format.raw/*8.81*/(""")</legend>
            """),_display_(/*9.14*/helper/*9.20*/.inputText(serviceForm.field("code"), '_label -> "Code")),format.raw/*9.76*/("""
            """),_display_(/*10.14*/helper/*10.20*/.textarea(serviceForm.field("description"), '_label -> "Description")),format.raw/*10.89*/("""
            """),_display_(/*11.14*/helper/*11.20*/.inputText(serviceForm.field("amount"), '_label -> "Amount")),format.raw/*11.80*/("""
        """),format.raw/*12.9*/("""</fieldset>
        <input type="submit" value="Save"/>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""<button onclick="window.location='"""),_display_(/*15.40*/routes/*15.46*/.Services.list()),format.raw/*15.62*/("""';" value="cancel">Cancel</button>
""")))}))
      }
    }
  }

  def render(serviceForm:Form[Service]): play.twirl.api.HtmlFormat.Appendable = apply(serviceForm)

  def f:((Form[Service]) => play.twirl.api.HtmlFormat.Appendable) = (serviceForm) => apply(serviceForm)

  def ref: this.type = this

}


}

/**/
object info extends info_Scope0.info
              /*
                  -- GENERATED --
                  DATE: Tue Jul 21 23:10:04 PDT 2015
                  SOURCE: /Users/chaoqunzhu/Documents/webserver/workspace/firsttry/app/views/services/info.scala.html
                  HASH: 864d383f8a4f80eab55de0f14382c5bf5766789c
                  MATRIX: 759->1|898->30|925->48|952->50|987->77|1026->79|1057->84|1116->118|1130->124|1176->162|1215->164|1250->173|1317->214|1336->225|1395->264|1445->288|1459->294|1535->350|1576->364|1591->370|1681->439|1722->453|1737->459|1818->519|1854->528|1945->589|1977->594|2039->629|2054->635|2091->651
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|36->6|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|44->14|45->15|45->15|45->15|45->15
                  -- GENERATED --
              */
          