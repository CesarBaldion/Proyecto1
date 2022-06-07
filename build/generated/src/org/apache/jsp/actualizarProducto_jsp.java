package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.Usuario_rolVO;
import ModeloDAO.UsuarioRolDAO;
import ModeloVO.UsuarioVO;
import ModeloVO.ProductoVO;

public final class actualizarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sesionesJefeProduccion.jsp");
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

HttpSession buscarSesion = (HttpSession) request.getSession();
    UsuarioVO usuVO1 = null;
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
    }else{
        UsuarioRolDAO uRDAO = new UsuarioRolDAO();
         usuVO1 = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
         Usuario_rolVO uRVO2 = uRDAO.consultarRol(usuVO1.getIdUsuarios());
         String id = uRVO2.getId_Rol();
         if(id.equals("2") || id.equals("1")){
             
         }else{
             request.getRequestDispatcher("errorPermisos.jsp").forward(request, response);
         }
         
    } 

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
 
        ProductoVO proVO = (ProductoVO)request.getAttribute("productoConsultado");
        if(proVO != null){
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"Producto\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <h1>Actualizar Productos</h1>\r\n");
      out.write("            <label>Id producto</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"text\" name=\"txtId\" value=\"");
      out.print(proVO.getIdProducto());
      out.write(" \" required=\"\" >\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Nombre Producto</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <input type=\"text\" name=\"txtNombre\" value=\"");
      out.print(proVO.getNombre());
      out.write(" \"  required=\"\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Estado</label>\r\n");
      out.write("            <br>\r\n");
      out.write("            <select name=\"txtEstado\">\r\n");
      out.write("                <option value=\"");
      out.print(proVO.getEstado());
      out.write('"');
      out.write('>');
      out.print(proVO.getEstado());
      out.write("</option>\r\n");
      out.write("                <option value=\"1\">Activo</option>\r\n");
      out.write("                <option value=\"0\">Inactivo</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button id=\"Boton\"> Actualizar </button>\r\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\r\n");
      out.write("            <a href=\"consultarProducto.jsp\">Volver</a><br>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("            ");
 }else{
request.getRequestDispatcher("consultarProducto.jsp").forward(request, response);

}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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