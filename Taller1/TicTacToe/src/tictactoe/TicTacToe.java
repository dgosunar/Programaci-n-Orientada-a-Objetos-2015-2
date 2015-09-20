package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    //simbolos para jugar y distinguir a cada jugador
    static final char marca_O = 'O';
    static final char marca_X = 'X';
    static final char marca_espacio_libre = ' ';
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char T[][] = new char [3][3];
        boolean Ganador = false;
        int f, c;
        limpiartablero(T);
        System.out.println("Tic Tac Toe");
        while(Ganador == false){
            //Jugador # 1
            System.out.println("Jugador # 1 (O)");
            System.out.print("Fila = ");
            f = sc.nextInt();
            System.out.print("Columna = ");
            c = sc.nextInt();
            T[f-1][c-1] = marca_O;
            mostrartablero(T);
            if(hayGanador(T, marca_O)){
                System.out.println("Gana el Jugador # 1");
                Ganador = true;
                break;
            }
            //Jugador # 2
            System.out.println("Jugador # 2 (X)");
            System.out.print("Fila = ");
            f = sc.nextInt();
            System.out.print("Columna = ");
            c = sc.nextInt();
            T[f-1][c-1] = marca_X;
            mostrartablero(T);
            if(hayGanador(T, marca_X)){
                System.out.println("Gana el Jugador # 2");
                Ganador = true;
                break;
            }
        }//fin del ciclo while
        if(Ganador == false){
            System.out.print("Empate");
        }
    }// fin del main
    
    //funcion que determina si el jugador gana o no gana
    private static boolean hayGanador (char[][]t, char marcaj1){
        boolean mj = false;
        //a continuacion se verifican las 3 filas
        if(t[0][0] == marcaj1 && t[0][1] == marcaj1 && t[0][2] == marcaj1){
            mj = true;
        } else if(t[1][0] == marcaj1 && t[1][1] == marcaj1 && t[1][2] == marcaj1){
            mj = true;
        } else if(t[2][0] == marcaj1 && t[2][1] == marcaj1 && t[2][2] == marcaj1){
            mj = true; 
        } //a continuacion se verifican las 3 columnas
        else if(t[0][0] == marcaj1 && t[1][0] == marcaj1 && t[2][0] == marcaj1){
            mj = true; 
        }else if(t[0][1] == marcaj1 && t[1][1] == marcaj1 && t[2][1] == marcaj1){
            mj = true; 
        }else if(t[0][2] == marcaj1 && t[1][2] == marcaj1 && t[2][2] == marcaj1){
            mj = true; 
        }// a continuacion se verifican las dos diagonales
        else if(t[0][0] == marcaj1 && t[1][1] == marcaj1 && t[2][2] == marcaj1){
            mj = true; 
        }else if(t[2][0] == marcaj1 && t[1][1] == marcaj1 && t[0][2] == marcaj1){
            mj = true; 
        }
        return mj;
    }
    
    private static void mostrartablero(char t[][]){
        int f, c;
        for(f=0; f<3; f++){
            for(c=0; c<3; c++){
                System.out.print("|"+ t[f][c]);
            }
            System.out.println("|");
        }
    }
    
    private static void limpiartablero(char[][] t){
        int f, c;
        for(f=0; f<3; f++){
            for(c=0; c<3; c++){
                t[f][c] = marca_espacio_libre;
            }
        }
    } //fin del metodo
}