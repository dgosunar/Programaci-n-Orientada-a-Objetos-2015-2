import java.util.*;
public class Equipo {
		
	/*Se crea un arreglo de 6 jugadores para las banquitas 
	 * y todos los atributos que tendra cada jugador
	 * definidos vacios para evitar bugs en tiempo de ejecucion
	 */
	
	Scanner sc = new Scanner(System.in);
	String goleador = "";
	int  goles = 0;	
	String nombre="";
	Jugador[] equipo = new Jugador[6];
	int partidos=0;
	int jugador=0;
	int goles_jugador=0;
	private static final int nuevo =0 ;
	Jugador[] newpi = new Jugador[6];
	Jugador [] franco_Canadiense=new Jugador[6];
	Jugador [] anglosajon = new Jugador [6];
	Jugador [] vacio = new Jugador [6];
	
		public Jugador[] agregar_Jugadores(){
			System.out.println("Bienvenido aqui podra ingrear los jugadores de su equipo");
			for(int it=0; it<=6;it++){
				equipo[it].set_numero(it);
				System.out.println("Por favor digite el nuevo nombre");
				equipo[it].set_nombre(sc.next());
				System.out.println("Por favor digite la nueva edad");
				equipo[it].set_edad(sc.nextInt());
				System.out.println("Por favor digite la nueva habilidad 1");
				equipo[it].set_habilidad_1(sc.next());
				System.out.println("Por favor digite la nueva habilidad 2");
				equipo[it].set_habilidad_2(sc.next());
				System.out.println("Por favor digite la nueva habilidad 3");
				equipo[it].set_habilidad_3(sc.next());
				System.out.println("Por favor digite la nueva posicion");
				equipo[it].set_posicion(sc.next());
				System.out.println("Los goles de su nuevo jugador por defecto seran 0");
				equipo[it].set_goles(nuevo);
				System.out.println("Estos son los datos de su nuevo jugador: ");
				equipo[it].mostrar_Jugador();							
			}
			
			System.out.println("Su nuevo equipo ahora es: ");
			mostrar_equipo();
		return equipo;
		}
		public void despedir_Jugadores(){
			
			System.out.println("Bienvenido aqui podra despedir los jugadores de su equipo");
			System.out.println("Su equipo es: ");
			mostrar_equipo();
			System.out.println("Por favor digite el numero del jugador que desea reemplazar");
			jugador =sc.nextInt();
			System.out.println("El jugador seleccionado es:" + jugador);
			System.out.println("Por favor digite el nuevo nombre");
			equipo[jugador].set_nombre(Integer.toString(nuevo));
			System.out.println("Por favor digite la nueva edad");
			equipo[jugador].set_edad(nuevo);
			System.out.println("Por favor digite la nueva habilidad 1");
			equipo[jugador].set_habilidad_1(Integer.toString(nuevo));
			System.out.println("Por favor digite la nueva habilidad 2");
			equipo[jugador].set_habilidad_2(Integer.toString(nuevo));
			System.out.println("Por favor digite la nueva habilidad 3");
			equipo[jugador].set_habilidad_3(Integer.toString(nuevo));
			System.out.println("Por favor digite la nueva posicion");
			equipo[jugador].set_posicion(Integer.toString(nuevo));
			System.out.println("Los goles de su nuevo jugador por defecto seran 0");
			equipo[jugador].set_goles(nuevo);
			System.out.println("Estos son los datos de su nuevo jugador: ");
			equipo[jugador].mostrar_Jugador();
			System.out.println("Su nuevo equipo ahora es: ");
			mostrar_equipo();
		}
		public void reemplazar_Jugadores(){
			System.out.println("Bienvenido aqui podra reemplazar los jugadores de su equipo");
			System.out.println("Su equipo es: ");
			mostrar_equipo();
			System.out.println("Por favor digite el numero del jugador que desea reemplazar");
			jugador =sc.nextInt();
			System.out.println("El jugador seleccionado es:" + jugador);
			System.out.println("Por favor digite el nuevo nombre");
			equipo[jugador].set_nombre(sc.next());
			System.out.println("Por favor digite la nueva edad");
			equipo[jugador].set_edad(sc.nextInt());
			System.out.println("Por favor digite la nueva habilidad 1");
			equipo[jugador].set_habilidad_1(sc.next());
			System.out.println("Por favor digite la nueva habilidad 2");
			equipo[jugador].set_habilidad_2(sc.next());
			System.out.println("Por favor digite la nueva habilidad 3");
			equipo[jugador].set_habilidad_3(sc.next());
			System.out.println("Por favor digite la nueva posicion");
			equipo[jugador].set_posicion(sc.next());
			System.out.println("Los goles de su nuevo jugador por defecto seran 0");
			equipo[jugador].set_goles(nuevo);
			System.out.println("Estos son los datos de su nuevo jugador: ");
			equipo[jugador].mostrar_Jugador();
			System.out.println("Su nuevo equipo ahora es: ");
			mostrar_equipo();
		}
		
