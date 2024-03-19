package Hanoi;

import java.util.ArrayList;

public class Torre {

	ArrayList <Disco> Torre;
	
	public Torre() {
		Torre=new ArrayList<Disco>();
	}
	
	public Disco cima() {
		return this.Torre.get(Torre.size()-1);
	}

	public boolean agregarDisco(Disco x) {		
		if (Torre.isEmpty() || x.getTamaño()<cima().getTamaño()) {
			this.Torre.add(x);
			return true;
		}
		else {
			System.out.println("El disco no puede ser mayor al ya puesto");
			return false;
		}
	}
	
	public Disco removerDisco() {
		return this.Torre.remove(Torre.size()-1);
	}
	
	public Disco ultimoDisco() {
		return this.Torre.get(Torre.size()-1);
	}

	@Override
	public String toString() {
		return "Torre " + Torre;
	}
	
}
