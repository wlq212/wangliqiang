package com.px.bean;

public class Bhouse {
	private Integer bhno;
	private Integer rno;
	private String time;
	private String style;
	private String retur;
	public Bhouse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bhouse(Integer bhno, Integer rno, String time, String style,
			String retur) {
		super();
		this.bhno = bhno;
		this.rno = rno;
		this.time = time;
		this.style = style;
		this.retur = retur;
	}
	
	public Bhouse( Integer rno, String time, String style,
			String retur, Integer bhno) {
		super();
		this.bhno = bhno;
		this.rno = rno;
		this.time = time;
		this.style = style;
		this.retur = retur;
	}
	public Integer getBhno() {
		return bhno;
	}
	public void setBhno(Integer bhno) {
		this.bhno = bhno;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getRetur() {
		return retur;
	}
	public void setRetur(String retur) {
		this.retur = retur;
	}
	@Override
	public String toString() {
		return "Bhouse [bhno=" + bhno + ", rno=" + rno + ", time=" + time
				+ ", style=" + style + ", retur=" + retur + "]";
	}
	

}