		public Jugador[] mostrar_equipo(){
			System.out.println("Los jugadores de este equipo son: ");
			for(int it=0; it<=6;it++){
				
				equipo[it].mostrar_Jugador();
			}
			return equipo;
		}
		
		public int get_partidos(){
			return partidos;
		}
		
		public void set_partidos(int partidos){
			this.partidos= partidos;
		}
		public String get_nombre(){
			return nombre;
		}
		
		public void set_nombre(String nombre){
			this.nombre= nombre;
		}
		public int get_goles(){
			return goles_jugador;
		}
		
		public Jugador[] set_goles(int goles_jugador, int posicion){
			this.goles_jugador= goles_jugador;			
			equipo[posicion].set_goles(goles_jugador);
			return equipo;
		}
	
		public void newpi(){
		
		Jugador Oliver = new Jugador("Oliver",33,1,0,"Tiro con chanfle",
									"Super Estado Fisico","Experiencia", "Delantero");
		Jugador Arthur = new Jugador("Arthur",33,1,0,"Mega defensa",
				"Super Estado Fisico","Experiencia", "Defensor");
		Jugador Mori = new Jugador("Mori",33,1,0,"Mega portero",
				"Super Estado Fisico","Experiencia", "Arquero");
		Jugador Bruce = new Jugador("Bruce",33,1,0,"Remate",
				"Super Estado Fisico","Experiencia", "Medio campista");
		Jugador Tom = new Jugador("Tom",33,1,0,"Amistad",
				"Super Estado Fisico","Experiencia", "Medio campista");
		newpi[0] = Oliver;
		newpi[1] = Arthur;
		newpi[2] = Mori;
		newpi[3] = Bruce;
		newpi[4] = Tom;
		
	}
		public void Franco_canadience(){
		Jugador Hyuga = new Jugador("Hyuga",33,1,0,"Goleador",
				"Super Estado Fisico","Experiencia", "Capitan");
		Jugador Ralph = new Jugador("Ralph",35,1,0,"Amistad",
				"Super Estado Fisico","Experiencia", "Medio campista");
		Jugador Richard_Tex  = new Jugador("Richard Tex ",33,1,0,"Karate",
				"Super Estado Fisico","Experiencia", "Arquero");
		Jugador Japo_coreano1 = new Jugador("Japo_coreano1",33,1,0,"Amistad",
				"Super Estado Fisico","Experiencia", "defensa");
		Jugador Japo_coreano2 = new Jugador("Japo_coreano2",33,1,0,"Amistad",
				"Super Estado Fisico","Experiencia", "defensa");
		franco_Canadiense[0] = Hyuga; 
		franco_Canadiense[1] = Ralph;
		franco_Canadiense[2] = Richard_Tex;
		franco_Canadiense[3] = Japo_coreano1;
		franco_Canadiense[4] = Japo_coreano2;
		
	}
		public void Anglosajon(){
		Jugador Korioto_1 = new Jugador("Korioto 1",33,1,0,"Huracán en el cielo",
				"Tiro mellizo","Tiro triangular", "la que quiera");
		Jugador Korioto_2 = new Jugador("Korioto 2",33,1,0,"Huracán en el cielo",
				"Tiro mellizo","Tiro triangular", "la que quiera");
		Jugador Japo_coreano1 = new Jugador("Japo_coreano2",33,1,0,"Huracán en el cielo",
				"Super Estado Fisico","Experiencia", "defensa");
		Jugador Japo_coreano2 = new Jugador("Japo_coreano2",33,1,0,"Amistad",
				"Super Estado Fisico","Experiencia", "defensa");
		Jugador Japo_coreano3 = new Jugador("Japo_coreano3",33,1,0,"Amistad",
				"Super Estado Fisico","Experiencia", "defensa");
		anglosajon[0]= Korioto_1;
		anglosajon[1]= Korioto_2;
		anglosajon[2]= Japo_coreano1;
		anglosajon[3]= Japo_coreano2;
		anglosajon[4]= Japo_coreano3;	
	}
		public void vacio(){
		Jugador pepito_galletas = new Jugador("pepito Galletas",3000,3000,0,"galleta",
				"Galleta con leche","Galleta con chocolate", "DIOS");
		for (int i=0; i<=vacio.length;i++){
			vacio[i] = pepito_galletas;
		}
		
	}
		public void goleador(){
			
			
			for (int i = 0 ; i < equipo.length - 1 ; i++) {
	            int max = i;
	 
	            //buscamos el mayor número
	            for (int j = i+1 ; j < equipo.length ; j++) {
	            	
	                if (equipo[j].get_goles() > equipo[max].get_goles()) {
	                    max = j;    //encontramos el mayor número
	                }
	            }
	 
	            if (i != max) {
	                //permutamos los valores
	                goles = equipo[max].get_goles();
	                goleador = equipo[max].get_nombre();
	                	                
	            }
			}			
			
		}
		public String get_goleador(){
			goleador();
			return goleador;
		}
		public int get_gogoles(){
			goleador();
			return goles;
		}
}
