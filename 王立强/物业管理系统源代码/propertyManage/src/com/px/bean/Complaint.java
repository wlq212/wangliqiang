package com.px.bean;

public class Complaint {
	private Integer cono;
	private Integer uno;
	private String name;
	private String content;
	private String time;
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(Integer cono, Integer uno, String name, String content,
			String time) {
		super();
		this.cono = cono;
		this.uno = uno;
		this.name = name;
		this.content = content;
		this.time = time;
	}
	
	public Complaint(String content, String time, Integer cono) {
		super();
		this.cono = cono;
		this.content = content;
		this.time = time;
	}
	public Integer getCono() {
		return cono;
	}
	public void setCono(Integer cono) {
		this.cono = cono;
	}
	public Integer getUno() {
		return uno;
	}
	public void setUno(Integer uno) {
		this.uno = uno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Complaint [cono=" + cono + ", uno=" + uno + ", name=" + name
				+ ", content=" + content + ", time=" + time + "]";
	}
	

}
