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
@WebServlet("/update")
public class update_employ extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int id=Integer.parseInt(req.getParameter("id"));
Employ_dao dao=new Employ_dao();
Employ emp=dao.getEmployById(id);
if(emp!=null) {
	req.setAttribute("emp", emp);
	RequestDispatcher r=req.getRequestDispatcher("edit_employ.jsp");
	r.forward(req, resp);
}
}
}
