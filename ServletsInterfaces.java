import java.io.*;
import javax.servlet.*;

public class HelloServlet implements Servlet {
  private ServletConfig config;

  public void init(ServletConfig config) throws ServletException {
    this.config = config;
  }

  public void service(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Hello, World!</h1>");
    out.println("</body>");
    out.println("</html>");
  }

  public void destroy() {}

  public ServletConfig getServletConfig() {
    return config;
  }

  public String getServletInfo() {
    return "A simple servlet that says hello.";
  }
}