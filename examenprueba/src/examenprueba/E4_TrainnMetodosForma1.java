package examenprueba;



public class E4_TrainnMetodosForma1 {

	private static final String String = null;
	// ATRIBUTOS
	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private int añosActivo;

	// CONSTRUCTOR para pasar valores al main

	public E4_TrainnMetodosForma1(String tipo, String referencia, int asientosOcupados, int añosActivo) {

		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.añosActivo = añosActivo;

	}

	// METODO PARA MOSTRAR LO QUE HAY EN EL CONSTRUCTOR
	//___________________________________________________________________________________________________________________

	public void mostrarDatos() {
		System.out.println("DATOS TREN: " + "TIPO:" + tipo + "  REFERENCIA:" + referencia + "  OCUPADOS:"
				+ asientosOcupados + "  AÑOS TRABAJADOS:" + añosActivo);
	}

	public String mostrarDatos2() {
		return "Tren [tipo=" + tipo + "referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", añosActivo=" + añosActivo + "]";
	}
	
	
	public void mostrarDatos3() {
		System.out.println("DATOS TREN: " + "TIPO:" + tipo + "  REFERENCIA:" + referencia + "  OCUPADOS:"
				+ asientosOcupados + "  AÑOS TRABAJADOS:" + añosActivo);
	}

	// GETTERS Y SETTERS para establecer valores y mostrarlos en el main
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getAñosActivo() {
		return añosActivo;
	}

	public void setAñosActivo(int añosActivo) {
		this.añosActivo = añosActivo;
	}

	// METODO PARA SABER SI ESTA LLENO. ESTA LLENO SI LLEGA A 400.
	//_____________________________________________________________________________________________________
	
	//forma1

	public boolean trenlleno() {

		boolean resul;

		if (this.asientosOcupados > 400) {
			resul = true;

		} else {
			resul = false;
		}
		return resul;

	}
	//forma2
	public String trenlleno2() {
		String lleno;
		if (this.asientosOcupados > 400) {
			lleno = "El tren esta al completo**";
		} else {
			lleno = "El tren no esta al completo**";
		}

		return lleno;
	}
		
		
		//AÑOS TRABAJADOS POR EL TREN
		//___________________________________________________________________________________________
		
		
		public String añostrabajados() {
			String años;
			if (this.añosActivo > 40) {
				años = "El tren es viejo y esta fuera de circulacion*";
			} else {
				años = "El tren es joven y esta en circulacion*";
			}

			return años;
		}
			
			
			public void añostrabajados2() {
				
				if (this.añosActivo > 40) {
					System.out.println("VIEJO");
					
				} else {
					System.out.println("JOVEN");
					
					
					
				}
				System.out.println("fdfdsfsfdsf");

				
			
		
		

	}//main
}//class
