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
		torneo1.NumeroJugadores=8;
		torneo1.CrearTorneo(torneo1.NumeroJugadores);
		torneo1.CrearTabla(torneo1.NumeroJugadores);
				
		Jugador PedroMachete = new Jugador();
		PedroMachete.Posicion=1;
		PedroMachete.Nombre="Pedro ";
		PedroMachete.Alias="El Machete";
		PedroMachete.Nivel=3;
		torneo1.IngresarJugadores(PedroMachete.Posicion , PedroMachete.Alias);
		
		Jugador JuanMariposa = new Jugador();
		JuanMariposa.Posicion=2;
		JuanMariposa.Nombre="Juan ";
		JuanMariposa.Alias="La Mariposa";
		JuanMariposa.Nivel=1;
		torneo1.IngresarJugadores(JuanMariposa.Posicion, JuanMariposa.Alias);
		
		Jugador DavidRoca = new Jugador();
		DavidRoca.Posicion=3;
		DavidRoca.Nombre="David ";
		DavidRoca.Alias="La Roca";
		DavidRoca.Nivel=2;
		torneo1.IngresarJugadores(DavidRoca.Posicion, DavidRoca.Alias);
		
		Jugador DanielLobo = new Jugador();
		DanielLobo.Posicion=4;
		DanielLobo.Nombre="Daniel ";
		DanielLobo.Alias="El Lobo";
		DanielLobo.Nivel=3;
		torneo1.IngresarJugadores(DanielLobo.Posicion, DanielLobo.Alias);
		
		Jugador LauraSirena = new Jugador();
		LauraSirena.Posicion=5;
		LauraSirena.Nombre="Laura ";
		LauraSirena.Alias="La Sirena";
		LauraSirena.Nivel=2;
		torneo1.IngresarJugadores(LauraSirena.Posicion, LauraSirena.Alias);
		
		Jugador VannesaDiosa = new Jugador();
		VannesaDiosa.Posicion=6;
		VannesaDiosa.Nombre="Vannesa ";
		VannesaDiosa.Alias="La Diosa";
		VannesaDiosa.Nivel=1;
		torneo1.IngresarJugadores(VannesaDiosa.Posicion, VannesaDiosa.Alias);
		
		Jugador NataliaFlaca = new Jugador();
		NataliaFlaca.Posicion=7;
		NataliaFlaca.Nombre="Natalia ";
		NataliaFlaca.Alias="La Flaca";
		NataliaFlaca.Nivel=2;
		torneo1.IngresarJugadores(NataliaFlaca.Posicion, NataliaFlaca.Alias);
		
		Jugador JenniferPrincesa = new Jugador();
		JenniferPrincesa.Posicion=8;
		JenniferPrincesa.Nombre="Jennifer ";
		JenniferPrincesa.Alias="La Princesa";
		JenniferPrincesa.Nivel=3;
		torneo1.IngresarJugadores(JenniferPrincesa.Posicion, JenniferPrincesa.Alias);
				
		System.out.println("En que tipo de tablero desea jugar");
		System.out.println("1. Tablero cuardrado");
		System.out.println("2. Tablero rectangular");
		System.out.println("3. Mostrar Jugadores del Torneo");
		TipoJuego = leer.nextInt();
		
		torneo1.EnfrentamientoJugadorez(PedroMachete.Posicion, JuanMariposa.Posicion, PedroMachete.Soborno, JuanMariposa.Soborno, PedroMachete.Nivel, JuanMariposa.Nivel, PedroMachete.Puntaje, JuanMariposa.Puntaje);
		torneo1.EnfrentamientoJugadorez(DavidRoca.Posicion, DanielLobo.Posicion, DavidRoca.Soborno, DanielLobo.Soborno, DavidRoca.Nivel, DanielLobo.Nivel, DavidRoca.Puntaje, DanielLobo.Puntaje);
		torneo1.EnfrentamientoJugadorez(LauraSirena.Posicion, VannesaDiosa.Posicion, LauraSirena.Soborno, VannesaDiosa.Soborno, LauraSirena.Nivel, VannesaDiosa.Nivel, LauraSirena.Puntaje, LauraSirena.Puntaje);
		torneo1.EnfrentamientoJugadorez(NataliaFlaca.Posicion, JenniferPrincesa.Posicion, NataliaFlaca.Soborno, JenniferPrincesa.Soborno, NataliaFlaca.Nivel, JenniferPrincesa.Nivel, NataliaFlaca.Puntaje, JenniferPrincesa.Puntaje);
		
		if (TipoJuego==1){
			nn.Juego1();
		}else if (TipoJuego==2){
			nn.Juego2();
		}else if (TipoJuego==3){
			torneo1.MostrarJugadores(torneo1.jugadores);
			torneo1.MostrarTabla(torneo1.NumeroJugadores, torneo1.TablaClasificacion);
		}
		
	
	}

}
