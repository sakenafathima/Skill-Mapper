import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String Username=request.getParameter("Username");
        String Password=request.getParameter("Password");
        if(Password.equals("admin123")){
        out.println("<h2>You are successfully Logged In</h2> ");
        out.println("<br/>Welcome"+" "+Username);
        Cookie ck=new Cookie("Username",Username);
        response.addCookie(ck);
        }
        else{
            out.println("<h2>Sorry Username or Password is incorrect!</h2>");
        }
    out.close();
}
}