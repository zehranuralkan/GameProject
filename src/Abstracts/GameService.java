package Abstracts;

import Entities.Game;

public interface GameService {
	//kaydetme
void save( Game game);
//gŁncelleme
void updatePrice( Game game);
//silme
void delete(Game game);
}
