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
	private Boolean bstatus;

	public Fieldrentinfo() {
	}

	public Fieldrentinfo(long lfieldRentId, Fieldinfo fieldinfo, Date dstartTime, Date dendTime, int irent) {
		this.lfieldRentId = lfieldRentId;
		this.fieldinfo = fieldinfo;
		this.dstartTime = dstartTime;
		this.dendTime = dendTime;
		this.irent = irent;
	}

	public Fieldrentinfo(long lfieldRentId, Fieldinfo fieldinfo, Userinfo userinfo, Date dstartTime, Date dendTime,
			int irent, Boolean bstatus) {
		this.lfieldRentId = lfieldRentId;
		this.fieldinfo = fieldinfo;
		this.userinfo = userinfo;
		this.dstartTime = dstartTime;
		this.dendTime = dendTime;
		this.irent = irent;
		this.bstatus = bstatus;
	}

	public long getLfieldRentId() {
		return this.lfieldRentId;
	}

	public void setLfieldRentId(long lfieldRentId) {
		this.lfieldRentId = lfieldRentId;
	}

	public Fieldinfo getFieldinfo() {
		return this.fieldinfo;
	}

	public void setFieldinfo(Fieldinfo fieldinfo) {
		this.fieldinfo = fieldinfo;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Date getDstartTime() {
		return this.dstartTime;
	}

	public void setDstartTime(Date dstartTime) {
		this.dstartTime = dstartTime;
	}

	public Date getDendTime() {
		return this.dendTime;
	}

	public void setDendTime(Date dendTime) {
		this.dendTime = dendTime;
	}

	public int getIrent() {
		return this.irent;
	}

	public void setIrent(int irent) {
		this.irent = irent;
	}

	public Boolean getBstatus() {
		return this.bstatus;
	}

	public void setBstatus(Boolean bstatus) {
		this.bstatus = bstatus;
	}

}
