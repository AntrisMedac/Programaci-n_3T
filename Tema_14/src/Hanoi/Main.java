package Hanoi;

public class Main {

	public static void main(String[] args) {
	
		Hanoi j1=new Hanoi(3);
		
		j1.mover('A', 'B');
		j1.Imprimir();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		j1.mover('A', 'C');
		j1.Imprimir();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		j1.mover('B', 'C');
		j1.Imprimir();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		j1.mover('A', 'C');
		j1.Imprimir();
		
	
	}
}
