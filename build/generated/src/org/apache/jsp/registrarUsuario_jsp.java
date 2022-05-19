package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("        <title>Registrar Usuario</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("                integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"col-md-5 mx-auto justify-content-center border-5 border border-info mt-3 caja\">\r\n");
      out.write("                <div class=\"col-md-11 mx-auto justify-content-center mt-5\">\r\n");
      out.write("                    <form   class=\"form-group\" action=\"Usuarios\" method=\"post\" enctype=\"multipart/form-data\"> \r\n");
      out.write("                        <h1 class=\"text-center fs-2\">Registrese para empezar</h1>\r\n");
      out.write("                        <h3 class=\"text-center fs-4\">Ingrese sus datos</h3>\r\n");
      out.write("                        <div class=\"mx-auto justify-content-center\">\r\n");
      out.write("                            ");
if (request.getAttribute("error") != null) {
      out.write("\r\n");
      out.write("                            <div class=\"container-fluid d-inline-block d-flex mx-auto\">                               \r\n");
      out.write("                                <img src=\"img/error.svg\" height=\"100\">\r\n");
      out.write("                                <p class=\"text-danger text-center fs-5 mt-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
   } else {
      out.write("\r\n");
      out.write("                            <p class=\"text-success text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Bien}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"d-flex  \">\r\n");
      out.write("                            <input type=\"text\"  name= \"txtNombre\" placeholder=\"Nombres\" required=\"\" class=\"form-control ms-1  mt-2\"  data-bs-toggle=\"tooltip\" data-bs-placement=\"top\" title=\"Tooltip on top\">\r\n");
      out.write("                            <input type=\"text\"  name= \"txtDocumento\" placeholder=\"Documento\" required=\"\" class=\" form-control  ms-3 mt-2\" >\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"d-flex  \">\r\n");
      out.write("                            <input type=\"text\"  name= \"txtTelefono\" placeholder=\"Telefono\" required=\"\" class=\"form-control  ms-1  mt-2\">\r\n");
      out.write("                            <input type=\"text\"  name= \"txtDireccion\" placeholder=\"Direccion\" required=\"\" class=\"form-control ms-3 mt-2\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"d-flex   \">\r\n");
      out.write("                            <input type=\"email\"  name= \"txtEmail\" placeholder=\"Email\" required=\"\" class=\"form-control ms-1 mt-2\">\r\n");
      out.write("                            <input type=\"email\"  name= \"txtEmail2\" placeholder=\"Confirme Email\" required=\"\" class=\"form-control ms-3  mt-2\">  \r\n");
      out.write("                        </div> \r\n");
      out.write("                        <div class=\"d-flex input-group mt-2 mb-3\">\r\n");
      out.write("                            <input name=\"txtContrasena\" id=\"txtPassword\" type=\"password\" class=\"form-control\"  placeholder=\"Contraseña\" required=\"\"   >\r\n");
      out.write("                            <button class=\"btn boton\" type=\"button\" id=\"botonOn\" onclick=\"mostrarPassword()\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-eye-slash-fill\" viewBox=\"0 0 16 16\"><path d=\"m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z\"/><path d=\"M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z\"/></svg>                        </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group mt-2 mb-3\">\r\n");
      out.write("                            <input name=\"txtContrasena2\" id=\"txtPassword2\" type=\"password\" class=\"form-control\"  placeholder=\"Confirme Contraseña\" required=\"\" aria-label=\"Recipient's username\"\r\n");
      out.write("                                   aria-describedby=\"button-addon2\">\r\n");
      out.write("                            <button class=\"btn boton\" type=\"button\" id=\"botonOn2\" onclick=\"mostrarPassword2()\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-eye-slash-fill\" viewBox=\"0 0 16 16\"><path d=\"m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z\"/><path d=\"M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z\"/></svg>                        </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"d-flex mt-4 mb-3\">\r\n");
      out.write("                            <button class=\"btn boton\" >Registrar</button><br>\r\n");
      out.write("                            <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                            <a href=\"iniciarSesion.jsp\" class=\"nav-link text-center\">¿Ya tiene una cuenta?</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>  \r\n");
      out.write("                <div class=\"mx-auto justify-content-center\">\r\n");
      out.write("                    ");
if (request.getAttribute("Verifique") != null) {
      out.write("\r\n");
      out.write("                    <p class=\"text-danger text-center fs-5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Verifique}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                function mostrarPassword() {\r\n");
      out.write("                    var cambio = document.getElementById(\"txtPassword\");\r\n");
      out.write("                    var uno = document.getElementById('botonOn');\r\n");
      out.write("                    if (cambio.type == \"password\") {\r\n");
      out.write("                        cambio.type = \"text\";\r\n");
      out.write("                        uno.innerHTML = '<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-eye-fill\" viewBox=\"0 0 16 16\"><path d=\"M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z\"/><path d=\"M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z\"/></svg>';\r\n");
      out.write("                    } else {\r\n");
      out.write("                        cambio.type = \"password\";\r\n");
      out.write("                        uno.innerHTML = '<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-eye-slash-fill\" viewBox=\"0 0 16 16\"><path d=\"m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z\"/><path d=\"M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z\"/></svg>';\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                ;\r\n");
      out.write("                function mostrarPassword2() {\r\n");
      out.write("                    var cambio = document.getElementById(\"txtPassword2\");\r\n");
      out.write("                    var uno = document.getElementById('botonOn2');\r\n");
      out.write("                    if (cambio.type == \"password\") {\r\n");
      out.write("                        cambio.type = \"text\";\r\n");
      out.write("                        uno.innerHTML = '<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-eye-fill\" viewBox=\"0 0 16 16\"><path d=\"M10.5 8a2.5 2.5 0 1 1-5 0 2.5 2.5 0 0 1 5 0z\"/><path d=\"M0 8s3-5.5 8-5.5S16 8 16 8s-3 5.5-8 5.5S0 8 0 8zm8 3.5a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7z\"/></svg>';\r\n");
      out.write("                    } else {\r\n");
      out.write("                        cambio.type = \"password\";\r\n");
      out.write("                        uno.innerHTML = '<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-eye-slash-fill\" viewBox=\"0 0 16 16\"><path d=\"m10.79 12.912-1.614-1.615a3.5 3.5 0 0 1-4.474-4.474l-2.06-2.06C.938 6.278 0 8 0 8s3 5.5 8 5.5a7.029 7.029 0 0 0 2.79-.588zM5.21 3.088A7.028 7.028 0 0 1 8 2.5c5 0 8 5.5 8 5.5s-.939 1.721-2.641 3.238l-2.062-2.062a3.5 3.5 0 0 0-4.474-4.474L5.21 3.089z\"/><path d=\"M5.525 7.646a2.5 2.5 0 0 0 2.829 2.829l-2.83-2.829zm4.95.708-2.829-2.83a2.5 2.5 0 0 1 2.829 2.829zm3.171 6-12-12 .708-.708 12 12-.708.708z\"/></svg>';\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                ;\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
