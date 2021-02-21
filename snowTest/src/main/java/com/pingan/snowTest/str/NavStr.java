package com.pingan.snowTest.str;

public class NavStr {

	private String prdName;
	private String navDate;

	private String initNav;
	private String totalNav;

	public NavStr() {
		super();
	}

	public NavStr(String prdName, String navDate, String initNav, String totalNav) {
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

	public String getInitNav() {
		return initNav;
	}

	public void setInitNav(String initNav) {
		this.initNav = initNav;
	}

	public String getTotalNav() {
		return totalNav;
	}

	public void setTotalNav(String totalNav) {
		this.totalNav = totalNav;
	}

}
