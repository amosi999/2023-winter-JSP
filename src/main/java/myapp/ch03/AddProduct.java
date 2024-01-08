package myapp.ch03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String product = req.getParameter("product");
        HttpSession session = req.getSession();
        ArrayList<String> list = (ArrayList<String>) session.getAttribute("productlist");
        if (list == null) {
            list = new ArrayList<String>();
        }
        list.add(product);
        session.setAttribute("productlist", list);

        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println(product + "이(가) 추가되었습니다<br>");
        out.println("<button onclick=\"history.back()\">뒤로가기</button>");
        out.println("</body></html>");
    }
}