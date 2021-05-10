package Abstracts;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerService {
	//kay�t
	void save(Gamer gamer) throws NumberFormatException, RemoteException;
	//bilgilerini g�ncelleme
	void update(Gamer gamer);
	//silme
	void delete(Gamer gamer);
}
