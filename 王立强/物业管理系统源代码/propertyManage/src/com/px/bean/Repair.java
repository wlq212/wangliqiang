package com.px.bean;

public class Repair {
	private Integer rpno;
	private Integer rno;
	private String content;
	private Integer price;
	private String time;
	public Repair() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Repair(Integer rpno, Integer rno, String content, Integer price,
			String time) {
		super();
		this.rpno = rpno;
		this.rno = rno;
		this.content = content;
		this.price = price;
		this.time = time;
	}
	
	public Repair(Integer rno, String content, Integer price, 
			String time,Integer rpno) {
		super();
		this.rpno = rpno;
		this.rno = rno;
		this.content = content;
		this.price = price;
		this.time = time;
	}
	public Integer getRpno() {
		return rpno;
	}
	public void setRpno(Integer rpno) {
		this.rpno = rpno;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	@Override
	public String toString() {
		return "Repair [rpno=" + rpno + ", rno=" + rno + ", content=" + content
				+ ", price=" + price + ", time=" + time + "]";
	}
	

}
