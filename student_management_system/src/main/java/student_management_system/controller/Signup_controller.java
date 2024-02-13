package student_management_system.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_management_system.dao.Student_dao;
import student_management_system.dto.Student;
@WebServlet("/signup")
public class Signup_controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s= new Student();
		s.setName(req.getParameter("name"));
		s.setAddress(req.getParameter("address"));
		s.setEmail(req.getParameter("email"));
		s.setPassword( req.getParameter("password")) ;

		Student_dao dao=new Student_dao();
		Student s1=dao.saveStudent(s);
		if(s1!=null) {
			req.setAttribute("message", "Signup Sucessfully");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(req, resp);
		}


	}
}
