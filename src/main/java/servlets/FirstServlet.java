package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

public class FirstServlet extends BaseServlet {
	
	private static final long serialVersionUID = 1L;


	@Override
	protected void doAction() throws ServletException, IOException {
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/First.jsp");
		rd.forward(request, response);
	}
}
