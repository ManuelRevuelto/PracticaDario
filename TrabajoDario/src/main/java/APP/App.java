package APP;

import java.io.NotActiveException;
import java.util.Date;
import java.util.DuplicateFormatFlagsException;
import java.util.List;
import java.util.Scanner;

import DAO.BuilderClienteDao;
import DAO.BuilderPedidoDao;
import DAO.ClienteDao;
import DAO.PedidoDao;
import MODEL.Cliente;
import MODEL.Pedido;

public class App {
	public static void main(String[] args) throws DuplicateFormatFlagsException, NotActiveException {

		Scanner ky = new Scanner(System.in);
		System.out.println("************************************** CLIENTES **************************************");
		System.out.println();
		ClienteDao clienteDao = new ClienteDao();

		List<Cliente> misClientes = clienteDao.getAll();

		for (Cliente u : misClientes) {
			System.out.println(u.toString());
		}

		System.out.println();
		System.out.println("************************************** PEDIDOS **************************************");
		System.out.println();
		PedidoDao pedidoDao = new PedidoDao();
		List<Pedido> misPedidos = pedidoDao.getAll();

		for (Pedido v : misPedidos) {
			System.out.println(v.toString());
		}

		System.out.println();
		System.out.println(
				"************************************** AÑADIR PEDIDOS **************************************");
		System.out.println();

		Pedido p2 = BuilderPedidoDao.build(3, new Date(120, 10, 25), new Date(120, 10, 29), null, true, "", 0,
				misPedidos);

		System.out.println();
		System.out.println(
				"************************************** AÑADIR CLIENTES **************************************");
		System.out.println();

		Cliente c1 = BuilderClienteDao.build(1, null, null, null, 0, 0, null, null, null, null, null, 0, 0, 0);
		Cliente c2 = BuilderClienteDao.build(2, null, null, null, 0, 0, null, null, null, null, null, 0, 0, 0);
		clienteDao.guardar(c1);
		clienteDao.guardar(c2);

		System.out.println(
				"************************************** Actualizar CLIENTES **************************************");

		System.out.println("Que cliente quieres actualizar:");
		int id = ky.nextInt();
		Cliente c3 = new Cliente(id, "feo", null, null, 0, 0, null, null, null, null, null, 0, 0, 0);

		clienteDao.actualizar(id, c3);

	}
}
