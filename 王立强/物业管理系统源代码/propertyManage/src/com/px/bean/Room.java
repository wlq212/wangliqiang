package com.px.bean;

public class Room {
	private Integer rno;
	private String facility;
	private Integer area;
	private Integer uno;
	private String name;
	private Integer vno;
	private String namee;
	private Integer bno;
	private String nname;
	private String live;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(Integer rno, String facility, Integer area, Integer uno,
			String name, Integer vno, String namee, Integer bno, String nname,
			String live) {
		super();
		this.rno = rno;
		this.facility = facility;
		this.area = area;
		this.uno = uno;
		this.name = name;
		this.vno = vno;
		this.namee = namee;
		this.bno = bno;
		this.nname = nname;
		this.live = live;
	}
	
	public Room( String facility, Integer uno, String name,Integer rno) {
		super();
		this.rno = rno;
		this.facility = facility;
		this.uno = uno;
		this.name = name;
	}
	public Integer getRno() {
		return rno;
	}
	public void setRno(Integer rno) {
		this.rno = rno;
	}
	public String getFacility() {
		return facility;
	}
	public void setFacility(String facility) {
		this.facility = facility;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
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
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public String getLive() {
		return live;
	}
	public void setLive(String live) {
		this.live = live;
	}
	@Override
	public String toString() {
		return "Room [rno=" + rno + ", facility=" + facility + ", area=" + area
				+ ", uno=" + uno + ", name=" + name + ", vno=" + vno
				+ ", namee=" + namee + ", bno=" + bno + ", nname=" + nname
				+ ", live=" + live + "]";
	}
	

}
