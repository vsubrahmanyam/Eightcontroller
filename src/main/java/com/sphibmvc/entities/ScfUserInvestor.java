package com.sphibmvc.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="scf_user_investors")
public class ScfUserInvestor {

	 @Id
	 @GeneratedValue
	private Integer scfuinv_id;
	private String scfuinv_guid;
	private String scfuinv_comp_name;
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="scfuinv_dc_id",updatable = true,nullable=true)
	private DomainCountry scfuinv_dc_id;
	private Integer scfuinv_dtit_id;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="scfuinv_dcty_id")
	private DomainCity scfuinv_dcty_id;
	
	private Integer scfuinv_duit_id;
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="scfuinv_dst_id")
	private DomainState scfuinv_dst_id;
	private String scfuinv_zip;
	private Integer scfuinv_duir_id;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "scfuinv_scfu_id", updatable = true, nullable = true)
	private ScfUser scfUser;
	private String scfuinv_addr;
	private String scfuinv_fname;
	private String scfuinv_lname;
	private String scfuinv_email;
	private String scfuinv_phone;
	private String scfuinv_fund_type;
	private String scfuinv_intr_industries;
	private String scfuinv_intr_countries;
	private String scfuinv_preffered_contact;
	@Column(name = "scfuinv_create_date", updatable = true, nullable = true)
	@Temporal(TemporalType.DATE)
    private Date scfuinv_create_date;
	@Temporal(TemporalType.TIMESTAMP)
	private Date scfuinv_last_update;
	private String scfuinv_desc;
//	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinColumn(name="")
	private Integer scfuinv_min_duir_id;
	private Integer scfuinv_max_duir_id;
	private String scfuinv_one_liner;
	private String scfuinv_capital_needed;
	private String scfuinv_visibility;
	private String scfuinv_rating;
	private String scfuinv_pre_money;
	private String scfuinv_risk;
	private String scfuinv_collatera;
	private String scfuinv_verified;
	private Integer scfuinv_di_id;
	private String scfuinv_client_invest_countries;
	private String scfuinv_type_of_funding;
	private String scfuinv_type_of_access;
	private String scfuinv_acceptance_risk;
	private String scfuinv_investment_objective;
	private String scfuinv_est_net_worth;
	private String scfuinv_investment_experience;
	private Integer scfuinv_investment_amount_min;
	private Integer scfuinv_investment_amount_max;
	private Integer scfuinv_investment_time;
	private String scfuinv_general_investment_knowledge;
	
	@Temporal(TemporalType.DATE)
	private Date scfuinv_relation_date_started;
	private String scfuinv_investment_product_knowledge;
	private String scfuinv_commission;
	private String scfuinv_site_url;
	private String scfuinv_logo;
	private Integer scfuinv_investor_type;
	private Integer scfuinv_client_invest_industries;
 

/*	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="scfuinv_id",updatable = true, nullable = true)*/
	
/*	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "scfuinv_id")*/
	/*@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "scfuport_scfu_id", updatable = true, nullable = true)*/
