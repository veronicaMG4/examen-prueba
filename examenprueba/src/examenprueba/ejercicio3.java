package examenprueba;


import java.util.Scanner;

public class ejercicio3 {
	
	//TODO try

	public static void main(String[] args) {

		int i;//contabilizador for
		int[] numeros = new int[3];// array numeros introducidos
		int[] multiplos = new int[3];// array para guardar los numeros multiplos de 7
		
		int contar = 0;//contador de multiplos
	
		
		Scanner sc_teclado = new Scanner(System.in);

		for (i = 0; i < numeros.length; i++) {
			System.out.println("Introduzca número:");
			// System.out.printf("Introduzca número %d: ", i+1);
			numeros[i] = sc_teclado.nextInt();// guardo el numero en el array
			// System.out.println("el numero es: "+ numeros[i]);

			if (numeros[i] % 7 == 0) {
				System.out.println(numeros[i] + "---------------------------------SI es multiplo de 7");
				multiplos[i] = numeros[i];

				contar++;
				

			} // if
			else {
				System.out.println(numeros[i] + "------------------------------------NO es multiple de 7");
			}

		} // for1

		// VISUALIZO EL TOTAL

		System.out.println("HAY " + contar + " MULTIPLO(S) DE 7 QUE SON : ");

		
		for (i = 0; i < multiplos.length; i++) {
			if (multiplos[i] != 0) {
				System.out.println(multiplos[i]);

			} // if

		} // for2

		// VISUALIZAR LA MEDIA ARITMETICA
		
		
		double media = 0.0;//porque la media puede tener decimales
		for ( i=0; i < numeros.length; i++) {
			 media = media + numeros[i];
			 
			}//for2
			media = media / numeros.length;
			System.out.println("La media de todos es: " + media);
			

	}// main

}// class
