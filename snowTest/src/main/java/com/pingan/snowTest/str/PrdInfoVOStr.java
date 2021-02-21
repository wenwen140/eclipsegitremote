package com.pingan.snowTest.str;

import java.util.List;

public class PrdInfoVOStr {
 
    private int id;
    private String userName;
    /**
     * 以下两个字段用户模拟自定义转换
     */
    private String gmtBroth;
    private String balance;
    
    
    private List<NavStr> navList;
    private List<RateStr> rateList;
    
 
    public PrdInfoVOStr() {
		super();
	}

	public PrdInfoVOStr(Integer id, String userName, String gmtBroth, String balance) {
        this.id = id;
        this.userName = userName;
        this.gmtBroth = gmtBroth;
        this.balance = balance;
        
    }

	public List<NavStr> getNavList() {
		return navList;
	}

	public void setNavList(List<NavStr> navList) {
		this.navList = navList;
	}



	public List<RateStr> getRateList() {
		return rateList;
	}



	public void setRateList(List<RateStr> rateList) {
		this.rateList = rateList;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGmtBroth() {
		return gmtBroth;
	}

	public void setGmtBroth(String gmtBroth) {
		this.gmtBroth = gmtBroth;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

    
    
}
