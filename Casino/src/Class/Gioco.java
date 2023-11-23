package Class;

public class Gioco {
	
	public void eseguiPuntata(Giocatore giocatore)
	{
		giocatore.punta();
	}
	
	public boolean giocatoriAttivi(Giocatore giocatore, Giocatore giocatore1)
	{
		if ((giocatore.getPuntata() + giocatore1.getPuntata()) > 0)
			return true;
		else
			return false;
	}
	
}
