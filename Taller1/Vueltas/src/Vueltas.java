import java.util. Scanner;
public class Vueltas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vueltas=0;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Ingrese el Monto a Retirar");
		vueltas = lectura.nextInt();
		
		
		int bil50000=0;
		int bil20000=0;
		int bil10000=0;
		int bil5000=0;
		int bil2000=0;
		int bil1000=0;
		
		int mon500=0;
		int mon200=0;
		int mon100=0;
		int mon50=0;
				
		bil50000 = vueltas / 50000;
		vueltas = vueltas - (bil50000*50000);
		bil20000 = vueltas / 20000;
		vueltas = vueltas - (bil20000*20000);
		bil10000 = vueltas / 10000;
		vueltas = vueltas - (bil10000*10000);
		bil5000 = vueltas / 5000;
		vueltas = vueltas - (bil5000*5000);
		bil2000 = vueltas / 2000;
		vueltas = vueltas - (bil2000*2000);
		bil1000 = vueltas / 1000;
		vueltas = vueltas - (bil1000*1000);
		
		System.out.println(+bil50000+" billetes de 50000, "+bil20000+" billetes de 20000, "+bil10000+" billetes de 10000, ");
		System.out.println(+bil5000+" billetes de 5000, "+bil2000+" billetes de 2000, "+bil1000+" billetes de 1000, ");
		
		mon500 = vueltas / 500;
		vueltas = vueltas - (mon500*500);
		mon200 = vueltas / 200;
		vueltas = vueltas - (mon200*200);
		mon100 = vueltas / 100;
		vueltas = vueltas - (mon100*100);
		mon50 = vueltas / 50;
		vueltas = vueltas - (mon50*50);
		
		System.out.println(+mon500+" monedas de 500, "+mon200+" monedas de 200, "+mon100+" monedas de 100, "+mon50+" monedas de 50");
		
		
		
		
		

	}

}
