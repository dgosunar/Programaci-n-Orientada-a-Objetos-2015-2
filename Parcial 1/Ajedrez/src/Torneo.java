
public class Torneo {
	String jugadores[];
	int NumeroJugadores;
	
	public void CrearTorneo(int j){
		this.jugadores = new String[j];
		for (int x=0; x<j; x++){
			jugadores[x]="___";
		}
	}
	
	public void IngresarJugadores(int i, String Nombre, String Alias){
		i=i-1;
		jugadores[i]=Nombre+Alias;
	}

	public void MostrarJugadores(String i[]){
		for (int a=0; a<NumeroJugadores; a++){
				System.out.println("|"+i[a]+"|");
		}
	}
}
