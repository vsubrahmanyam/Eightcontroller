package com.sphibmvc.model;

import java.io.Serializable;
import java.util.Date;

public class ScfBean implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5468732529433371061L;
	
	private Date scfuCreateDate = new Date();
	private Date scfuLastUpdate = new Date();
	private Date scfuLoginTime = new Date();
	private String scfuGuid  = java.util.UUID.randomUUID()+"";
	
	public String getScfuGuid() {
		return scfuGuid;
	}
	public void setScfuGuid(String scfuGuid) {
		this.scfuGuid = scfuGuid;
	}
	public Date getScfuCreateDate() {
		return scfuCreateDate;
	}
	public void setScfuCreateDate(Date scfuCreateDate) {
		this.scfuCreateDate = scfuCreateDate;
	}
	public Date getScfuLastUpdate() {
		return scfuLastUpdate;
	}
	public void setScfuLastUpdate(Date scfuLastUpdate) {
		this.scfuLastUpdate = scfuLastUpdate;
	}
	public Date getScfuLoginTime() {
		return scfuLoginTime;
	}
	public void setScfuLoginTime(Date scfuLoginTime) {
		this.scfuLoginTime = scfuLoginTime;
	}

}
