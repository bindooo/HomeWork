package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		initAction(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		initAction(req, resp);
	}

	private void initAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.request = request;
		this.response = response;

		doAction();
	}
	
	protected abstract void doAction()
			throws ServletException, IOException;
/*
	protected void redirect(String page, Object values) throws IOException {
		request.getSession().setAttribute("values", values);
		response.sendRedirect(page);
	}

	protected void redirect(String page) throws IOException {
		response.sendRedirect(page);
	}

	protected void setSessionAttribute(String key, Object o) {
		request.getSession().setAttribute(key, o);
	}

	protected Object getSessionAttribute(String key) {
		return request.getSession().getAttribute(key);
	}
*/
}
