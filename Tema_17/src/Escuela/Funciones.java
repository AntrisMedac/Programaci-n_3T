package Escuela;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Funciones {

	public static void Menu(){
		System.out.println("<-------Menú------->");
		System.out.println("1.- Insertar  datos");
		System.out.println("2.- Consultar datos");
		System.out.println("3.- Modificar datos");
		System.out.println("4.- Eliminar  datos");
		System.out.println("5.- Fin");
		System.out.println("<------------------>");
	}
	
	public static void Introducir(Scanner teclado, ConexionMySQL conexion) throws SQLException {
		System.out.println("¿Como se llama el estudiante?");
		String Nombre=teclado.next();
		System.out.println("¿Cual es la edad del estudiante?");
		int Edad=teclado.nextInt();
		System.out.println("¿Cual es el DNI del estudiante?");
		String DNI=teclado.next();
		
		String sentencia="INSERT INTO estudiantes (Nombre, Edad, DNI) VALUES ('"+Nombre+"', '"+Edad+"', '"+DNI+"')";
		conexion.ejecutarInsertDeleteUpdate(sentencia);
	}
	
	public static void Mostrar(Scanner teclado, ConexionMySQL conexion) throws SQLException {
		int opcion;
		boolean fin=false;
		while (!fin) {
			System.out.println("¿Que desea hacer?");
			System.out.println("1.- Mostrar todo");
			System.out.println("2.- Buscar por nombre");
			System.out.println("3.- Buscar por DNI");
			System.out.println("4.- Volver al menú");
			switch(opcion=teclado.nextInt()) {
			case 1:
				String sentencia="SELECT * FROM estudiantes";
				ResultSet datos;
				datos=conexion.ejecutarSelect(sentencia);
				
				while(datos.next()) {
					String nombre=datos.getString("Nombre");
					int edad=datos.getInt("Edad");
					String dni=datos.getString("DNI");
					
					System.out.println(nombre+", "+edad+", "+dni);
				}
				break;
			case 2:
				System.out.println("¿Como se llama el estudiante a buscar?");
				String nombre=teclado.next();
				String sentenciaNombre="SELECT * FROM estudiantes WHERE Nombre='"+nombre+"'";
				ResultSet datosNombre;
				datosNombre=conexion.ejecutarSelect(sentenciaNombre);
				
				while(datosNombre.next()) {
					String nombre2=datosNombre.getString("Nombre");
					int edad=datosNombre.getInt("Edad");
					String dni=datosNombre.getString("DNI");
					
					System.out.println(nombre2+", "+edad+", "+dni);
				}
				break;
			case 3:
				System.out.println("¿Cual es el DNI del estudiante a buscar?");
				String dni=teclado.next();
				String sentenciaDNI="SELECT * FROM estudiantes WHERE DNI='"+dni+"'";
				ResultSet datosDNI;
				datosDNI=conexion.ejecutarSelect(sentenciaDNI);
				
				while(datosDNI.next()) {
					String nombre2=datosDNI.getString("Nombre");
					int edad=datosDNI.getInt("Edad");
					String dni2=datosDNI.getString("DNI");
					
					System.out.println(nombre2+", "+edad+", "+dni2);
				}
				break;
			case 4:
				fin=true;
				break;
			}
		}
	}
	
	public static void Actualizar(Scanner teclado, ConexionMySQL conexion) throws SQLException {
		System.out.println("¿Cual es el DNI del estudiante a buscar?");
		String dni=teclado.next();
		
		int opcion;
		boolean fin=false;
		
		while (!fin) {
			System.out.println("¿Que desea hacer con el alumno con DNI "+dni+"?");
			System.out.println("1.- Actualizar nombre");
			System.out.println("2.- Actualizar edad");
			System.out.println("3.- Actualizar ambos");
			System.out.println("4.- Volver al menú");
			
			switch(opcion=teclado.nextInt()) {
			case 1:
				System.out.println("¿Cual es su nuevo nombre?");
				String nuevoNom=teclado.next();
				String sentenciaActualizarNombre="UPDATE estudiantes SET Nombre= '"+nuevoNom+"' WHERE DNI='"+dni+"'";
				
				conexion.ejecutarInsertDeleteUpdate(sentenciaActualizarNombre);
				System.out.println("Cambio ejecutado con exito");
				break;
				
			case 2:
				System.out.println("¿Cual es su nueva edad?");
				int nuevaEd=teclado.nextInt();
				String sentenciaActualizarEdad="UPDATE estudiantes SET Edad= '"+nuevaEd+"' WHERE DNI='"+dni+"'";
				
				conexion.ejecutarInsertDeleteUpdate(sentenciaActualizarEdad);
				System.out.println("Cambio ejecutado con exito");
				break;
				
			case 3:
				System.out.println("¿Cual es su nuevo nombre?");
				String nuevoNombre=teclado.next();
				System.out.println("¿Cual es su nueva edad?");
				int nuevaEdad=teclado.nextInt();
				String sentenciaActualizarTodo="UPDATE estudiantes SET Nombre= '"+nuevoNombre+"', Edad= '"+nuevaEdad+"' WHERE DNI='"+dni+"'";
				
				conexion.ejecutarInsertDeleteUpdate(sentenciaActualizarTodo);
				System.out.println("Cambios ejecutados con exito");
				break;
				
			case 4:
				fin=true;
				break;
			}
		}
	}
	
	public static void Eliminar(Scanner teclado, ConexionMySQL conexion) throws SQLException{
		System.out.println("¿Cual es el DNI del estudiante a eliminar?");
		String dni=teclado.next();
		
		String sentenciaEliminarEstudiante="DELETE FROM estudiantes WHERE DNI='"+dni+"'";
		
		conexion.ejecutarInsertDeleteUpdate(sentenciaEliminarEstudiante);
		System.out.println("Cambio ejecutado con exito");
		
	}
	
}
