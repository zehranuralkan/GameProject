package Adapters;

import java.rmi.RemoteException;
import Abstracts.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getfirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
		
	}

}
