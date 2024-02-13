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
@WebServlet("/login")
public class login_controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s=new Student();
		String email=req.getParameter("email");
		String password=req.getParameter("password");

		Student_dao dao=new Student_dao();
		Student s1=dao.loginStudent(email);

		if(s1.getEmail().equals(email)&& s1.getPassword().equals(password)) {
			List<Student> list= dao.featchall();
			req.setAttribute("list", list);
			RequestDispatcher r=req.getRequestDispatcher("disply.jsp");
			r.forward(req, resp);
//					req.setAttribute("list", "login sucess");
			//		RequestDispatcher r=req.getRequestDispatcher("disply.jsp");
			//		r.forward(req, resp);


		}else {
			req.setAttribute("message", "invalid email");
			RequestDispatcher r=req.getRequestDispatcher("login.jsp");
			r.include(req, resp);

		}
	}
}
