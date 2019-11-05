import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class reg_app extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws IOException {
    String username = request.getParameter("username");
	String password = request.getParameter("password");{
        if(username.isEmpty()||password.isEmpty()){
        RequestDispatcher req = request.getRequestDispatcher("reg1.html");
        req.include(request, response);
    }
    else
    {
        RequestDispatcher req = request.getRequestDispatcher("reg2.html");
        req.forward(request, response);
    }

}
}
}