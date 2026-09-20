package tiendaVideojuegos;

public class Clientes {

	private int id;
	private static int contadorclientes = 0;
	private String nombre;
	private Double saldo;
	private Double saldoantiguo;

	public Clientes(String nombre) {

		this.id = ++contadorclientes;
		this.nombre = nombre;
		this.saldo = 0.0;

	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPresupuesto() {
		return saldo;
	}

	public void aumentarsaldo(double saldo) {

		if (saldo > 0) {
			this.saldo = this.saldo + saldo;
			System.out.println("El nuevo saldo del cliente es de  " + this.saldo + "€");
		} else {

			System.out.println("No puedes añadir saldo negativo");

		}

	}

	public void restarsaldo(double saldo) {

		if (saldo > 0) {

			saldoantiguo = this.saldo;

			this.saldo = this.saldo - saldo;

			if (this.saldo < 0) {

				this.saldo = saldoantiguo;

				System.out.println(
						"El saldo es negativo por lo que se quedara en el saldo antiguo y se cancelara la compra");

			} else {

				System.out.println("El saldo actual es de " + this.saldo);
			}

		} else {
			System.out.println("El numero debe ser positivo para restarlo no negativo");
		}

	}

	public boolean puedeComprar(Juegos Juegos) {

		if (this.saldo >= Juegos.getPrecio() && Juegos.hayStock()) {
			System.out.println("Puede comprar el juego");
			return true;

		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "El Clientes con id: " + id + "que se llama " + nombre + "tiene un presupuesto actual de" + saldo;
	}

}