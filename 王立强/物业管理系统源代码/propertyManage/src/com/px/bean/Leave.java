package com.px.bean;

public class Leave {
	private Integer lno;
	private String reason;
	private String time;
	private Integer sno;
	private String name;
	public Leave() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leave(Integer lno, String reason, String time, Integer sno,
			String name) {
		super();
		this.lno = lno;
		this.reason = reason;
		this.time = time;
		this.sno = sno;
		this.name = name;
	}
	
	public Leave( String reason, String time,Integer lno) {
		super();
		this.lno = lno;
		this.reason = reason;
		this.time = time;
	}
	public Integer getLno() {
		return lno;
	}
	public void setLno(Integer lno) {
		this.lno = lno;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
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
		return "Leave [lno=" + lno + ", reason=" + reason + ", time=" + time
				+ ", sno=" + sno + ", name=" + name + "]";
	}
	

}
