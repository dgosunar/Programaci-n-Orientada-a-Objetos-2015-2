import java.util.*;

public class main {

	public static void main(String[] args) {
		//esta variable sera el index del arreglo creado en el ciclo
		int x=0;
		//esta variable sera el tamaño inicial del arreglo
		int cantidad=99999;
		
		//esta variable corresponde al numero que ingresa el usuario
		double pos=0;
		
		Scanner scan = new Scanner( System.in );
		promedio prom = new promedio();
		
		/*
		System.out.println ("hola, digite la cantidad de numeros que desea ingresar");
		//se define la cantidad de valores del arreglo de numeros digitados
		cantidad = scan.nextInt(); */						
		
		//Se crea el arreglo con la cantidad de numeros que digitara el usuario
		double numeros [];
		
		//inicializamos el arreglo con un valor 1 para tener una casilla vacia
		numeros = new double [cantidad];
			
		
		/*mientras el usuario no digite 9999 entonces capture las variables 
		y les saque el promedio*/
		System.out.println ("Por favor digite los numeros (9999 para finalizar)");
		pos=scan.nextDouble();
		/* 				
		 * 
		 * 
		 * 
		 * 
		for (int x=0; pos!=9999 && (x<=(cantidad-1));pos=scan.nextDouble()){
			System.out.println(pos);
					
			numeros [x] = pos;
				
			System.out.println ("esta es la posicion " + x);
			System.out.println("y su valor es" + pos);
			x++;				
						 } */
		
		
		
		
		for (; pos!=9999 ;pos=scan.nextDouble()){
			
			//definimos que la posicion x del arreglo sera igual al numero ingresado
			numeros[x] = pos;
			System.out.println ("esta es la posicion " + x);
			System.out.println("y su valor es" + pos);
			
			//aunmentamos en uno el  index
			x++;		
						
		}
		
		//se define el tamaño del arreglo del promedio
		
		prom.cant=x;
		
		prom.Promedio(numeros);
		
		System.out.println("hola la suma es: " +(prom.suma));
		System.out.println("hola el promedio es: "+ prom.promedio);
		
		
		scan.close();
			
		}
						
		
				
	   
		
		}	
		




