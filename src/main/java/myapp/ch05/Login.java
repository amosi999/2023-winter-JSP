package myapp.ch05;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LoginManager loginMgr = new LoginManager();
        UserBean userBean = new UserBean();
        String addr;

        userBean.setUserid(request.getParameter("userid"));
        userBean.setPassword(request.getParameter("password"));
        if (loginMgr.authenticate(userBean)) {
            addr = "/ch05/login_success.jsp";
        } else {
            addr = "/ch05/login_fail.jsp";
        }

        request.setAttribute("userinfo", userBean);
        RequestDispatcher dispatcher = request.getRequestDispatcher(addr);
        dispatcher.forward(request, response);
    }
}