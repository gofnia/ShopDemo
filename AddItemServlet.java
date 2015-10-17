import java.io.*;
import javax.servlet.http.*;

public class AddItemServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
		HttpServletResponse response)throws IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Item Added");
		out.println(request.getParameter("itemName"));
		
	}

}