package com.pingan.snowTest.po;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class UserDO {
 
    private int id;
    private String userName;
    /**
     * 以下两个字段用户模拟自定义转换
     */
    private LocalDateTime gmtBroth;
    private BigDecimal balance;
 
    public UserDO(Integer id, String userName, LocalDateTime gmtBroth, BigDecimal balance) {
        this.id = id;
        this.userName = userName;
        this.gmtBroth = gmtBroth;
        this.balance = balance;
        
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
