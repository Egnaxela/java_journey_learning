package com.rongji.entity;

import com.google.gson.annotations.SerializedName;

public class UserInfo {
	private String userCode;
	
	@SerializedName(value="userName",alternate={"UserName","username","User_Name","user_Name"})
	private String userName;
	private String companyCode;
    private String businessOrgCode;
    private Integer age;
    private Double money;
    
    
    
	public UserInfo() {
		
	}
	
	public UserInfo(String userCode, String userName, String companyCode, String businessOrgCode, Integer age,
			Double money) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.companyCode = companyCode;
		this.businessOrgCode = businessOrgCode;
		this.age = age;
		this.money = money;
	}



	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getBusinessOrgCode() {
		return businessOrgCode;
	}

	public void setBusinessOrgCode(String businessOrgCode) {
		this.businessOrgCode = businessOrgCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "UserInfo [userCode=" + userCode + ", userName=" + userName + ", companyCode=" + companyCode
				+ ", businessOrgCode=" + businessOrgCode + ", age=" + age + ", money=" + money + "]";
	}

	
}
