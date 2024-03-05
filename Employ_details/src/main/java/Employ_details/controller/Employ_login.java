package Employ_details.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Employ_details.dao.Employ_dao;
import Employ_details.dto.Employ;
@WebServlet("/login")
public class Employ_login extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String email=req.getParameter("email");
String password=req.getParameter("password");
Employ_dao dao =new Employ_dao();
Employ e= dao.login_employ(email);
if(e.getEmail().equals(email) && e.getPassword().equals(password)) {
	List<Employ> list=dao.featchall();
	req.setAttribute("list", list);
	RequestDispatcher r=req.getRequestDispatcher("employ_disply.jsp");
	r.forward(req, resp);
}else {
	req.setAttribute("message", "invalid mail");
	RequestDispatcher r=req.getRequestDispatcher("Employ_login.jsp");
	r.include(req, resp);
	
}



	
}
}
