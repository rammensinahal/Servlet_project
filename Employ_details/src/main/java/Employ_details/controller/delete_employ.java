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


@WebServlet("/delete")
public class delete_employ extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	Employ_dao dao=new Employ_dao();
	boolean b=dao.delete(id);
	if(b) {
	List<Employ> list=dao.featchall();
	req.setAttribute("list", list);
	RequestDispatcher  r=req.getRequestDispatcher("employ_disply.jsp");
	r.include(req, resp);
		
		
	}
	
}
}
