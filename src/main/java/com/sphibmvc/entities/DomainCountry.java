package com.sphibmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domain_country")
public class DomainCountry {
	@Id
	@GeneratedValue
	private int dc_id;               
	private String dc_iso_code;        
	private String dc_name;            
	private String dc_printable_name;  
	private String dc_iso3;            
	private int dc_numcode;
	
	public int getDc_id() {
		return dc_id;
	}
	public void setDc_id(int dc_id) {
		this.dc_id = dc_id;
	}
	public String getDc_iso_code() {
		return dc_iso_code;
	}
	public void setDc_iso_code(String dc_iso_code) {
		this.dc_iso_code = dc_iso_code;
	}
	public String getDc_name() {
		return dc_name;
	}
	public void setDc_name(String dc_name) {
		this.dc_name = dc_name;
	}
	public String getDc_printable_name() {
		return dc_printable_name;
	}
	public void setDc_printable_name(String dc_printable_name) {
		this.dc_printable_name = dc_printable_name;
	}
	public String getDc_iso3() {
		return dc_iso3;
	}
	public void setDc_iso3(String dc_iso3) {
		this.dc_iso3 = dc_iso3;
	}
	public int getDc_numcode() {
		return dc_numcode;
	}
	public void setDc_numcode(int dc_numcode) {
		this.dc_numcode = dc_numcode;
	}         

}
