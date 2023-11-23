package main;

import java.util.Scanner;

import Class.Casino;
import Class.Dado;
import Class.Giocatore;
import Class.Gioco;

public class CasinoMain {

	public static void main(String[] args) {

		int gioco;
		
		Casino casino = new Casino("Royal", 3000);
		
		Giocatore giocatore = new Giocatore("Alessandro", 500);
		Giocatore giocatore1 = new Giocatore("Luca", 500);
		
		Gioco game = new Gioco();
		
		scritta();
		
		System.out.println("");
		System.out.println("╔═════════════════════════════════════════════╗");
		casino.stampaCapitale();
		System.out.println("╚═════════════════════════════════════════════╝");
		
		gioco = 0;
		while (gioco < 3)
		{
			Dado dado = new Dado();
			System.out.println("");
			System.out.println("╔═════════════════════════════════════════════╗");
			System.out.println("║                                              ");
			Scanner sc = new Scanner(System.in);
			if (gioco > 0)
			{
				System.out.print("║ " + giocatore.getNome()+  " vuoi ricaricare il tuo budget ? \n║ 1.SI - 2.NO : ");
				if (sc.nextInt() == 1)
				{
					System.out.print("║ Inserisci quanto vuoi ricaricare: ");
					giocatore.ricaricaBudget(sc.nextInt());
				}
				System.out.println("║");
				System.out.print("║ " + giocatore1.getNome()+  " vuoi ricaricare il tuo budget ? \n║ 1.SI - 2.NO : ");
				if (sc.nextInt() == 1)
				{
					System.out.print("║ Inserisci quanto vuoi ricaricare: ");
					giocatore1.ricaricaBudget(sc.nextInt());
				}
			}
			
			game.eseguiPuntata(giocatore);
			game.eseguiPuntata(giocatore1);
			if (game.giocatoriAttivi(giocatore, giocatore1) == true)
			{
				if (giocatore.getNumeroGiocato() != dado.getR())
					casino.incassa(giocatore);
				if (giocatore1.getNumeroGiocato() != dado.getR())
					casino.incassa(giocatore1);
				
				if (giocatore.getNumeroGiocato() == dado.getR())
					casino.paga(giocatore);
				if (giocatore1.getNumeroGiocato() == dado.getR())
					casino.paga(giocatore1);
				System.out.println("║");
				System.out.println("║ NUMERO DADO ESTRATTO: " + dado.getR());
				giocatore.stampaGiocatore();
				giocatore1.stampaGiocatore();
				System.out.println("║                                             ");
				System.out.println("║                                             ");
				casino.stampaCapitale();
			}
			else
			{
				System.out.println("║");
				System.out.println("║ Giocata annullata");
			}
			gioco++;
			System.out.println("╚═════════════════════════════════════════════╝");
		}
		System.out.println("");
		System.out.println("╔═════════════════════════════════════════════╗");
		System.out.println("║            ♦ ♠ GIOCO TERMINATO ♥ ♣          ║");
		System.out.println("╚═════════════════════════════════════════════╝");


	}
	
	
	
	
	
	
	public static void scritta()
	{
	
		System.out.println("  ██████╗ █████╗ ███████╗██╗███╗   ██╗ ██████╗   ");
		System.out.println(" ██╔════╝██╔══██╗██╔════╝██║████╗  ██║██╔═══██╗ ");
	    System.out.println(" ██║     ███████║███████╗██║██╔██╗ ██║██║   ██║ ");
	    System.out.println(" ██║     ██╔══██║╚════██║██║██║╚██╗██║██║   ██║ ");
	    System.out.println(" ╚██████╗██║  ██║███████║██║██║ ╚████║╚██████╔╝  ");
	    System.out.println("  ╚═════╝╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝   ");
	}                                        


	
	
}






