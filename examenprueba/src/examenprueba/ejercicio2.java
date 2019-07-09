package examenprueba;



import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {

		int x;
		Scanner sc_puntos = new Scanner(System.in);
		
		

		System.out.println("¿Cuantos puntos ha obtenido?");
		
		
		
		try {
		x = sc_puntos.nextInt();

		System.out.println("los puntos obtenidos son: " + x);
		ganar(x);

		if (ganar(x)) {
			System.out.println("ganaras");

		} else {
			System.out.println("perderas");

		}
		
		}catch (Exception e){
			
			System.out.println("Por favor introduzca datos numericos y positivos");
			
		}
		sc_puntos.close();

	}//fin main

	public static boolean ganar(int x) throws Exception {

		boolean ganarcampeonato;

		if (x >= 70) {

			ganarcampeonato = true;
		} else if(x<70 && x>0) {
			ganarcampeonato = false;

		}else {
			throw new Exception();
		}

		return ganarcampeonato;

	}

}
