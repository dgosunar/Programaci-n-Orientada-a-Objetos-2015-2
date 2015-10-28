import java.util.Scanner;

public class Director_Proyecto extends Trabajador {
	Scanner sc = new Scanner(System.in);
	double presupuesto=42;
	String idea_proyecto="Un Mega Video Juego";
	String [] Diás_de_trabajo= {"lunes", "martes", "miercoles", "jueves", "viernes"};
	
	Director_Proyecto(String nombre, String apellido, String profesion, String nacionalidad, String cargo,
			double sueldo, double presupuesto,String idea_proyecto ) {
		super(nombre, apellido, profesion, nacionalidad, cargo, sueldo);		
	}
	public void Manejar_presupuesto(){
		System.out.println("¿Que desea hacer con el presupesto?");
		System.out.println("Digite 1 para sumar, 2 para restar y 3 para cambiar");
		int desicion = sc.nextInt();
				if (desicion>3 || desicion<1){
					System.out.println("parece que el rango esta fuera de lo permitido");
					System.out.println("pero tranquilo no hay lio lo enviaremos directamente al menu de cambio");
					desicion=3;
				}
				switch(desicion){
				case 1:
					System.out.println("Digite la cantidad a sumar");
					double sumar=sc.nextDouble();
					presupuesto=+ sumar;
					break;
				case 2:
					System.out.println("Digite la cantidad a restar");
					double restar=sc.nextDouble();
					presupuesto=- restar;
				case 3:
					System.out.println("Digite el nuevo presupuesto");
					double nuevo= sc.nextDouble();
					set_presupuesto(nuevo);
					break;
				}
	}
	
	public String set_idea(String idea_proyecto){
		this.idea_proyecto= idea_proyecto;
		return idea_proyecto;
	}
	public void get_idea(){}
	public double set_presupuesto(double presupuesto){
		this.presupuesto=presupuesto;
		return presupuesto;
	}
	public double get_presupuesto(){
		return presupuesto;
	}


}
