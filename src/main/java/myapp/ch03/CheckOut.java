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

@WebServlet("/CheckOut")
public class CheckOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("username");
        ArrayList<?> list = (ArrayList<?>) session.getAttribute("productlist");
        out.println("<html><body>");
        out.println("<center> <H2>" + name + "님이 선택한 상품 목록 </H2>");
        if (list == null) {
            out.println("선택한 상품이 없습니다!");
        } else {
            for (Object product : list) {
                out.println(product + "<br>");
            }
            out.println("</center>");
        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }
}