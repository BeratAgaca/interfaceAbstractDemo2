package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IGameSaleService {
	void sale(Game game, Player player);
	
	void bargainSale(Game game, Player player, Campaign campaign);
	
}
