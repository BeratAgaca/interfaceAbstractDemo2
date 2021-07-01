package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaign campaign, Game game) {
		System.out.println("campaign is added successfully!");
		game.setGamePrice(game.getGamePrice()*(100-campaign.getCampaignDiscount())/100);
		
	}

	@Override
	public void deleteCampaign(Campaign campaign, Game game) {
		System.out.println("campaign is deleted successfully!");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Game game) {
		System.out.println("campaign is updated successfully!");
		
	}

	
	

}
