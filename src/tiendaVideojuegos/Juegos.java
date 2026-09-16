package tiendaVideojuegos;

public class Juegos {

	private int id = 0;
	private String nombre;
	private double precio;
	private Generos genero;
	private int stock;
	public int contadorjuegos=0;

	public Juegos(int id, String nombre, Double precio, Generos genero, int stock) {

		this.id = ++id;
		this.nombre = nombre;
		this.precio = precio;
		this.genero = genero;
		this.stock = stock;
		contadorjuegos++;

	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public Generos getGenero() {
		return genero;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {

		if (stock < 0) {
			this.stock = 0;
			System.out.println("no puedes poner un stock negativo");
		} else {
			this.stock = stock;
		}

	}

	public void aumentarStock(int stock) {

		if (stock < 0) {
			this.stock = this.stock + stock;
			System.out.println("Hay un stock total de " + this.stock);
		} else {

			System.out.println("No puedes añadir stock negativo");

		}

	}

	public void reducirStock(int stock) {

		this.stock = this.stock - stock;

		if (this.stock < 0) {

			System.out.println("El stock es negativo no puedes hacer eso se pondra en 0");

			this.stock = 0;

		} else {

			System.out.println("Hay un stock total de " + this.stock);
		}

	}

	public void hayStock() {

		if (this.stock > 0) {
			System.out.println("Si hay un total de " + this.stock + " unidades de stock ");
		} else {
			System.out.println("No hay stock disponible");
			System.out.println("hola");
		}

	}

	@Override
	public String toString() {
		
		return "El Juego con la id " + id + " que se llama " + nombre + " tiene un precio de " + precio
				+ "€ euros es del genero de " + genero + " y actualmente hay un total de " + stock
				+ " unidades en el almacen ";
	}

}