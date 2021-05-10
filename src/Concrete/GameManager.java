package Concrete;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void save(Game game) {
		System.out.println("Oyun kaydedildi:"+ game.getGameName());	
	}

	@Override
	public void updatePrice(Game game) {
		System.out.println("Oyun güncellendi:"+ game.getGameName());	
	
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi:"+ game.getGameName());	

	}

}
