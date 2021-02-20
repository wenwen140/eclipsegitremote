package com.pingan.snowTest.dto;

public class UserDomain {
    private Integer id;
    private String userName;
    
    /**
     * 以下两个字段用户模拟自定义转换
     */
    private String gmtBroth;
    private String balance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
