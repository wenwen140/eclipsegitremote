package com.pingan.snowTest.vo;

import java.math.BigDecimal;

public class Rate {
	
	private String prdName;
	private String rateDate;

	private BigDecimal prdRate;
	
	public Rate() {
		super();
	}

	public Rate(String prdName, String rateDate, BigDecimal prdRate) {
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

	public BigDecimal getPrdRate() {
		return prdRate;
	}

	public void setPrdRate(BigDecimal prdRate) {
		this.prdRate = prdRate;
	}

	
}
