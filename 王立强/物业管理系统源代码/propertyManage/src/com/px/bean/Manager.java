package com.px.bean;

public class Manager {
	private Integer mno;
	private String mname;
	private String password;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(Integer mno, String mname, String password) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.password = password;
	}
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Manager [mno=" + mno + ", mname=" + mname + ", password="
				+ password + "]";
	}
	

}
