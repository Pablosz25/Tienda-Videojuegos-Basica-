package tiendaVideojuegos;

public class Clientes {
	
	public int id;
	public String nombre;
	public Double presupuesto;
	
public Clientes(int id,String nombre,Double presupuesto) {
		
		this.id=id++;
		this.nombre=nombre;
		this.presupuesto=presupuesto;
		
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Double getPresupuesto() {
	return presupuesto;
}

public void setPresupuesto(Double presupuesto) {
	this.presupuesto = presupuesto;
}

@Override
public String toString() {
	return "El Clientes con id: " + id + "que se llama " + nombre + "tiene un presupuesto actual de" + presupuesto;
}


	
	

}
