package com.entity;

import javax.persistence.Id;
import javax.persistence.Entity;



@Entity
public class student {

	@Id
	private int id;
	private String name;
	private int maths;
	private int hindi;
	private int english;
	private int sanskrit;
	private int science;
	private int social;
	private int total;
	private double per;
	private String Grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getSanskrit() {
		return sanskrit;
	}
	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student( String name, int maths, int hindi, int english, int sanskrit, int science, int social,
			int total, double per, String grade) {
		super();
		
		this.name = name;
		this.maths = maths;
		this.hindi = hindi;
		this.english = english;
		this.sanskrit = sanskrit;
		this.science = science;
		this.social = social;
		this.total = total;
		this.per = per;
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", maths=" + maths + ", hindi=" + hindi + ", english=" + english
				+ ", sanskrit=" + sanskrit + ", science=" + science + ", social=" + social + ", total=" + total
				+ ", per=" + per + ", Grade=" + Grade + "]";
	}
}
