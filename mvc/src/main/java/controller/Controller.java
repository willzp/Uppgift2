package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Bean a = new Bean();
		HttpSession session = request.getSession();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		a.setUsername("william");
		a.setPassword("a");
		a.setUsername2("simon");
		a.setPassword2("b");
		
		if(username.equals(a.getUsername()) && password.equals(a.getPassword())){
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
			rd.forward(request, response);
			
		}
		else if(username.equals(a.getUsername2()) && password.equals(a.getPassword2())){
			session.setAttribute("username", username);
			RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
			rd.forward(request, response);

		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
