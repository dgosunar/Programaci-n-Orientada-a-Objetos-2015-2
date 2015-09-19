
public class promedio {
	public int cant=0;
	public double promedio=0;
	public double suma=0;
	
	
	public double Promedio(double pro []){
		
		
	for (int c=0; c<=(cant); c++){
		
		suma += pro[c];
		
	}
	
	
	promedio=(suma/(cant));
				
	return promedio;
	}

}
