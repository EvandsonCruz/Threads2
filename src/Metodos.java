
public class Metodos extends Thread{
	private int soma;
	private int i;
	
	public Metodos(int soma, int i) {
		this.soma = soma;
		this.i= i;
		start();
	}
	
	public void run() {
		System.out.println("Soma da linha #" + i +": " + soma);
	}

}
