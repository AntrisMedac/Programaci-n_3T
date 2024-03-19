package Hanoi;

public class Disco {

	 int tamaño;
	 
	 public Disco(int x) {
		 this.tamaño=x;
	 }
	 
	 public int getTamaño() {
		 return this.tamaño;
	 }

	@Override
	public String toString() {
		return "Disco " + tamaño;
	}
	 
}
