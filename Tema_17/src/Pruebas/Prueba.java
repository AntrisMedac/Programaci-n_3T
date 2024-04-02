package Pruebas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {

	ConexionMySQL conexion=new ConexionMySQL("root", "", "Prueba");
	
	Scanner teclado=new Scanner (System.in);
	
	try {
	/*	conexion.conectar();
		System.out.println("Introduzca un nombre");
		String nombre=teclado.next();
		System.out.println("Introduza una edad");
		int edad=teclado.nextInt();
		String sentencia="INSERT INTO personas(Nombre, Edad) VALUES ('"+nombre+"', '"+edad+"')";
		conexion.ejecutarInsertDeleteUpdate(sentencia);*/
		
		String sentencia="SELECT * FROM Personas";
		ResultSet datos;
		datos=conexion.ejecutarSelect(sentencia);
		
		while(datos.next()) {
			String nombre=datos.getString("Nombre");
			int edad=datos.getInt("Edad");
			
			System.out.println(nombre+", "+edad);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	finally {
		try {
			conexion.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	}

}
