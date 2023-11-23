package Class;

public class Casino {

	private String nome;
	private int capitale; 
	private static final int ricarico = 5;
	
	
	public Casino(String nome, int capitale)
	{
		this.nome = nome;
		this.capitale = capitale;
	}
	
	
	
	
	
	public void incassa(Giocatore giocatore)
	{
		this.capitale += giocatore.getPuntata();
		System.out.println("║");
		System.out.println("║ " + giocatore.getNome() + ": HAI PERSO LA PUNTATA");
	}
	
	
	
	public void paga(Giocatore giocatore)
	{
		if (valutaPuntate(giocatore) == false)
		{
			this.capitale -= giocatore.getPuntata() * Casino.ricarico;
			giocatore.incassa();
			System.out.println("║");
			System.out.println("║ " + giocatore.getNome() + ": HAI VINTO: " + giocatore.getPuntata() * Casino.ricarico);
			System.out.println("║ Il casinò ha pagato: " +  + giocatore.getPuntata() * Casino.ricarico + " a " + giocatore.getNome());
		}
		else
		{
			giocatore.recuperaPuntata();
			return;
		}
	}
	
	
	
	public boolean valutaPuntate(Giocatore giocatore)
	{
		if (this.capitale < giocatore.getPuntata() * Casino.ricarico)
		{
			System.out.println("║ " + giocatore.getNome() + ": Il capitale del casinò è troppo basso \n║ puntata ritorntata nel tuo budget");
			return true;
		}
		return false;
	}
	
	
	
	public void stampaCapitale()
	{
		System.out.println("║             Capitale casinò: " + this.capitale + "             ");
	}

	
	
	
	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCapitale() {
		return capitale;
	}


	public void setCapitale(int capitale) {
		this.capitale = capitale;
	}


	public static int getRicarico() {
		return ricarico;
	}
	
	
	
	
	
	
	
	
	
}
