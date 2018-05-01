

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EE2Session.Response;
import com.EE2Session.User;
import com.auribises.db.JDBCHelper;
import com.google.gson.Gson;


@WebServlet("/Register")
public class Register extends HttpServlet {
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		response.setContentType("application/json");
		PrintWriter  out = response.getWriter();
		
		
		User user = new User();
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		Response res = new Response();
		
		if(i>0){
			res.success = 1;
			res.message = "User Registered Successfully !!";
		}else{
			res.success = 0;
			res.message = "User Registration Failed !!";
		}
		
		
	
		//Response res = new Response();
		res.success = 1;
		res.message = "User Registered Successfully";
		
		
		
		
		Gson gson = new Gson();
		String json = gson.toJson(res);
		
		
		out.print(json);
		
		
	}

}
