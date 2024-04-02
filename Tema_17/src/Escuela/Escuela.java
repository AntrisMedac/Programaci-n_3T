package Escuela;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Escuela {

	public static void main(String[] args) {
		
		ConexionMySQL conexion=new ConexionMySQL("root", "", "escuela");
		Scanner teclado=new Scanner(System.in);
	
		try {
			conexion.conectar();
			
			int opcion;
			
			boolean fin=false;
			
			while (!fin) {
				Funciones.Menu();
				opcion=teclado.nextInt();
				switch (opcion) {
				case 1:
					Funciones.Introducir(teclado, conexion);
				
					break;
				case 2:
					Funciones.Mostrar(teclado, conexion);
					break;
				case 3:
					Funciones.Actualizar(teclado, conexion);
					break;
				case 4:
					Funciones.Eliminar(teclado, conexion);
					break;
				case 5:
					System.out.println("¡Hazta la próxima!");
					fin=true;
					break;
				}
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
