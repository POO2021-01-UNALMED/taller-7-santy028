package comunicacion;

public class Alfabeto extends Pictograma{
	
    String[] letras;
	String interpretacion;

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
	}
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

	public String interpretacion() {
		return interpretacion;
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String toString() {
	
			String aux = null ;

			for(String letra: this.letras) {
				if(letra.equals("Z")) {
					aux =aux + letra;
				}else {
					aux = aux+ letra + ", ";
				}
			}

			return aux;
		}
		
	
	
		
	
	
	
	
	
	
}
