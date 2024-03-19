package Hanoi;

import java.util.*;

public class Hanoi {

	private int NDiscos;
	private Torre A;
	private Torre B;
	private Torre C;
	
	public Hanoi(int NDiscos) {
		A=new Torre();
		B=new Torre();
		C=new Torre();
		this.NDiscos=NDiscos;
		for (int i=NDiscos;i>0;i--) {
			this.A.agregarDisco(new Disco(i));
		}
	}
	
	public void Imprimir() {
		System.out.println(A);
		System.out.println("-----------------------------------");
		System.out.println(B);
		System.out.println("-----------------------------------");
		System.out.println(C);
		
	}
	
	public boolean mover(char Origen, char Destino) {
		Torre Incial;
		Torre Final;
		if (Origen=='A') {
			Incial=A;
		}
		else if(Origen=='B'){
			Incial=B;
		}
		else {
			Incial=C;
		}
		
		if (Destino=='A') {
			Final=A;
		}
		else if(Destino=='B'){
			Final=B;
		}
		else {
			Final=C;
		}
		
		if(Final.agregarDisco(Incial.ultimoDisco())) {
			Incial.removerDisco();
			return true;
		}
		else {
			return false;
		}
	}
}
