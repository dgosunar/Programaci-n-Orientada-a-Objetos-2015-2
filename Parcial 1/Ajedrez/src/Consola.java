//COSAS PENDIENTES---
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
		PedroMachete.Nombre="Pedro  ";
		PedroMachete.Alias="El Machete";
		PedroMachete.Nivel=3;
		torneo1.IngresarJugadores(PedroMachete.Posicion , PedroMachete.Alias);
		
		Jugador JuanMariposa = new Jugador();
		JuanMariposa.Posicion=2;
		JuanMariposa.Nombre="Juan   ";
		JuanMariposa.Alias="La Mariposa";
		JuanMariposa.Nivel=1;
		torneo1.IngresarJugadores(JuanMariposa.Posicion, JuanMariposa.Alias);
		
		Jugador DavidRoca = new Jugador();
		DavidRoca.Posicion=3;
		DavidRoca.Nombre="David  ";
		DavidRoca.Alias="La Roca";
		DavidRoca.Nivel=2;
		torneo1.IngresarJugadores(DavidRoca.Posicion, DavidRoca.Alias);
		
		Jugador DanielLobo = new Jugador();
		DanielLobo.Posicion=4;
		DanielLobo.Nombre="Daniel  ";
		DanielLobo.Alias="El Lobo";
		DanielLobo.Nivel=4;
		torneo1.IngresarJugadores(DanielLobo.Posicion, DanielLobo.Alias);
		
		Jugador LauraSirena = new Jugador();
		LauraSirena.Posicion=5;
		LauraSirena.Nombre="Laura  ";
		LauraSirena.Alias="La Sirena";
		LauraSirena.Nivel=2;
		torneo1.IngresarJugadores(LauraSirena.Posicion, LauraSirena.Alias);
		
		Jugador VannesaDiosa = new Jugador();
		VannesaDiosa.Posicion=6;
		VannesaDiosa.Nombre="Vannesa";
		VannesaDiosa.Alias="La Diosa";
		VannesaDiosa.Nivel=1;
		torneo1.IngresarJugadores(VannesaDiosa.Posicion, VannesaDiosa.Alias);
		
		Jugador NataliaFlaca = new Jugador();
		NataliaFlaca.Posicion=7;
		NataliaFlaca.Nombre="Natalia";
		NataliaFlaca.Alias="La Flaca";
		NataliaFlaca.Nivel=2;
		torneo1.IngresarJugadores(NataliaFlaca.Posicion, NataliaFlaca.Alias);
		
		Jugador JenniferPrincesa = new Jugador();
		JenniferPrincesa.Posicion=8;
		JenniferPrincesa.Nombre="Jennifer";
		JenniferPrincesa.Alias="La Princesa";
		JenniferPrincesa.Nivel=3;
		torneo1.IngresarJugadores(JenniferPrincesa.Posicion, JenniferPrincesa.Alias);
		
		int z=0;
		while (z!=11){		
			System.out.println("En que tipo de tablero desea jugar");
			System.out.println("");
			System.out.println("1. Tablero cuardrado");
			System.out.println("2. Tablero rectangular");
			System.out.println("3. Check Torneo");
			TipoJuego = leer.nextInt();
				
			if (TipoJuego==1){
				nn.Juego1();
			}else if (TipoJuego==2){
				nn.Juego2();
			}else if (TipoJuego==3){
				System.out.println("");
				System.out.println("");
				System.out.println("1. Para Ver datos de los jugadores");
				System.out.println("2. Arreglar torneo");
				System.out.println("3. Mostrar torneo");
				System.out.println("");
				TipoJuego = leer.nextInt();
				
				if (TipoJuego==1){
					PedroMachete.JugadorM(PedroMachete.Nombre, JuanMariposa.Nombre, DavidRoca.Nombre, DanielLobo.Nombre, LauraSirena.Nombre, VannesaDiosa.Nombre, NataliaFlaca.Nombre, JenniferPrincesa.Nombre, PedroMachete.Alias, JuanMariposa.Alias, DavidRoca.Alias, DanielLobo.Alias, LauraSirena.Alias, VannesaDiosa.Alias, NataliaFlaca.Alias, JenniferPrincesa.Alias, PedroMachete.Nivel, JuanMariposa.Nivel, DavidRoca.Nivel, DanielLobo.Nivel, LauraSirena.Nivel, VannesaDiosa.Nivel, NataliaFlaca.Nivel, JenniferPrincesa.Nivel, PedroMachete.Puntaje, JuanMariposa.Puntaje, DavidRoca.Puntaje, DanielLobo.Puntaje, LauraSirena.Puntaje, LauraSirena.Puntaje, NataliaFlaca.Puntaje, JenniferPrincesa.Puntaje);				
				}else if (TipoJuego==2){
					System.out.println("");
					System.out.println("¿A quien desea beneficiar?");
					System.out.println("1. Pedro ''El Machete''.");
					System.out.println("2. Juan ''La Mariposa''.");
					System.out.println("3. David ''La Roca''.");
					System.out.println("4. Daniel ''El Lobo''.");
					System.out.println("5. Laura ''La Sirena''.");
					System.out.println("6. Vannesa ''La Diosa''.");
					System.out.println("7. Natalia ''La Flaca''.");
					System.out.println("8. Jennifer ''La Princesa''.");
					System.out.println("");
					TipoJuego = leer.nextInt();
				if (TipoJuego==1){
					PedroMachete.Soborno=true;
				}else if (TipoJuego==2){
					JuanMariposa.Soborno=true;
				}else if (TipoJuego==3){
					DavidRoca.Soborno=true;
				}else if (TipoJuego==4){
					DanielLobo.Soborno=true;
				}else if (TipoJuego==5){
					LauraSirena.Soborno=true;
				}else if (TipoJuego==6){
					VannesaDiosa.Soborno=true;
				}else if (TipoJuego==7){
					NataliaFlaca.Soborno=true;
				}else if (TipoJuego==8){
					JenniferPrincesa.Soborno=true;
				}
			}else if (TipoJuego==3){
				torneo1.Enfrentamiento(PedroMachete.Nombre, JuanMariposa.Nombre, DavidRoca.Nombre, DanielLobo.Nombre, LauraSirena.Nombre, VannesaDiosa.Nombre, NataliaFlaca.Nombre, JenniferPrincesa.Nombre, PedroMachete.Alias, JuanMariposa.Alias, DavidRoca.Alias, DanielLobo.Alias, LauraSirena.Alias, VannesaDiosa.Alias, NataliaFlaca.Alias, JenniferPrincesa.Alias, PedroMachete.Soborno, JuanMariposa.Soborno, DavidRoca.Soborno, DanielLobo.Soborno, LauraSirena.Soborno, VannesaDiosa.Soborno, NataliaFlaca.Soborno, JenniferPrincesa.Soborno, PedroMachete.Nivel, JuanMariposa.Nivel, DavidRoca.Nivel, DanielLobo.Nivel, LauraSirena.Nivel, VannesaDiosa.Nivel, NataliaFlaca.Nivel, JenniferPrincesa.Nivel, PedroMachete.Puntaje, JuanMariposa.Puntaje, DavidRoca.Puntaje, DanielLobo.Puntaje, LauraSirena.Puntaje, LauraSirena.Puntaje, NataliaFlaca.Puntaje, JenniferPrincesa.Puntaje);
			}
		}
		}
	}
}