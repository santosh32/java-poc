package com.valuelabs.poc.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "singular")
public class Singular {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sid;

	private String country_field;

	private String custom_installs;

	private String app;

	private String tracker_clicks;

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getCountry_field() {
		return country_field;
	}

	public void setCountry_field(String country_field) {
		this.country_field = country_field;
	}

	public String getCustom_installs() {
		return custom_installs;
	}

	public void setCustom_installs(String custom_installs) {
		this.custom_installs = custom_installs;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getTracker_clicks() {
		return tracker_clicks;
	}

	public void setTracker_clicks(String tracker_clicks) {
		this.tracker_clicks = tracker_clicks;
	}
}
