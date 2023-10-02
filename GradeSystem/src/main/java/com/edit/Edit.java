package com.edit;

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

@WebServlet("/edit")
public class Edit extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		
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
		
		int id = Integer.parseInt(req.getParameter("note").trim());
		Session s = ServiceProvider.Service().openSession();
		Transaction t = s.beginTransaction();
		
		student se= s.get(student.class, id);
		se.setEnglish(english);
		se.setGrade(grade);
		se.setHindi(hindi);
		se.setId(id);
		se.setMaths(math);
		se.setPer(per);
		se.setSanskrit(sanskrit);
		se.setScience(science);
		se.setTotal(total);
		se.setSocial(social);
		
		t.commit();
		s.close();
		res.sendRedirect("view.jsp");
		
	}
}
