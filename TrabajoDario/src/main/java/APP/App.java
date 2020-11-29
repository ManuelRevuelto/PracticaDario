package APP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import DAO.BuilderClienteDao;
import DAO.BuilderPedidoDao;
import DAO.ClienteDao;
import DAO.PedidoDao;
import EXCEPCIONES.MisExcepciones;
import MODEL.Cliente;
import MODEL.Pedido;
import MODEL.misDocumentos;
import MODEL.misEstados;

public class App {
	static List<Cliente> misClientes = new ArrayList<Cliente>();
	static List<Pedido> misPedidos = new ArrayList<Pedido>();
	static ClienteDao clienteDao = new ClienteDao(misClientes);
	static PedidoDao pedidoDao = new PedidoDao(misPedidos);

	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws MisExcepciones {
		Scanner ky = new Scanner(System.in);

		System.out.println(
				"************************************** AÑADIR CLIENTES **************************************");
		System.out.println();

		Cliente c1 = BuilderClienteDao.build(misDocumentos.DNI, "25359770W", "email1@gmail.com", "pass1", 1, "nom1", null,
				null, 0, 0, null, null, null, null, null, 0, 0, 0, misClientes, false);
		Cliente c2 = BuilderClienteDao.build(misDocumentos.NIE, "X6893412X", "email2@gmail.com", "pass2", 2, "nom2", null,
				null, 0, 0, null, null, null, null, null, 0, 0, 0, misClientes, false);
		clienteDao.guardar(c1);
		clienteDao.guardar(c2);
		System.out.println("Los clientes han sido añadidos con exito");

		System.out.println();
		System.out.println(
				"************************************** AÑADIR PEDIDOS **************************************");
		System.out.println();

		Pedido p1 = BuilderPedidoDao.build(1, new Date(120, 10, 28), new Date(120, 11, 2), null, misEstados.Entregado, "com1", 1,
				misPedidos, misClientes, false);
		Pedido p2 = BuilderPedidoDao.build(2, new Date(120, 10, 28), new Date(120, 11, 3), null, misEstados.Entregado, "com2", 2,
				misPedidos, misClientes, false);
		pedidoDao.guardar(p1);
		pedidoDao.guardar(p2);
		System.out.println("Los pedidos han sido añadidos con exito");

		System.out.println();
		System.out.println(
				"************************************** ACTUALIZAR CLIENTES **************************************");

		System.out.print("Que cliente quieres actualizar: ");
		int idC = ky.nextInt();
		Cliente c3 = BuilderClienteDao.build(misDocumentos.DNI, "12345678R", "email3@gmail.com", "pass3", idC, null, null, null, 0,
				0, null, null, null, null, null, 0, 0, 0, misClientes, true);
		clienteDao.actualizar(idC, c3);

		System.out.println();
		System.out.println(
				"************************************** ACTUALIZAR PEDIDOS **************************************");

		System.out.print("Que cliente quieres actualizar: ");
		int idP = ky.nextInt();
		Pedido p3 = BuilderPedidoDao.build(idP, new Date(120, 10, 28), new Date(120, 11, 5), null, misEstados.Entregado, "com3", 1,
				misPedidos, misClientes, true);
		pedidoDao.actualizar(idP, p3);

		System.out.println();
		System.out.println("************************************** CLIENTES **************************************");
		System.out.println();

		misClientes = clienteDao.getAll();
		for (Cliente u : misClientes) {
			System.out.println(u.toString());
		}

		System.out.println();
		System.out.println("************************************** PEDIDOS **************************************");
		System.out.println();

		misPedidos = pedidoDao.getAll();
		for (Pedido v : misPedidos) {
			System.out.println(v.toString());
		}

	}
}
