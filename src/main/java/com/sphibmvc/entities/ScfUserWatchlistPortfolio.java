package com.sphibmvc.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="scf_user_portfolio")
public class ScfUserWatchlistPortfolio {
	@Id
	@GeneratedValue
	private Integer scfuport_id;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "scfuport_scfu_id", updatable = true, nullable = true)
	private ScfUser scfUser;
	
	 
	/*@ManyToMany(mappedBy="watchlistInv")
	private List<ScfUserInvestor> scfUserInvestor;
	*/
//	private ScfUserStarup scfUserStarup;
	private Integer scfuport_scfu_ut_id;
	
	public Integer getScfuport_id() {
		return scfuport_id;
	}
	
	public void setScfuport_id(Integer scfuport_id) {
		this.scfuport_id = scfuport_id;
	}
	
	public ScfUser getScfUser() {
		return scfUser;
	}
	
	public void setScfUser(ScfUser scfUser) {
		this.scfUser = scfUser;
	}
	/*	
	public List<ScfUserInvestor> getScfUserInvestor() {
		return scfUserInvestor;
	}
	
	
	
	public void setScfUserInvestor(List<ScfUserInvestor> scfUserInvestor) {
		this.scfUserInvestor = scfUserInvestor;
	}
	public ScfUserStarup getScfUserStarup() {
		return scfUserStarup;
	}
	public void setScfUserStarup(ScfUserStarup scfUserStarup) {
		this.scfUserStarup = scfUserStarup;
	}*/
	public Integer getScfuport_scfu_ut_id() {
		return scfuport_scfu_ut_id;
	}
	public void setScfuport_scfu_ut_id(Integer scfuport_scfu_ut_id) {
		this.scfuport_scfu_ut_id = scfuport_scfu_ut_id;
	}
	
}
