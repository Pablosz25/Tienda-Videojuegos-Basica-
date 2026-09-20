package tiendaVideojuegos;

import java.util.ArrayList;

public class Tienda {

	public ArrayList<Juegos> juegos = new ArrayList<>();
	public ArrayList<Clientes> clientes = new ArrayList<>();
	public ArrayList<Compra> compras = new ArrayList<>();

	public void añadirJuego(Juegos juego) {
		if (juego == null) {
			System.out.println("El videojuego no puedo ser añadido por algun campo sin rellenar");
			return;
		} else {
			juegos.add(juego);
			System.out.println("Videojuego añadido correctamente");
		}

	}

	public void añadirCliente(Clientes cliente) {
		if (cliente == null) {
			System.out.println("El cliente no puedo ser añadido por algun campo sin rellenar");
			return;
		} else {
			clientes.add(cliente);
			System.out.println("Cliente añadido correctamente");
		}

	}

	public Juegos buscarJuego(int id) {

		if (id <= 0) {
			System.out.println("El identificador debe ser positivo");
			return null;
		}

		for (int i = 0; i < juegos.size(); i++) {
			if (juegos.get(i).getId() == id) {
				return juegos.get(i);
			}
		}

		System.out.println("No existe ningún videojuego con ese identificador");
		return null;
	}

	public void realizarCompra(Clientes cliente, Juegos juego, int cantidad) {

		if (cantidad <= 0) {
			System.out.println("La cantidad tiene que ser mayor que 0");
			return;
		}

		if (juego.getStock() < cantidad) {
			System.out.println("No hay suficientes unidades disponibles");
			return;
		}

		double precioFinal = juego.getPrecio() * cantidad;

		if (cliente.getPresupuesto() < precioFinal) {
			System.out.println("No tienes suficiente dinero para poder comprarlo");
			return;
		}

		cliente.restarsaldo(precioFinal);
		juego.reducirStock(cantidad);

		System.out.println("Has comprado " + cantidad + " copias del juego por un total de " + precioFinal + "€");

		Compra compra = new Compra(juego, cliente, cantidad,precioFinal);

		compras.add(compra);
	}
}
