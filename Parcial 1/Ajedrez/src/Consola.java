//COSAS PENDIENTES---
//---CREAR CLASE TORNEO
//---manejar soborno en torneos
//---MOVIMIENTO DE CABALLO, REINA, PEON
//---HERENCIA ENTRE FICHAS


import java.util.*;

public class Consola {
	
	static Scanner leer = new Scanner(System.in);
	static int TipoJuego;
	
	public static void main(String[] args) {
		
		Juego nn = new Juego();
		
		Torneo torneo1 = new Torneo();
		torneo1.NumeroJugadores=6;
		torneo1.CrearTorneo(torneo1.NumeroJugadores);
				
		Jugador PedroMachete = new Jugador();
		PedroMachete.Posicion=1;
		PedroMachete.Nombre="Pedro ";
		PedroMachete.Alias="El Machete";
		PedroMachete.Nivel=3;
		torneo1.IngresarJugadores(PedroMachete.Posicion ,PedroMachete.Nombre, PedroMachete.Alias);
		
		Jugador JuanMariposa = new Jugador();
		JuanMariposa.Posicion=2;
		JuanMariposa.Nombre="Juan ";
		JuanMariposa.Alias="La Mariposa";
		JuanMariposa.Nivel=1;
		torneo1.IngresarJugadores(JuanMariposa.Posicion, JuanMariposa.Nombre, JuanMariposa.Alias);
		
		Jugador DavidRoca = new Jugador();
		DavidRoca.Posicion=3;
		DavidRoca.Nombre="David ";
		DavidRoca.Alias="La Roca";
		DavidRoca.Nivel=2;
		torneo1.IngresarJugadores(DavidRoca.Posicion, DavidRoca.Nombre, DavidRoca.Alias);
		
		Jugador LauraSirena = new Jugador();
		LauraSirena.Posicion=4;
		LauraSirena.Nombre="Laura ";
		LauraSirena.Alias="La Sirena";
		LauraSirena.Nivel=2;
		torneo1.IngresarJugadores(LauraSirena.Posicion, LauraSirena.Nombre, LauraSirena.Alias);
		
		Jugador VannesaDiosa = new Jugador();
		VannesaDiosa.Posicion=5;
		VannesaDiosa.Nombre="Vannesa ";
		VannesaDiosa.Alias="La Diosa";
		VannesaDiosa.Nivel=1;
		torneo1.IngresarJugadores(VannesaDiosa.Posicion, VannesaDiosa.Nombre, VannesaDiosa.Alias);
		
		Jugador NataliaFlaca = new Jugador();
		NataliaFlaca.Posicion=6;
		NataliaFlaca.Nombre="Natalia ";
		NataliaFlaca.Alias="La Flaca";
		NataliaFlaca.Nivel=3;
		torneo1.IngresarJugadores(NataliaFlaca.Posicion, NataliaFlaca.Nombre, NataliaFlaca.Alias);
		
		
		
		
		System.out.println("En que tipo de tablero desea jugar");
		System.out.println("1. Tablero cuardrado");
		System.out.println("2. Tablero rectangular");
		System.out.println("3. Mostrar Jugadores de Torneo");
		TipoJuego = leer.nextInt();
		
		
		if (TipoJuego==1){
			nn.Juego1();
		}else if (TipoJuego==2){
			nn.Juego2();
		}else if (TipoJuego==3){
			torneo1.MostrarJugadores(torneo1.jugadores);
		}
		
	
	}

}
