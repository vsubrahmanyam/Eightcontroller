package com.sphibmvc.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class ScfUserBean extends ScfBean
{
	private int scfu_id;
	private int scfu_subscription_id;
	private String scfu_guid ;
	@NotEmpty
	private String scfu_fname;
	@NotEmpty
	private String scfu_lname;
	@NotEmpty @Email
	private String scfu_email;
	private String scfu_image;
	@NotNull
	private String scfu_password;
	
	private String scfu_login_time;
	@NotNull
	private String scfu_create_date;
	@NotNull
	private String scfu_last_update;
	
	private int scfu_ut_id;
	private String scfu_token;
	private String scfu_status;
	private String scfu_social_domain;
	private String scfu_social_user_token;
	private String scfu_social_userid;
	private String scfu_subsciption_validity;
	@NotNull
	private String scfuae_last_update;
	private int scfu_ref_id;
	private String scfu_optout;

	public int getScfu_id() {
		return scfu_id;
	}

	public void setScfu_id(int scfu_id) {
		this.scfu_id = scfu_id;
	}

	public int getScfu_subscription_id() {
		return scfu_subscription_id;
	}

	public void setScfu_subscription_id(int scfu_subscription_id) {
		this.scfu_subscription_id = scfu_subscription_id;
	}

	public String getScfu_guid() {
		return scfu_guid;
	}

	public void setScfu_guid(String scfu_guid) {
		this.scfu_guid = scfu_guid;
	}

	public String getScfu_fname() {
		return scfu_fname;
	}

	public void setScfu_fname(String scfu_fname) {
		this.scfu_fname = scfu_fname;
	}

	public String getScfu_lname() {
		return scfu_lname;
	}

	public void setScfu_lname(String scfu_lname) {
		this.scfu_lname = scfu_lname;
	}

	public String getScfu_email() {
		return scfu_email;
	}

	public void setScfu_email(String scfu_email) {
		this.scfu_email = scfu_email;
	}

	public String getScfu_image() {
		return scfu_image;
	}

	public void setScfu_image(String scfu_image) {
		this.scfu_image = scfu_image;
	}

	public String getScfu_password() {
		return scfu_password;
	}

	public void setScfu_password(String scfu_password) {
		this.scfu_password = scfu_password;
	}

	public String getScfu_login_time() {
		return scfu_login_time;
	}

	public void setScfu_login_time(String scfu_login_time) {
		this.scfu_login_time = scfu_login_time;
	}

	public String getScfu_create_date() {
		return scfu_create_date;
	}

	public void setScfu_create_date(String scfu_create_date) {
		this.scfu_create_date = scfu_create_date;
	}

	public String getScfu_last_update() {
		return scfu_last_update;
	}

	public void setScfu_last_update(String scfu_last_update) {
		this.scfu_last_update = scfu_last_update;
	}

	public int getScfu_ut_id() {
		return scfu_ut_id;
	}

	public void setScfu_ut_id(int scfu_ut_id) {
		this.scfu_ut_id = scfu_ut_id;
	}

	public String getScfu_token() {
		return scfu_token;
	}

	public void setScfu_token(String scfu_token) {
		this.scfu_token = scfu_token;
	}

	public String getScfu_status() {
		return scfu_status;
	}

	public void setScfu_status(String scfu_status) {
		this.scfu_status = scfu_status;
	}

	public String getScfu_social_domain() {
		return scfu_social_domain;
	}

	public void setScfu_social_domain(String scfu_social_domain) {
		this.scfu_social_domain = scfu_social_domain;
	}

	public String getScfu_social_user_token() {
		return scfu_social_user_token;
	}

	public void setScfu_social_user_token(String scfu_social_user_token) {
		this.scfu_social_user_token = scfu_social_user_token;
	}

	public String getScfu_social_userid() {
		return scfu_social_userid;
	}

	public void setScfu_social_userid(String scfu_social_userid) {
		this.scfu_social_userid = scfu_social_userid;
	}

	public String getScfu_subsciption_validity() {
		return scfu_subsciption_validity;
	}

	public void setScfu_subsciption_validity(String scfu_subsciption_validity) {
		this.scfu_subsciption_validity = scfu_subsciption_validity;
	}

	public String getScfuae_last_update() {
		return scfuae_last_update;
	}

	public void setScfuae_last_update(String scfuae_last_update) {
		this.scfuae_last_update = scfuae_last_update;
	}

	public int getScfu_ref_id() {
		return scfu_ref_id;
	}

	public void setScfu_ref_id(int scfu_ref_id) {
		this.scfu_ref_id = scfu_ref_id;
	}

	public String getScfu_optout() {
		return scfu_optout;
	}

	public void setScfu_optout(String scfu_optout) {
		this.scfu_optout = scfu_optout;
	}
	
	public String toString()
	{
		return "[ scfu_fname -  fname || scfu_lname - lname]";
	}

}
