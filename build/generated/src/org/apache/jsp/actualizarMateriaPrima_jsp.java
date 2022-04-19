package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.MateriaPrimaVO;

public final class actualizarMateriaPrima_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 
        MateriaPrimaVO mpVO = (MateriaPrimaVO)request.getAttribute("MateriaPrimaConsultada");
        if(mpVO != null){
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"MateriaPrima\" method=\"post\">\n");
      out.write("            <h1>Actualizar materia prima</h1>\n");
      out.write("            <label>Id materia prima</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"txtIdMateriaPrima\" value=\"");
      out.print(mpVO.getId_materia_Prima());
      out.write(" \" required=\"\" >\n");
      out.write("            <br>\n");
      out.write("            <label>Nombre</label>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" value=\"");
      out.print(mpVO.getNombre());
      out.write("\">\n");
      out.write("            <br>\n");
      out.write("            <label>Estado</label>\n");
      out.write("            <br>\n");
      out.write("            <select name=\"txtEstado\">\n");
      out.write("                <option value=\"");
      out.print(mpVO.getEstado());
      out.write('"');
      out.write('>');
      out.print(mpVO.getEstado());
      out.write("</option>\n");
      out.write("                <option value=\"0\">Inactivo</option>\n");
      out.write("                <option value=\"1\">Activo</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <button id=\"Boton\"> Actualizar </button>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("            <a href=\"consultarMateriaPrima.jsp\">Volver</a><br>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("            ");
 }else{
request.getRequestDispatcher("consultarMateriaPrima.jsp").forward(request, response);

}
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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
