package com.sphibmvc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domain_state")
public class DomainState {
	@Id
	@GeneratedValue
	private int dst_id;
	private Integer dst_dc_id;
	private String dst_iso_code;
	private String dst_iso;
	private String dst_display_name;
	private String dst_name;
	private String dst_printable_name;

	public int getDst_id() {
		return dst_id;
	}

	public void setDst_id(int dst_id) {
		this.dst_id = dst_id;
	}

	public Integer getDst_dc_id() {
		return dst_dc_id;
	}

	public void setDst_dc_id(Integer dst_dc_id) {
		this.dst_dc_id = dst_dc_id;
	}

	public String getDst_iso_code() {
		return dst_iso_code;
	}

	public void setDst_iso_code(String dst_iso_code) {
		this.dst_iso_code = dst_iso_code;
	}

	public String getDst_iso() {
		return dst_iso;
	}

	public void setDst_iso(String dst_iso) {
		this.dst_iso = dst_iso;
	}

	public String getDst_display_name() {
		return dst_display_name;
	}

	public void setDst_display_name(String dst_display_name) {
		this.dst_display_name = dst_display_name;
	}

	public String getDst_name() {
		return dst_name;
	}

	public void setDst_name(String dst_name) {
		this.dst_name = dst_name;
	}

	public String getDst_printable_name() {
		return dst_printable_name;
	}

	public void setDst_printable_name(String dst_printable_name) {
		this.dst_printable_name = dst_printable_name;
	}

}
