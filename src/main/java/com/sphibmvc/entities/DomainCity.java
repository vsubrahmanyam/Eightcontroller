package com.sphibmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domain_city")
public class DomainCity {
	 
@Id
@GeneratedValue
private int dcty_id;          
private String dcty_name;        
private String dcty_dc_iso_code; 
private String dcty_dst_iso_code;
private Integer dcty_dc_id;       
private Integer dcty_dst_id;   

public int getDcty_id() {
	return dcty_id;
}
public void setDcty_id(int dcty_id) {
	this.dcty_id = dcty_id;
}
public String getDcty_name() {
	return dcty_name;
}
public void setDcty_name(String dcty_name) {
	this.dcty_name = dcty_name;
}
public String getDcty_dc_iso_code() {
	return dcty_dc_iso_code;
}
public void setDcty_dc_iso_code(String dcty_dc_iso_code) {
	this.dcty_dc_iso_code = dcty_dc_iso_code;
}
public String getDcty_dst_iso_code() {
	return dcty_dst_iso_code;
}
public void setDcty_dst_iso_code(String dcty_dst_iso_code) {
	this.dcty_dst_iso_code = dcty_dst_iso_code;
}
public Integer getDcty_dc_id() {
	return dcty_dc_id;
}
public void setDcty_dc_id(Integer dcty_dc_id) {
	this.dcty_dc_id = dcty_dc_id;
}
public Integer getDcty_dst_id() {
	return dcty_dst_id;
}
public void setDcty_dst_id(Integer dcty_dst_id) {
	this.dcty_dst_id = dcty_dst_id;
}
public String getDcty_create_date() {
	return dcty_create_date;
}
public void setDcty_create_date(String dcty_create_date) {
	this.dcty_create_date = dcty_create_date;
}
public String getDcty_last_update() {
	return dcty_last_update;
}
public void setDcty_last_update(String dcty_last_update) {
	this.dcty_last_update = dcty_last_update;
}
public String getDcty_longitude() {
	return dcty_longitude;
}
public void setDcty_longitude(String dcty_longitude) {
	this.dcty_longitude = dcty_longitude;
}
public String getDcty_latitude() {
	return dcty_latitude;
}
public void setDcty_latitude(String dcty_latitude) {
	this.dcty_latitude = dcty_latitude;
}
private String dcty_create_date; 
private String dcty_last_update; 
private String dcty_longitude;   
private String dcty_latitude;    

}
