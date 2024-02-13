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
@WebServlet("/update")
public class Update_controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		Student_dao dao=new Student_dao();
		Student student=dao.featch(id);
		if(student!=null) {
			req.setAttribute("student", student);
			RequestDispatcher r=req.getRequestDispatcher("edit.jsp");
			r.forward(req, resp);
		}
	}
}
