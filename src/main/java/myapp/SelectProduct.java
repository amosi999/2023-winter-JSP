package myapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SelectProduct")
public class SelectProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        HttpSession session = req.getSession();
        session.setAttribute("username", username);

        PrintWriter out = res.getWriter();
        out.println("<center>");
        out.println("<h2>상품 선택<h2>");
        out.println(username + "님이 로그인한 상태입니다");
        out.println("<form name=form2 method=post action=AddProduct>");
        out.println("   <select name=product>");
        out.println("       <option>apple</option>");
        out.println("       <option>orange</option>");
        out.println("       <option>lemon</option>");
        out.println("   </select>");
        out.println("   <input type=submit value=추가 />");
        out.println("</form>");
        out.println("<a href=CheckOut>결제</a>");
        out.println("</center>");
    }
}