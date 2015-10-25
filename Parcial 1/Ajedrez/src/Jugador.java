public class Jugador {
	String Nombre;
	String Alias;
	int Puntaje;
	int Nivel;
	int Posicion;
	boolean Soborno;
	String Datos[][];
	
	//CONSTRUCTOR
	Jugador(){
		this.Puntaje = 0;
		
	}
	public void JugadorM(String nn1, String nn2, String nn3, String nn4, String nn5, String nn6, String nn7, String nn8, String al1, String al2, String al3, String al4, String al5, String al6, String al7, String al8, int nJ1, int nJ2, int nJ3, int nJ4, int nJ5, int nJ6, int nJ7, int nJ8, int pJ1, int pJ2, int pJ3, int pJ4, int pJ5, int pJ6, int pJ7, int pJ8){

		this.Datos = new String[9][4];
		for (int x=0; x<9; x++){
			for (int y=0; y<4; y++)
				Datos[x][y]="  ";
		}
		Datos[0][0]="NOMBRE   "; Datos[0][1]="ALIAS	"; Datos[0][2]="NIVEL"; Datos[0][3]="PUNTOS";
		Datos[1][0]=nn1; Datos[1][1]=al1; Datos[1][2]=Integer.toString(nJ1); Datos[1][3]=Integer.toString(pJ1);
		Datos[2][0]=nn2; Datos[2][1]=al2; Datos[2][2]=Integer.toString(nJ2); Datos[2][3]=Integer.toString(pJ2);
		Datos[3][0]=nn3; Datos[3][1]=al3; Datos[3][2]=Integer.toString(nJ3); Datos[3][3]=Integer.toString(pJ3);
		Datos[4][0]=nn4; Datos[4][1]=al4; Datos[4][2]=Integer.toString(nJ4); Datos[4][3]=Integer.toString(pJ4);
		Datos[5][0]=nn5; Datos[5][1]=al5; Datos[5][2]=Integer.toString(nJ5); Datos[5][3]=Integer.toString(pJ5);
		Datos[6][0]=nn6; Datos[6][1]=al6; Datos[6][2]=Integer.toString(nJ6); Datos[6][3]=Integer.toString(pJ6);
		Datos[7][0]=nn7; Datos[7][1]=al7; Datos[7][2]=Integer.toString(nJ7); Datos[7][3]=Integer.toString(pJ7);
		Datos[8][0]=nn8; Datos[8][1]=al8; Datos[8][2]=Integer.toString(nJ8); Datos[8][3]=Integer.toString(pJ8);
		
		for (int a=0; a<9; a++){
			for (int b=0; b<4; b++)
				System.out.print("|"+Datos[a][b]+"	");
					System.out.println("|");
		}
	}
	
}