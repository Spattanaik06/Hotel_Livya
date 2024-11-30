package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/login")
public class Login extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
	 String cid=req.getParameter("cid");
	 String cname=req.getParameter("cname");
	 HttpSession hSession=req.getSession();
	 HotelBean hBean=new LoginDao().login(cid, cname);
	 hSession.setAttribute("hbean", hBean);
	 if(hBean==null)
	 {
		 req.setAttribute("msg", "invalid Credential");
		 req.getRequestDispatcher("msg.jsp").forward(req, resp);
	 }
	 else {
		 req.setAttribute("msg", "Login Successfull..");
		 req.getRequestDispatcher("LoginSuccess.jsp").forward(req, resp);
	}
	 
 }
}
