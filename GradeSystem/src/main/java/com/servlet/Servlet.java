package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Service.ServiceProvider;
import com.entity.student;




@WebServlet("/register")
public class Servlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
	
		String name=req.getParameter("name");
		int english=Integer.parseInt(req.getParameter("english"));
		int hindi=Integer.parseInt(req.getParameter("hindi"));
		int math=Integer.parseInt(req.getParameter("math"));
		int social=Integer.parseInt(req.getParameter("social"));
		int science=Integer.parseInt(req.getParameter("science"));
		int sanskrit=Integer.parseInt(req.getParameter("sanskrit"));
		
		int total = english+hindi+math+social+science+sanskrit;
		Double per=(double) (total/6);
		String grade = null;
		if(per>=80) {
			grade = "A";
			
		}else if(per>=60){
			grade ="B";
			
		}else if(per>=45) {
			
			grade = "C";
		}
		
			HttpSession se= req.getSession();
		student s = new student(name,math,hindi,english,sanskrit,science,social,total,per,grade);
			
			Session v=ServiceProvider.Service().openSession();
			Transaction t = v.beginTransaction();
			 v.save(s);
			t.commit();
			
			v.close();
			se.setAttribute("ss", "Data Updated");
			
				res.sendRedirect("view.jsp");
			
			
			
			
			
			
			
			
	}}
			
			
			
			
			
			

