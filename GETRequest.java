import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // Get the request parameters
    String name = request.getParameter("name");
    int age = Integer.parseInt(request.getParameter("age"));

    // Set the response type and status code
    response.setContentType("text/html");
    response.setStatus(HttpServletResponse.SC_OK);

    // Get the output stream and print the response
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Hello, " + name + "!</h1>");
    out.println("<p>You are " + age + " years old.</p>");
    out.println("</body>");
    out.println("</html>");
  }
}