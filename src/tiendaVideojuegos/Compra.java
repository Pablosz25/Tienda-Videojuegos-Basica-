package tiendaVideojuegos;

public class Compra {

	private int idJuego;
	private int idCliente;
	private double precioFinal;
	private int cantidad;

	public Compra(Juegos juego, Clientes cliente,  int cantidad, double precioFinal) {

		this.idJuego = juego.getId();
		this.idCliente = cliente.getId();
		
		this.cantidad = cantidad;
		this.precioFinal = precioFinal;

	}

	public int getIdJuego() {
		return idJuego;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Compra: Cliente ID " + idCliente + " | Juego ID " + idJuego + " | Cantidad: " + cantidad
				+ " | Precio final: " + precioFinal + "€";
	}

}
