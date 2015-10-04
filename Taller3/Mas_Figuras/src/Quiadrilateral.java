import java.util.*;
public class Quiadrilateral {
	
	Scanner sc = new Scanner(System.in);
	double height=0;
	double widht=0;
	String message = "Coordinates of Quadrilateral are:";
	
	//Este constructor es el que nos mostrara el mensaje de coordenadas más adelante
	public Quiadrilateral(String message){
					
		this.message=message;
	}
	
	//Aqui Encontramos y definimos las coordenadas para cada punto
	public final String points(){
		double [] x = new double[4];
		double [] y = new double[4];
		point pt = new point(x,y);	
		String c1 ="(";
		String c2 =")";
		String c3 =",";
		String p1= c1+x[0]+c3+y[0]+c2;
		String p2= c1+x[1]+c3+y[1]+c2;
		String p3= c1+x[2]+c3+y[2]+c2;
		String p4= c1+x[3]+c3+y[3]+c2;
		System.out.println(message);
		
		//definimos alto y ancho de cada cuadrilatero
		double height=pt.max_y;
		double widht=pt.max_x;		
		return p1+p2+p3+p4;
		
	}	
	
	//Simplemente damos una formula general para el area de los cuadrilateros
	public double Area(){		
		return (height*widht);
	}
	
}

