import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServlet implements Servlet{

	ServletConfig config = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("-- Servlet Intialization completed ----");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1> Hello, welcome to 'servlet interface' based response. </h1>");
		out.println("</body></html>");
		System.out.println("-- Servlet Requested request completed ----");
	}
	
	@Override
	public void destroy() {
		System.out.println("-- Servlet destroy completed ----");	
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return "This is a servlet interface implementation class example.";
	}

}
