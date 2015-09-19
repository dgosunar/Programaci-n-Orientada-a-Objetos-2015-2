import java.util.*;

public class Main {
			
	public static void main(String[] args) {

		//Se inicialisan los dos numeros a operar
		 int x1=0;	   
		 int x2=0;
		Es_par parr = new Es_par();
		Es_multiplo Mult = new Es_multiplo();
		Mayor may = new Mayor();	
		
	//se instancia el scanner para leer datos desde consola	
	Scanner scan = new Scanner(System.in);	
			
	
	//se comienza a asignar el valor a cada numero
	System.out.println("Por favor digita Numero 1");
		
		x1= scan.nextInt();
				
	System.out.println("Por favor digita Numero 2");	
		x2= scan.nextInt();
		
		if(parr.Par_n1(x1)){
			System.out.println("El primer numero es par");
				}
		else {
			System.out.println("El primer numero es impar");
		}
		
		if(parr.Par_n2(x2)){
			System.out.println("El segundo numero es par");
				}
		else {
			System.out.println("El segundo numero es impar");
		}
		
		if(Mult.Multiplo(x1, x2)){
			System.out.println("El primer numero es multiplo");
				}
		else {
			System.out.println("El primer numero no es multipo");
		}
		
		if(may.Meyor(x1, x2)){
			System.out.println("El primer numero es mayor");
				}
		else {
			System.out.println("El primer numero no es mayor");
		}
		
		
		
		scan.close();
		
	}

}
