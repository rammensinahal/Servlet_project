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
@WebServlet("/edit")
public class edit_employ  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
Employ e=new Employ();
int id=Integer.parseInt(req.getParameter("id"));
e.setEid(id);
e.setEname(req.getParameter("ename"));
e.setEmail(req.getParameter("email"));
e.setPassword(req.getParameter("password"));
int eage=Integer.parseInt(req.getParameter("eage"));
e.setEage(eage);
long phoneno=Long.parseLong(req.getParameter("phoneno"));
e.setPhoneno(phoneno);

Employ_dao dao=new Employ_dao();
Employ emp= dao.update_employ(e);
if(emp!=null) {
	List<Employ> list=dao.featchall();
	req.setAttribute("list", list);
	RequestDispatcher r=req.getRequestDispatcher("employ_disply.jsp");
	r.forward(req, resp);
}
else {
RequestDispatcher r=req.getRequestDispatcher("login_employ.jsps");
r.forward(req, resp);
}
}}
