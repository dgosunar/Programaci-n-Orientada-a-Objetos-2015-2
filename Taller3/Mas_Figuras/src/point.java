import java.util.*;

public class point {
	/*definimos dos arreglos para los puntos en "x" y en "y"
	 * junto con las variables correspondientes a los lados mayores y menores
	 */
	double [] points_x= new double [4];
	double [] points_y=  new double[4];
	double max_x=0;
	double max_y=0;
	double min_x=0;
	double min_y=0;
	
	//Aqui tenemos el constructor de la clase punto y su comportamiento general
	
	public point(double [] point_x, double [] point_y){
		this.points_x= point_x;
		this.points_y= point_y;
		Scanner sc = new Scanner(System.in);		
		
		//este for se utiliza para capturar los puntos "x" y "y" en arreglos 
		for(int d=0; d<2 ;d++ ){
			System.out.println("please type x for the top");
			double x=0;
			x= sc.nextDouble();
			points_x[d]=x;	
			System.out.println("please type y for the top");
			double y=0;
			y= sc.nextDouble();
			points_y[d]=y;
		}	
		for(int d=2; d<4 ;d++ ){
			System.out.println("please type x for the bot");
			double x= sc.nextDouble();
			points_x[d]=x;	
			System.out.println("please type y for the bot");
			double y= sc.nextDouble();
			points_y[d]=y;
		}
		
		//Aqui asigamos el valor para cada lado de la figura
		double width_bot = Math.abs(max_x= points_x[1])+
						   Math.abs(max_x= points_x[0]);
		double width_top = Math.abs(max_x= points_x[2])+
						   Math.abs(max_x= points_x[3]);
		double height_bot = Math.abs(max_y= points_y[1])+
				            Math.abs(max_y= points_y[0]);
		double height_top = Math.abs(max_y= points_y[2])+
				            Math.abs(max_y= points_y[3]);
		
		
		//con estos if encontramos que lado es mayor y que lado es menor		
		if(width_bot<width_top){
			max_x= width_top;
			min_x= width_bot;
		}
		else{
			max_x= width_bot;
			min_x= width_top;
		}
		if(height_bot<height_top){
			max_y= height_top;
			min_y= height_bot;
		}
		else{
			max_y= height_bot;
			min_y= height_top;
		}
		sc.close();
	}
	
}
