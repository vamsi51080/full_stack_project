package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class menutake_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color:#959ead;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"ml-5 text-center\">\n");
      out.write("        <table border=\"1px\">\n");
      out.write("            <th>OrderId</th>\n");
      out.write("            <th>Item</th>\n");
      out.write("            <th>Quantity</th>\n");
      out.write("            <th>Price</th>\n");
      out.write("            <th>Amount</th>\n");
      out.write("        \n");
      out.write("        ");

            int tquan=0,price=0,id=1,total=0;
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/cart","root","");
            Statement st=conn.createStatement();
            PreparedStatement ps=conn.prepareStatement("select price from rates where item=?");
            String menutake[]=request.getParameterValues("cracker");
            
            for(int i=0;i<menutake.length;i++){
                int quan=Integer.parseInt(request.getParameter(menutake[i]));
                ps.setString(1,menutake[i]);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    price=rs.getInt(1);
                }
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
 out.println(id);
      out.write("</td>\n");
      out.write("                ");
 id=id+1; 
      out.write("\n");
      out.write("                <td>");
 out.println(menutake[i]);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(quan);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(price);
      out.write("</td>\n");
      out.write("                <td>");
 out.println(quan*price);
                    total=total+quan*price;
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
        
}
        catch(Exception e){
            out.println(e.getMessage());
        }
      out.write("\n");
      out.write("        <tr colspan=\"2\">\n");
      out.write("                <td>");
 out.println("Total Price");
      out.write("</td>\n");
      out.write("                <td>");
 out.println(total);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("        </div>\n");
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
