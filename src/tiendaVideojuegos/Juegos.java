package tiendaVideojuegos;

public class Juegos {

	private int id = 0;
	private String nombre;
	private double precio;
	private Generos genero;
	private int stock;
	private static int contadorjuegos = 0;

	public Juegos(String nombre, Double precio, Generos genero, int stock) {

		this.id = ++contadorjuegos;
		this.nombre = nombre;
		this.precio = precio;
		this.genero = genero;
		this.stock = stock;

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

		if (stock > 0) {
			this.stock = this.stock + stock;
			System.out.println("Hay un stock total de " + this.stock);
		} else {

			System.out.println("No puedes añadir stock negativo");

		}

	}

	public void reducirStock(int stock) {

		if (stock > 0) {

			this.stock = this.stock - stock;

			if (this.stock < 0) {

				System.out.println("El stock es negativo no puedes hacer eso se pondra en 0");

				this.stock = 0;

			} else {

				System.out.println("Hay un stock total de " + this.stock);
			}

		} else {

			System.out.println("El numero debe ser positivo para restarlo no negativo");

		}

	}

	public boolean hayStock() {

		if (this.stock > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {

		return "El Juego con la id " + id + " que se llama " + nombre + " tiene un precio de " + precio
				+ "€ euros es del genero de " + genero + " y actualmente hay un total de " + stock
				+ " unidades en el almacen ";
	}

}