import java.util.*;
public class Juego {
	
	static Scanner entrada = new Scanner(System.in);
	static boolean Ganador;
	static int a, b, c, d;

	//CONSTRUCTOR
	Juego(){
		Juego.Ganador= false;
	}
	
	//METODOS
	
	public void Juego1() {
		System.out.println("");
		System.out.println("BIENVENIDO A EL JUEGO DE AJEDREZ");
		System.out.println("");
			
		//------------------------------
		//CREACION DE Tableros
		Tablero tablero1 = new Tablero();
		tablero1.ancho=9;
		tablero1.largo=9;
		tablero1.CrearTablero();
		
		
		//------------------------------
		//CREACION DE LAS FICHAS NEGRAS
		Ficha Peon_1_N = new Ficha();
		Peon_1_N.Nombre = "P1N";
		Peon_1_N.Color_Ficha=true;
		a=1;
		b=2;
		tablero1.ubicar_ficha(a, b, Peon_1_N.Nombre);
			
				
		Ficha Peon_2_N = new Ficha();
		Peon_2_N.Nombre = "P2N";
		Peon_2_N.Color_Ficha=true;
		a=2;
		tablero1.ubicar_ficha(a, b, Peon_2_N.Nombre);
			
		Ficha Peon_3_N = new Ficha();
		Peon_3_N.Nombre = "P3N";
		Peon_3_N.Color_Ficha=true;
		a=3;
		tablero1.ubicar_ficha(a, b, Peon_3_N.Nombre);
				
		Ficha Peon_4_N = new Ficha();
		Peon_4_N.Nombre = "P4N";
		a=4;
		tablero1.ubicar_ficha(a, b, Peon_4_N.Nombre);
						
		Ficha Peon_5_N = new Ficha();
		Peon_5_N.Nombre = "P5N";
		Peon_5_N.Color_Ficha=true;
		a=5;
		tablero1.ubicar_ficha(a, b, Peon_5_N.Nombre);
				
		Ficha Peon_6_N = new Ficha();
		Peon_6_N.Nombre = "P6N";
		a=6;
		tablero1.ubicar_ficha(a, b, Peon_6_N.Nombre);
			
		Ficha Peon_7_N = new Ficha();
		Peon_7_N.Nombre = "P7N";
		a=7;
		tablero1.ubicar_ficha(a, b, Peon_7_N.Nombre);
						
		Ficha Peon_8_N = new Ficha();
		Peon_8_N.Nombre = "P8N";
		a=8;
		tablero1.ubicar_ficha(a, b, Peon_8_N.Nombre);
		//--					
		Ficha Rey_N = new Ficha();
		Rey_N.Nombre = "R-N";
		a=4;
		b=1;
		tablero1.ubicar_ficha(a, b, Rey_N.Nombre);
		//--				
		Ficha Dama_N = new Ficha();
		Dama_N.Nombre = "D-N";
		a=5;
		tablero1.ubicar_ficha(a, b, Dama_N.Nombre);
		//--
		Ficha Alfil_1_N = new Ficha();
		Alfil_1_N.Nombre = "A1N";
		a=3;
		tablero1.ubicar_ficha(a, b, Alfil_1_N.Nombre);
		
		Ficha Alfil_2_N = new Ficha();
		Alfil_2_N.Nombre = "A2N";
		a=6;
		tablero1.ubicar_ficha(a, b, Alfil_2_N.Nombre);
		//--	
		Ficha Caballo_1_N = new Ficha();
		Caballo_1_N.Nombre = "C1N";
		a=2;
		tablero1.ubicar_ficha(a, b, Caballo_1_N.Nombre);
		
		Ficha Caballo_2_N = new Ficha();
		Caballo_2_N.Nombre = "C2N";
		a=7;
		tablero1.ubicar_ficha(a, b, Caballo_2_N.Nombre);
		//--		
		Ficha Torre_1_N = new Ficha();
		Torre_1_N.Nombre = "T1N";
		a=1;
		tablero1.ubicar_ficha(a, b, Torre_1_N.Nombre);
		
		Ficha Torre_2_N = new Ficha();
		Torre_2_N.Nombre = "T2N";
		a=8;
		tablero1.ubicar_ficha(a, b, Torre_2_N.Nombre);
				
		//------------------------------				
		//CREACION DE LAS FICHAS BLANCAS
		Ficha Peon_1_B = new Ficha();
		Peon_1_B.Nombre = "P1B";
		a=1;
		b=7;
		tablero1.ubicar_ficha(a, b, Peon_1_B.Nombre);
					
		Ficha Peon_2_B = new Ficha();
		Peon_2_B.Nombre = "P2B";
		a=2;
		tablero1.ubicar_ficha(a, b, Peon_2_B.Nombre);
		
		Ficha Peon_3_B = new Ficha();
		Peon_3_B.Nombre = "P3B";a=1;
		a=3;
		tablero1.ubicar_ficha(a, b, Peon_3_B.Nombre);
					
		Ficha Peon_4_B = new Ficha();
		Peon_4_B.Nombre = "P4B";
		a=4;
		tablero1.ubicar_ficha(a, b, Peon_4_B.Nombre);
		
		Ficha Peon_5_B = new Ficha();
		Peon_5_B.Nombre = "P5B";
		a=5;
		tablero1.ubicar_ficha(a, b, Peon_5_B.Nombre);
			
		Ficha Peon_6_B = new Ficha();
		Peon_6_B.Nombre = "P6B";
		a=6;
		tablero1.ubicar_ficha(a, b, Peon_6_B.Nombre);
		
		Ficha Peon_7_B = new Ficha();
		Peon_7_B.Nombre = "P7B";
		a=7;
		tablero1.ubicar_ficha(a, b, Peon_7_B.Nombre);			
		
		Ficha Peon_8_B = new Ficha();
		Peon_8_B.Nombre = "P8B";
		a=8;
		tablero1.ubicar_ficha(a, b, Peon_8_B.Nombre);
		//--					
		Ficha Rey_B = new Ficha();
		Rey_B.Nombre = "R-B";
		a=5;
		b=8;
		tablero1.ubicar_ficha(a, b, Rey_B.Nombre);
		//--				
		Ficha Dama_B = new Ficha();
		Dama_B.Nombre = "D-B";
		a=4;
		tablero1.ubicar_ficha(a, b, Dama_B.Nombre);
		//--
		Ficha Alfil_1_B = new Ficha();
		Alfil_1_B.Nombre = "A1B";
		a=3;
		tablero1.ubicar_ficha(a, b, Alfil_1_B.Nombre);
				
		Ficha Alfil_2_B = new Ficha();
		Alfil_2_B.Nombre = "A2B";
		a=6;
		tablero1.ubicar_ficha(a, b, Alfil_2_B.Nombre);
		
		//--	
		Ficha Caballo_1_B = new Ficha();
		Caballo_1_B.Nombre = "C1B";
		a=2;
		tablero1.ubicar_ficha(a, b, Caballo_1_B.Nombre);
		
		Ficha Caballo_2_B = new Ficha();
		Caballo_2_B.Nombre = "C2B";
		a=7;
		tablero1.ubicar_ficha(a, b, Caballo_2_B.Nombre);
		
		//--		
		Ficha Torre_1_B = new Ficha();
		Torre_1_B.Nombre = "T1B";
		a=1;
		tablero1.ubicar_ficha(a, b, Torre_1_B.Nombre);
				
		Ficha Torre_2_B = new Ficha();
		Torre_2_B.Nombre = "T2B";
		a=8;
		tablero1.ubicar_ficha(a, b, Torre_2_B.Nombre);
			
		tablero1.mostrar_tablero(tablero1.tablero);
		

		
		//INICIO DEL JUEGO1		
		//------------------------------
			
		while (Ganador==false){		
			
			

			//---Juego Blancas---
			System.out.println();
			System.out.println("Juegan Las Fichas Blancas");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero1.verificar_ocupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero1.MostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
			
			tablero1.MoverFicha(a, b, c, d);
			tablero1.mostrar_tablero(tablero1.tablero);
			
			//---Juego Negras---
			System.out.println();
			System.out.println("Juegan Las Fichas Negras");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero1.verificar_ocupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero1.MostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
		
		}//FIN WHILE
		
		System.out.println("En la ubicacion no hay ninguna ficha");
		Ganador=true;
	}//FIN Juego1
	
