package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Main</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta name=\"HandheldFriendly\" content=\"true\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\" />\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".food-munch-logo {\n");
      out.write("    height: 80px;\n");
      out.write("    width: 120px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navitem1 {\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navitem2 {\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navitem3 {\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#navitem4 {\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner_section-bg-container {\n");
      out.write("    background-image: url(\"https://image.freepik.com/free-vector/neon-lights-wallpaper_52683-46462.jpg\");\n");
      out.write("    height: 100vh;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner-heading {\n");
      out.write("    color: white;\n");
      out.write("    font-family: \"Roboto\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner-caption {\n");
      out.write("    color: white;\n");
      out.write("    font-family: \"Roboto\";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".view-menu-button {\n");
      out.write("    border-width: 0;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    color: white;\n");
      out.write("    background: orange;\n");
      out.write("    width: 130px;\n");
      out.write("    height: 40px;\n");
      out.write("    margin-right: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".order-now-button {\n");
      out.write("    border-width: 1;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    border-color: orange;\n");
      out.write("    color: orange;\n");
      out.write("    background: transparent;\n");
      out.write("    width: 130px;\n");
      out.write("    height: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!--<div class=\"container\">\n");
      out.write("<img src=\"https://media.olivegarden.com/en_us/images/product/catering-lasagna-combo-dpv-590x365.jpg\" width=\"300px\" height=\"450px\"/>\n");
      out.write("<a href=\"cooking_login.html\"><img id=\"cook\" src=\"https://st.depositphotos.com/1012331/2024/v/950/depositphotos_20245623-stock-illustration-chef-and-best-food-for.jpg\" height=\"150px\" width=\"50px\"/></a>\n");
      out.write("<img id=\"cook1\" src=\"https://www.chefs-resources.com/wp-content/uploads/Horizontal-Lines-plating.jpg\" height=\"150px\" width=\"50px\"/>\n");
      out.write("<a href=\"management_login.html\"><img id=\"cook2\" src=\"https://image.shutterstock.com/image-vector/hotel-service-cartoon-illustration-general-260nw-265624334.jpg\" height=\"150px\" width=\"50px\"/></a>\n");
      out.write("<h1>R O H S R A  &nbsp;&nbsp;&nbsp; B I S T R O </h1>\n");
      out.write("<div class=\"sravan\">\n");
      out.write("<p>Our menu has perfectly planned with hand picked<br/> items with care and each has its unique style ,<br/>\n");
      out.write("An awesome  place for food rowdies!!! <br/>you can experience the best taste while enjoying<br/> with your favourite music </p>\n");
      out.write("<a href=\"menu.html\"><button>E &nbsp;&nbsp;X &nbsp;&nbsp;P &nbsp;&nbsp;L &nbsp;&nbsp;O &nbsp;&nbsp;R &nbsp;&nbsp;E<span><span></button></a>\n");
      out.write("</div>\n");
      out.write("\t</div>-->\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <img src=\"KRACK.png\" class=\"food-munch-logo\" />\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n");
      out.write("                <div class=\"navbar-nav ml-auto\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"wcu-section.html\" id=\"navitem1\">\n");
      out.write("                        Why Choose Us\n");
      out.write("                        <span class=\"sr-only\">(current)</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"nav-link\" href=\"menu1.html\" id=\"navitem1\">Explore Menu</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"registration.html\" id=\"navitem1\">Registration</a>\n");
      out.write("\t\t    <a class=\"nav-link\" href=\"login.html\" id=\"navitem1\">Login</a>\t\t\n");
      out.write("                    <a class=\"nav-link\" href=\"FollowUs.html\" id=\"navitem1\">Follow Us</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"banner_section-bg-container d-flex flex-column justify-content-center\">\n");
      out.write("        <div class=\"text-center \">\n");
      out.write("            <h1 class=\"banner-heading\">KRACK the crackers</h1>\n");
      out.write("            <!--<p class=\"banner-caption\">Eat Smart & Healthy</p>-->\n");
      out.write("            <button class=\"view-menu-button\">View Menu</button>\n");
      out.write("            <!--<button class=\"order-now-button\">Order Now</button>-->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
