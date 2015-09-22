
package views.html.services

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Service],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(services: List[Service]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Chaoqun Services")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),format.raw/*4.5*/("""<h2>All Services</h2>
    <script>
        function del(delUrl) """),format.raw/*6.30*/("""{"""),format.raw/*6.31*/("""
        """),format.raw/*7.9*/("""$.ajax( """),format.raw/*7.17*/("""{"""),format.raw/*7.18*/("""
            """),format.raw/*8.13*/("""url: delUrl,
            type: 'DELETE',
            success: function(results) """),format.raw/*10.40*/("""{"""),format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""location.reload();
            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/(""" """),format.raw/*13.11*/(""");
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""
    """),format.raw/*15.5*/("""</script>
    <table>
        <thead>
            <tr>
                <th>Code</th>
                <th>Description</th>
                <th>Amount</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*25.14*/for(service <- services) yield /*25.38*/ {_display_(Seq[Any](format.raw/*25.40*/("""
                """),format.raw/*26.17*/("""<tr>
                    <td><a href=""""),_display_(/*27.35*/routes/*27.41*/.Services.info(service.code)),format.raw/*27.69*/("""">"""),_display_(/*27.72*/service/*27.79*/.code),format.raw/*27.84*/("""</a></td>
                    <td>"""),_display_(/*28.26*/service/*28.33*/.description),format.raw/*28.45*/("""</td>
                    <td>"""),_display_(/*29.26*/service/*29.33*/.amount),format.raw/*29.40*/("""</td>
                    <td><button onclick="window.location='"""),_display_(/*30.60*/routes/*30.66*/.Services.info(service.code)),format.raw/*30.94*/("""';" value="edit">Edit</button> </td>
                    <td><button onclick="del('"""),_display_(/*31.48*/routes/*31.54*/.Services.delete(service.code)),format.raw/*31.84*/("""');" value="delete">Delete</button> </td>
                </tr>
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</tbody>
    </table>
    <button onclick="window.location='"""),_display_(/*36.40*/routes/*36.46*/.Services.addService()),format.raw/*36.68*/("""';" value="add">Add new service</button>
""")))}))
      }
    }
  }

  def render(services:List[Service]): play.twirl.api.HtmlFormat.Appendable = apply(services)

  def f:((List[Service]) => play.twirl.api.HtmlFormat.Appendable) = (services) => apply(services)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Tue Jul 21 23:48:53 PDT 2015
                  SOURCE: /Users/chaoqunzhu/Documents/webserver/workspace/firsttry/app/views/services/list.scala.html
                  HASH: 0a6e5639ba74c40b67225d80213f7993b8f60a21
                  MATRIX: 759->1|879->26|907->29|939->53|978->55|1009->60|1100->124|1128->125|1163->134|1198->142|1226->143|1266->156|1374->236|1403->237|1444->250|1503->281|1532->282|1568->291|1597->292|1626->293|1664->304|1693->305|1725->310|1970->528|2010->552|2050->554|2095->571|2161->610|2176->616|2225->644|2255->647|2271->654|2297->659|2359->694|2375->701|2408->713|2466->744|2482->751|2510->758|2602->823|2617->829|2666->857|2777->941|2792->947|2843->977|2951->1054|2987->1063|3075->1124|3090->1130|3133->1152
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|38->7|38->7|38->7|39->8|41->10|41->10|42->11|43->12|43->12|44->13|44->13|44->13|45->14|45->14|46->15|56->25|56->25|56->25|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|64->33|65->34|67->36|67->36|67->36
                  -- GENERATED --
              */
          