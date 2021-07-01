package Entities;

public class Campaign {
	private int CampaignId;
	private String CampaignName;
	private double CampaignDiscount;
	public Campaign(int campaignId, String campaignName, double campaignDiscount) {
		super();
		CampaignId = campaignId;
		CampaignName = campaignName;
		CampaignDiscount = campaignDiscount;
	}
	public int getCampaignId() {
		return CampaignId;
	}
	public void setCampaignId(int campaignId) {
		CampaignId = campaignId;
	}
	public String getCampaignName() {
		return CampaignName;
	}
	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
	public double getCampaignDiscount() {
		return CampaignDiscount;
	}
	public void setCampaignDiscount(int campaignDiscount) {
		CampaignDiscount = campaignDiscount;
	}
	

}
