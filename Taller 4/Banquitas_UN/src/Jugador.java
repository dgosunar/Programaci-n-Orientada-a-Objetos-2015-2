
public class Jugador {

	String nombre="";
	String habilidad_1="";
	String habilidad_2="";
	String habilidad_3="";
	String posicion="";
	int edad=0;
	int goles=0;
	int numero=0;
	
	public String get_nombre(){
		return nombre;
	}
	
	public void set_nombre(String nombre){
		this.nombre= nombre;
	}
	public String get_habilidad_1(){
		return habilidad_1;
	}
	
	public void set_habilidad_1(String habilidad_1){
		this.habilidad_1= habilidad_1;
	}
	public String get_hablididad_2(){
		return habilidad_2;
	}
	
	public void set_habilidad_2(String habilidad_2){
		this.habilidad_2= habilidad_2;
	}
	public String get_habilidad_3(){
		return habilidad_3;
	}
	
	public void set_habilidad_3(String habilidad_3){
		this.habilidad_3= habilidad_3;
	}
	
	public String get_posicion(){
		return posicion;
	}
	
	public void set_posicion(String posicion){
		this.posicion= posicion;
	}
		
	public int get_edad(){
		return edad;
	}
	
	public void set_edad(int edad){
		this.edad=edad;
	}
	public int get_goles(){
		return goles;
	}
	
	public void set_goles(int goles){
		this.goles= goles;
	}
	public int get_numero(){
		return numero;
	}
	
	public void set_numero(int numero){
		this.numero= numero;
	}
	
	public void mostrar_Jugador(){
		
		System.out.println("Su nombre es: "+ nombre);
		System.out.println("Su edad es: "+ edad);
		System.out.println("Su posicion es: "+ posicion);
		System.out.println("Su habilidad 1 es: "+ habilidad_1);
		System.out.println("Su habilidad 2 es: "+ habilidad_2);
		System.out.println("Su habilidad 3 es: "+ habilidad_3);
	}
	
	Jugador (String nombre, int edad, int numero,int goles, String habilidad_1,
			 String habilidad_2,String habilidad_3, String posicion){
		this.numero= numero;
		this.goles= goles;
		this.edad=edad;
		this.posicion= posicion;
		this.habilidad_3= habilidad_3;
		this.habilidad_2= habilidad_2;
		this.habilidad_1= habilidad_1;
		this.nombre= nombre;
	}
}

