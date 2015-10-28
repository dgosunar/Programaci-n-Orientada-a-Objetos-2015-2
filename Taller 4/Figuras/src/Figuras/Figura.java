package Figuras;

public abstract class Figura {
	 protected double base;
	 protected double heigth;
	 protected double length;
	 protected double width;
	 
	 Figura(){
		 this.base=1;
		 this.heigth=1;
		 this.length=1;
		 this.width=1;
	 } 
	 
	 public abstract double getBase();
	 public abstract void setBase();
	 public abstract double getHeigth();
	 public abstract void setHeigth();
	 public abstract double getPerimeteri();
	 public abstract double getArea();
	 public abstract double getLength();
	 public abstract void setLength();
	 public abstract double getWidth();
	 public abstract void setWidth();


}