package Adapters;

import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
 

public class MerniceServiceAdapters implements IPlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) throws Exception {
  
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),player.getBirthYear());
		
		
		 
	}
	

}
