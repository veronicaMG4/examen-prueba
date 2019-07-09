package examenprueba;



public class E4_TrainMainForma1 {
	
	public static void main(String[] args) {
		
		//DOY VALORES A UN OBJETO PARA EL CONSTRUCTOR DE LA OTRA CLASE
		//nombre de la clase donde estan los metodos==Nombre del constructor porque se llaman igual
		E4_TrainnMetodosForma1 tren1= new E4_TrainnMetodosForma1("locomotora","L0001",400,8);
		
		
		//MOSTRAR DATOS
		//__________________________________________________________________
		//forma1
		tren1.mostrarDatos();//este metodo esta hecho con un syso
		
		
		//2 forma2
		System.out.println( tren1.mostrarDatos2() );//Si en el metodo uso return en el main tengo que hacer syso
		//tren1.mostrarDatos2(); Esta forma no vale porque el metodo esta hecho con return
		
		
		
		//ASIENTOS OCUPADOS
		//__________________________________________________________________________
	
		
		//forma1
		
		if (tren1.trenlleno()) {
			
			System.out.println("El tren esta al completo*");
			
		}else {
			System.out.println("El tren no esta al completo*");
			
		}
		
		//forma2
		System.out.println(tren1.trenlleno2());
		
		
		//AÑOS TRABAJADOS POR EL TREN
		//___________________________________________________________________________________________
		
		//forma1
		System.out.println(tren1.añostrabajados());
		
		//forma2
		tren1.añostrabajados2();
		
		
		
		
	}//main

   
}//class