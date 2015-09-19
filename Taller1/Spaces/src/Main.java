import java.util.*;

public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 		
		
		int d= 0;
		int tamaño=0;
		String lector = "";		
			
		System.out.println("Hola, por favor comience a digitar numeros");
		
		d= scan.nextInt();
		
		//pasamos el entero a cadena para mas tarde imprimir cada
		//posicion del entero separado por tres espacios
		lector = Integer.toString(d);
		
		//Obtenemos el tamaño de la cadena
		tamaño= lector.length();
		
		
		//Usando este ciclo se imprimira la pocision de cada numero y los espacios
		
		for(int r=0; r<=(tamaño-1);r++){
			
			//De esta manera es como tenemos el numero en la
			//posicion deseada
			System.out.print(lector.charAt(r));
			System.out.print(" "+" "+" "+" ");	
		}
		
		
		
		
		scan.close();
		return ;
	}

}
