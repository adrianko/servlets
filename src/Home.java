import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Home extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        message = "Welcome";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {}

}