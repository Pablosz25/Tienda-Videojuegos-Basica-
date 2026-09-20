package tiendaVideojuegos;

public class Compra {

	public static void realizarCompra(Clientes cliente, Juegos juego, int cantidad) {

		if (cantidad <= 0) {
			System.out.println("La cantidad tiene que ser mayor que 0");
			return;
		} else if (juego.getStock() < cantidad) {
			System.out.println("No hay suficientes unidades disponibles");
			return;
		} else {
			double precioFinal = juego.getPrecio() * cantidad;
			if (cliente.getPresupuesto() < precioFinal) {
				System.out.println("No tienes sufieinte dinero para poder comprarlo");
				return;
			} else {
				cliente.restarsaldo(precioFinal);
				juego.reducirStock(cantidad);

				System.out
						.println("Has comprado " + cantidad + " copias del juego por un total de " + precioFinal + "€");
			}
		}

	}

}
