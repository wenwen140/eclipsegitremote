package com.pingan.snowTest.vo;

import java.math.BigDecimal;

public class Nav {

	private String prdName;
	private String navDate;

	private BigDecimal initNav;
	private BigDecimal totalNav;

	public Nav() {
		super();
	}

	public Nav(String prdName, String navDate, BigDecimal initNav, BigDecimal totalNav) {
		super();
		this.prdName = prdName;
		this.navDate = navDate;
		this.initNav = initNav;
		this.totalNav = totalNav;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getNavDate() {
		return navDate;
	}

	public void setNavDate(String navDate) {
		this.navDate = navDate;
	}

	public BigDecimal getInitNav() {
		return initNav;
	}

	public void setInitNav(BigDecimal initNav) {
		this.initNav = initNav;
	}

	public BigDecimal getTotalNav() {
		return totalNav;
	}

	public void setTotalNav(BigDecimal totalNav) {
		this.totalNav = totalNav;
	}

}
