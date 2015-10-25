import java.util.*;
public class Juego {
	
	static Scanner entrada = new Scanner(System.in);
	static boolean ganador;
	static int a, b, c, d;

	//CONSTRUCTOR
	Juego(){
		Juego.ganador= false;
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
		Peon_1_N.nombre = "P1N";
		Peon_1_N.colorFicha=true;
		a=1;
		b=2;
		tablero1.ubicarFicha(a, b, Peon_1_N.nombre);
			
				
		Ficha Peon_2_N = new Ficha();
		Peon_2_N.nombre = "P2N";
		Peon_2_N.colorFicha=true;
		a=2;
		tablero1.ubicarFicha(a, b, Peon_2_N.nombre);
			
		Ficha Peon_3_N = new Ficha();
		Peon_3_N.nombre = "P3N";
		Peon_3_N.colorFicha=true;
		a=3;
		tablero1.ubicarFicha(a, b, Peon_3_N.nombre);
				
		Ficha Peon_4_N = new Ficha();
		Peon_4_N.nombre = "P4N";
		a=4;
		tablero1.ubicarFicha(a, b, Peon_4_N.nombre);
						
		Ficha Peon_5_N = new Ficha();
		Peon_5_N.nombre = "P5N";
		Peon_5_N.colorFicha=true;
		a=5;
		tablero1.ubicarFicha(a, b, Peon_5_N.nombre);
				
		Ficha Peon_6_N = new Ficha();
		Peon_6_N.nombre = "P6N";
		a=6;
		tablero1.ubicarFicha(a, b, Peon_6_N.nombre);
			
		Ficha Peon_7_N = new Ficha();
		Peon_7_N.nombre = "P7N";
		a=7;
		tablero1.ubicarFicha(a, b, Peon_7_N.nombre);
						
		Ficha Peon_8_N = new Ficha();
		Peon_8_N.nombre = "P8N";
		a=8;
		tablero1.ubicarFicha(a, b, Peon_8_N.nombre);
		//--					
		Ficha Rey_N = new Ficha();
		Rey_N.nombre = "R-N";
		a=4;
		b=1;
		tablero1.ubicarFicha(a, b, Rey_N.nombre);
		//--				
		Ficha Dama_N = new Ficha();
		Dama_N.nombre = "D-N";
		a=5;
		tablero1.ubicarFicha(a, b, Dama_N.nombre);
		//--
		Ficha Alfil_1_N = new Ficha();
		Alfil_1_N.nombre = "A1N";
		a=3;
		tablero1.ubicarFicha(a, b, Alfil_1_N.nombre);
		
		Ficha Alfil_2_N = new Ficha();
		Alfil_2_N.nombre = "A2N";
		a=6;
		tablero1.ubicarFicha(a, b, Alfil_2_N.nombre);
		//--	
		Ficha Caballo_1_N = new Ficha();
		Caballo_1_N.nombre = "C1N";
		a=2;
		tablero1.ubicarFicha(a, b, Caballo_1_N.nombre);
		
		Ficha Caballo_2_N = new Ficha();
		Caballo_2_N.nombre = "C2N";
		a=7;
		tablero1.ubicarFicha(a, b, Caballo_2_N.nombre);
		//--		
		Ficha Torre_1_N = new Ficha();
		Torre_1_N.nombre = "T1N";
		a=1;
		tablero1.ubicarFicha(a, b, Torre_1_N.nombre);
		
		Ficha Torre_2_N = new Ficha();
		Torre_2_N.nombre = "T2N";
		a=8;
		tablero1.ubicarFicha(a, b, Torre_2_N.nombre);
				
		//------------------------------				
		//CREACION DE LAS FICHAS BLANCAS
		Ficha Peon_1_B = new Ficha();
		Peon_1_B.nombre = "P1B";
		a=1;
		b=7;
		tablero1.ubicarFicha(a, b, Peon_1_B.nombre);
					
		Ficha Peon_2_B = new Ficha();
		Peon_2_B.nombre = "P2B";
		a=2;
		tablero1.ubicarFicha(a, b, Peon_2_B.nombre);
		
		Ficha Peon_3_B = new Ficha();
		Peon_3_B.nombre = "P3B";a=1;
		a=3;
		tablero1.ubicarFicha(a, b, Peon_3_B.nombre);
					
		Ficha Peon_4_B = new Ficha();
		Peon_4_B.nombre = "P4B";
		a=4;
		tablero1.ubicarFicha(a, b, Peon_4_B.nombre);
		
		Ficha Peon_5_B = new Ficha();
		Peon_5_B.nombre = "P5B";
		a=5;
		tablero1.ubicarFicha(a, b, Peon_5_B.nombre);
			
		Ficha Peon_6_B = new Ficha();
		Peon_6_B.nombre = "P6B";
		a=6;
		tablero1.ubicarFicha(a, b, Peon_6_B.nombre);
		
		Ficha Peon_7_B = new Ficha();
		Peon_7_B.nombre = "P7B";
		a=7;
		tablero1.ubicarFicha(a, b, Peon_7_B.nombre);			
		
		Ficha Peon_8_B = new Ficha();
		Peon_8_B.nombre = "P8B";
		a=8;
		tablero1.ubicarFicha(a, b, Peon_8_B.nombre);
		//--					
		Ficha Rey_B = new Ficha();
		Rey_B.nombre = "R-B";
		a=5;
		b=8;
		tablero1.ubicarFicha(a, b, Rey_B.nombre);
		//--				
		Ficha Dama_B = new Ficha();
		Dama_B.nombre = "D-B";
		a=4;
		tablero1.ubicarFicha(a, b, Dama_B.nombre);
		//--
		Ficha Alfil_1_B = new Ficha();
		Alfil_1_B.nombre = "A1B";
		a=3;
		tablero1.ubicarFicha(a, b, Alfil_1_B.nombre);
				
		Ficha Alfil_2_B = new Ficha();
		Alfil_2_B.nombre = "A2B";
		a=6;
		tablero1.ubicarFicha(a, b, Alfil_2_B.nombre);
		
		//--	
		Ficha Caballo_1_B = new Ficha();
		Caballo_1_B.nombre = "C1B";
		a=2;
		tablero1.ubicarFicha(a, b, Caballo_1_B.nombre);
		
		Ficha Caballo_2_B = new Ficha();
		Caballo_2_B.nombre = "C2B";
		a=7;
		tablero1.ubicarFicha(a, b, Caballo_2_B.nombre);
		
		//--		
		Ficha Torre_1_B = new Ficha();
		Torre_1_B.nombre = "T1B";
		a=1;
		tablero1.ubicarFicha(a, b, Torre_1_B.nombre);
				
		Ficha Torre_2_B = new Ficha();
		Torre_2_B.nombre = "T2B";
		a=8;
		tablero1.ubicarFicha(a, b, Torre_2_B.nombre);
			
		tablero1.mostrarTablero(tablero1.tablero);
		

		
		//INICIO DEL JUEGO1		
		//------------------------------
			
		while (ganador==false){		
			
			

			//---Juego Blancas---
			System.out.println();
			System.out.println("Juegan Las Fichas Blancas");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero1.verificarOcupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero1.mostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
			
			tablero1.moverFicha(a, b, c, d);
			tablero1.mostrarTablero(tablero1.tablero);
			
			//---Juego Negras---
			System.out.println();
			System.out.println("Juegan Las Fichas Negras");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero1.verificarOcupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero1.mostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
			
			tablero1.moverFicha(a, b, c, d);
			tablero1.mostrarTablero(tablero1.tablero);
		
		}//FIN WHILE
		
		System.out.println("En la ubicacion no hay ninguna ficha");
		ganador=true;
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
		Peon_1_N.nombre = "P1N";
		Peon_1_N.colorFicha=true;
		a=1;
		b=1;
		tablero2.ubicarFicha(a, b, Peon_1_N.nombre);
			
				
		Ficha Peon_2_N = new Ficha();
		Peon_2_N.nombre = "P2N";
		Peon_2_N.colorFicha=true;
		a=2;
		b=2;
		tablero2.ubicarFicha(a, b, Peon_2_N.nombre);
			
		Ficha Peon_3_N = new Ficha();
		Peon_3_N.nombre = "P3N";
		Peon_3_N.colorFicha=true;
		a=1;
		b=3;
		tablero2.ubicarFicha(a, b, Peon_3_N.nombre);
				
		Ficha Peon_4_N = new Ficha();
		Peon_4_N.nombre = "P4N";
		a=2;
		b=4;
		tablero2.ubicarFicha(a, b, Peon_4_N.nombre);
						
		Ficha Peon_5_N = new Ficha();
		Peon_5_N.nombre = "P5N";
		Peon_5_N.colorFicha=true;
		a=1;
		b=5;
		tablero2.ubicarFicha(a, b, Peon_5_N.nombre);
				
		Ficha Peon_6_N = new Ficha();
		Peon_6_N.nombre = "P6N";
		a=2;
		b=6;
		tablero2.ubicarFicha(a, b, Peon_6_N.nombre);
			
		Ficha Peon_7_N = new Ficha();
		Peon_7_N.nombre = "P7N";
		a=1;
		b=7;
		tablero2.ubicarFicha(a, b, Peon_7_N.nombre);
						
		Ficha Peon_8_N = new Ficha();
		Peon_8_N.nombre = "P8N";
		a=2;
		b=8;
		tablero2.ubicarFicha(a, b, Peon_8_N.nombre);
		//--					
				//------------------------------				
		//CREACION DE LAS FICHAS BLANCAS
		Ficha Peon_1_B = new Ficha();
		Peon_1_B.nombre = "P1B";
		a=17;
		b=1;
		tablero2.ubicarFicha(a, b, Peon_1_B.nombre);
					
		Ficha Peon_2_B = new Ficha();
		Peon_2_B.nombre = "P2B";
		a=18;
		b=2;
		tablero2.ubicarFicha(a, b, Peon_2_B.nombre);
		
		Ficha Peon_3_B = new Ficha();
		Peon_3_B.nombre = "P3B";
		a=17;
		b=3;
		tablero2.ubicarFicha(a, b, Peon_3_B.nombre);
					
		Ficha Peon_4_B = new Ficha();
		Peon_4_B.nombre = "P4B";
		a=18;
		b=4;
		tablero2.ubicarFicha(a, b, Peon_4_B.nombre);

		Ficha Peon_5_B = new Ficha();
		Peon_5_B.nombre = "P5B";
		a=17;
		b=5;
		tablero2.ubicarFicha(a, b, Peon_5_B.nombre);
			
		Ficha Peon_6_B = new Ficha();
		Peon_6_B.nombre = "P6B";
		a=18;
		b=6;
		tablero2.ubicarFicha(a, b, Peon_6_B.nombre);
		
		Ficha Peon_7_B = new Ficha();
		Peon_7_B.nombre = "P7B";
		a=17;
		b=7;
		tablero2.ubicarFicha(a, b, Peon_7_B.nombre);
					
		Ficha Peon_8_B = new Ficha();
		Peon_8_B.nombre = "P8B";
		a=18;
		b=8;
		tablero2.ubicarFicha(a, b, Peon_8_B.nombre);
		//--					
		

		tablero2.mostrarTablero(tablero2.tablero);
		
		
		//INICIO DEL JUEGO2		
		//------------------------------
			
		while (ganador==false){		
			
			
			
			//---Juego Blancas---
			System.out.println();
			System.out.println("Juegan Las Fichas Blancas");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero2.verificarOcupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero2.mostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
			
			tablero2.moverFicha(a, b, c, d);
			tablero2.mostrarTablero(tablero2.tablero);
			
			//---Juego Negras---
			System.out.println();
			System.out.println("Juegan Las Fichas Negras");
			System.out.println("真Cual es la ubicacion de ficha que desea jugar??");
			System.out.println("Fila");
			a = entrada.nextInt();
			System.out.println("Columna");
			b = entrada.nextInt();
			tablero2.verificarOcupado(a,b);			
			System.out.println();
			System.out.println("La ficha es: ");
			tablero2.mostrarUbicacion(a, b);
			System.out.println();
			System.out.println("真A que ubicacion desea moverla??");
			System.out.println("Fila");
			c = entrada.nextInt();
			System.out.println("Columna");
			d = entrada.nextInt();
			
			tablero2.moverFicha(a, b, c, d);
			tablero2.mostrarTablero(tablero2.tablero);
		
			
		}//FIN WHILE
		
		System.out.println("En la ubicacion no hay ninguna ficha");
		ganador=true;
	}//FIN Juego2
	
}//FIN CLASE JUEGO
