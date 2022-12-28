//Simple example of a servlet that handles a GET request and generates a response:

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // Set the response type and status code
    response.setContentType("text/html");
    response.setStatus(HttpServletResponse.SC_OK);

    // Get the output stream and print the response
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Hello, World!</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
