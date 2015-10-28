import java.util.Scanner;

public class Torneo {
	
	Equipo pre_definido = new Equipo();
	Equipo interactivo = new Equipo();
	Equipo [] equipos_data = new Equipo[7];
	Jugador [][] equipos = new Jugador [7][7];
    Scanner sc = new Scanner(System.in);
	
	
			
	public void pre_definidos(){
		equipos[7] = pre_definido.anglosajon;
		equipos_data[7].set_nombre("Anglosajon");
		equipos_data[7].set_partidos(0);
		equipos[6] = pre_definido.franco_Canadiense;
		equipos_data[6].set_nombre("franco Canadiense");
		equipos_data[6].set_partidos(0);
		equipos[5] = pre_definido.newpi;
		equipos_data[5].set_nombre("Newpi");
		equipos_data[5].set_partidos(0);
		
		
	}			
	
	public void creador_Equipos(){
						
		System.out.println("Bienvenido al creador de equipos");
		System.out.println("Usted aqui podra crear 5 equipos que competiran contra");
		System.out.println("los 3 equipos de capitan Tsubasa ya predefinidos");
		System.out.println("Por favor digite un digito entre 1 y 5");
		int e=sc.nextInt();
		if(e>4){
			System.out.println("Parece que has excedido el numero maximo de equipos");
			System.out.println("que gracioso, pero no te preocupes solo podras ingresar 5");
			System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
			e=4;
		}
		else if (e<0){
			System.out.println("Parece que has excedido el numero minimo de equipos");
			System.out.println("que gracioso, pero no te preocupes solo podras ingresar 1");
			System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
			e=0;
		}	
		while (e>=0){
		System.out.println("Por favor digite el nombre de su equipo");
		String nombre = sc.next();
		equipos_data[e].set_nombre(nombre);
		for(int i=0; i<=e; i++){
			equipos[i] = interactivo.agregar_Jugadores();
						
		}
		e--;
		}
	}
	
	public void eliminar_Equipos(){
		System.out.println("Bienvenido al eliminador de equipos");
		System.out.println("Usted aqui podra eliminar 5 equipos excepto");
		System.out.println("los 3 equipos de capitan Tsubasa ya predefinidos");
		System.out.println("Por favor digite el numero de equipos a elminar entre 1 y 5");
		int e=sc.nextInt();
		if(e>5){
			System.out.println("Parece que has excedido el numero maximo de equipos");
			System.out.println("que gracioso, pero no te preocupes solo podras eliminar 5");
			System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
			e=4;
		}
		else if (e<0){
			System.out.println("Parece que has excedido el numero minimo de equipos");
			System.out.println("que gracioso, pero no te preocupes solo podras eliminar 1");
			System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
			e=0;
		}		
		while(e>=0){
			tabla();
			System.out.println("Por favor digite la posicion donde esta su equipo");
			int i=sc.nextInt();
			if(i>5){
				System.out.println("Parece que has excedido el numero maximo de equipos");
				System.out.println("que gracioso, pero no te preocupes eliminaremos el 5");
				System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
				i=4;
			}
			else if (i<0){
				System.out.println("Parece que has excedido el numero minimo de equipos");
				System.out.println("que gracioso, pero no te preocupes eliminaremos el 1");
				System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
				i=0;
			}
			else{
				i--;
			}			
			equipos[i] = pre_definido.vacio;			
			e--;
		}
			
		}
	
	public void reemplazar_Equipos(){

		
	}	

	public void ingresar_goles(){
		for(int i=0; 0<=equipos.length;i++){
			System.out.print(i+"  "+equipos_data[i].get_nombre());
				}
		System.out.println("por favor elija el equipo del que ingresara los goles");
		int w=sc.nextInt();
		equipos[w] = interactivo.mostrar_equipo();
		System.out.println("por favor elija el jugador del que ingresara los goles");
		int goleador= sc.nextInt();
		System.out.println("por favor digite el numero de goles");
		int contador_goles= sc.nextInt();
		equipos[w] = interactivo.set_goles(goleador,contador_goles);
	}
	
	public void goleadores(){
		
		int[] max_goleadores = new int[7];		
		String[] nombres = new String[7];
		for (int i=0;i<=max_goleadores.length;i++){
			max_goleadores[i]= equipos_data[i].get_gogoles();
			nombres[i]=equipos_data[i].get_goleador();
		}
		for (int i = 0 ; i < max_goleadores.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i+1 ; j < max_goleadores.length ; j++) {
                if (max_goleadores[j] > max_goleadores[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = max_goleadores[i];
                String auxiliar = nombres[i];
                nombres[i] = nombres[max];
                max_goleadores[i] = max_goleadores[max];
                max_goleadores[max] = aux;
                nombres[max]=auxiliar;
            }
        }
		
		for (int i=0;i<=max_goleadores.length;i++){
			System.out.println("La tabla de goleadores va asi: ");
			System.out.println((i+1)+"."+nombres[i]+" Con un total de "+
					 			max_goleadores[i]+ " goles");
			
		}		
		
		
	}
	
	public void ingresar_resultados(){
		
		System.out.println("Aqui podra ingresar los partidos ganados de sus equipos");
		tabla();
		System.out.println("Por favor seleccione su equipo");
		int i= sc.nextInt();
		if(i>8){
			System.out.println("Parece que has excedido el numero maximo de equipos");
			System.out.println("que gracioso, pero no te preocupes ingresaremos el 8");
			System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
			i=7;
		}
		else if (i<0){
			System.out.println("Parece que has excedido el numero minimo de equipos");
			System.out.println("que gracioso, pero no te preocupes ingresaremos el 1");
			System.out.println("Gracias por tratar de brikear el programa, espero tu equipo pierda");
			i=0;
		}
		else{
			i--;
		}			
		System.out.println("Por favor digite cuantos partidos ha ganado");
		int w=sc.nextInt();
		equipos_data[i].set_partidos(w);
		
	}	

	public void tabla(){
		int [] posiciones = new int [7];
		String[] nombres = new String[7];
		for (int i=0;i<=posiciones.length;i++){
			posiciones[i]= equipos_data[i].get_partidos();
			nombres[i]=equipos_data[i].get_nombre();
		}
		for (int i = 0 ; i < posiciones.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i+1 ; j < posiciones.length ; j++) {
                if (posiciones[j] > posiciones[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = posiciones[i];
                String auxiliar = nombres[i];
                nombres[i] = nombres[max];
                posiciones[i] = posiciones[max];
                posiciones[max] = aux;
                nombres[max]=auxiliar;
            }
        }
    
	}
}


