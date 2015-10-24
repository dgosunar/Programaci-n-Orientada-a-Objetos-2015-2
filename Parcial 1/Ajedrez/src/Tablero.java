public class Tablero {
	
	String tablero[][];
	boolean Ocupado[][];
	int ancho,largo;
	
	//CONSTRUCTOR
	Tablero(){
		this.Ocupado= new boolean[9][9];
	}
		
	//METODOS	
	
	public void CrearTablero(){

		// CREACION DEL TABLERO
		
		this.tablero= new String[largo][ancho];
		
		for (int x=0; x<largo; x++){
			for (int y=0; y<ancho; y++){
				tablero[x][y]="___";
			}
		}
		for (int m=0; m<ancho; m++){
			for (int n=0; n<largo; n++){
				String e=Integer.toString(m);
				String f=Integer.toString(n);
				tablero[0][m]=("*"+e+"*");
				tablero[n][0]=("*"+f+"*");
			}
		}//--------------------------------
		
	}
	
	public void MoverFicha(int a, int b, int c, int d){
		tablero[c][d]=tablero[a][b];
		tablero[a][b]="___";
	}
	
	public void ubicar_ficha(int a, int b, String nombre){
		tablero[a][b]= nombre;
	}

	public void mostrar_tablero(String t[][]){
		
		for (int a=0; a<largo; a++){
			for (int b=0; b<ancho; b++)
				System.out.print("|"+t[a][b]);
					System.out.println("|");
		}
	}//------------------------------

	public void MostrarUbicacion(int a, int b){
		System.out.println(tablero[a][b]);
	}//------------------------------

	public void verificar_ocupado(int a, int b){
		
		if (tablero[a][b] !="___"){
			Ocupado[a][b]= true;
		}//------------------------------
	}
}//FIN CLASE Tablero