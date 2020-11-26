package DAO;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import MODEL.Cliente;
import MODEL.Pedido;

public class BuilderPedidoDao {

	@SuppressWarnings("deprecation")
	public static Pedido build(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega,
			Boolean estado, String comentarios, int codigoCliente, List<Pedido> misPedidos, List<Cliente> misClientes) {
		
		Calendar calendar = Calendar.getInstance();
		// Comprueba que la fecha de realizacion del pedido es del dia actual
		if (calendar.get(Calendar.DAY_OF_MONTH) != fechaPedido.getDate()
				|| calendar.get(Calendar.MONTH) != fechaPedido.getMonth()
				|| calendar.get(Calendar.YEAR) != fechaPedido.getYear() + 1900) {
			System.out
					.println(fechaPedido.getDate() + " " + fechaPedido.getMonth() + " " + fechaPedido.getYear() + 1900);
			throw new IllegalArgumentException();
		}

		// Comprueba que la fecha de esperada del pedido es tres dias antes del dia
		// actual
		calendar.add(Calendar.DATE, +3);
		if (!fechaEsperada.after(calendar.getTime())) {
			System.out
					.println(fechaPedido.getDate() + " " + fechaPedido.getMonth() + " " + fechaPedido.getYear() + 1900);
			throw new IllegalArgumentException();
		}

		if (codigoPedido < 0) {
			throw new IllegalArgumentException();
		}

		// Comprueba que no existan dos pedidos con el mismo id
		for (Pedido pedido : misPedidos) {
			if (pedido.getId() == codigoPedido) {
				throw new IllegalArgumentException();
			}
		}

		// Comprueba que el id del codigo del cliente exista

		boolean encontrado = false;
		for (Cliente cliente : misClientes) {
			if (cliente.getId() == codigoCliente) {
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			throw new IllegalArgumentException();
		}

		return new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estado, comentarios, codigoCliente);
	}
}
