package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE.html>");
			out.println("<html>");
 			out.println("<head>");
			out.println("<title>Servlet Servlet1</title>");
			out.println("</head>");
			out.println("<body>");
			
			String name = request.getParameter("name");
			out.println("<h1>Hello, "+name+ " welcome to my website...</h1>");
			out.println("<h1><a href='servlet2'>Go to Servlet 2</a></h1>");
			
			//Create a cookie
			Cookie ck = new Cookie("user_name", name);
			response.addCookie(ck);
			
			out.println("</body>");
			out.println("</html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
