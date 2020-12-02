package DAO;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import EXCEPCIONES.MisExcepciones;
import MODEL.Cliente;
import MODEL.Pedido;
import MODEL.misEstados;

public class BuilderPedidoDao {

	/**
	 * Metodo para crear un pedido (Patron builder)
	 * 
	 * @param codigoPedido
	 * @param fechaPedido
	 * @param fechaEsperada
	 * @param fechaEntrega
	 * @param estado
	 * @param comentarios
	 * @param codigoCliente
	 * @param misPedidos
	 * @param misClientes
	 * @return Pedido
	 * @throws MisExcepciones
	 */
	public static Pedido build(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega,
			misEstados estado, String comentarios, int codigoCliente, List<Pedido> misPedidos, List<Cliente> misClientes,
			boolean actualizar) throws MisExcepciones {

		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 11, 2, 0, 0);
		comprobarFechaPedido(calendar, fechaPedido);
		comprobarFechaEsperada(calendar, fechaPedido, fechaEsperada);
		comprobarIdClientes(codigoCliente, misClientes);

		if (actualizar = false) {
			comprobarIdPedidos(codigoPedido, misPedidos);
		}

		return new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estado, comentarios, codigoCliente);
	}

	/**
	 * Metodo para comprobar si la fecha del pedido es la misma que la fecha del dia
	 * de hoy
	 * 
	 * @param calendar
	 * @param fechaPedido
	 * @throws MisExcepciones
	 */
	@SuppressWarnings("deprecation")
	public static void comprobarFechaPedido(Calendar calendar, Date fechaPedido) throws MisExcepciones {
		if (calendar.get(Calendar.DAY_OF_MONTH) != fechaPedido.getDate()
				|| calendar.get(Calendar.MONTH) != fechaPedido.getMonth()
				|| calendar.get(Calendar.YEAR) != fechaPedido.getYear() + 1900) {
			System.out.println(fechaPedido.getDate() + " " + (fechaPedido.getMonth()+1) + " " + (fechaPedido.getYear() + 1900));
			throw new MisExcepciones(555);
		}
	}

	/**
	 * Metodo para comprobar si la fecha esperada es tres dias despues de la fecha
	 * de hoy
	 * 
	 * @param calendar
	 * @param fechaPedido
	 * @param fechaEsperada
	 * @throws MisExcepciones
	 */
	@SuppressWarnings("deprecation")
	public static void comprobarFechaEsperada(Calendar calendar, Date fechaPedido, Date fechaEsperada)
			throws MisExcepciones {
		calendar.add(Calendar.DATE, +3);
		if (!fechaEsperada.after(calendar.getTime())) {
			System.out
					.println(fechaPedido.getDate() + " " + (fechaPedido.getMonth()+1) + " " + (fechaPedido.getYear() + 1900));
			throw new MisExcepciones(666);
		}
	}

	/**
	 * Metodo para comprobar si el ID del pedido es correcto
	 * 
	 * @param codigoPedido
	 * @param misPedidos
	 * @throws MisExcepciones
	 */
	public static void comprobarIdPedidos(int codigoPedido, List<Pedido> misPedidos) throws MisExcepciones {
		if (codigoPedido < 0) {
			throw new MisExcepciones(777);
		}

		// Comprueba que no existan dos pedidos con el mismo id
		for (Pedido pedido : misPedidos) {
			if (pedido.getId() == codigoPedido) {
				throw new MisExcepciones(777);
			}
		}
	}

	/**
	 * Metodo para comprobar si el ID del cliente introducido en los pedidos existe
	 * 
	 * @param codigoCliente
	 * @param misClientes
	 * @throws MisExcepciones
	 */
	public static void comprobarIdClientes(int codigoCliente, List<Cliente> misClientes) throws MisExcepciones {
		boolean encontrado = false;
		for (Cliente cliente : misClientes) {
			if (cliente.getId() == codigoCliente) {
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			throw new MisExcepciones(888);
		}
	}
}
