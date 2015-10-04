
public class Rectangle extends Square {
	
	//Publicamos el mensaje de coordenadas
	public Rectangle(String message) {
		super(message);		
	}
	
	
	//hacemos el constructor para el area y retornamos el metodo inicial de super clase
	public double Area() {		
		return super.Area();
	}

}
