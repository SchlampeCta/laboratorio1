package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class response_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.mypackage.hello.NameHandler mybean = null;
      synchronized (session) {
        mybean = (org.mypackage.hello.NameHandler) _jspx_page_context.getAttribute("mybean", PageContext.SESSION_SCOPE);
        if (mybean == null){
          mybean = new org.mypackage.hello.NameHandler();
          _jspx_page_context.setAttribute("mybean", mybean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.mypackage.hello.NameHandler mybean1 = null;
      synchronized (session) {
        mybean1 = (org.mypackage.hello.NameHandler) _jspx_page_context.getAttribute("mybean1", PageContext.SESSION_SCOPE);
        if (mybean1 == null){
          mybean1 = new org.mypackage.hello.NameHandler();
          _jspx_page_context.setAttribute("mybean1", mybean1, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.mypackage.hello.NameHandler mybean2 = null;
      synchronized (session) {
        mybean2 = (org.mypackage.hello.NameHandler) _jspx_page_context.getAttribute("mybean2", PageContext.SESSION_SCOPE);
        if (mybean2 == null){
          mybean2 = new org.mypackage.hello.NameHandler();
          _jspx_page_context.setAttribute("mybean2", mybean2, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("mybean"), "name", request.getParameter("name"), request, "name", false);
      out.write("\n");
      out.write("        <h1>Hola, ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.NameHandler)_jspx_page_context.findAttribute("mybean")).getName())));
      out.write(" !</h1>\n");
      out.write("         \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("mybean1"), "fechaNacimiento", request.getParameter("fechaNacimiento"), request, "fechaNacimiento", false);
      out.write("\n");
      out.write("        <h2>Fecha de nacimiento: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.NameHandler)_jspx_page_context.findAttribute("mybean1")).getFechaNacimiento())));
      out.write(" !</h2>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("mybean2"), "periodo", request.getParameter("periodo"), request, "periodo", false);
      out.write("\n");
      out.write("        <h2>Su edad es: ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((org.mypackage.hello.NameHandler)_jspx_page_context.findAttribute("mybean2")).getPeriodo())));
      out.write(" !</h2>\n");
      out.write("        \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
