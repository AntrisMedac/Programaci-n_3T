package Inicio;

import java.nio.charset.Charset;
import java.util.ArrayList;

public class Act_1 {

	public static void main(String[] args) {
		
		ArrayList <Character> lista=new ArrayList<>();
		
		char[] alfabeto={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for (int i=0;i<alfabeto.length;i++) {
			lista.add(alfabeto[i]);
		}
		
		System.out.println(lista);
		
		System.out.println(lista.indexOf('e'));		
		System.out.println(lista.indexOf('h'));
		System.out.println(lista.indexOf('o'));
		
		lista.remove(1);
		lista.remove((Character)'u');
		
		System.out.println(lista);
	}

}
