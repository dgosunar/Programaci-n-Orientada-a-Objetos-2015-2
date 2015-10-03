package Figuras;

public class IsocelesTriangle {
	 private double base=1;
	 private double heigth=1;
	 
	 public IsocelesTriangle(double base, double heigth) {
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
	 public double getPerimeterit(){
	     return (3*base);
	     }
	 public double getAreait(){
	     return 2*((heigth*(base/2))/2);
	     }   
}