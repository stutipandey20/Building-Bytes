package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("        <LINK REL=STYLESHEET type=text/CSS href=css/style.css>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              <div class=\"topnav\" align=center width=100% class=\"table1\" >\n");
      out.write("                          <table border=0 width=100% >\n");
      out.write("\t\t<tr>\n");
      out.write("                                           <td>\n");
      out.write("                                                    <h1 >BUILDING BYTES</h1>\n");
      out.write("                                                    <h3 > Explore, Learn, Share</h3>\n");
      out.write("                                           </td>\n");
      out.write("                                           <td>\n");
      out.write("                                               <ul>\n");
      out.write("                                                   <li><h5><a href=\"#\"><font color=\"black\">HOME</font></a></h5></li>\n");
      out.write("                                                   <li><h5><a href=\"#about\"><font color=\"black\">ABOUT US</font></a></h5></li>\n");
      out.write("                                                   <li><h5><a href=\"#services\"><font color=\"black\">SERVICES</font></a></h5></li>\n");
      out.write("                                                   <li><h5><a href=\"Policy.jsp\"><font color=\"black\">POLICY</font></a></h5></li>\n");
      out.write("                                               </ul>\n");
      out.write("                                              \n");
      out.write("                                           </td>\n");
      out.write("                                  </tr>\n");
      out.write("                                  \n");
      out.write("                          </table>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"content1\">\n");
      out.write("             <h2 class=\"heading1\">UPLOAD STUDY MATERIALS</h2>\n");
      out.write("             <div class=\"container\">\n");
      out.write("                  <div class=\"box\"> \n");
      out.write("            <a href=\"StudyMaterialUpload.jsp\" target=\"_blank\" class=\"pglink\">\n");
      out.write("            <img src=\"images\\studym.jpg\" alt=\"HTML tutorial\" class=\"img1\"></a>\n");
      out.write("          </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content2\">\n");
      out.write("             <h2 class=\"heading2\">VIEW FEEDBACK AND QUERY</h2>\n");
      out.write("             <div class=\"container\">\n");
      out.write("                  <div class=\"box\"> \n");
      out.write("            <a href=\"ViewFeedbackQuery.jsp\" target=\"_blank\" class=\"pglink\">\n");
      out.write("            <img src=\"images/feed.jpg\" alt=\"HTML tutorial\" class=\"img2\"></a>\n");
      out.write("          </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content1\">\n");
      out.write("             <h2 class=\"heading1\">VIEW DATABASE</h2>\n");
      out.write("             <div class=\"container\">\n");
      out.write("                  <div class=\"box\"> \n");
      out.write("           <a href=\"ViewDatabase.jsp\" target=\"_blank\" class=\"pglink\">\n");
      out.write("            <img src=\"images/Capture.PNG\" alt=\"HTML tutorial\" class=\"img1\" ></a>\n");
      out.write("          </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content2\">\n");
      out.write("             <h2 class=\"heading2\">UPDATE ACCOUNT INFORMATION</h2>\n");
      out.write("             <div class=\"container\">\n");
      out.write("                  <div class=\"box\"> \n");
      out.write("            <a href=\"UpdateAdminInfo.jsp\" target=\"_blank\" class=\"pglink\">\n");
      out.write("                <img src=\"images/unnamed.png\" alt=\"HTML tutorial\" class=\"img2\" ></a>\n");
      out.write("          </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("body\n");
      out.write("{\n");
      out.write("    background-image:linear-gradient(#999966,#99ffcc,#999966);\n");
      out.write("}\n");
      out.write(".heading1\n");
      out.write("{\n");
      out.write("    font-family:Palantino Linotype ;\n");
      out.write("    color: black;\n");
      out.write("    font-size: 40px;\n");
      out.write("}\n");
      out.write(".heading1:hover\n");
      out.write("{\n");
      out.write("    background-color:#003366;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    color:#cc9900;\n");
      out.write("}\n");
      out.write(".heading2\n");
      out.write("{\n");
      out.write("    font-family:Palantino Linotype ;\n");
      out.write("    color: black;\n");
      out.write("    font-size: 40px;\n");
      out.write("    margin-left:650px;\n");
      out.write("    margin-top:100px;\n");
      out.write("}\n");
      out.write(".heading2:hover\n");
      out.write("{\n");
      out.write("    background-color:#003366;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    color:#cc9900;\n");
      out.write("}\n");
      out.write(".pglink.a:hover\n");
      out.write("{\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".img1\n");
      out.write("{\n");
      out.write("    width:500px;\n");
      out.write("    height:250px;\n");
      out.write("    border:0;\n");
      out.write("    margin-left: 650px;\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("}\n");
      out.write(".img2\n");
      out.write("{\n");
      out.write("    width:600px;\n");
      out.write("    height:250px;\n");
      out.write("    border:2;\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("}\n");
      out.write(".content1\n");
      out.write("{\n");
      out.write("    width:90%;\n");
      out.write("    background-image: linear-gradient(#cc9900,#003366);\n");
      out.write("    padding:20px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    margin-left:30px;\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("    margin-right: 30px;\n");
      out.write("    margin-top: 30px;\n");
      out.write("}\n");
      out.write(".content2\n");
      out.write("{\n");
      out.write("    width:90%;\n");
      out.write("    background-image: linear-gradient(#cc9900,#003366);\n");
      out.write("    padding:20px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("    margin-left:30px;\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("    margin-right: 30px;\n");
      out.write("    margin-top: 30px;\n");
      out.write("}\n");
      out.write(".topnav\n");
      out.write("{\n");
      out.write("   padding-top: 0px;\n");
      out.write("    background-color: #99ffcc;\n");
      out.write("}\n");
      out.write(".table1\n");
      out.write("{\n");
      out.write("    border-radius: 10px;\n");
      out.write("    padding: 20px;\n");
      out.write("    width:97%;\n");
      out.write("    height:100%;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    background-color:#669999;    \n");
      out.write("}\n");
      out.write("li\n");
      out.write("{\n");
      out.write("    display:inline-block;\n");
      out.write("    text-align: end;\n");
      out.write("    margin-left: 140px;\n");
      out.write("    margin-top: 70px;\n");
      out.write("    font-family: Palantino Linotype;\n");
      out.write("    font-size: 15px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("a:link\n");
      out.write("{\n");
      out.write("    color:black;\n");
      out.write("}\n");
      out.write("a:visited\n");
      out.write("{\n");
      out.write("    color:green;\n");
      out.write("}\n");
      out.write("a:active\n");
      out.write("{\n");
      out.write("    color:darkblue;\n");
      out.write("       font-size:150%;\n");
      out.write("}\n");
      out.write("a:hover\n");
      out.write("{\n");
      out.write("    background-color:slategrey;\n");
      out.write("    border-radius: 5px;\n");
      out.write("     padding:15px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("</style>");
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
