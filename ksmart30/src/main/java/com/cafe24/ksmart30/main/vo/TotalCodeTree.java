package com.cafe24.ksmart30.main.vo;

public class TotalCodeTree{
	private String id;
	private String pid;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TotalCodeTree [id=" + id + ", pid=" + pid + ", name=" + name + "]";
	}
	
}
