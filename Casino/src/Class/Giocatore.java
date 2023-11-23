package Class;

import java.util.Scanner;

public class Giocatore {

	private String nome; 
	private int budget; 
	private int puntata; 
	private int numeroGiocato;
	
	public Giocatore(String nome, int budget)
	{
		this.nome = nome;
		this.budget = budget;
	}
	
	
	
	
	
	public void punta()
	{
		Scanner sc = new Scanner(System.in);
		
		stampaGiocatore();
		System.out.println("║");
		do
		{
			System.out.print("║ " + this.nome + ": Inserisci la puntata: ");
			this.puntata = sc.nextInt();
			
		}
		while(this.budget < this.puntata);

		this.budget -= this.puntata;
		
		do
		{
			System.out.print("║ " + this.nome + ": Inserisci numero da giocare: ");
			this.numeroGiocato = sc.nextInt();
			
		}
		while(this.numeroGiocato <= 0 || this.numeroGiocato > 6);

	}
	
	public void incassa()
	{
		this.budget += this.puntata * Casino.getRicarico(); 
	}
	
	public void ricaricaBudget(int n)
	{
		this.budget += n;
	}
	
	public void recuperaPuntata()
	{
		this.budget += this.puntata;
	}
	
	public void reset()
	{
		this.puntata = 0;
		this.numeroGiocato = 0;
	}
	
	public void stampaGiocatore()
	{
		System.out.println("║ ");
		System.out.println("║ Giocatore: " + this.nome + "\n" + "║ Budget: " + this.budget);
	}


	
	
	
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getBudget() {
		return budget;
	}


	public void setBudget(int budget) {
		this.budget = budget;
	}


	public int getPuntata() {
		return puntata;
	}


	public void setPuntata(int puntata) {
		this.puntata = puntata;
	}


	public int getNumeroGiocato() {
		return numeroGiocato;
	}


	public void setNumeroGiocato(int numeroGiocato) {
		this.numeroGiocato = numeroGiocato;
	}
	
	
	
	
	
	
	
	
}
