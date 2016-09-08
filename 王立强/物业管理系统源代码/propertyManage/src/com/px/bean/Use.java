package com.px.bean;

public class Use {
	private Integer uno;
	private String uname;
	private String password;
	private String sex;
	private Integer age;
	private String carid;
	private String pet;
	private Long phone;
	private String father;
	private String mother;
	public Use() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Use(Integer uno, String uname, String password, String sex,
			Integer age, String carid, String pet, Long phone,
			String father, String mother) {
		super();
		this.uno = uno;
		this.uname = uname;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.carid = carid;
		this.pet = pet;
		this.phone = phone;
		this.father = father;
		this.mother = mother;
	}
	
	public Use(String carid, String pet, Long phone, Integer uno) {
		super();
		this.uno = uno;
		this.carid = carid;
		this.pet = pet;
		this.phone = phone;
	}
	public Integer getUno() {
		return uno;
	}
	public void setUno(Integer uno) {
		this.uno = uno;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	@Override
	public String toString() {
		return "Use [uno=" + uno + ", uname=" + uname + ", password="
				+ password + ", sex=" + sex + ", age=" + age + ", carid="
				+ carid + ", pet=" + pet + ", phone=" + phone + ", father="
				+ father + ", mother=" + mother + "]";
	}
	

}