	public void Juego2() {
		System.out.println("");
		System.out.println("BIENVENIDO A EL JUEGO DE DAMAS CHINAS");
		System.out.println("");
			
		
		//------------------------------
		//CREACION DE Tableros
			
		Tablero tablero2 = new Tablero();
		tablero2.ancho=9;
		tablero2.largo=19;
		tablero2.CrearTablero();
		
		
		//------------------------------
		//CREACION DE LAS FICHAS NEGRAS
		Ficha Peon_1_N = new Ficha();
		Peon_1_N.Nombre = "P1N";
		Peon_1_N.Color_Ficha=true;
		a=1;
		b=1;
		tablero2.ubicar_ficha(a, b, Peon_1_N.Nombre);
			
				
		Ficha Peon_2_N = new Ficha();
		Peon_2_N.Nombre = "P2N";
		Peon_2_N.Color_Ficha=true;
		a=2;
		b=2;
		tablero2.ubicar_ficha(a, b, Peon_2_N.Nombre);
			
		Ficha Peon_3_N = new Ficha();
		Peon_3_N.Nombre = "P3N";
		Peon_3_N.Color_Ficha=true;
		a=1;
		b=3;
		tablero2.ubicar_ficha(a, b, Peon_3_N.Nombre);
				
		Ficha Peon_4_N = new Ficha();
		Peon_4_N.Nombre = "P4N";
		a=2;
		b=4;
		tablero2.ubicar_ficha(a, b, Peon_4_N.Nombre);
						
		Ficha Peon_5_N = new Ficha();
		Peon_5_N.Nombre = "P5N";
		Peon_5_N.Color_Ficha=true;
		a=1;
		b=5;
		tablero2.ubicar_ficha(a, b, Peon_5_N.Nombre);
				
		Ficha Peon_6_N = new Ficha();
		Peon_6_N.Nombre = "P6N";
		a=2;
		b=6;
		tablero2.ubicar_ficha(a, b, Peon_6_N.Nombre);
			
		Ficha Peon_7_N = new Ficha();
		Peon_7_N.Nombre = "P7N";
		a=1;
		b=7;
		tablero2.ubicar_ficha(a, b, Peon_7_N.Nombre);
						
		Ficha Peon_8_N = new Ficha();
		Peon_8_N.Nombre = "P8N";
		a=2;
		b=8;
		tablero2.ubicar_ficha(a, b, Peon_8_N.Nombre);
		//--					
				//------------------------------				
		//CREACION DE LAS FICHAS BLANCAS
		Ficha Peon_1_B = new Ficha();
		Peon_1_B.Nombre = "P1B";
		a=17;
		b=1;
		tablero2.ubicar_ficha(a, b, Peon_1_B.Nombre);
					
		Ficha Peon_2_B = new Ficha();
		Peon_2_B.Nombre = "P2B";
		a=18;
		b=2;
		tablero2.ubicar_ficha(a, b, Peon_2_B.Nombre);
		
		Ficha Peon_3_B = new Ficha();
		Peon_3_B.Nombre = "P3B";
		a=17;
		b=3;
		tablero2.ubicar_ficha(a, b, Peon_3_B.Nombre);
					
		Ficha Peon_4_B = new Ficha();
		Peon_4_B.Nombre = "P4B";
		a=18;
		b=4;
		tablero2.ubicar_ficha(a, b, Peon_4_B.Nombre);

		Ficha Peon_5_B = new Ficha();
		Peon_5_B.Nombre = "P5B";
		a=17;
		b=5;
		tablero2.ubicar_ficha(a, b, Peon_5_B.Nombre);
			
		Ficha Peon_6_B = new Ficha();
		Peon_6_B.Nombre = "P6B";
		a=18;
		b=6;
		tablero2.ubicar_ficha(a, b, Peon_6_B.Nombre);
		
		Ficha Peon_7_B = new Ficha();
		Peon_7_B.Nombre = "P7B";
		a=17;
		b=7;
		tablero2.ubicar_ficha(a, b, Peon_7_B.Nombre);
					
		Ficha Peon_8_B = new Ficha();
		Peon_8_B.Nombre = "P8B";
		a=18;
		b=8;
		tablero2.ubicar_ficha(a, b, Peon_8_B.Nombre);
		//--					
		

		tablero2.mostrar_tablero(tablero2.tablero);
		
		
		//INICIO DEL JUEGO2		
		//------------------------------
			
		while (Ganador==false){		
			
			
			
			//---Juego Blancas---
			System.out.println();
			System.out.println("Juegan Las Fichas Blancas");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero2.verificar_ocupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero2.MostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
			
			tablero2.MoverFicha(a, b, c, d);
			tablero2.mostrar_tablero(tablero2.tablero);
			
			//---Juego Negras---
			System.out.println();
			System.out.println("Juegan Las Fichas Negras");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero2.verificar_ocupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero2.MostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
		
			
		}//FIN WHILE
		
		System.out.println("En la ubicacion no hay ninguna ficha");
		Ganador=true;
	}//FIN Juego2
	
}//FIN CLASE JUEGO
