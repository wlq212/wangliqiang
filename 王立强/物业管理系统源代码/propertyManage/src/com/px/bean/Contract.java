package com.px.bean;

public class Contract {
	private Integer cno;
	private String content;
	private String begintime;
	private Integer time;
	private Integer sno;
	private String name;
	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contract(Integer cno, String content, String begintime,
			Integer time, Integer sno, String name) {
		super();
		this.cno = cno;
		this.content = content;
		this.begintime = begintime;
		this.time = time;
		this.sno = sno;
		this.name = name;
	}
	
	public Contract( String content, String begintime, Integer time , Integer cno) {
		super();
		this.cno = cno;
		this.content = content;
		this.begintime = begintime;
		this.time = time;
	}
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBegintime() {
		return begintime;
	}
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Contract [cno=" + cno + ", content=" + content + ", begintime="
				+ begintime + ", time=" + time + ", sno=" + sno + ", name="
				+ name + "]";
	}
	
	

}
