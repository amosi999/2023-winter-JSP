package myapp;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Session test<br>");

        HttpSession session = request.getSession();
        if (session.isNew()) {
            out.println("This is a new session.");
            session.setMaxInactiveInterval(30);
        } else {
            out.println("<br>created time = " + session.getCreationTime());
            out.println("<br>last accessed time = " + session.getLastAccessedTime());
            out.println("<br>maximum inactive interval = " + session.getMaxInactiveInterval());
        }
        out.println("</body></html>");
    }
}