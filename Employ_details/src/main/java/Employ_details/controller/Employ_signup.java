package Employ_details.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Employ_details.dao.Employ_dao;
import Employ_details.dto.Employ;
@WebServlet("/signup")
public class Employ_signup extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Employ employ=new Employ();
	employ.setEname(req.getParameter("ename"));
	employ.setEmail(req.getParameter("email"));
	employ.setPassword(req.getParameter("password"));
	int eage=Integer.parseInt(req.getParameter("eage"));
	employ.setEage(eage);
	long phoneno=Long.parseLong(req.getParameter("phoneno"));
	employ.setPhoneno(phoneno);
	Employ_dao dao=new Employ_dao();
	Employ emp= dao.save_employ(employ);
	if(emp!=null) {
		 req.setAttribute("emp", "signup succussfully");
		
		RequestDispatcher r=req.getRequestDispatcher("login_employ.jsp");
		r.forward(req, resp);
	}
	
	
}
}
