import java.util.*;
public class Mega_Proyecto {
	Scanner sc = new Scanner(System.in);
	String Nombre="GINGER HAT COMPANY: TALLER 4";
	double porcentaje_general=0.0;
	Proyecto[] proyectos= new Proyecto [3];
	
	public void predefinidos(){
		proyectos[0].nombre_proyecto="Los ingenieros";
		proyectos[0].porciento=99;
		proyectos[1].nombre_proyecto="Los Diseñadores";
		proyectos[1].porciento=2;
		proyectos[2].nombre_proyecto="Los Gerentes de negocio";
		proyectos[2].porciento=40;
		proyectos[3].nombre_proyecto="Los publicistas";
		proyectos[3].porciento=50;
	}
	public void mostrar(){
		predefinidos();
		System.out.println("El nombre del proyecto general es: " + Nombre);
		System.out.println("El porcentaje del proyecto general es: " + porcentaje_general()+"%");
		proyectos[1].mostrar_proyecto();
	}
	public double porcentaje_general(){
		predefinidos();
		double porciento_ingenieros= (proyectos[0].get_porciento()*0.25);
		double porciento_diseñadores= (proyectos[1].get_porciento()*0.25);
		double porciento_gerentes_de_negocio= (proyectos[2].get_porciento()*0.25);
		double porciento_publisistas = (proyectos[3].get_porciento()*0.25);
		double porciento_general= porciento_publisistas+porciento_gerentes_de_negocio+porciento_diseñadores+porciento_ingenieros;
		if(porciento_general>100){
			System.out.println("parece que el porcentaje se salio del rango, gracias a quien trabajo de más");
			porciento_general=100;
		}
		return porciento_general;
	}
	
}
