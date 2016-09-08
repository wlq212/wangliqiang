package com.px.bean;

public class Stuff {
	private Integer sno;
	private String sname;
	private String password;
	private String sex;
	private Integer age;
	private String education;
	private String address;
	private String email;
	private Long phone;
	private String status;
	private String father;
	private String fworkerplace;
	private String mother;
	private String mworkerplace;
	public Stuff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stuff(Integer sno, String sname, String password, String sex,
			Integer age, String education, String address, String email,
			Long phone, String status, String father, String fworkerplace,
			String mother, String mworkerplace) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.education = education;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.status = status;
		this.father = father;
		this.fworkerplace = fworkerplace;
		this.mother = mother;
		this.mworkerplace = mworkerplace;
	}
	
	public Stuff(String education, String address, String email,
			Long phone, String status, Integer sno) {
		super();
		this.sno = sno;
		this.education = education;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getFworkerplace() {
		return fworkerplace;
	}
	public void setFworkerplace(String fworkerplace) {
		this.fworkerplace = fworkerplace;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getMworkerplace() {
		return mworkerplace;
	}
	public void setMworkerplace(String mworkerplace) {
		this.mworkerplace = mworkerplace;
	}
	@Override
	public String toString() {
		return "Stuff [sno=" + sno + ", sname=" + sname + ", password="
				+ password + ", sex=" + sex + ", age=" + age + ", education="
				+ education + ", address=" + address + ", email=" + email
				+ ", phone=" + phone + ", status=" + status + ", father="
				+ father + ", fworkerplace=" + fworkerplace + ", mother="
				+ mother + ", mworkerplace=" + mworkerplace + "]";
	}
	

}
