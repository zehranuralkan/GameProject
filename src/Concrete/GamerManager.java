package Concrete;

import java.rmi.RemoteException;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
private GamerCheckService gamercheckService;
public GamerManager(GamerCheckService gamercheckService) {
	this.gamercheckService=gamercheckService;
}
	@Override
	public void save(Gamer gamer) throws NumberFormatException, RemoteException {
		if(gamercheckService.checkIfRealPerson(gamer)) {
			System.out.println("Kayıt gerçekleştirilmiştir:"+gamer.getfirstName()+" "+gamer.getLastName());
		}
		else {
			System.out.println("Kayıt başarısız.Bilgilerinizi kontrol ediniz.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getfirstName()+" "+ gamer.getLastName()+"kullanıcı güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getfirstName()+" "+ gamer.getLastName()+"kullanıcı silindi");
	}

}
