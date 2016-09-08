package com.px.bean;

public class Building {
	private Integer bno;
	private String name;
	private String style;
	private Integer height;
	private Integer uno;
	private String admini;
	private Integer num;
	private Integer vno;
	private String namee;
	public Building() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Building(Integer bno, String name, String style, Integer height,
			Integer uno, String admini, Integer num, Integer vno, String namee) {
		super();
		this.bno = bno;
		this.name = name;
		this.style = style;
		this.height = height;
		this.uno = uno;
		this.admini = admini;
		this.num = num;
		this.vno = vno;
		this.namee = namee;
	}
	
	public Building( Integer uno, String admini, Integer num, Integer bno) {
		super();
		this.bno = bno;
		this.uno = uno;
		this.admini = admini;
		this.num = num;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getUno() {
		return uno;
	}
	public void setUno(Integer uno) {
		this.uno = uno;
	}
	public String getAdmini() {
		return admini;
	}
	public void setAdmini(String admini) {
		this.admini = admini;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getVno() {
		return vno;
	}
	public void setVno(Integer vno) {
		this.vno = vno;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	@Override
	public String toString() {
		return "Building [bno=" + bno + ", name=" + name + ", style=" + style
				+ ", height=" + height + ", uno=" + uno + ", admini=" + admini
				+ ", num=" + num + ", vno=" + vno + ", namee=" + namee + "]";
	}
	

}
