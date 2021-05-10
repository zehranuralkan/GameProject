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
			System.out.println("Kay�t ger�ekle�tirilmi�tir:"+gamer.getfirstName()+" "+gamer.getLastName());
		}
		else {
			System.out.println("Kay�t ba�ar�s�z.Bilgilerinizi kontrol ediniz.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getfirstName()+" "+ gamer.getLastName()+"kullan�c� g�ncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getfirstName()+" "+ gamer.getLastName()+"kullan�c� silindi");
	}

}
