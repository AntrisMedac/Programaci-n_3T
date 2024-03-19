package Map;

import java.util.HashMap;
import java.util.Scanner;

public class InventarioProductos {

	public static void main(String[] args) {
		
		HashMap<Integer, Producto> Inventario=new HashMap<Integer, Producto>();
		
		Scanner teclado=new Scanner(System.in);
		
		boolean Fin=false;
		
		while (!Fin) {
			System.out.println("¿Que desea hacer?");
			System.out.println("1.- Agregar nuevos productos al inventario");
			System.out.println("2.- Actualizar el stock de un producto existente");
			System.out.println("3.- Eliminar un producto del inventario por su código");
			System.out.println("4.- Buscar un producto por su código y mostrar su información");
			System.out.println("5.- Salir");
			
			int opcion=teclado.nextInt();
			
			switch (opcion) {
				case 1:
					System.out.println("Introduzca el codigo y seguido por el producto");
					int codigo=teclado.nextInt();
					System.out.println("Nombre del producto:");
					String nombre=teclado.next();
					System.out.println("Stock del producto:");
					int stock=teclado.nextInt();
					System.out.println("Precio del producto:");
					double precio=teclado.nextDouble();
					Producto producto=new Producto(nombre, stock, precio);
				
					Inventario.put(codigo, producto);
					
					break;
					
				case 2:
					System.out.println("Introduzca el producto a actualizar");
					int codigoActualizar=teclado.nextInt();
			
					if (Inventario.containsKey(codigoActualizar)) {
						Producto productoExistente=Inventario.get(codigoActualizar);
						System.out.println("Nuevo Stock:");
						int nuevoStock=teclado.nextInt();
						productoExistente.setStock(nuevoStock);
						Inventario.put(codigoActualizar, productoExistente);
					}
					else{
						System.out.println("No hay coincidencias");
					}
					
					break;
					
				case 3:
					System.out.println("Introduzca el producto a elminar");
					Integer codigoEliminar=teclado.nextInt();
					
					if (Inventario.containsKey(codigoEliminar)) {
						Inventario.remove(codigoEliminar);
						System.out.println("El producto con codigo "+codigoEliminar+" ha sido eliminado");
					}
					
					break;
					
				case 4:
					System.out.println("Introduzca el codigo del producto a buscar");
					int codigoBuscar=teclado.nextInt();
					if (Inventario.containsKey(codigoBuscar)) {
						System.out.println(Inventario.get(codigoBuscar));
					}
					
					break;
					
				case 5:
					System.out.println("Hasta la proxima");
					Fin=true;
					break;
					
				default: System.out.println("Introduzca una entrada valida");
					
			}
		}
		
		teclado.close();
		
	}	
}


