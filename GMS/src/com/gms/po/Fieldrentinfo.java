package com.gms.po;
// Generated 2017-5-21 12:46:56 by Hibernate Tools 5.2.0.Beta1

import java.util.Date;

/**
 * Filedrentinfo generated by hbm2java
 */
public class Fieldrentinfo implements java.io.Serializable {

	private long lfieldRentId;
	private Fieldinfo fieldinfo;
	private Userinfo userinfo;
	private Date dstartTime;
	private Date dendTime;
	private int irent;
	private Boolean bstatus; // ��������¼��Ч״̬

	public long getLfieldRentId() {
		return lfieldRentId;
	}

	public void setLfieldRentId(long lfieldRentId) {
		this.lfieldRentId = lfieldRentId;
	}

	public Fieldinfo getFieldinfo() {
		return fieldinfo;
	}

	public void setFieldinfo(Fieldinfo fieldinfo) {
		this.fieldinfo = fieldinfo;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Date getDstartTime() {
		return dstartTime;
	}

	public void setDstartTime(Date dstartTime) {
		this.dstartTime = dstartTime;
	}

	public Date getDendTime() {
		return dendTime;
	}

	public void setDendTime(Date dendTime) {
		this.dendTime = dendTime;
	}

	public int getIrent() {
		return irent;
	}

	public void setIrent(int irent) {
		this.irent = irent;
	}

	public Boolean getBstatus() {
		return bstatus;
	}

	public void setBstatus(Boolean bstatus) {
		this.bstatus = bstatus;
	}

}