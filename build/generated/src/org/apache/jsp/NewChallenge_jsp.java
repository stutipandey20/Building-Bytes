package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class NewChallenge_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t    <LINK REL=STYLESHEET type=text/CSS href=css/c_article_style.css>\r\n");
      out.write("           \r\n");
      out.write("\t\t<link rel=stylesheet href=bootstrap.css>\r\n");
      out.write("                <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<div class=\"topnav\" align=center width=100% class=\"table1\" >\r\n");
      out.write("                          <table border=0 width=100% >\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("                                           <td>\r\n");
      out.write("                                                    <h1 >BUILDING BYTES</h1>\r\n");
      out.write("                                                    <h3 > Explore | Learn | Share</h3>\r\n");
      out.write("                                           </td>\r\n");
      out.write("                                           <td>\r\n");
      out.write("                                              <div class=\"box\">\r\n");
      out.write("                                                   <a href=\"SAfterLogin.jsp\" class=\"btn btn4\">Home</a>\r\n");
      out.write("\t\t\t<a href=\"Study.jsp\" class=\"btn btn1\">E-BOOKS</a>\r\n");
      out.write("                                                    <a href=\"LectureVideos.jsp\" class=\"btn btn2\">Lecture Videos</a>\r\n");
      out.write("\t\t\t<a href=\"Secell.jsp\" class=\"btn btn3\">E-cell</a>\r\n");
      out.write("\t\t\t<a href=\"SAccount.jsp\" class=\"btn btn4\">My account</a>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                           </td>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                          </table>\r\n");
      out.write("          </div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("               <div class=\"row\">\r\n");
      out.write("  <div class=\"leftcolumn\">\r\n");
      out.write("      <br>\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "buildingbytes";
String userId = "root";
String password = "password";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write('\r');
      out.write('\n');

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement(); 
      out.write('\r');
      out.write('\n');

String idd= session.getAttribute("idd").toString();
String sql ="(SELECT article FROM ArticlesPosted )" ;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\r\n");
      out.write("<div class=\"card1\">\r\n");
      out.print(resultSet.getString("Idea")

);
      out.write("\r\n");
      out.write("</div>\r\n");
 
}
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("     .post\r\n");
      out.write("    {\r\n");
      out.write("        font-family: Palantino Linotype;\r\n");
      out.write("        color:black;\r\n");
      out.write("        font-size: 17px;\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    .txta1\r\n");
      out.write("    {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        background-color: white;\r\n");
      out.write("        border-color: 2px solid #d9b3ff;\r\n");
      out.write("        font-family: Palantino Linotype;\r\n");
      out.write("        color:black;\r\n");
      out.write("        font-size: 17px;\r\n");
      out.write("        padding:3px;\r\n");
      out.write("        height:40px;\r\n");
      out.write("        margin:5px;\r\n");
      out.write("        margin-left: 275px;\r\n");
      out.write("        width:400px;\r\n");
      out.write("    }\r\n");
      out.write("    .txta1:hover\r\n");
      out.write("    {\r\n");
      out.write("        background-color: #d9b3ff;\r\n");
      out.write("        color:black;\r\n");
      out.write("    }\r\n");
      out.write("    .txta2\r\n");
      out.write("    {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        font-family: Palantino Linotype;\r\n");
      out.write("        color:black;\r\n");
      out.write("        font-size: 17px;\r\n");
      out.write("        margin:8px;\r\n");
      out.write("        height:150px;\r\n");
      out.write("    }\r\n");
      out.write("    .txta2:hover\r\n");
      out.write("    {\r\n");
      out.write("        background-color: #d9b3ff;\r\n");
      out.write("        color:black;\r\n");
      out.write("    }\r\n");
      out.write("    .postbtn\r\n");
      out.write("    {\r\n");
      out.write("        color:black;\r\n");
      out.write("        background-color: #d9b3ff;\r\n");
      out.write("        font-family: Palantino Linotype;\r\n");
      out.write("        width:100px;\r\n");
      out.write("        height:50px;\r\n");
      out.write("        padding:10px;\r\n");
      out.write("        border-right: 5px;\r\n");
      out.write("        font-size: 20px;\r\n");
      out.write("        margin:5px;\r\n");
      out.write("        margin-left: 380px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("    .postbtn:hover\r\n");
      out.write("    {\r\n");
      out.write("        color:#d9b3ff;\r\n");
      out.write("        background-color: black;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"onlyarti\">\r\n");
      out.write("   \r\n");
      out.write("        ");

            try{

String sql ="select * from challenges_posted";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\r\n");
      out.write(" <div class=\"box\">\r\n");
      out.write("    <div class=\"icon\">");
      out.print(resultSet.getString("Name") );
      out.write("</div>\r\n");
      out.write("    <div class=\"arti_block\">\r\n");
      out.write("<h2>");
      out.print(resultSet.getString("Topic") );
      out.write("</h2>\r\n");
      out.write("<p>");
      out.print(resultSet.getString("Challenge") );
      out.write("</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>      \r\n");
      out.write("            ");

}
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\r\n");
      out.write("          \r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("   </div>\r\n");
      out.write("<div class=\"heha\">\r\n");
      out.write("         <div class=\"ads_column\">\r\n");
      out.write("    </div>  \r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<table  width=100% height=10% border=0 >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td><a href=\"AboutUs.jsp\" class=\"btn btn1\">ABOUT US</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"Contact.jsp\" class=\"btn btn2\">CONTACT US</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"Feedback.jsp\" class=\"btn btn3\">FEEDBACK</a></td>\r\n");
      out.write("\t\t\t\t<td> <a href=\"Privacy.jsp\" class=\"btn btn4\">PRIVACY POLICY</a></td>\t\r\n");
      out.write("                        </tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("            </div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("\t\tbackground-color:black;\r\n");
      out.write("\t\tmargin:0;\r\n");
      out.write("                overflow-x: hidden;\r\n");
      out.write("\t}\r\n");
      out.write("\t.p1{\r\n");
      out.write("\t\ttext-align:left;\r\n");
      out.write("\t\tpadding:0px;\r\n");
      out.write("\t\tmargin:0px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.p2{\r\n");
      out.write("\t\ttext-align:left;\r\n");
      out.write("\t\tpadding:0px;\r\n");
      out.write("\t\tmargin-top:-10px;\r\n");
      out.write("\t\tmargin-left:10px;\r\n");
      out.write("\t\tfont-family:Palantino Linotype;\r\n");
      out.write("\t}\r\n");
      out.write("        .topnav button\r\n");
      out.write("{\r\n");
      out.write("  float: revert;\r\n");
      out.write("  cursor:pointer;\r\n");
      out.write("\tmargin-top:-49px;\r\n");
      out.write("\tmargin-left: -5px;\r\n");
      out.write("  width:20px;\r\n");
      out.write("  padding:20px;\r\n");
      out.write("  border: 2px solid grey;\r\n");
      out.write("  border-left: none;\r\n");
      out.write("\t border-radius: 0px 10 10 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav\r\n");
      out.write("{  width:100%;\r\n");
      out.write("   padding-top: 0px;\r\n");
      out.write("   margin-top:0;\r\n");
      out.write("   background-color: #d9b3ff;\r\n");
      out.write("   border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write(".box{\r\n");
      out.write(" \ttransform:translate(20%,20%);\r\n");
      out.write(" }\r\n");
      out.write(" .btn{color:black;\r\n");
      out.write("                    position:relative;\r\n");
      out.write("\tfont-size:18px;\r\n");
      out.write("\tfont-family: Palantino Linotype;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("\tmargin:20px ;\r\n");
      out.write("\tpadding:15px;\r\n");
      out.write("\ttext-transform:uppercase;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("\ttransition:1s all ease;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write(" }\r\n");
      out.write(" .btn:hover\r\n");
      out.write(" {\r\n");
      out.write("     background-color: black;\r\n");
      out.write("     color:#d9b3ff;\r\n");
      out.write(" }\r\n");
      out.write(" .btn::before{\r\n");
      out.write("    \t background:black;\r\n");
      out.write("\t     content:\"\";\r\n");
      out.write("       position:absolute;\r\n");
      out.write("       top:0%;\r\n");
      out.write("       left:0%;\r\n");
      out.write("       bottom:0%;\r\n");
      out.write("      right:0%;\r\n");
      out.write("      opacity: 0.4;\r\n");
      out.write("     z-index:-1;\r\n");
      out.write("\ttransition: all 0.6s ease;\r\n");
      out.write("\t}\r\n");
      out.write(" .btn1::before{\r\n");
      out.write("  \twidth:0px;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("}\r\n");
      out.write(".btn1:hover::before{\r\n");
      out.write(" width:100%;\r\n");
      out.write("}\r\n");
      out.write(".btn2::before{\r\n");
      out.write(" width:100%;\r\n");
      out.write(" height:0;\r\n");
      out.write("}\r\n");
      out.write(".btn2:hover::before{\r\n");
      out.write(" height:100%;\r\n");
      out.write(" }\r\n");
      out.write(".btn3::before{\r\n");
      out.write("width:0px;\r\n");
      out.write(" height:100%;\r\n");
      out.write("}\r\n");
      out.write(".btn3:hover::before{\r\n");
      out.write("width:100%;\r\n");
      out.write(" }\r\n");
      out.write(".btn4::before{\r\n");
      out.write(" width:100%;\r\n");
      out.write(" height:0;\r\n");
      out.write("}\r\n");
      out.write(".btn4:hover::before{\r\n");
      out.write(" height:100%;\r\n");
      out.write(" }\r\n");
      out.write(" .btn5::before{\r\n");
      out.write(" width:0px;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("}\r\n");
      out.write(".btn5:hover::before{\r\n");
      out.write("width:100%;\r\n");
      out.write(" }\r\n");
      out.write(".footer{\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    margin-bottom:20px;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    background-color:#d9b3ff;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    color:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover\r\n");
      out.write("    {\r\n");
      out.write("       text-decoration:underline;\r\n");
      out.write("      border-radius:5px;\r\n");
      out.write("    }\r\n");
      out.write(" *\r\n");
      out.write("    {\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("    }\r\n");
      out.write("\t.list1\r\n");
      out.write("{\r\n");
      out.write("    font-family: Palantino Linotype;\r\n");
      out.write("    font-size:20px;\r\n");
      out.write("    color:black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rightcolumn {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 25%;\r\n");
      out.write("  padding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Fake image */\r\n");
      out.write(".fakeimg {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  padding: 20px;\r\n");
      out.write("}\r\n");
      out.write(".query{\r\n");
      out.write("\tbackground-color:lightgrey;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row:after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: table;\r\n");
      out.write("  clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 800px) {\r\n");
      out.write("  .container, .rightcolumn {   \r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 400px) {\r\n");
      out.write("  .topnav a {\r\n");
      out.write("    float: none;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(".heha{\r\n");
      out.write("      margin-top:10%;\r\n");
      out.write("}\r\n");
      out.write(".ads_column{\r\n");
      out.write("width:400px;\r\n");
      out.write("height:550px;\r\n");
      out.write("right:3%;\r\n");
      out.write("position:absolute;\r\n");
      out.write("tranform:translate(-50%,-50%);\r\n");
      out.write("\r\n");
      out.write("background-size:100% 100%;\r\n");
      out.write("box-shadow:1px 2px 10px 6px white;\r\n");
      out.write("animation:slider 18s infinite linear;\r\n");
      out.write("}\r\n");
      out.write("@keyframes slider{\r\n");
      out.write("      0% { background-image: url(images/pic1.jpg); \r\n");
      out.write("\t        background-size:100% 100%;\r\n");
      out.write("\t  }\r\n");
      out.write("    15%{background-image: url(images/pic2.jpg);\r\n");
      out.write("\t        background-size:100% 100%;\r\n");
      out.write("\t  }\r\n");
      out.write("    35%{background-image: url(images/Slide3.JPG);\r\n");
      out.write("\t        background-size:100% 100%;\r\n");
      out.write("          }\r\n");
      out.write("\t50%{background-image: url(images/Slide4.JPG); \r\n");
      out.write("\t        background-size:100% 100%;\r\n");
      out.write("        }\r\n");
      out.write("\t65%{background-image: url(images/pic4.png);\r\n");
      out.write("\t        background-size:100% 100%;\r\n");
      out.write("        }\r\n");
      out.write("\t85%{background-image: url(images/pic8.jpg);\r\n");
      out.write("\t        background-size:100% 100%;\r\n");
      out.write("        }\r\n");
      out.write("\t 100%{background-image: url(images/Slide7.JPG);\r\n");
      out.write("\t        background-size:100% 100%;\r\n");
      out.write("         } \t\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
