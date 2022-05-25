package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class iniciarSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/iniciarSesion.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@500&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Login y registro</title>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class=\"container a-container\" id=\"a-container\">\r\n");
      out.write("                <form  class=\"form\" id=\"a-form\" method=\"post\" action=\"Usuarios\">\r\n");
      out.write("                    <h2 class=\"form_title title col-md-8\">Registrar Cuenta</h2>\r\n");
      out.write("                    <div class=\"col-md-11 d-flex d-inline-block \">\r\n");
      out.write("                        <input id=\"txtNombre\" class=\"form__input_c ms-1 mt-2\"  type=\"text\" placeholder=\"Nombre completo\" requiered>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-11 d-flex d-inline-block \">\r\n");
      out.write("                        <select class=\"form__input ms-1 mt-2\" requiered>\r\n");
      out.write("                            <option value=\"\">Tipo de documento</option>\r\n");
      out.write("                            <option>Cedula de ciudadania</option>\r\n");
      out.write("                            <option>Tarjeta de identidad</option>\r\n");
      out.write("                            <option>Pasaporte</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <input id=\"txtDocumento\" class=\"form__input ms-3 mt-2\" type=\"text\" placeholder=\"Número de documento\" requiered>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-11 d-flex d-inline-block \">\r\n");
      out.write("                        <input id=\"txtDireccion\" class=\"form__input_c ms-1 mt-2\"  type=\"text\" placeholder=\"Dirección\" requiered>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-11 d-flex d-inline-block \">\r\n");
      out.write("                        <input id=\"txtCiudad\"  class=\"form__input ms-1 mt-2\"  type=\"text\" placeholder=\"Ciudad\" requiered>\r\n");
      out.write("                        <input id=\"txtTelefono\"  class=\"form__input ms-1 mt-2\"  type=\"text\" placeholder=\"Teléfono\" requiered>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-11 d-flex d-inline-block \">\r\n");
      out.write("                        <input id=\"txtEmail\"  class=\"form__input ms-1 mt-2\"  type=\"text\" placeholder=\"Correo\" requiered>\r\n");
      out.write("                        <input id=\"txtEmail2\"  class=\"form__input ms-1 mt-2\"  type=\"text\" placeholder=\"Confirme correo\" requiered>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-11 d-flex d-inline-block\">\r\n");
      out.write("                        <input id=\"txtPassword\"  type=\"password\" class=\"form__input_c ms-1 mt-2\"  type=\"text\" placeholder=\"Contraseña\"  aria-label=\"Recipient's username\"\r\n");
      out.write("                               aria-describedby=\"button-addon2\" requiered>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-11 d-flex d-inline-block \">\r\n");
      out.write("                        <input id=\"txtContrasena2\" class=\"form__input_c ms-1 mt-2\"  type=\"text\" placeholder=\"Confirme Contraseña\" requiered>\r\n");
      out.write("                    </div>  \r\n");
      out.write("                    <div class=\"col-md-11 d-flex mb-5 \">\r\n");
      out.write("                        <button class=\"form__button button submit \">Registrar</button>\r\n");
      out.write("\r\n");
      out.write("                    </div>          \r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container b-container col-md-8\" id=\"b-container\">\r\n");
      out.write("                <form class=\"form\" id=\"b-form\" method=\"\" action=\"\">\r\n");
      out.write("                    <div class=\"container_img\"><img src=\"img/Login/Login.svg\" alt=\"\"></div>\r\n");
      out.write("                    <h2 class=\"form_title title\">Iniciar Sesión</h2>\r\n");
      out.write("                    <input class=\"form__input\" name=\"txtDocumento\" type=\"text\" placeholder=\"Documento de Identidad\">\r\n");
      out.write("                    <input class=\"form__input\" ID=\"txtContrasena\" name=\"txtContrasena\" type=\"password\" placeholder=\"Contraseña\" requiered>\r\n");
      out.write("                    <a class=\"form__link\">¿Olvidó su contraseña?</a><button class=\"form__button button submit\">Ingresar</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"switch\" id=\"switch-cnt\">\r\n");
      out.write("                <div class=\"switch__circle\"></div>\r\n");
      out.write("                <div class=\"switch__circle switch__circle--t\"></div>\r\n");
      out.write("                <div class=\"switch__container\" id=\"switch-c1\">\r\n");
      out.write("                    <h2 class=\"switch__title title\">¡Bienvenido!</h2>\r\n");
      out.write("                    <p class=\"switch__description description\">Para ingresar, inicia sesión a continuación</p><button class=\"switch__button button switch-btn\">INICIAR SESIÓN</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"switch__container is-hidden\" id=\"switch-c2\">\r\n");
      out.write("                    <h2 class=\"switch__title title\">¿Nuevo usuario?</h2>\r\n");
      out.write("                    <p class=\"switch__description description\">Si es un nuevo usuario puede crear una cuenta a continuación</p>\r\n");
      out.write("                    <button class=\"switch__button button switch-btn\">REGISTRARSE</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function mostrarPassword() {\r\n");
      out.write("                var cambio = document.getElementById(\"txtContrasena\");\r\n");
      out.write("                if (cambio.type == \"password\") {\r\n");
      out.write("                    cambio.type = \"text\";\r\n");
      out.write("\r\n");
      out.write("                } else {\r\n");
      out.write("                    cambio.type = \"password\";\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"js/iniciarSesionRegistro.js\"></script>\r\n");
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
