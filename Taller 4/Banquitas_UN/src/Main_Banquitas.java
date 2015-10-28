import java.util.*;
public class Main_Banquitas {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int main_menu= 0;
	int torneo_menu=0;
	int equipo_menu=0;	
	Equipo equipo = new Equipo();
	Torneo torneo = new Torneo();
	System.out.println("Bienvenido al nuevo sistemas de posicionamiento y torneo BANQUITAS UN");
	System.out.println("Aqui usted tendra todas las posibilidades para tener un bonito torneo");
	System.out.println("de banquitas, pero cuidado, despues de todo aqui participaran 3 de los");
	System.out.println("viejos equipos del viejo super campeones, y aun que un poco viejos sus");
	System.out.println("jugadores tienen más energia que nunca, asi que bien, disfruten del torneo");
	
		do{
			System.out.println("Digite 1 para entrar al menu del torneo o 2 para el menu del equipo");
			main_menu= sc.nextInt();
			switch(main_menu){
			case 1:
				do{
				System.out.println("Bienvenido al menu del torneo ¿que desa hacer? ");
				System.out.println("1. Crear equipos");
				System.out.println("2. Eliminar equipos");
				System.out.println("3. ver tabla del torneo");
				System.out.println("4. Conocer los goleadores");
				System.out.println("digite 5 o más para salir");
				torneo_menu= sc.nextInt();
				if(torneo_menu<0){
					torneo_menu = (-1*torneo_menu);
				}
				switch(torneo_menu){
				
				case 1:
					torneo.creador_Equipos();
					break;
				case 2:
					torneo.eliminar_Equipos();
					break;
				case 3:
					torneo.tabla();
					break;
				case 4:
					torneo.goleadores();
					break;				
					}//fin del menu de torneo
				}//fin del "do" sub menu de torneo
				while (torneo_menu<=4); //validacion para terminar con el menu
				
			case 2:
				do{
					System.out.println("Bienvenido al menu de equipo aqui podra");
					System.out.println("1. Agregar jugadores");
					System.out.println("2. Despedir jugadores");
					System.out.println("3. Cambiar juadores");
					System.out.println("Digite 4 o más para salir");
					if(equipo_menu<0){
						equipo_menu= (-1*equipo_menu);
					}
					switch(equipo_menu){
					
					case 1:
						equipo.agregar_Jugadores();
						break;
					case 2:
						equipo.despedir_Jugadores();
						break;
					case 3:
						equipo.reemplazar_Jugadores();					
					}// fin del menu equipo						
				}// fin del "do" del menu equipo
				while(equipo_menu<=3);//final del sub menu equipo
				
			}//fin del main menu
		}// fin del do del main menu
		
		while(main_menu<2);// final de los menus
		System.out.println("Gracias por usar el software");
	sc.close();	
	}
}
