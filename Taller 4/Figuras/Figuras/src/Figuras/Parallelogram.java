package Figuras;

public class Parallelogram extends Figura{
		 
	 public Parallelogram(double length, double width) {
		 this.setLength(length);
	     this.setWidth(width);
	     }   
	 public double getLength() {
	     return length;
	     }
	 public void setLength(double length) {
	     if(length<20.0&&length>0.0){
	    	this.length = length;
	     	}else{
	     		System.out.println("The value is out of range");
	     		}
	     }
	 public double getWidth() {
	     return width;
	     }
	 public void setWidth(double width) {
	     if(width<20.0&&width>0.0){
	    	 this.width = width;
	     	 }else{
	     		 System.out.println("The value is out of range");
	     	 	 }
	     }
	 public double getPerimeteri(){
	     return 2*(width+length);
	     }
	 public double getAreap(){
	     return width*length;
	     }

	 public void setBase(){
	 }
	 public void setHeigth(){
	 }
	 public void setLength(){
	 }
	 public void setWidth(){
	 }
	public double getBase() {
		return base;
	}
	public double getHeigth() {
		return heigth;
	}
	public double getArea() {
		return 0;
	}	  
}
