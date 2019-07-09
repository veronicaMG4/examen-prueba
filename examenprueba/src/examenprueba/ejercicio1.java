package examenprueba;





import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {

	
			

			

			Scanner sc_peso = new Scanner(System.in);
			int peso_introducido = 0;
			boolean prueba= true;

			
			while (prueba) {
				System.out.println("Introduce el peso del boxeador");

			try {
				peso_introducido = sc_peso.nextInt();
				if (peso_introducido <= 0) {
					throw new Exception  ();
				} else if (peso_introducido > 0 && peso_introducido < 52) {
					System.out.println("El boxeador pertenece a la categoria de PESO MOSCA");
				} else if (peso_introducido >= 52 && peso_introducido < 58) {
					System.out.println("El boxeador pertenece a la categoria de PESO PLUMA");

				} else if (peso_introducido>= 58 && peso_introducido < 65) {
					System.out.println("El boxeador pertenece a la categoria de PESO LIGERO");

				} else if (peso_introducido >= 65 && peso_introducido < 90) {
					System.out.println("El boxeador pertenece a la categoria de PESO MEDIANO");

				} else if (peso_introducido >= 90) {
					System.out.println("El boxeador pertenece a la categoria de PESO PESADO");
				}

			} catch (Exception e){

				System.out.println("ha introducido datos sin el formato adecuado o fuera de rango");
				prueba=false;
				

			}
			
		}sc_peso.close();
	}
}
