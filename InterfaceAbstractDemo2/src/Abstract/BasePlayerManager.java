package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements IPlayerService{

	@Override
	public void saveMember(Player player) {
		System.out.println("New player saved : "+player.getFirstName()+player.getLastName());
		
	}

	@Override
	public void updateInfo(Player player) {
		System.out.println("you can change your informations : "+player.getFirstName());
		
	}

	@Override
	public void deleteMember(Player player) {
		System.out.println("Your account deleted : "+player.getFirstName()+player.getLastName());
		
	}

}
