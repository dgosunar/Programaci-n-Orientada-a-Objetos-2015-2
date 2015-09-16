import java.util.Scanner;
public class Primos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		numero= leer.nextInt();
		
			for(int i=1; i<=numero; i++){
				int count=0;
				
				for(int j=1;j<=i;j++){
					
					if(i%j==0)
						count++;
				}
				if(count==2){
					System.out.println(i);
				}
			}
		}
	}

