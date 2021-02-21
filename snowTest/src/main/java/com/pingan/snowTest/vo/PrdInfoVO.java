package com.pingan.snowTest.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class PrdInfoVO {
 
    private int id;
    private String userName;
    /**
     * 以下两个字段用户模拟自定义转换
     */
    private LocalDateTime gmtBroth;
    private BigDecimal balance;
    
    
    private List<Nav> navList;
    private List<Rate> rateList;
    
 
    public PrdInfoVO() {
		super();
	}

	public PrdInfoVO(Integer id, String userName, LocalDateTime gmtBroth, BigDecimal balance) {
        this.id = id;
        this.userName = userName;
        this.gmtBroth = gmtBroth;
        this.balance = balance;
        
    }

	public List<Nav> getNavList() {
		return navList;
	}

	public void setNavList(List<Nav> navList) {
		this.navList = navList;
	}



	public List<Rate> getRateList() {
		return rateList;
	}



	public void setRateList(List<Rate> rateList) {
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

	public LocalDateTime getGmtBroth() {
		return gmtBroth;
	}

	public void setGmtBroth(LocalDateTime gmtBroth) {
		this.gmtBroth = gmtBroth;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
    
    
}