/*	@ManyToMany(cascade = {CascadeType.ALL} , fetch=FetchType.LAZY)
    @JoinTable(name="scf_user_portfolio", 
   @AssociationOverride(name = "scfuinv_scfu_id",joinColumns= @JoinColumn(name="scfuport_scfu_id")), 
   @AssociationOverride(name = "pk.stock", 
	joinColumns= @JoinColumn(name="scfuport_scfuinv_id")))

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.ScfUserInvestor", cascade=CascadeType.ALL)
	private List<ScfUserWatchlistPortfolio> watchlistInv;
	*/	
	public Integer getScfuinv_id() {
		return scfuinv_id;
	}

	public void setScfuinv_id(Integer scfuinv_id) {
		this.scfuinv_id = scfuinv_id;
	}

	public String getScfuinv_guid() {
		return scfuinv_guid;
	}

	public void setScfuinv_guid(String scfuinv_guid) {
		this.scfuinv_guid = scfuinv_guid;
	}

	public String getScfuinv_comp_name() {
		return scfuinv_comp_name;
	}

	public void setScfuinv_comp_name(String scfuinv_comp_name) {
		this.scfuinv_comp_name = scfuinv_comp_name;
	}

	public DomainCountry getScfuinv_dc_id() {
		return scfuinv_dc_id;
	}

	public void setScfuinv_dc_id(DomainCountry scfuinv_dc_id) {
		this.scfuinv_dc_id = scfuinv_dc_id;
	}

	public Integer getScfuinv_dtit_id() {
		return scfuinv_dtit_id;
	}

	public void setScfuinv_dtit_id(Integer scfuinv_dtit_id) {
		this.scfuinv_dtit_id = scfuinv_dtit_id;
	}

	public DomainCity getScfuinv_dcty_id() {
		return scfuinv_dcty_id;
	}

	public void setScfuinv_dcty_id(DomainCity scfuinv_dcty_id) {
		this.scfuinv_dcty_id = scfuinv_dcty_id;
	}

	public Integer getScfuinv_duit_id() {
		return scfuinv_duit_id;
	}

	public void setScfuinv_duit_id(Integer scfuinv_duit_id) {
		this.scfuinv_duit_id = scfuinv_duit_id;
	}

	public DomainState getScfuinv_dst_id() {
		return scfuinv_dst_id;
	}

	public void setScfuinv_dst_id(DomainState scfuinv_dst_id) {
		this.scfuinv_dst_id = scfuinv_dst_id;
	}

	public String getScfuinv_zip() {
		return scfuinv_zip;
	}

	public void setScfuinv_zip(String scfuinv_zip) {
		this.scfuinv_zip = scfuinv_zip;
	}

	public Integer getScfuinv_duir_id() {
		return scfuinv_duir_id;
	}

	public void setScfuinv_duir_id(Integer scfuinv_duir_id) {
		this.scfuinv_duir_id = scfuinv_duir_id;
	}

	public String getScfuinv_fund_type() {
		return scfuinv_fund_type;
	}

	public void setScfuinv_fund_type(String scfuinv_fund_type) {
		this.scfuinv_fund_type = scfuinv_fund_type;
	}

	public String getScfuinv_intr_industries() {
		return scfuinv_intr_industries;
	}

	public void setScfuinv_intr_industries(String scfuinv_intr_industries) {
		this.scfuinv_intr_industries = scfuinv_intr_industries;
	}

	public String getScfuinv_intr_countries() {
		return scfuinv_intr_countries;
	}

	public void setScfuinv_intr_countries(String scfuinv_intr_countries) {
		this.scfuinv_intr_countries = scfuinv_intr_countries;
	}

	public String getScfuinv_preffered_contact() {
		return scfuinv_preffered_contact;
	}

	public void setScfuinv_preffered_contact(String scfuinv_preffered_contact) {
		this.scfuinv_preffered_contact = scfuinv_preffered_contact;
	}

	public Date getScfuinv_create_date() {
		return scfuinv_create_date;
	}

	public void setScfuinv_create_date(Date scfuinv_create_date) {
		this.scfuinv_create_date = scfuinv_create_date;
	}

	public Date getScfuinv_last_update() {
		return scfuinv_last_update;
	}

	public void setScfuinv_last_update(Date scfuinv_last_update) {
		this.scfuinv_last_update = scfuinv_last_update;
	}
	 
	public String getScfuinv_desc() {
		return scfuinv_desc;
	}

	public void setScfuinv_desc(String scfuinv_desc) {
		this.scfuinv_desc = scfuinv_desc;
	}

	public Integer getScfuinv_min_duir_id() {
		return scfuinv_min_duir_id;
	}

	public void setScfuinv_min_duir_id(Integer scfuinv_min_duir_id) {
		this.scfuinv_min_duir_id = scfuinv_min_duir_id;
	}

	public Integer getScfuinv_max_duir_id() {
		return scfuinv_max_duir_id;
	}

	public void setScfuinv_max_duir_id(Integer scfuinv_max_duir_id) {
		this.scfuinv_max_duir_id = scfuinv_max_duir_id;
	}

	public String getScfuinv_one_liner() {
		return scfuinv_one_liner;
	}

	public void setScfuinv_one_liner(String scfuinv_one_liner) {
		this.scfuinv_one_liner = scfuinv_one_liner;
	}

	public String getScfuinv_capital_needed() {
		return scfuinv_capital_needed;
	}

	public void setScfuinv_capital_needed(String scfuinv_capital_needed) {
		this.scfuinv_capital_needed = scfuinv_capital_needed;
	}

	public String getScfuinv_visibility() {
		return scfuinv_visibility;
	}

	public void setScfuinv_visibility(String scfuinv_visibility) {
		this.scfuinv_visibility = scfuinv_visibility;
	}

	public String getScfuinv_rating() {
		return scfuinv_rating;
	}

	public void setScfuinv_rating(String scfuinv_rating) {
		this.scfuinv_rating = scfuinv_rating;
	}

	public String getScfuinv_pre_money() {
		return scfuinv_pre_money;
	}

	public void setScfuinv_pre_money(String scfuinv_pre_money) {
		this.scfuinv_pre_money = scfuinv_pre_money;
	}

	public String getScfuinv_risk() {
		return scfuinv_risk;
	}

	public void setScfuinv_risk(String scfuinv_risk) {
		this.scfuinv_risk = scfuinv_risk;
	}

	public String getScfuinv_collatera() {
		return scfuinv_collatera;
	}

	public void setScfuinv_collatera(String scfuinv_collatera) {
		this.scfuinv_collatera = scfuinv_collatera;
	}

	public String getScfuinv_verified() {
		return scfuinv_verified;
	}

	public void setScfuinv_verified(String scfuinv_verified) {
		this.scfuinv_verified = scfuinv_verified;
	}

	public Integer getScfuinv_di_id() {
		return scfuinv_di_id;
	}

	public void setScfuinv_di_id(Integer scfuinv_di_id) {
		this.scfuinv_di_id = scfuinv_di_id;
	}

	public String getScfuinv_client_invest_countries() {
		return scfuinv_client_invest_countries;
	}

	public void setScfuinv_client_invest_countries(
			String scfuinv_client_invest_countries) {
		this.scfuinv_client_invest_countries = scfuinv_client_invest_countries;
	}

	public String getScfuinv_type_of_funding() {
		return scfuinv_type_of_funding;
	}

	public void setScfuinv_type_of_funding(String scfuinv_type_of_funding) {
		this.scfuinv_type_of_funding = scfuinv_type_of_funding;
	}

	public String getScfuinv_type_of_access() {
		return scfuinv_type_of_access;
	}

	public void setScfuinv_type_of_access(String scfuinv_type_of_access) {
		this.scfuinv_type_of_access = scfuinv_type_of_access;
	}

	public String getScfuinv_acceptance_risk() {
		return scfuinv_acceptance_risk;
	}

	public void setScfuinv_acceptance_risk(String scfuinv_acceptance_risk) {
		this.scfuinv_acceptance_risk = scfuinv_acceptance_risk;
	}

	public String getScfuinv_investment_objective() {
		return scfuinv_investment_objective;
	}

	public void setScfuinv_investment_objective(
			String scfuinv_investment_objective) {
		this.scfuinv_investment_objective = scfuinv_investment_objective;
	}

	public String getScfuinv_est_net_worth() {
		return scfuinv_est_net_worth;
	}

	public void setScfuinv_est_net_worth(String scfuinv_est_net_worth) {
		this.scfuinv_est_net_worth = scfuinv_est_net_worth;
	}

	public String getScfuinv_investment_experience() {
		return scfuinv_investment_experience;
	}

	public void setScfuinv_investment_experience(
			String scfuinv_investment_experience) {
		this.scfuinv_investment_experience = scfuinv_investment_experience;
	}

	public Integer getScfuinv_investment_amount_min() {
		return scfuinv_investment_amount_min;
	}

	public void setScfuinv_investment_amount_min(
			Integer scfuinv_investment_amount_min) {
		this.scfuinv_investment_amount_min = scfuinv_investment_amount_min;
	}

	public Integer getScfuinv_investment_amount_max() {
		return scfuinv_investment_amount_max;
	}

	public void setScfuinv_investment_amount_max(
			Integer scfuinv_investment_amount_max) {
		this.scfuinv_investment_amount_max = scfuinv_investment_amount_max;
	}

	public Integer getScfuinv_investment_time() {
		return scfuinv_investment_time;
	}

	public void setScfuinv_investment_time(Integer scfuinv_investment_time) {
		this.scfuinv_investment_time = scfuinv_investment_time;
	}

	public String getScfuinv_general_investment_knowledge() {
		return scfuinv_general_investment_knowledge;
	}

	public void setScfuinv_general_investment_knowledge(
			String scfuinv_general_investment_knowledge) {
		this.scfuinv_general_investment_knowledge = scfuinv_general_investment_knowledge;
	}

	public Date getScfuinv_relation_date_started() {
		return scfuinv_relation_date_started;
	}

	public void setScfuinv_relation_date_started(
			Date scfuinv_relation_date_started) {
		this.scfuinv_relation_date_started = scfuinv_relation_date_started;
	}

	public String getScfuinv_investment_product_knowledge() {
		return scfuinv_investment_product_knowledge;
	}

	public void setScfuinv_investment_product_knowledge(
			String scfuinv_investment_product_knowledge) {
		this.scfuinv_investment_product_knowledge = scfuinv_investment_product_knowledge;
	}

	public String getScfuinv_commission() {
		return scfuinv_commission;
	}

	public void setScfuinv_commission(String scfuinv_commission) {
		this.scfuinv_commission = scfuinv_commission;
	}

	public String getScfuinv_site_url() {
		return scfuinv_site_url;
	}

	public void setScfuinv_site_url(String scfuinv_site_url) {
		this.scfuinv_site_url = scfuinv_site_url;
	}

	public String getScfuinv_logo() {
		return scfuinv_logo;
	}

	public void setScfuinv_logo(String scfuinv_logo) {
		this.scfuinv_logo = scfuinv_logo;
	}

	public Integer getScfuinv_investor_type() {
		return scfuinv_investor_type;
	}

	public void setScfuinv_investor_type(Integer scfuinv_investor_type) {
		this.scfuinv_investor_type = scfuinv_investor_type;
	}

	public Integer getScfuinv_client_invest_industries() {
		return scfuinv_client_invest_industries;
	}

	public void setScfuinv_client_invest_industries(
			Integer scfuinv_client_invest_industries) {
		this.scfuinv_client_invest_industries = scfuinv_client_invest_industries;
	}

