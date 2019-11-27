package es.studium.CambiarAporO;

import java.util.Scanner;

public class CambiarAporO {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String cadena;
		
		System.out.println("Escribe la cadena");
		cadena=teclado.next();
		System.out.println(cadena.replace('a', 'o'));

		teclado.close();


	}

}
