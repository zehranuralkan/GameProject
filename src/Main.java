import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstracts.GameService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
     GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
     gamerManager.save(new Gamer(1,"zehra ","alkan",LocalDate.of(2000, 10, 8),"11111111111","zehranuralkan","z.nuralkan@gmail.com"));
     GameManager gameManager=new GameManager();
     gameManager.save(new Game(1,"Valorant","Riot Games",100,10));	
     CampaignManager campaignManager=new CampaignManager();
     campaignManager.add(new Campaign(1,"gece indirimi",10));
     SalesManager salesManager=new SalesManager();
     salesManager.sale(new Game(1,"Valorant","Riot Games",100,10), new Gamer(1,"zehra ","alkan",LocalDate.of(2000, 10, 8),"11111111111","zehranuralkan","z.nuralkan@gmail.com"));
     }

}
