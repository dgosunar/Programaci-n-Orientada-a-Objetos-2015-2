import java.util.*;
public class Figuritas {

	public static void main(String[] args) {
				
	Scanner sc = new Scanner(System.in);	
		
	Quiadrilateral qua = new Quiadrilateral("Coordinates of Quadrilateral are:");	
	Square squ = new Square("Coordinates of Square are:");
	Rectangle rec = new Rectangle("Coordinates of Rectangle are:");
	Parallelogram par = new Parallelogram("Coordinates of Parallelogram are:");
	Trapezoid tra = new Trapezoid("Coordinates of Trapezoid are:");
		
		System.out.println(qua.points());		
		System.out.println(squ.points());
		System.out.println("Square's area: "+ squ.Area());
		System.out.println(rec.points());
		System.out.println("Rectangle's area: "+ rec.Area());
		System.out.println(par.points());
		System.out.println("Parallelogram's area: "+ par.Area());
		System.out.println(tra.points());
		System.out.println("Trapezoid's area: "+ tra.Area());
		
	sc.close();	
	}
	
	
	

}
