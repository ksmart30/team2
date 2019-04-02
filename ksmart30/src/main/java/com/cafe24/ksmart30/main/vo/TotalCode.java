package com.cafe24.ksmart30.main.vo;

public class TotalCode extends TotalCodeTree{
	private String busi_gb;
	private String level1_nm;
	private String level2_len;
	private String level2_name_len;
	private String ref1_expenses;
	private String ref1_len;
	public String getBusi_gb() {
		return busi_gb;
	}
	public void setBusi_gb(String busi_gb) {
		this.busi_gb = busi_gb;
	}
	public String getLevel1_nm() {
		return level1_nm;
	}
	public void setLevel1_nm(String level1_nm) {
		this.level1_nm = level1_nm;
	}
	public String getLevel2_len() {
		return level2_len;
	}
	public void setLevel2_len(String level2_len) {
		this.level2_len = level2_len;
	}
	public String getLevel2_name_len() {
		return level2_name_len;
	}
	public void setLevel2_name_len(String level2_name_len) {
		this.level2_name_len = level2_name_len;
	}
	public String getRef1_expenses() {
		return ref1_expenses;
	}
	public void setRef1_expenses(String ref1_expenses) {
		this.ref1_expenses = ref1_expenses;
	}
	public String getRef1_len() {
		return ref1_len;
	}
	public void setRef1_len(String ref1_len) {
		this.ref1_len = ref1_len;
	}
	@Override
	public String toString() {
		return "TotalCode [busi_gb=" + busi_gb + ", level1_nm=" + level1_nm + ", level2_len=" + level2_len
				+ ", level2_name_len=" + level2_name_len + ", ref1_expenses=" + ref1_expenses + ", ref1_len=" + ref1_len
				+ "]";
	}
	
	
}
