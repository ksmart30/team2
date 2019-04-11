/* 8.1.전표입력
 * @file      SlipDetailDomain.java
 * @brief    전표상세 Domain
 * @author  ksmart30 박찬업
 */
package ksmart30.team02.account.domain;

public class SlipDetailDomain {
	private String ACC_UNIT;
	private String SLIP_DATE;
	private String SLIP_NO;
	private String JS_CODE;
	private String SLIP_SEQ;
	private String ACC_CD;
	private String ACC_DTL_CD;
	private String BELONG_DEPT_CD;
	private String DRCR_GB;
	private String ACC_AMT;
	private String DESCR;
	
	public String getACC_UNIT() {
		return ACC_UNIT;
	}
	public void setACC_UNIT(String aCC_UNIT) {
		ACC_UNIT = aCC_UNIT;
	}
	public String getSLIP_DATE() {
		return SLIP_DATE;
	}
	public void setSLIP_DATE(String sLIP_DATE) {
		SLIP_DATE = sLIP_DATE;
	}
	public String getSLIP_NO() {
		return SLIP_NO;
	}
	public void setSLIP_NO(String sLIP_NO) {
		SLIP_NO = sLIP_NO;
	}
	public String getJS_CODE() {
		return JS_CODE;
	}
	public void setJS_CODE(String jS_CODE) {
		JS_CODE = jS_CODE;
	}
	public String getSLIP_SEQ() {
		return SLIP_SEQ;
	}
	public void setSLIP_SEQ(String sLIP_SEQ) {
		SLIP_SEQ = sLIP_SEQ;
	}
	public String getACC_CD() {
		return ACC_CD;
	}
	public void setACC_CD(String aCC_CD) {
		ACC_CD = aCC_CD;
	}
	public String getACC_DTL_CD() {
		return ACC_DTL_CD;
	}
	public void setACC_DTL_CD(String aCC_DTL_CD) {
		ACC_DTL_CD = aCC_DTL_CD;
	}
	public String getBELONG_DEPT_CD() {
		return BELONG_DEPT_CD;
	}
	public void setBELONG_DEPT_CD(String bELONG_DEPT_CD) {
		BELONG_DEPT_CD = bELONG_DEPT_CD;
	}
	public String getDRCR_GB() {
		return DRCR_GB;
	}
	public void setDRCR_GB(String dRCR_GB) {
		DRCR_GB = dRCR_GB;
	}
	public String getACC_AMT() {
		return ACC_AMT;
	}
	public void setACC_AMT(String aCC_AMT) {
		ACC_AMT = aCC_AMT;
	}	
	public String getDESCR() {
		return DESCR;
	}
	public void setDESCR(String dESCR) {
		DESCR = dESCR;
	}
	
	@Override
	public String toString() {
		return "SlipDetailDomain [ACC_UNIT=" + ACC_UNIT + ", SLIP_DATE=" + SLIP_DATE + ", SLIP_NO=" + SLIP_NO
				+ ", JS_CODE=" + JS_CODE + ", SLIP_SEQ=" + SLIP_SEQ + ", ACC_CD=" + ACC_CD + ", ACC_DTL_CD="
				+ ACC_DTL_CD + ", BELONG_DEPT_CD=" + BELONG_DEPT_CD + ", DRCR_GB=" + DRCR_GB + ", ACC_AMT=" + ACC_AMT
				+ ", DESCR=" + DESCR + "]";
	}
	
	
}
