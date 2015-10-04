
public class Parallelogram extends  Quiadrilateral  {
	
	//Publicamos el mensaje de coordenadas
	public Parallelogram(String message) {
		super(message);		
	}
	
		
	//Reescribimos este metodo pues la manera de encontrar estos valores cambia drasticamente
	public double Area() {
		
		//hacemos alucion a los arreglos de puntos antes instanciados
		double [] x = new double[4];
		double [] y = new double[4];		
		
		//Definimos es tamaño de cada lado de la figura
		double top_base= x[2]+x[3];
		double top_heigth= y[2]+y[0];
		double bot_base= x[0]+x[1];
		double bot_heigth= y[1]+y[3];
		//Aplicamos la formula de area para cada triangulo obtenido
		double area1= ((top_base*top_heigth)/2);
		double area2= ((bot_base*bot_heigth)/2);
		
		//retornamos el area final de nuestra figura
		return area1+area2;
	}
}
