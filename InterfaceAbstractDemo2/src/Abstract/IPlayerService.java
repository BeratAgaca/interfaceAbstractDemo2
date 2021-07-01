package Abstract;

import Entities.Player;

public interface IPlayerService {
	void saveMember(Player player);

	void updateInfo(Player player);
	
	void deleteMember(Player player);
	
}
