import java.util.*;
public class Proyecto {
Scanner sc = new Scanner(System.in);

	ArrayList<Trabajador> trabajadores = new ArrayList();
	String nombre_proyecto="Una parte";
	double porciento=0.0;	
	String [] dias_laborales = new String[4];
	Director_Proyecto director = new Director_Proyecto(null, null, null, null, null, 0, 0, null);
	
	public void Agregar_trabajadores(){
		System.out.println("Aqui podra agregar trabajadores a su proyecto");
		System.out.println("por favor digite el numero de trabajadores que quiere agregar");
		int agregar = sc.nextInt();
		for(int i =0; i<=agregar; i++){
			System.out.println("Digite nombre: ");
			String nombre=sc.next();
			System.out.println("Digite apellido: ");
			String apellido=sc.next();
			System.out.println("Digite profesion: ");
			String profesion=sc.next();
			System.out.println("Digite nacionalidad: ");
			String nacionalidad=sc.next();
			System.out.println("Digite cargo: ");
			String cargo=sc.next();
			System.out.println("Digite suelo: ");
			double sueldo=sc.nextDouble();
			Trabajador trabajador = new Trabajador(nombre, apellido, profesion, nacionalidad, cargo, sueldo);
			trabajadores.add(trabajador);			
		}
	}
	public void Eliminar_trabajadores(){
		System.out.println("Esta es la lista de trabajadores que tiene por ahora");
		for(int i=0; i<=trabajadores.size();i++){
			System.out.print(i+". ");
			System.out.println(trabajadores.get(i).mostrar_trabajador());			
		}
		System.out.println("Por favor digite la posicion del trabajador que quiere dar de baja");
		int baja =sc.nextInt();
		if(baja>trabajadores.size() || baja<trabajadores.size()){
			System.out.println("Vaya parece que el index no existe, pero tranquilo te remitire al ultimo trabajador de la lista");
			baja=trabajadores.size();
		}
		trabajadores.remove(baja);
		System.out.println("Esta es la nueva lista");
		for(int i=0; i<=trabajadores.size();i++){
			System.out.print(i+". ");
			System.out.println(trabajadores.get(i).mostrar_trabajador());			
		}
		
	}
	public void Reemplazar_trabajor(){
		System.out.println("Esta es la lista de trabajadores por ahora:");
		for(int i=0; i<=trabajadores.size();i++){
			System.out.print(i+". ");
			System.out.println(trabajadores.get(i).mostrar_trabajador());			
		}
		System.out.println("Por favor digite la posicion del trabajador que quiere reemplazar");
		int reemplazo =sc.nextInt();
		if(reemplazo>trabajadores.size() || reemplazo<trabajadores.size()){
			System.out.println("Vaya parece que el index no existe, pero tranquilo te remitire al ultimo trabajador de la lista");
			reemplazo=trabajadores.size();
		}
		System.out.println("Bien, ahora comenzaremos con los datos del nuevo trabajador");
		System.out.println("Digite nombre: ");
		String nombre=sc.next();
		System.out.println("Digite apellido: ");
		String apellido=sc.next();
		System.out.println("Digite profesion: ");
		String profesion=sc.next();
		System.out.println("Digite nacionalidad: ");
		String nacionalidad=sc.next();
		System.out.println("Digite cargo: ");
		String cargo=sc.next();
		System.out.println("Digite suelo: ");
		double sueldo=sc.nextDouble();
		Trabajador nuevo = new Trabajador(nombre, apellido, profesion, nacionalidad, cargo, sueldo);
		trabajadores.set(reemplazo, nuevo);
		System.out.println("Esta es la nueva lista de trabajadores :");
		for(int i=0; i<=trabajadores.size();i++){
			System.out.print(i+". ");
			System.out.println(trabajadores.get(i).mostrar_trabajador());			
		}
		
	}
	public String mostrar_proyecto(){
		System.out.println("Este es el nombre del proyecto: " + nombre_proyecto);
		System.out.println("Este es el porciento del proyecto: " + porciento+"%");
		System.out.println("Y esta es la lista de trabajadores por ahora:");
		for(int i=0; i<=trabajadores.size();i++){
			System.out.print(i+". ");
			System.out.println(trabajadores.get(i).mostrar_trabajador());			
		}
		return "";
	}
	public void set_porciento(double porciento){
		this.porciento= porciento;
	}
	public double get_porciento(){
		return porciento;
	}
	public void set_nombre(String nombre_proyecto){
		this.nombre_proyecto= nombre_proyecto;
	}
	public String get_nombre(){
		return nombre_proyecto;
	}
	public String días(){
		System.out.println("Aqui usted podra definir que días desea trabajar hablando con el director");
		for(int i=0; i<=4;i++){			
			System.out.println((i+1)+". "+director.Diás_de_trabajo[i]);
		}
		System.out.println("¿cuantos días sea trabajar?");
		int dias=sc.nextInt();
		for(int i=0; i<=dias;i++){
			System.out.println("¿cual es el index del día "+(i+1)+"?");
			int index = sc.nextInt();
			dias_laborales[i]=director.Diás_de_trabajo[i];			
		}
		System.out.println("Estos son sus días laborales: ");
		for(int i=0; i<=dias;i++){
			System.out.println((i+1)+". "+dias_laborales[i]);
			
			
		}
		return "";
	}
}
