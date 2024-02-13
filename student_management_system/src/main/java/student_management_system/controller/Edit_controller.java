package student_management_system.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_management_system.dao.Student_dao;
import student_management_system.dto.Student;
@WebServlet("/edit")
public class Edit_controller extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s= new Student();
		int id=Integer.parseInt(req.getParameter("id"));
		s.setId(id);
		s.setName(req.getParameter("name"));
		s.setEmail(req.getParameter("email"));
		s.setPassword(req.getParameter("password"));
		s.setAddress(req.getParameter("address"));
		Student_dao dao=new Student_dao();
		Student s1= dao.update(s);
		if(s1!=null) {
			List<Student> list=dao.featchall();
			req.setAttribute("list", list);
			RequestDispatcher r=req.getRequestDispatcher("disply.jsp");
			r.forward(req, resp);
		}
		else {
			RequestDispatcher r=req.getRequestDispatcher("login.jsp");
			r.forward(req, resp);

		}
	}
}
