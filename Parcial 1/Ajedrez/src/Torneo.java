
public class Torneo {
	String jugadores[];
	String TablaClasificacion[][];
	int NumeroJugadores;
		
	Torneo(){
		this.NumeroJugadores=0;
	}
	
	public void CrearTorneo(int j){
		this.jugadores = new String[j];
		for (int x=0; x<j; x++){
			jugadores[x]="___";
		}
	}
	
	public void CrearTabla(int j){
		int i=(j*2);
		this.TablaClasificacion= new String[j][i];
		for (int x=0; x<j; x++){
			for (int y=0; y<i; y++){
				TablaClasificacion[x][y]="";
			}
		}
	}
		
	public void MostrarTabla(int j, String k[][]){
		int i=(j*2);
		System.out.println("");
		System.out.println("Esta es la tabla de clasificaciones");
		System.out.println("");
		
		for (int a=0; a<j; a++){
			TablaClasificacion[a][0]=jugadores[a];
		}
		for (int a=0; a<j; a++){
			for (int b=0; b<i; b++)
				System.out.print("  "+k[a][b]);
					System.out.println("");
		}

	}
	
	public void IngresarJugadores(int i, String Alias){
		i=i-1;
		jugadores[i]=Alias;
	}

	public void MostrarJugadores(String i[]){
		for (int a=0; a<NumeroJugadores; a++){
				System.out.println("|"+i[a]+"|");
		}
	}
	
	public void EnfrentamientoJugadorez(int posiJ1, int posiJ2, boolean sobornoJ1, boolean sobornoJ2, int nivelJ1, int nivelJ2, int puntajeJ1, int puntajeJ2){
		int b=0;
		posiJ1=(posiJ1-1);
		posiJ2=(posiJ2-1);
		String g = ">>";
		if(sobornoJ1==true){
			TablaClasificacion[posiJ1][b++]=g;
			TablaClasificacion[posiJ1][b+2]=jugadores[posiJ1];
		}else if(sobornoJ2==true){
			TablaClasificacion[posiJ2][b+2]=jugadores[posiJ2];
			TablaClasificacion[posiJ2][b++]=g;
		}else if(nivelJ1 > nivelJ2){
			TablaClasificacion[posiJ1][b]=g;
			TablaClasificacion[posiJ1][b+2]=jugadores[posiJ1];
		}else if(nivelJ1 < nivelJ2){
			TablaClasificacion[posiJ2][b+2]=jugadores[posiJ2];
			TablaClasificacion[posiJ2][b]=g;
		}else if(puntajeJ1 > puntajeJ2){
			TablaClasificacion[posiJ1][b+2]=jugadores[posiJ1];
			TablaClasificacion[posiJ1][b++]=g;
		}else if(puntajeJ1 < puntajeJ2){
			TablaClasificacion[posiJ2][b+2]=jugadores[posiJ2];
			TablaClasificacion[posiJ2][b++]=g;
		}
	}
		
}
