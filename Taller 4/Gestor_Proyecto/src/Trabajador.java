
public class Trabajador {
	String nombre="Pepito";
	String apellido="Galletas";
	String profesion="Millonario";
	String nacionalidad="Ciudadano del mundo";
	String cargo="No lo necesita";
	double sueldo=42;
	 String mostrar_trabajador(){
		 System.out.println("Aqui estan los datos del trabajador"); 
		 System.out.println("Su nombre es: "+nombre);
		 System.out.println("Su apellido es: "+apellido);
		 System.out.println("Su profesion es: "+profesion);
		 System.out.println("Su nacionalidad es: "+nacionalidad);
		 System.out.println("Su cargo es: "+cargo);
		 System.out.println("Su sueldo es: "+sueldo);
		 return "";
	 }
	Trabajador(String nombre,String apellido,
	                       String profesion,String nacionalidad,
	                       String cargo,double sueldo){
		
	} 
}
