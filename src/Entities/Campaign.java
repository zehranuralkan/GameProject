package Entities;

import Abstracts.CampaignService;

public class Campaign implements CampaignService{
private int id;
private String campaignName;
private int discountAmount;


public Campaign(int id,String campaignName,int discountAmount)
{
super();
this.setId(id);
this.setCampaignName(campaignName);
this.setDiscountAmount(discountAmount);
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getCampaignName() {
	return campaignName;
}


public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}


public int getDiscountAmount() {
	return discountAmount;
}


public void setDiscountAmount(int discountAmount) {
	this.discountAmount = discountAmount;
}


@Override
public void add(Campaign campaign) {
	// TODO Auto-generated method stub
	
}


@Override
public void update(Campaign campaign) {
	// TODO Auto-generated method stub
	
}


@Override
public void delete(Campaign campaign) {
	// TODO Auto-generated method stub
	
}



}