/*	public List<ScfUserWatchlistPortfolio> getWatchlistInv() {
		return watchlistInv;
	}

	public void setWatchlistInv(List<ScfUserWatchlistPortfolio> watchlistInv) {
		this.watchlistInv = watchlistInv;
	} 
*/
	
	public ScfUser getScfUser() {
		return scfUser;
	}

	public void setScfUser(ScfUser scfUser) {
		this.scfUser = scfUser;
	}
	
	public String getScfuinv_addr() {
		return scfuinv_addr;
	}

	public void setScfuinv_addr(String scfuinv_addr) {
		this.scfuinv_addr = scfuinv_addr;
	}

	public String getScfuinv_fname() {
		return scfuinv_fname;
	}

	public void setScfuinv_fname(String scfuinv_fname) {
		this.scfuinv_fname = scfuinv_fname;
	}

	public String getScfuinv_lname() {
		return scfuinv_lname;
	}

	public void setScfuinv_lname(String scfuinv_lname) {
		this.scfuinv_lname = scfuinv_lname;
	}

	public String getScfuinv_email() {
		return scfuinv_email;
	}

	public void setScfuinv_email(String scfuinv_email) {
		this.scfuinv_email = scfuinv_email;
	}

	public String getScfuinv_phone() {
		return scfuinv_phone;
	}

	public void setScfuinv_phone(String scfuinv_phone) {
		this.scfuinv_phone = scfuinv_phone;
	}


}
