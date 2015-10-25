//COSAS PENDIENTES---
//---MOVIMIENTO DE CABALLO, REINA, PEON
//---HERENCIA ENTRE FICHAS
//------------------

import java.util.*;

public class Consola {
	
	static Scanner leer = new Scanner(System.in);
	static int tipoJuego;
	
	public static void main(String[] args) {
		
		Juego nn = new Juego();
		
		Torneo torneo1 = new Torneo();
		torneo1.numeroJugadores=8;
		torneo1.crearTorneo(torneo1.numeroJugadores);
		torneo1.crearTabla(torneo1.numeroJugadores);
				
		Jugador PedroMachete = new Jugador();
		PedroMachete.posicion=1;
		PedroMachete.nombre="Pedro  ";
		PedroMachete.alias="El Machete";
		PedroMachete.nivel=3;
		torneo1.IngresarJugadores(PedroMachete.posicion , PedroMachete.alias);
		
		Jugador JuanMariposa = new Jugador();
		JuanMariposa.posicion=2;
		JuanMariposa.nombre="Juan   ";
		JuanMariposa.alias="La Mariposa";
		JuanMariposa.nivel=1;
		torneo1.IngresarJugadores(JuanMariposa.posicion, JuanMariposa.alias);
		
		Jugador DavidRoca = new Jugador();
		DavidRoca.posicion=3;
		DavidRoca.nombre="David  ";
		DavidRoca.alias="La Roca";
		DavidRoca.nivel=2;
		torneo1.IngresarJugadores(DavidRoca.posicion, DavidRoca.alias);
		
		Jugador DanielLobo = new Jugador();
		DanielLobo.posicion=4;
		DanielLobo.nombre="Daniel  ";
		DanielLobo.alias="El Lobo";
		DanielLobo.nivel=4;
		torneo1.IngresarJugadores(DanielLobo.posicion, DanielLobo.alias);
		
		Jugador LauraSirena = new Jugador();
		LauraSirena.posicion=5;
		LauraSirena.nombre="Laura  ";
		LauraSirena.alias="La Sirena";
		LauraSirena.nivel=2;
		torneo1.IngresarJugadores(LauraSirena.posicion, LauraSirena.alias);
		
		Jugador VannesaDiosa = new Jugador();
		VannesaDiosa.posicion=6;
		VannesaDiosa.nombre="Vannesa";
		VannesaDiosa.alias="La Diosa";
		VannesaDiosa.nivel=1;
		torneo1.IngresarJugadores(VannesaDiosa.posicion, VannesaDiosa.alias);
		
		Jugador NataliaFlaca = new Jugador();
		NataliaFlaca.posicion=7;
		NataliaFlaca.nombre="Natalia";
		NataliaFlaca.alias="La Flaca";
		NataliaFlaca.nivel=2;
		torneo1.IngresarJugadores(NataliaFlaca.posicion, NataliaFlaca.alias);
		
		Jugador JenniferPrincesa = new Jugador();
		JenniferPrincesa.posicion=8;
		JenniferPrincesa.nombre="Jennifer";
		JenniferPrincesa.alias="La Princesa";
		JenniferPrincesa.nivel=3;
		torneo1.IngresarJugadores(JenniferPrincesa.posicion, JenniferPrincesa.alias);
		
		int z=0;
		while (z!=11){		
			System.out.println("En que tipo de tablero desea jugar");
			System.out.println("");
			System.out.println("1. Tablero cuadrado");
			System.out.println("2. Tablero rectangular");
			System.out.println("3. Check Torneo");
			tipoJuego = leer.nextInt();
				
			if (tipoJuego==1){
				nn.Juego1();
			}else if (tipoJuego==2){
				nn.Juego2();
			}else if (tipoJuego==3){
				System.out.println("");
				System.out.println("");
				System.out.println("1. Para Ver datos de los jugadores");
				System.out.println("2. Arreglar torneo");
				System.out.println("3. Mostrar torneo");
				System.out.println("");
				tipoJuego = leer.nextInt();
				
				if (tipoJuego==1){
					PedroMachete.jugadorM(PedroMachete.nombre, JuanMariposa.nombre,
							DavidRoca.nombre, DanielLobo.nombre, LauraSirena.nombre,
							VannesaDiosa.nombre, NataliaFlaca.nombre, JenniferPrincesa.nombre,
							PedroMachete.alias, JuanMariposa.alias, DavidRoca.alias,
							DanielLobo.alias, LauraSirena.alias, VannesaDiosa.alias,
							NataliaFlaca.alias, JenniferPrincesa.alias, PedroMachete.nivel,
							JuanMariposa.nivel, DavidRoca.nivel, DanielLobo.nivel,
							LauraSirena.nivel, VannesaDiosa.nivel, NataliaFlaca.nivel,
							JenniferPrincesa.nivel, PedroMachete.puntaje, JuanMariposa.puntaje,
							DavidRoca.puntaje, DanielLobo.puntaje, LauraSirena.puntaje,
							LauraSirena.puntaje, NataliaFlaca.puntaje, JenniferPrincesa.puntaje);				
				}else if (tipoJuego==2){
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
					tipoJuego = leer.nextInt();
				if (tipoJuego==1){
					PedroMachete.soborno=true;
				}else if (tipoJuego==2){
					JuanMariposa.soborno=true;
				}else if (tipoJuego==3){
					DavidRoca.soborno=true;
				}else if (tipoJuego==4){
					DanielLobo.soborno=true;
				}else if (tipoJuego==5){
					LauraSirena.soborno=true;
				}else if (tipoJuego==6){
					VannesaDiosa.soborno=true;
				}else if (tipoJuego==7){
					NataliaFlaca.soborno=true;
				}else if (tipoJuego==8){
					JenniferPrincesa.soborno=true;
				}
			}else if (tipoJuego==3){
				torneo1.Enfrentamiento(PedroMachete.nombre, JuanMariposa.nombre,
						DavidRoca.nombre, DanielLobo.nombre, LauraSirena.nombre,
						VannesaDiosa.nombre, NataliaFlaca.nombre, JenniferPrincesa.nombre,
						PedroMachete.alias, JuanMariposa.alias, DavidRoca.alias,
						DanielLobo.alias, LauraSirena.alias, VannesaDiosa.alias,
						NataliaFlaca.alias, JenniferPrincesa.alias, PedroMachete.soborno,
						JuanMariposa.soborno, DavidRoca.soborno, DanielLobo.soborno,
						LauraSirena.soborno, VannesaDiosa.soborno, NataliaFlaca.soborno,
						JenniferPrincesa.soborno, PedroMachete.nivel, JuanMariposa.nivel,
						DavidRoca.nivel, DanielLobo.nivel, LauraSirena.nivel,
						VannesaDiosa.nivel, NataliaFlaca.nivel, JenniferPrincesa.nivel,
						PedroMachete.puntaje, JuanMariposa.puntaje, DavidRoca.puntaje,
						DanielLobo.puntaje, LauraSirena.puntaje, LauraSirena.puntaje,
						NataliaFlaca.puntaje, JenniferPrincesa.puntaje);
			}
		}
		}
	}
}