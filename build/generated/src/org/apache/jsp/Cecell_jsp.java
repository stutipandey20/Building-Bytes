package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Cecell_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t    <LINK REL=STYLESHEET type=text/CSS href=css/c_article_style1.css>\n");
      out.write("           \n");
      out.write("\t\t<link rel=stylesheet href=bootstrap.css>\n");
      out.write("                <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t<div class=\"topnav\" align=center width=100% class=\"table1\" >\n");
      out.write("                          <table border=0 width=100% >\n");
      out.write("\t\t<tr>\n");
      out.write("                                           <td>\n");
      out.write("                                                    <h1 >BUILDING BYTES</h1>\n");
      out.write("                                                    <h3 > Explore | Learn | Share</h3>\n");
      out.write("                                           </td>\n");
      out.write("                                           <td>\n");
      out.write("                                              <div class=\"box\">\n");
      out.write("                                                   <a href=\"CAfterLogin.jsp\" class=\"btn btn4\">Home</a>\n");
      out.write("\t\t\t<a href=\"CJobs.jsp\" class=\"btn btn1\">Job Update</a>\n");
      out.write("                                                    <a href=\"Cchallenges.jsp\" class=\"btn btn2\">Challenge</a>\n");
      out.write("\t\t\t<a href=\"Cecell.jsp\" class=\"btn btn3\">E-cell</a>\n");
      out.write("\t\t\t<a href=\"CAccount.jsp\" class=\"btn btn4\">My account</a>\n");
      out.write("                                            </div>\n");
      out.write("                                           </td>\n");
      out.write("                                  </tr>\n");
      out.write("                          </table>\n");
      out.write("          </div>\n");
      out.write("\t\t\t<div>\n");
      out.write("               <div class=\"row\">\n");
      out.write("  <div class=\"leftcolumn\">\n");
      out.write("      <br>\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

      out.write('\n');

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement(); 
      out.write('\n');

String idd= session.getAttribute("idd").toString();
String sql ="(SELECT article FROM ArticlesPosted )" ;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<div class=\"card1\">\n");
      out.print(resultSet.getString("Idea")

);
      out.write("\n");
      out.write("</div>\n");
 
}
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("<style>\n");
      out.write("     .post\n");
      out.write("    {\n");
      out.write("        font-family: Palantino Linotype;\n");
      out.write("        color:black;\n");
      out.write("        font-size: 17px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .txta1\n");
      out.write("    {\n");
      out.write("        text-align: center;\n");
      out.write("        background-color: white;\n");
      out.write("        border-color: 2px solid #d9b3ff;\n");
      out.write("        font-family: Palantino Linotype;\n");
      out.write("        color:black;\n");
      out.write("        font-size: 17px;\n");
      out.write("        padding:3px;\n");
      out.write("        height:40px;\n");
      out.write("        margin:5px;\n");
      out.write("        margin-left: 275px;\n");
      out.write("        width:400px;\n");
      out.write("    }\n");
      out.write("    .txta1:hover\n");
      out.write("    {\n");
      out.write("        background-color: #d9b3ff;\n");
      out.write("        color:black;\n");
      out.write("    }\n");
      out.write("    .txta2\n");
      out.write("    {\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: Palantino Linotype;\n");
      out.write("        color:black;\n");
      out.write("        font-size: 17px;\n");
      out.write("        margin:8px;\n");
      out.write("        height:150px;\n");
      out.write("    }\n");
      out.write("    .txta2:hover\n");
      out.write("    {\n");
      out.write("        background-color: #d9b3ff;\n");
      out.write("        color:black;\n");
      out.write("    }\n");
      out.write("    .postbtn\n");
      out.write("    {\n");
      out.write("        color:black;\n");
      out.write("        background-color: #d9b3ff;\n");
      out.write("        font-family: Palantino Linotype;\n");
      out.write("        width:100px;\n");
      out.write("        height:50px;\n");
      out.write("        padding:10px;\n");
      out.write("        border-right: 5px;\n");
      out.write("        font-size: 20px;\n");
      out.write("        margin:5px;\n");
      out.write("        margin-left: 380px;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("    .postbtn:hover\n");
      out.write("    {\n");
      out.write("        color:#d9b3ff;\n");
      out.write("        background-color: black;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<div class=\"onlyarti\">\n");
      out.write("   \n");
      out.write("             ");

            try{
int i=0;
String sql ="select * from e_cell";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write(" <div class=\"box\">\n");
      out.write("    <div class=\"icon\">");
      out.print(resultSet.getString("Name") );
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <div class=\"arti_block\">\n");
      out.write("        <h2>");
      out.print(resultSet.getString("Email") );
      out.write("</h2>\n");
      out.write("<h2>");
      out.print(resultSet.getString("Heading") );
      out.write("</h2>\n");
      out.write("<p>");
      out.print(resultSet.getString("Idea") );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("    </div>      \n");
      out.write("            ");

                i++;
}
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("          \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<table  width=100% height=10% border=0 >\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<td><a href=\"AboutUs.jsp\" class=\"btn btn1\">ABOUT US</a></td>\n");
      out.write("\t\t\t\t<td><a href=\"Contact.jsp\" class=\"btn btn2\">CONTACT US</a></td>\n");
      out.write("\t\t\t\t<td><a href=\"Feedback.jsp\" class=\"btn btn3\">FEEDBACK</a></td>\n");
      out.write("\t\t\t\t<td> <a href=\"Privacy.jsp\" class=\"btn btn4\">PRIVACY POLICY</a></td>\t\n");
      out.write("                        </tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</table>\n");
      out.write("            </div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write("\t\tbackground-color:black;\n");
      out.write("\t\tmargin:0;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("\t}\n");
      out.write("\t.p1{\n");
      out.write("\t\ttext-align:left;\n");
      out.write("\t\tpadding:0px;\n");
      out.write("\t\tmargin:0px;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t.p2{\n");
      out.write("\t\ttext-align:left;\n");
      out.write("\t\tpadding:0px;\n");
      out.write("\t\tmargin-top:-10px;\n");
      out.write("\t\tmargin-left:10px;\n");
      out.write("\t\tfont-family:Palantino Linotype;\n");
      out.write("\t}\n");
      out.write("        .topnav button\n");
      out.write("{\n");
      out.write("  float: revert;\n");
      out.write("  cursor:pointer;\n");
      out.write("\tmargin-top:-49px;\n");
      out.write("\tmargin-left: -5px;\n");
      out.write("  width:20px;\n");
      out.write("  padding:20px;\n");
      out.write("  border: 2px solid grey;\n");
      out.write("  border-left: none;\n");
      out.write("\t border-radius: 0px 10 10 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav\n");
      out.write("{  width:100%;\n");
      out.write("   padding-top: 0px;\n");
      out.write("   margin-top:0;\n");
      out.write("   background-color: #d9b3ff;\n");
      out.write("   border-radius: 10px;\n");
      out.write("}\n");
      out.write(".box{\n");
      out.write(" \ttransform:translate(20%,20%);\n");
      out.write(" }\n");
      out.write(" .btn{color:black;\n");
      out.write("                    position:relative;\n");
      out.write("\tfont-size:18px;\n");
      out.write("\tfont-family: Palantino Linotype;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\tmargin:20px ;\n");
      out.write("\tpadding:15px;\n");
      out.write("\ttext-transform:uppercase;\n");
      out.write("\toverflow:hidden;\n");
      out.write("\ttransition:1s all ease;\n");
      out.write("        font-weight: bold;\n");
      out.write(" }\n");
      out.write(" .btn:hover\n");
      out.write(" {\n");
      out.write("     background-color: black;\n");
      out.write("     color:#d9b3ff;\n");
      out.write(" }\n");
      out.write(" .btn::before{\n");
      out.write("    \t background:black;\n");
      out.write("\t     content:\"\";\n");
      out.write("       position:absolute;\n");
      out.write("       top:0%;\n");
      out.write("       left:0%;\n");
      out.write("       bottom:0%;\n");
      out.write("      right:0%;\n");
      out.write("      opacity: 0.4;\n");
      out.write("     z-index:-1;\n");
      out.write("\ttransition: all 0.6s ease;\n");
      out.write("\t}\n");
      out.write(" .btn1::before{\n");
      out.write("  \twidth:0px;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write(".btn1:hover::before{\n");
      out.write(" width:100%;\n");
      out.write("}\n");
      out.write(".btn2::before{\n");
      out.write(" width:100%;\n");
      out.write(" height:0;\n");
      out.write("}\n");
      out.write(".btn2:hover::before{\n");
      out.write(" height:100%;\n");
      out.write(" }\n");
      out.write(".btn3::before{\n");
      out.write("width:0px;\n");
      out.write(" height:100%;\n");
      out.write("}\n");
      out.write(".btn3:hover::before{\n");
      out.write("width:100%;\n");
      out.write(" }\n");
      out.write(".btn4::before{\n");
      out.write(" width:100%;\n");
      out.write(" height:0;\n");
      out.write("}\n");
      out.write(".btn4:hover::before{\n");
      out.write(" height:100%;\n");
      out.write(" }\n");
      out.write(" .btn5::before{\n");
      out.write(" width:0px;\n");
      out.write("\theight:100%;\n");
      out.write("}\n");
      out.write(".btn5:hover::before{\n");
      out.write("width:100%;\n");
      out.write(" }\n");
      out.write(".footer{\n");
      out.write("    padding: 20px;\n");
      out.write("    margin-bottom:20px;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    background-color:#d9b3ff;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    color:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a{\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("a:hover\n");
      out.write("    {\n");
      out.write("       text-decoration:underline;\n");
      out.write("      border-radius:5px;\n");
      out.write("    }\n");
      out.write(" *\n");
      out.write("    {\n");
      out.write("        box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\t.list1\n");
      out.write("{\n");
      out.write("    font-family: Palantino Linotype;\n");
      out.write("    font-size:20px;\n");
      out.write("    color:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".rightcolumn {\n");
      out.write("  float: left;\n");
      out.write("  width: 25%;\n");
      out.write("  padding-left: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fake image */\n");
      out.write(".fakeimg {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write(".query{\n");
      out.write("\tbackground-color:lightgrey;\n");
      out.write("}\n");
      out.write(".row\n");
      out.write("{\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 800px) {\n");
      out.write("  .container, .rightcolumn {   \n");
      out.write("    width: 100%;\n");
      out.write("    padding: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 400px) {\n");
      out.write("  .topnav a {\n");
      out.write("    float: none;\n");
      out.write("    width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(".heha{\n");
      out.write("      margin-top:10%;\n");
      out.write("}\n");
      out.write(".ads_column{\n");
      out.write("width:400px;\n");
      out.write("height:550px;\n");
      out.write("right:3%;\n");
      out.write("position:absolute;\n");
      out.write("tranform:translate(-50%,-50%);\n");
      out.write("\n");
      out.write("background-size:100% 100%;\n");
      out.write("box-shadow:1px 2px 10px 6px white;\n");
      out.write("animation:slider 18s infinite linear;\n");
      out.write("}\n");
      out.write("@keyframes slider{\n");
      out.write("      0% { background-image: url(images/Slide1.JPG); \n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("\t  }\n");
      out.write("    15%{background-image: url(images/Slide2.JPG);\n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("\t  }\n");
      out.write("    35%{background-image: url(images/Slide3.JPG);\n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("          }\n");
      out.write("\t50%{background-image: url(images/Slide4.JPG); \n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("        }\n");
      out.write("\t65%{background-image: url(images/Slide5.png);\n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("        }\n");
      out.write("\t85%{background-image: url(images/Slide6.JPG);\n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("        }\n");
      out.write("\t 100%{background-image: url(images/Slide7.JPG);\n");
      out.write("\t        background-size:100% 100%;\n");
      out.write("         } \t\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
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
