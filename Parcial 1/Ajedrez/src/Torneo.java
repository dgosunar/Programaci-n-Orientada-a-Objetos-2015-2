public class Torneo {
	String jugadores[];
	String tablaClasificacion[][];
	String ronda1[];
	String ronda2[];
	String ronda3[];
	String ganador;
	String datos[][];
	int numeroJugadores;
	
	Torneo(){
		this.numeroJugadores=0;
		this.ronda1 = new String[8];
		this.ronda2 = new String[4];
		this.ronda3 = new String[2];
	}
	
	public void crearTorneo(int j){
		this.jugadores = new String[j];
		for (int x=0; x<j; x++){
			jugadores[x]="___";
		}
	}
	
	public void crearTabla(int j){
		int i=(j*2);
		this.tablaClasificacion= new String[j][i];
		for (int x=0; x<j; x++){
			for (int y=0; y<i; y++){
				tablaClasificacion[x][y]="";
			}
		}
	}
		
	public void mostrarTabla(int j, String k[][]){
		int i=(j*2);
		System.out.println("");
		System.out.println("Esta es la tabla de clasificaciones");
		System.out.println("");
		
		for (int a=0; a<j; a++){
			tablaClasificacion[a][0]=jugadores[a];
		}
		for (int a=0; a<j; a++){
			for (int b=0; b<i; b++)
				System.out.print("  "+k[a][b]);
					System.out.println("");
		}

	}
	
	public void ingresarJugadores(int i, String Alias){
		i=i-1;
		jugadores[i]=Alias;
	}

	public void mostrarJugadores(String i[]){
		System.out.println("ESTOS SON LOS PARTICIPANTES");
		for (int a=0; a<numeroJugadores; a++){
				System.out.println("|"+i[a]+"|");
		}
	}
	
	public void enfrentamiento(String nn1, String nn2, String nn3, String nn4, String nn5, String nn6, String nn7, String nn8, String al1, String al2, String al3, String al4, String al5, String al6, String al7, String al8, boolean sJ1, boolean sJ2, boolean sJ3, boolean sJ4, boolean sJ5, boolean sJ6, boolean sJ7, boolean sJ8, int nJ1, int nJ2, int nJ3, int nJ4, int nJ5, int nJ6, int nJ7, int nJ8, int pJ1, int pJ2, int pJ3, int pJ4, int pJ5, int pJ6, int pJ7, int pJ8){
		
		boolean semisJ1=false;boolean semisJ2=false;boolean semisJ3=false;boolean semisJ4=false;
		int seminJ1=0;int seminJ2=0;int seminJ3=0;int seminJ4=0;
		int semipJ1=0;int semipJ2=0;int semipJ3=0;int semipJ4=0;
		
		boolean finalsJ1=false; boolean finalsJ2=false;
		int finalnJ1=0; int finalnJ2=0;
		int finalpJ1=0; int finalpJ2=0;
		
		int GanadorN=0;	int GanadorP=0;
						
		//RONDA1
		for (int x=0; x<numeroJugadores; x++){
				ronda1[x]=jugadores[x];
		}
		System.out.println("");
		System.out.println("RONDA1");
		
		for (int x=0; x<numeroJugadores; x++){
			System.out.println("  "+ronda1[x]+"	|");
			
		}
		//1 vs 2
		if(sJ1==true){
			ronda2[0]=ronda1[0];
			semisJ1=sJ1;
			seminJ1=nJ1;
			semipJ1=(pJ1+1);
		}else if(sJ2==true){
			ronda2[0]=ronda1[1];
			semisJ1=sJ2;
			seminJ1=nJ2;
			semipJ1=(pJ2+1);
		}else if(nJ1 > nJ2){
			ronda2[0]=ronda1[0];
			semisJ1=sJ1;
			seminJ1=nJ1;
			semipJ1=(pJ1+3);
		}else if(nJ1 < nJ2){
			ronda2[0]=ronda1[1];
			semisJ1=sJ2;
			seminJ1=nJ2;
			semipJ1=(pJ2+3);
		}else if(pJ1 > pJ2){
			ronda2[0]=ronda1[0];
			semisJ1=sJ1;
			seminJ1=nJ1;
			semipJ1=(pJ1+2);
		}else if(pJ1 < pJ2){
			ronda2[0]=ronda1[1];
			semisJ1=sJ2;
			seminJ1=nJ2;
			semipJ1=(pJ2+2);
		}
		//3 vs 4
		if(sJ3==true){
			ronda2[1]=ronda1[2];
			semisJ2=sJ3;
			seminJ2=nJ3;
			semipJ2=(pJ3+1);
		}else if(sJ4==true){
			ronda2[1]=ronda1[3];
			semisJ2=sJ4;
			seminJ2=nJ4;
			semipJ2=(pJ4+1);
		}else if(nJ3 > nJ4){
			ronda2[1]=ronda1[2];
			semisJ2=sJ3;
			seminJ2=nJ3;
			semipJ2=(pJ3+3);
		}else if(nJ3 < nJ4){
			ronda2[1]=ronda1[3];
			semisJ2=sJ4;
			seminJ2=nJ4;
			semipJ2=(pJ4+3);
		}else if(pJ3 > pJ4){
			ronda2[1]=ronda1[2];
			semisJ2=sJ3;
			seminJ2=nJ3;
			semipJ2=(pJ3+2);
		}else if(pJ3 < pJ4){
			ronda2[1]=ronda1[3];
			semisJ2=sJ4;
			seminJ2=nJ4;
			semipJ2=(pJ4+2);
		}
		//5 vs 6
		if(sJ5==true){
			ronda2[2]=ronda1[4];
			semisJ3=sJ5;
			seminJ3=nJ5;
			semipJ3=(pJ5+1);
		}else if(sJ6==true){
			ronda2[2]=ronda1[5];
			semisJ3=sJ6;
			seminJ3=nJ6;
			semipJ3=(pJ6+1);
		}else if(nJ5 > nJ6){
			ronda2[2]=ronda1[4];
			semisJ3=sJ5;
			seminJ3=nJ5;
			semipJ3=(pJ5+3);
		}else if(nJ5 < nJ6){
			ronda2[2]=ronda1[5];
			semisJ3=sJ6;
			seminJ3=nJ6;
			semipJ3=(pJ6+3);
		}else if(pJ5 > pJ6){
			ronda2[2]=ronda1[4];
			semisJ3=sJ5;
			seminJ3=nJ5;
			semipJ3=(pJ5+2);
		}else if(pJ5 < pJ6){
			ronda2[2]=ronda1[5];
			semisJ3=sJ6;
			seminJ3=nJ6;
			semipJ3=(pJ6+2);
		}
		//7 vs 8
		if(sJ7==true){
			ronda2[3]=ronda1[6];
			semisJ4=sJ7;
			seminJ4=nJ7;
			semipJ4=(pJ7+1);
		}else if(sJ8==true){
			ronda2[3]=ronda1[7];
			semisJ4=sJ8;
			seminJ4=nJ8;
			semipJ4=(pJ8+1);
		}else if(nJ7 > nJ8){
			ronda2[3]=ronda1[6];
			semisJ4=sJ7;
			seminJ4=nJ7;
			semipJ4=(pJ7+3);
		}else if(nJ7 < nJ8){
			ronda2[3]=ronda1[7];
			semisJ4=sJ8;
			seminJ4=nJ8;
			semipJ4=(pJ8+3);
		}else if(pJ7 > pJ8){
			ronda2[3]=ronda1[6];
			semisJ4=sJ7;
			seminJ4=nJ7;
			semipJ4=(pJ7+2);
		}else if(pJ7 < pJ8){
			ronda2[3]=ronda1[7];
			semisJ4=sJ8;
			seminJ4=nJ8;
			semipJ4=(pJ8+2);
		}//-----------------------------
		
		
		//RONDA2
		System.out.println("");
		System.out.println("RONDA2");
		for (int x=0; x<4; x++){
			System.out.println("  "+ronda2[x]+"	|");
		}
		//1 vs 2
		if(semisJ1==true){
			ronda3[0]=ronda2[0];
			finalsJ1=semisJ1;
			finalnJ1=seminJ1;
			finalpJ1=(semipJ1+1);
		}else if(semisJ2==true){
			ronda3[0]=ronda2[1];
			finalsJ1=semisJ2;
			finalnJ1=seminJ2;
			finalpJ1=(semipJ2+1);
		}else if(seminJ1 > seminJ2){
			ronda3[0]=ronda2[0];
			finalsJ1=semisJ1;
			finalnJ1=seminJ1;
			finalpJ1=(semipJ1+3);
		}else if(seminJ1 < seminJ2){
			ronda3[0]=ronda2[1];
			finalsJ1=semisJ2;
			finalnJ1=seminJ2;
			finalpJ1=(semipJ2+3);
		}else if(semipJ1 > semipJ2){
			ronda3[0]=ronda2[0];
			finalsJ1=semisJ1;
			finalnJ1=seminJ1;
			finalpJ1=(semipJ1+2);
		}else if(semipJ1 < semipJ2){
			ronda3[0]=ronda2[1];
			finalsJ1=semisJ2;
			finalnJ1=seminJ2;
			finalpJ1=(semipJ2+2);
		}
		//3 vs 4
		if(semisJ3==true){
			ronda3[1]=ronda2[2];
			finalsJ2=semisJ3;
			finalnJ2=seminJ3;
			finalpJ2=(semipJ3+1);
		}else if(semisJ4==true){
			ronda3[1]=ronda2[3];
			finalsJ2=semisJ4;
			finalnJ2=seminJ4;
			finalpJ2=(semipJ4+1);
		}else if(seminJ3 > seminJ4){
			ronda3[1]=ronda2[2];
			finalsJ2=semisJ3;
			finalnJ2=seminJ3;
			finalpJ2=(semipJ3+3);
		}else if(seminJ3 < seminJ4){
			ronda3[1]=ronda2[3];
			finalsJ2=semisJ4;
			finalnJ2=seminJ4;
			finalpJ2=(semipJ4+3);
		}else if(semipJ3 > semipJ4){
			ronda3[1]=ronda2[2];
			finalsJ2=semisJ3;
			finalnJ2=seminJ3;
			finalpJ2=(semipJ3+2);
		}else if(semipJ3 < semipJ4){
			ronda3[1]=ronda2[3];
			finalsJ2=semisJ4;
			finalnJ2=seminJ4;
			finalpJ2=(semipJ4+2);
		}//-----------------------------
		
		
		//RONDA3
		System.out.println("");
		System.out.println("RONDA3");
		for (int x=0; x<2; x++){
			System.out.println("  "+ronda3[x]+"	|");
		}
		//1 vs 2
		if(finalsJ1==true){
			ganador=ronda3[0];
			GanadorN=finalnJ1;
			GanadorP=(finalpJ1+1);
		}else if(finalsJ2==true){
			ganador=ronda3[1];
			GanadorN=finalnJ2;
			GanadorP=(finalpJ2+1);
		}else if(finalnJ1 > finalnJ2){
			ganador=ronda3[0];
			GanadorN=finalnJ1;
			GanadorP=(finalpJ1+3);
		}else if(finalnJ1 < finalnJ2){
			ganador=ronda3[1];
			GanadorN=finalnJ2;
			GanadorP=(finalpJ2+3);
		}else if(finalpJ1 > finalpJ2){
			ganador=ronda3[0];
			GanadorN=finalnJ1;
			GanadorP=(finalpJ1+2);
		}else if(finalpJ1 < finalpJ2){
			ganador=ronda3[1];
			GanadorN=finalnJ2;
			GanadorP=(finalpJ2+2);
		}
		System.out.println("");
		System.out.println("GANADOR");
		System.out.println("  |"+ganador+"	|"+GanadorP+"	|"+GanadorN);
		System.out.println("");
		
	}
}