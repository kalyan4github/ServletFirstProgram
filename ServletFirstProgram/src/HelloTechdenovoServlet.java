import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloTechdenovoServlet extends HttpServlet {

	private String msg;
	
	public HelloTechdenovoServlet() {
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		msg="Hello Techdenovo";
	}
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+msg+"</h1>");
 	}
	
	public void destroy() {
		
	}
}
