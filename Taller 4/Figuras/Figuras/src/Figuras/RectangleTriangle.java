package Figuras;

public class RectangleTriangle extends Figura{
	 	 
	 public RectangleTriangle(double base, double heigth) {
		 this.setBase(base);
	     this.setHeigth(heigth);
	     
	     }   
	 public double getBase() {
	     return base;
	     }
	 public void setBase(double base) {
	     if(base<20.0&&base>0.0){
	    	this.base = base;
	     	}else{
	     		System.out.println("The value is out of range");
	     		}
	     }
	 public double getHeigth() {
	     return heigth;
	     }
	 public void setHeigth(double heigth) {
	     if(heigth<20.0&&heigth>0.0){
	    	 this.heigth = heigth;
	     	 }else{
	     		 System.out.println("The value is out of range");
	     	 	 }
	     }
	 
	 public double getPerimeteri(){
		 
	     return (heigth+base)+(Math.sqrt((base*base)+(heigth*heigth)));
	     }
	 public double getAreart(){
	     return (heigth*base)/2;
	     }

	public void setBase() {
	}
	public void setHeigth() {
	}
	public double getArea() {
		return 0;
	}
	public double getLength() {
		return 0;
	}
	public void setLength() {			
	}
	public double getWidth() {
		return 0;
	}
	public void setWidth() {		
	}   
}