package Abstracts;

import Entities.Game;

public interface GameService {
	//kaydetme
void save( Game game);
//g�ncelleme
void updatePrice( Game game);
//silme
void delete(Game game);
}
