package com.santosh.poc.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "status", "substatus", "value" })
@XmlRootElement(name = "SingularResponse")
public class SingularResponse {

	@XmlElement(required = true)
	protected String status;
	@XmlElement(required = true)
	protected String substatus;
	@XmlElement(required = true)
	protected SingularResponse.Value value;

	public String getStatus() {
		return status;
	}

	public void setStatus(String value) {
		this.status = value;
	}

	public String getSubstatus() {
		return substatus;
	}

	public void setSubstatus(String value) {
		this.substatus = value;
	}

	public SingularResponse.Value getValue() {
		return value;
	}

	public void setValue(SingularResponse.Value value) {
		this.value = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "results" })
	public static class Value {

		protected List<SingularResponse.Value.Results> results;

		public List<SingularResponse.Value.Results> getResults() {
			if (results == null) {
				results = new ArrayList<SingularResponse.Value.Results>();
			}
			return this.results;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "countryField", "customInstalls",
				"app", "trackerClicks", "adnAccountId", "ecpi", "adnClickType",
				"ecpm", "ecpc", "adnSubadnetwork", "endDate", "adnStatus",
				"source", "platform", "sitePublicId", "adnImpressions",
				"startDate", "adnCampaignUrl", "ocvr", "adnCampaign",
				"adnOriginalCurrency", "adnOriginalCost", "customClicks",
				"adnCost", "adnEstimatedTotalConversions", "trackerName",
				"adnSubCampaign", "adnClicks", "ctr", "adnInstalls",
				"adnTimezone", "cvr", "trackerInstalls", "adnUtcOffset", "os" })
		public static class Results {

			@XmlElement(name = "country_field", required = true)
			protected String countryField;
			@XmlElement(name = "custom_installs", required = true)
			protected String customInstalls;
			@XmlElement(required = true)
			protected String app;
			@XmlElement(name = "tracker_clicks", required = true)
			protected String trackerClicks;
			@XmlElement(name = "adn_account_id", required = true)
			protected String adnAccountId;
			@XmlElement(required = true)
			protected String ecpi;
			@XmlElement(name = "adn_click_type", required = true)
			protected String adnClickType;
			@XmlElement(required = true)
			protected String ecpm;
			@XmlElement(required = true)
			protected String ecpc;
			@XmlElement(name = "adn_subadnetwork", required = true)
			protected String adnSubadnetwork;
			@XmlElement(name = "end_date", required = true)
			protected String endDate;
			@XmlElement(name = "adn_status", required = true)
			protected String adnStatus;
			@XmlElement(required = true)
			protected String source;
			@XmlElement(required = true)
			protected String platform;
			@XmlElement(name = "site_public_id", required = true)
			protected String sitePublicId;
			@XmlElement(name = "adn_impressions", required = true)
			protected String adnImpressions;
			@XmlElement(name = "start_date", required = true)
			protected String startDate;
			@XmlElement(name = "adn_campaign_url", required = true)
			protected String adnCampaignUrl;
			@XmlElement(required = true)
			protected String ocvr;
			@XmlElement(name = "adn_campaign", required = true)
			protected String adnCampaign;
			@XmlElement(name = "adn_original_currency", required = true)
			protected String adnOriginalCurrency;
			@XmlElement(name = "adn_original_cost", required = true)
			protected String adnOriginalCost;
			@XmlElement(name = "custom_clicks", required = true)
			protected String customClicks;
			@XmlElement(name = "adn_cost", required = true)
			protected String adnCost;
			@XmlElement(name = "adn_estimated_total_conversions", required = true)
			protected String adnEstimatedTotalConversions;
			@XmlElement(name = "tracker_name", required = true)
			protected String trackerName;
			@XmlElement(name = "adn_sub_campaign", required = true)
			protected String adnSubCampaign;
			@XmlElement(name = "adn_clicks", required = true)
			protected String adnClicks;
			@XmlElement(required = true)
			protected String ctr;
			@XmlElement(name = "adn_installs", required = true)
			protected String adnInstalls;
			@XmlElement(name = "adn_timezone", required = true)
			protected String adnTimezone;
			@XmlElement(required = true)
			protected String cvr;
			@XmlElement(name = "tracker_installs", required = true)
			protected String trackerInstalls;
			@XmlElement(name = "adn_utc_offset", required = true)
			protected String adnUtcOffset;
			@XmlElement(required = true)
			protected String os;

			public String getCountryField() {
				return countryField;
			}

			public void setCountryField(String value) {
				this.countryField = value;
			}

			public String getCustomInstalls() {
				return customInstalls;
			}

			public void setCustomInstalls(String value) {
				this.customInstalls = value;
			}

			public String getApp() {
				return app;
			}

			public void setApp(String value) {
				this.app = value;
			}

			public String getTrackerClicks() {
				return trackerClicks;
			}

			public void setTrackerClicks(String value) {
				this.trackerClicks = value;
			}

			public String getAdnAccountId() {
				return adnAccountId;
			}

			public void setAdnAccountId(String value) {
				this.adnAccountId = value;
			}

			public String getEcpi() {
				return ecpi;
			}

			public void setEcpi(String value) {
				this.ecpi = value;
			}

			public String getAdnClickType() {
				return adnClickType;
			}

			public void setAdnClickType(String value) {
				this.adnClickType = value;
			}

			public String getEcpm() {
				return ecpm;
			}

			public void setEcpm(String value) {
				this.ecpm = value;
			}

			public String getEcpc() {
				return ecpc;
			}

			public void setEcpc(String value) {
				this.ecpc = value;
			}

			public String getAdnSubadnetwork() {
				return adnSubadnetwork;
			}

			public void setAdnSubadnetwork(String value) {
				this.adnSubadnetwork = value;
			}

			public String getEndDate() {
				return endDate;
			}

			public void setEndDate(String value) {
				this.endDate = value;
			}

			public String getAdnStatus() {
				return adnStatus;
			}

			public void setAdnStatus(String value) {
				this.adnStatus = value;
			}

			public String getSource() {
				return source;
			}

			public void setSource(String value) {
				this.source = value;
			}

			public String getPlatform() {
				return platform;
			}

			public void setPlatform(String value) {
				this.platform = value;
			}

			public String getSitePublicId() {
				return sitePublicId;
			}

			public void setSitePublicId(String value) {
				this.sitePublicId = value;
			}

			public String getAdnImpressions() {
				return adnImpressions;
			}

			public void setAdnImpressions(String value) {
				this.adnImpressions = value;
			}

			public String getStartDate() {
				return startDate;
			}

			public void setStartDate(String value) {
				this.startDate = value;
			}

			public String getAdnCampaignUrl() {
				return adnCampaignUrl;
			}

			public void setAdnCampaignUrl(String value) {
				this.adnCampaignUrl = value;
			}

			public String getOcvr() {
				return ocvr;
			}

			public void setOcvr(String value) {
				this.ocvr = value;
			}

			public String getAdnCampaign() {
				return adnCampaign;
			}

			public void setAdnCampaign(String value) {
				this.adnCampaign = value;
			}

			public String getAdnOriginalCurrency() {
				return adnOriginalCurrency;
			}

			public void setAdnOriginalCurrency(String value) {
				this.adnOriginalCurrency = value;
			}

			public String getAdnOriginalCost() {
				return adnOriginalCost;
			}

			public void setAdnOriginalCost(String value) {
				this.adnOriginalCost = value;
			}

			public String getCustomClicks() {
				return customClicks;
			}

			public void setCustomClicks(String value) {
				this.customClicks = value;
			}

			public String getAdnCost() {
				return adnCost;
			}

			public void setAdnCost(String value) {
				this.adnCost = value;
			}

			public String getAdnEstimatedTotalConversions() {
				return adnEstimatedTotalConversions;
			}

			public void setAdnEstimatedTotalConversions(String value) {
				this.adnEstimatedTotalConversions = value;
			}

			public String getTrackerName() {
				return trackerName;
			}

			public void setTrackerName(String value) {
				this.trackerName = value;
			}

			public String getAdnSubCampaign() {
				return adnSubCampaign;
			}

			public void setAdnSubCampaign(String value) {
				this.adnSubCampaign = value;
			}

			public String getAdnClicks() {
				return adnClicks;
			}

			public void setAdnClicks(String value) {
				this.adnClicks = value;
			}

			public String getCtr() {
				return ctr;
			}

			public void setCtr(String value) {
				this.ctr = value;
			}

			public String getAdnInstalls() {
				return adnInstalls;
			}

			public void setAdnInstalls(String value) {
				this.adnInstalls = value;
			}

			public String getAdnTimezone() {
				return adnTimezone;
			}

			public void setAdnTimezone(String value) {
				this.adnTimezone = value;
			}

			public String getCvr() {
				return cvr;
			}

			public void setCvr(String value) {
				this.cvr = value;
			}

			public String getTrackerInstalls() {
				return trackerInstalls;
			}

			public void setTrackerInstalls(String value) {
				this.trackerInstalls = value;
			}

			public String getAdnUtcOffset() {
				return adnUtcOffset;
			}

			public void setAdnUtcOffset(String value) {
				this.adnUtcOffset = value;
			}

			public String getOs() {
				return os;
			}

			public void setOs(String value) {
				this.os = value;
			}

		}

	}

}
