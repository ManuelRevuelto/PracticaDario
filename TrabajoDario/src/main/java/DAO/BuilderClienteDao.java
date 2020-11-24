package DAO;

import MODEL.Cliente;

public class BuilderClienteDao {
	/**
	 * Metodo para crear un cliente (Patron builder)
	 * 
	 * @param codigoCliente
	 * @param nombreCliente
	 * @param nombreContacto
	 * @param apellidoContacto
	 * @param telefono
	 * @param fax
	 * @param lineaDireccion
	 * @param lineaDireccion2
	 * @param ciudad
	 * @param region
	 * @param pais
	 * @param codigoPostal
	 * @param codigoEmpleado
	 * @param limiteCredito
	 * @return Cliente
	 * @throws IllegalArgumentException
	 */
	public static Cliente build(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto,
			int telefono, int fax, String lineaDireccion, String lineaDireccion2, String ciudad, String region,
			String pais, int codigoPostal, int codigoEmpleado, int limiteCredito) throws IllegalArgumentException {

		ClienteDao clienteDao = new ClienteDao();
		if (codigoCliente < 0) {
			throw new IllegalArgumentException();
		}

		// Comprueba que no existan dos clientes con el mismo id
		for (Cliente cliente : clienteDao.getAll()) {
			if (cliente.getId() == codigoCliente) {
				throw new IllegalArgumentException();
			}
		}

		return new Cliente(codigoCliente, nombreCliente, nombreContacto, apellidoContacto, telefono, fax,
				lineaDireccion, lineaDireccion2, ciudad, region, pais, codigoPostal, codigoEmpleado, limiteCredito);
	}

}
