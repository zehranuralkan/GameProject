package Concrete;

import Abstracts.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getfirstName() + " sat�n al�nd�: " + game.getGameName() + ".");
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyas� uyguland� " + game.getGameName() + " taraf�ndan: " + gamer.getfirstName());
		
	}

}
