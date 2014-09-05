package com.bms.pojo;

import java.util.Date;

public class SysUser {
	
	private String userID;
	private String groupID;		//同事作为BI_GROUP和SYS_ROLE的外键
	private String name;
	private String password;
	private String updUser;
	private Date updDate;
	private String updProg;
	private String status;
	private Date chgUpdDT;
	private String branchUser;
	private Integer buyerCde;
	private String chainCde;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUpdUser() {
		return updUser;
	}

	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public String getUpdProg() {
		return updProg;
	}

	public void setUpdProg(String updProg) {
		this.updProg = updProg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getChgUpdDT() {
		return chgUpdDT;
	}

	public void setChgUpdDT(Date chgUpdDT) {
		this.chgUpdDT = chgUpdDT;
	}

	public String getBranchUser() {
		return branchUser;
	}

	public void setBranchUser(String branchUser) {
		this.branchUser = branchUser;
	}

	public Integer getBuyerCde() {
		return buyerCde;
	}

	public void setBuyerCde(Integer buyerCde) {
		this.buyerCde = buyerCde;
	}

	public String getChainCde() {
		return chainCde;
	}

	public void setChainCde(String chainCde) {
		this.chainCde = chainCde;
	}

	@Override
	public String toString() {
		return "SysUser [userID=" + userID + ", groupID=" + groupID + ", name="
				+ name + ", password=" + password + ", updUser=" + updUser
				+ ", updDate=" + updDate + ", updProg=" + updProg + ", status="
				+ status + ", chgUpdDT=" + chgUpdDT + ", branchUser="
				+ branchUser + ", buyerCde=" + buyerCde + ", chainCde="
				+ chainCde + "]";
	}

}
