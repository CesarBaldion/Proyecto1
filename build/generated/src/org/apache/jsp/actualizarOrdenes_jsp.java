package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.OrdenesVO;

public final class actualizarOrdenes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");
 
        OrdenesVO ordVO = (OrdenesVO)request.getAttribute("ordenConsultada");
        if(ordVO != null){
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"Ordenes\" method=\"post\">\r\n");
      out.write("            <h1>Actualizar Ordenes</h1>\r\n");
      out.write("            <label>Id orden</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"text\" name=\"txtIdOrden\" value=\"");
      out.print(ordVO.getId_Orden());
      out.write(" \" required=\"\" >\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Id usuario</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <select name=\"txtUsu\">\r\n");
      out.write("                <option value=\"");
      out.print(ordVO.getId_Usuarios());
      out.write('"');
      out.write('>');
      out.print(ordVO.getId_Usuarios());
      out.write("</option>\r\n");
      out.write("            ");

                UsuarioDAO usuDAO = new UsuarioDAO();
                for(UsuarioVO usuVO:usuDAO.Listar()){
                
                
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("                <option value=\"");
      out.print(usuVO.getIdUsuarios());
      out.write('"');
      out.write('>');
      out.print(usuVO.getNombre());
      out.write("</option>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Fecha registro</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"date\" name=\"txtFechaRegistro\" value=\"");
      out.print(ordVO.getFecha_registro());
      out.write(" \"  required=\"\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Fecha Entrega</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"date\" name=\"txtFechaEntrega\" value=\"");
      out.print(ordVO.getFecha_entrega());
      out.write(" \"  required=\"\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <button id=\"Boton\"> Actualizar </button>\r\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("            <a href=\"consultarOrdenes.jsp\">Volver</a><br>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("            ");
 }else{
request.getRequestDispatcher("consultarOrdenes.jsp").forward(request, response);

}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
