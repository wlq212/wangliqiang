package com.px.bean;

public class Village {
	private Integer vno;
	private String name;
	private String introduce;
	private Integer sno;
	private String admini;
	private Integer num;
	public Village() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Village(Integer vno, String name, String introduce, Integer sno,
			String admini, Integer num) {
		super();
		this.vno = vno;
		this.name = name;
		this.introduce = introduce;
		this.sno = sno;
		this.admini = admini;
		this.num = num;
	}
	
	public Village(String introduce, Integer sno, String admini,Integer vno) {
		super();
		this.vno = vno;
		this.introduce = introduce;
		this.sno = sno;
		this.admini = admini;
	}
	public Integer getVno() {
		return vno;
	}
	public void setVno(Integer vno) {
		this.vno = vno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
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
	@Override
	public String toString() {
		return "Village [vno=" + vno + ", name=" + name + ", introduce="
				+ introduce + ", sno=" + sno + ", admini=" + admini + ", num="
				+ num + "]";
	}
	

}
