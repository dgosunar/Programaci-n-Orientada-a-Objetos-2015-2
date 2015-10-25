public class Jugador {
	String nombre;
	String alias;
	int puntaje;
	int nivel;
	int posicion;
	boolean soborno;
	String datos[][];
	
	//CONSTRUCTOR
	Jugador(){
		this.puntaje = 0;
		
	}
	public void jugadorM(String nn1, String nn2, String nn3, String nn4, String nn5, String nn6, String nn7, String nn8, String al1, String al2, String al3, String al4, String al5, String al6, String al7, String al8, int nJ1, int nJ2, int nJ3, int nJ4, int nJ5, int nJ6, int nJ7, int nJ8, int pJ1, int pJ2, int pJ3, int pJ4, int pJ5, int pJ6, int pJ7, int pJ8){

		this.datos = new String[9][4];
		for (int x=0; x<9; x++){
			for (int y=0; y<4; y++)
				datos[x][y]="  ";
		}
		datos[0][0]="NOMBRE   "; datos[0][1]="ALIAS	"; datos[0][2]="NIVEL"; datos[0][3]="PUNTOS";
		datos[1][0]=nn1; datos[1][1]=al1; datos[1][2]=Integer.toString(nJ1); datos[1][3]=Integer.toString(pJ1);
		datos[2][0]=nn2; datos[2][1]=al2; datos[2][2]=Integer.toString(nJ2); datos[2][3]=Integer.toString(pJ2);
		datos[3][0]=nn3; datos[3][1]=al3; datos[3][2]=Integer.toString(nJ3); datos[3][3]=Integer.toString(pJ3);
		datos[4][0]=nn4; datos[4][1]=al4; datos[4][2]=Integer.toString(nJ4); datos[4][3]=Integer.toString(pJ4);
		datos[5][0]=nn5; datos[5][1]=al5; datos[5][2]=Integer.toString(nJ5); datos[5][3]=Integer.toString(pJ5);
		datos[6][0]=nn6; datos[6][1]=al6; datos[6][2]=Integer.toString(nJ6); datos[6][3]=Integer.toString(pJ6);
		datos[7][0]=nn7; datos[7][1]=al7; datos[7][2]=Integer.toString(nJ7); datos[7][3]=Integer.toString(pJ7);
		datos[8][0]=nn8; datos[8][1]=al8; datos[8][2]=Integer.toString(nJ8); datos[8][3]=Integer.toString(pJ8);
		
		for (int a=0; a<9; a++){
			for (int b=0; b<4; b++)
				System.out.print("|"+datos[a][b]+"	");
					System.out.println("|");
		}
	}
	
}