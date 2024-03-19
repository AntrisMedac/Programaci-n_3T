package Parking;

import java.util.ArrayList;
import java.util.List;

import Hanoi.Disco;

public class Parking {

	private ArrayList<Plaza> parking;
	
	public Parking() {
		this.parking = new ArrayList<>();
	}

	public void agregarPlazas(int cantidad) {
		for (int i=0;i<cantidad;i++) {
			this.parking.add(new Plaza(i));
		}
	}
	
	public void estacionarVehiculo(Vehiculo vehiculo) {
		for (int i=0;i<parking.size();i++) {
			if(!parking.get(i).getOcupada()) {
				parking.get(i).setOcupada(true);
				parking.get(i).setVehiculo(vehiculo);
			}
		}
	}
	
	public boolean retirarVehiculo(String matricula) {
		return true;
	}
	
	public void imprimirEstado() {
		System.out.println(parking);
	}

	@Override
	public String toString() {
		return "Parking " + parking;
	}
	
}
