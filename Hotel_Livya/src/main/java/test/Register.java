package test;

import java.io.IOException;
import java.io.PushbackInputStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
@SuppressWarnings("serial")
public class Register extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
	
	String cid=req.getParameter("cid");
	String cname=req.getParameter("cname");
	String caddress=req.getParameter("caddress");
	String cmail=req.getParameter("cmail");
	String cphone=req.getParameter("cphone");
	String cstate=req.getParameter("cstate");
	String ccountry=req.getParameter("ccountry");
	
	HotelBean hBean=new HotelBean();
	hBean.setCid(cid);
	hBean.setCname(cname);
	hBean.setCaddress(caddress);
	hBean.setCmail(cmail);
	hBean.setCphone(cphone);
	hBean.setCstate(cstate);
	hBean.setCcountryString(ccountry);
	int k=new RegisterDao().register(hBean);
	if(k>0)
	{
		req.setAttribute("msg", "Customer Registration Successfull....");
		req.getRequestDispatcher("Register.jsp").forward(req, resp);
	}
	
 }
}
