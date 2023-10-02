package com.delete;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Service.ServiceProvider;
import com.entity.student;

@WebServlet("/Delete")
public class Delete extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		
		
		int i =Integer.parseInt(req.getParameter("note-id").trim());
		
		Session s = ServiceProvider.Service().openSession();
		Transaction t=s.beginTransaction();
		student v =(student) s.get(student.class,i);
		s.delete(v);
		t.commit();
		s.close();
		res.sendRedirect("view.jsp");
		
		
		
	}
}
