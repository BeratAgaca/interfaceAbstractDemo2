package Concrete;


 
import Abstract.IGameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements IGameSaleService{

	@Override
	public void sale(Game game, Player player) {
		System.out.println(game.getGameName()+" is bought for "+game.getGamePrice());
		
	}
 

	@Override
	public void bargainSale(Game game, Player player, Campaign campaign) {
		System.out.println(game.getGameName()+" is bought for "+game.getGamePrice());
		
	}
	
	

}
