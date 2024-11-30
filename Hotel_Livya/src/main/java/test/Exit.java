package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/exit")
public class Exit extends HttpServlet

{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession hSession=req.getSession(false);
		if(hSession==null)
		{
			req.setAttribute("msg","already loggedout");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		else 
		{
			hSession.removeAttribute("hbean");
			hSession.invalidate();
			req.setAttribute("msg", "logged out successful...");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		
	}
}
