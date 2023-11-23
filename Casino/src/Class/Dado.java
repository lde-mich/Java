package Class;

public class Dado {

	private int r;
	
	public Dado()
	{
		double random;
		random = Math.random() * 6 + 1;
		this.r = (int) random;
//		System.out.println("Dado lanciato");
//		System.out.println("Dado lanciato: " + this.r);
	}

	
	
	
	
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
}
