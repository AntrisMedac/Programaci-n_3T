package Parking;

public class Plaza {

	private int numero;
	private boolean ocupada;
	private Vehiculo vehiculo;
	
	public Plaza(int numero) {
		this.numero = numero;
		this.ocupada = false;
		this.vehiculo = null;
	}

	public int getNumero() {
		return numero;
	}

	public boolean getOcupada() {
		return ocupada;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public boolean ocuparPlaza(Vehiculo x) {
		if(!ocupada) {
			this.ocupada=true;
			this.vehiculo=x;
		}
		else {
			System.out.println("La plaza esta ocupada");
		}
		return ocupada;
	}
	
	public Vehiculo liberarPlaza() {
		if (this.ocupada==true) {
			Vehiculo temporal=this.vehiculo;
			this.ocupada=false;
			this.vehiculo=null;
			return temporal;
		}
		else {
			System.out.println("El parking esta vacío");
		}
		return null;
	}

	@Override
	public String toString() {
		return "{Plaza numero " + numero + ", ocupada=" + ocupada + ", vehiculo=" + vehiculo+"}";
	}
	
}