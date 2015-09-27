
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        
        Rectangle r2=new Rectangle(2.3,5.6);
        
        
        Rectangle r3=new Rectangle();
        r3.setLength(6.22);
        r3.setWidth(9.33);
        
        Rectangle r4=new Rectangle();
        r4.setLength(16.01);
        r4.setWidth(5.1);
        
        Rectangle r5=new Rectangle();
        r5.setLength(8);
        r5.setWidth(8);
        
        System.out.println("R1= Area: "+r1.getArea()+" Perimeter: "+r1.getPerimeter());
        System.out.println("R2= Area: "+r2.getArea()+" Perimeter: "+r2.getPerimeter());
        System.out.println("R3= Area: "+r3.getArea()+" Perimeter: "+r3.getPerimeter());
        System.out.println("R4= Area: "+r4.getArea()+" Perimeter: "+r4.getPerimeter());
        System.out.println("R5= Area: "+r5.getArea()+" Perimeter: "+r5.getPerimeter());
        
        
    }
}
