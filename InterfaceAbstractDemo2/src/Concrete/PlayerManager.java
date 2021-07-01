package Concrete;

import Abstract.BasePlayerManager;
import Abstract.IPlayerCheckService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager{
	private IPlayerCheckService playerCheckService;

	public PlayerManager(IPlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void saveMember(Player player) {
		try {
			if(playerCheckService.checkIfRealPerson(player)) {
				System.out.println("New player saved : "+player.getFirstName()+player.getLastName());
			}
			else {
				System.out.println("New player could not saved try again ");
			}
		}catch(Exception e) {
			System.out.println("Can not access mernis");
			System.out.println(e.getMessage());
		}
		 
		
	}

	 

}
