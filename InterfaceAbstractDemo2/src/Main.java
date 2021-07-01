import Abstract.BasePlayerManager;
import Adapters.MerniceServiceAdapters;
import Concrete.CampaignManager;
import Concrete.GameSaleManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		BasePlayerManager playerManager = new PlayerManager(new MerniceServiceAdapters());
		Player player1 = new Player(1, "Berat", "Agaca", "28483169236", 2001);
		playerManager.saveMember(player1);
		
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		Game valo = new Game(1, "Valorant", 100);
		gameSaleManager.sale(valo, player1);
		

		CampaignManager campaignManager = new CampaignManager();
		Campaign greatFriday = new Campaign(1, "Great Friday Campaign", 30);
		campaignManager.addCampaign(greatFriday, valo);
		gameSaleManager.bargainSale(valo, player1, greatFriday);

		
  
		
	}

}
