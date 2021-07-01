package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface ICampaignService {

	void addCampaign(Campaign campaign, Game game);
	
	void deleteCampaign(Campaign campaign, Game game);

	void updateCampaign(Campaign campaign, Game game);
	
	
}
