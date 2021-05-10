package Concrete;

import java.rmi.RemoteException;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		return true;
	}

}
