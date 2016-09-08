package com.px.bean;

public class Debt {
	private Integer dno;
	private Integer rno;
	private Integer price;
	private String time;
	private String pay;
	public Debt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Debt(Integer dno, Integer rno, Integer price, String time, String pay) {
		super();
		this.dno = dno;
		this.rno = rno;
		this.price = price;
		this.time = time;
		this.pay = pay;
	}
	
	public Debt(Integer rno, Integer price, String time, String pay, Integer dno) {
		super();
		this.dno = dno;
		this.rno = rno;
		this.price = price;
		this.time = time;
		this.pay = pay;
	}
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Debt [dno=" + dno + ", rno=" + rno + ", price=" + price
				+ ", time=" + time + ", pay=" + pay + "]";
	}
	

}
