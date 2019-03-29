package com.cafe24.ksmart30.team02.baseinfo.vo;

public class AccountCode {
	private String accCd;
	private String accDtlCd;
	private String accShrtNm;
	private String accClas;
	private String DrcrGb;
	private String accLevel;
	public String getAccCd() {
		return accCd;
	}
	public void setAccCd(String accCd) {
		this.accCd = accCd;
	}
	public String getAccDtlCd() {
		return accDtlCd;
	}
	public void setAccDtlCd(String accDtlCd) {
		this.accDtlCd = accDtlCd;
	}
	public String getAccShrtNm() {
		return accShrtNm;
	}
	public void setAccShrtNm(String accShrtNm) {
		this.accShrtNm = accShrtNm;
	}
	public String getAccClas() {
		return accClas;
	}
	public void setAccClas(String accClas) {
		this.accClas = accClas;
	}
	public String getDrcrGb() {
		return DrcrGb;
	}
	public void setDrcrGb(String drcrGb) {
		DrcrGb = drcrGb;
	}
	public String getAccLevel() {
		return accLevel;
	}
	public void setAccLevel(String accLevel) {
		this.accLevel = accLevel;
	}
	@Override
	public String toString() {
		return "AccountCode [accCd=" + accCd + ", accDtlCd=" + accDtlCd + ", accShrtNm=" + accShrtNm + ", accClas="
				+ accClas + ", DrcrGb=" + DrcrGb + ", accLevel=" + accLevel + "]";
	}
	
}
