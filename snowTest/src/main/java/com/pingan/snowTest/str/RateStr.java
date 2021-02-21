package com.pingan.snowTest.str;

public class RateStr {
	
	private String prdName;
	private String rateDate;

	private String prdRate;
	
	public RateStr() {
		super();
	}

	public RateStr(String prdName, String rateDate, String prdRate) {
		super();
		this.prdName = prdName;
		this.rateDate = rateDate;
		this.prdRate = prdRate;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getRateDate() {
		return rateDate;
	}

	public void setRateDate(String rateDate) {
		this.rateDate = rateDate;
	}

	public String getPrdRate() {
		return prdRate;
	}

	public void setPrdRate(String prdRate) {
		this.prdRate = prdRate;
	}

	
}
