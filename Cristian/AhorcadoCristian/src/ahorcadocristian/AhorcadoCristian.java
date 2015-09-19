package ahorcadocristian;

import java.util.*;

public class AhorcadoCristian {
    public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		
	        String caracter = "cx";
	        	        
	        char carac;
	        int azar= (int) (Math.random() * 20);
	        int pos_error=0;
	        int error=0;
	        int gano = 0;

	        Palabras Xd = new Palabras();
	       
	        System.out.println("Bienvenido al ahoracado ¿desea jugar?");
	        System.out.println("Si=0/N0=1");
	        int pla;
	        
	        pla = scan.nextInt();

	        if (pla == 0) {
	                
	            String word = Xd.palabras[azar];
	            
	            int tamaño = word.length();
	            
	            System.out.println(tamaño);
	            
	            System.out.println(word);
	            
	            char palabra[] = new char[tamaño];
	            
	            char pantalla[] = new char[tamaño];
	            
	         
	            
	            for (int w1 = 0; w1 <= (tamaño - 1); w1++) {
	                char c1 = word.charAt(w1);
	                pantalla[w1] = c1;
	            }
	            char guion = '-';
	            for (int w1 = 0; w1 <= (tamaño- 1); w1++) {
	                
	                palabra[w1] = guion;
	            }
	            System.out.println(palabra);
	            
	           
	            	            
	            for (;gano<=tamaño && error <=6 ;){
	            	
	            	System.out.println("Digite su caracter");
	            	caracter = scan.next();
	            	carac = caracter.charAt(0);
	            	
	            	for (int q=0; q<=(tamaño-1);q++){
	            		
	            			            		
	            		if(carac ==(word.charAt(q))){
	            			
	            			palabra[q]=carac;
            			
	            		}
	            		
	            		else{
	            			
	            			pos_error++;
	            		}
	            		
	            	}
	            	
	            	
	            	
	            	
	            	if((pos_error%tamaño)==0){
            			error++;
            			
            		}
	            	
	            	gano ++;
	            	
	            	
		            if(error==1){
		            	System.out.println("p");
		            }
		            if(error==2){
		            	System.out.println("p(");
		            }
		            if(error==3){
		            	System.out.println("p(x");
		            }
		            if(error==4){
		            	System.out.println("p(x_");
		            }
		            if(error==5){
		            	System.out.println("p(x_x");
		            }
		            if(error==6){
		            	System.out.println("p(x_x)");
		            }
		            if(error==7){
		            	System.out.println("p(x_x)q");
            		
            		}
            	           	
	           	 
	            }
	            }
           
	        
	            System.out.println("Gracias por jugar.");
	            
	            scan.close();
	}
    
}


	