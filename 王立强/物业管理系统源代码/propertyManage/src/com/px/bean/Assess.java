package com.px.bean;

public class Assess {
	private Integer ano;
	private String content;
	private String time;
	private Integer sno;
	private String name;
	private String rank;
	public Assess() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assess(Integer ano, String content, String time,Integer sno,
			String name, String rank) {
		super();
		this.ano = ano;
		this.content = content;
		this.time = time;
		this.sno = sno;
		this.name = name;
		this.rank = rank;
	}
	
	public Assess( String content, String time, String rank, Integer ano) {
		super();
		this.ano = ano;
		this.content = content;
		this.time = time;
		this.rank = rank;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
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
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Assess [ano=" + ano + ", content=" + content + ", time=" + time
				+ ",  sno=" + sno + ", name=" + name + ", rank=" + rank
				+ "]";
	}
	
}
