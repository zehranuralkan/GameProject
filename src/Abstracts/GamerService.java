package Abstracts;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerService {
	//kayýt
	void save(Gamer gamer) throws NumberFormatException, RemoteException;
	//bilgilerini güncelleme
	void update(Gamer gamer);
	//silme
	void delete(Gamer gamer);
}
