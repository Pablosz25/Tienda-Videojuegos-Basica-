package tiendaVideojuegos;

import java.util.ArrayList;

public class Tienda {

	public ArrayList<Juegos> juegos = new ArrayList<>();
	Clientes pablo = new Clientes("Pablo");
	Clientes ana = new Clientes("Ana");
	public ArrayList<Clientes> clientes = new ArrayList<>();
	Juegos doom = new Juegos("Doom", 59.99, Generos.Accion, 10);
	Juegos minecraft = new Juegos("Minecraft", 29.99, Generos.Aventura, 15);

}
