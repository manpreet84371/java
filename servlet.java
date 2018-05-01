

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet")
public class servlet extends HttpServlet {
	public servlet() {
		super();
	}
	public void init(ServletConfig config) throws ServletException {
		System.out.println("----Init Executed");
	}

		public void destroy() {
		System.out.println("----Destroy Executed");
	}

		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("----Service Executed");
		
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		
		System.out.println("User Details:" +name+"  - "+email+" - "+password);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		if(!name.isEmpty()&&!email.isEmpty()&&!password.isEmpty()) {
			out.write("Thank You For Registration");
			
				}else {
					out.write("Kindly Enter Correct Details");
				}
		
			
	}

}
