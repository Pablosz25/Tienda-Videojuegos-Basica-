package tiendaVideojuegos;

public class Juegos {
	
	public int id;
	public String nombre;
	public double precio;
	public Generos genero;
	
	public Juegos(int id,String nombre,Double precio,Generos genero) {
		
		this.id=id++;
		this.nombre=nombre;
		this.precio=precio;
		this.genero=genero;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "El Juego con la id "+ id + " que se llama " + nombre + " tiene un preciode " + precio + "€ euros y es del genero de " + genero;
	}
	
	
	
	

}
