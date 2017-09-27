package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.User;
import service.UserService;

public class LoginServlet extends HttpServlet 
{

    UserService us = new UserService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        request.setAttribute("message", request.getParameter("message"));
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        User user = new User(request.getParameter("user"),request.getParameter("pass"));
        String message = "";
        if(!user.isEmpty()){
            if (us.login(user)){
                request.setAttribute("user", user);
                getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
            }
            else{
                message = "Username or Password are invalid/incorrect";
            }
        }
        else{
            message = "Both Values Are Required";
        }
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    
}
