package com.px.bean;

public class Train {
	private Integer tno;
	private String content;
	private String time;
	private Integer sno;
	private String name;
	private String behave;
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Train(Integer tno, String content, String time, Integer sno,
			String name, String behave) {
		super();
		this.tno = tno;
		this.content = content;
		this.time = time;
		this.sno = sno;
		this.name = name;
		this.behave = behave;
	}
	
	public Train(String content, String time, String behave, Integer tno) {
		super();
		this.tno = tno;
		this.content = content;
		this.time = time;
		this.behave = behave;
	}
	public Integer getTno() {
		return tno;
	}
	public void setTno(Integer tno) {
		this.tno = tno;
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
	public String getBehave() {
		return behave;
	}
	public void setBehave(String behave) {
		this.behave = behave;
	}
	@Override
	public String toString() {
		return "Train [tno=" + tno + ", content=" + content + ", time=" + time
				+ ", sno=" + sno + ", name=" + name + ", behave=" + behave
				+ "]";
	}
	

}
