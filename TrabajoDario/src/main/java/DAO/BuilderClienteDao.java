package DAO;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import EXCEPCIONES.MisExcepciones;
import MODEL.Cliente;
import MODEL.misDocumentos;

public class BuilderClienteDao {

	/**
	 * Metodo para crear un cliente (Patron builder)
	 * 
	 * @param codigoCliente
	 * @param Username
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
	 * @throws MisExcepciones
	 */
	public static Cliente build(misDocumentos tipoDocumento, String documento, String email, String password,
			int codigoCliente, String Username, String nombreContacto, String apellidoContacto, int telefono,
			int fax, String lineaDireccion, String lineaDireccion2, String ciudad, String region, String pais,
			int codigoPostal, int codigoEmpleado, int limiteCredito, List<Cliente> misClientes, boolean actualizar)
			throws MisExcepciones {

		ClienteDao clienteDao = new ClienteDao(misClientes);
		validarDocumento(tipoDocumento, documento);
		validarEmail(email);
		if (actualizar = false) {
			validarId(clienteDao, codigoCliente);
		}

		return new Cliente(tipoDocumento, documento, email, password, codigoCliente, Username, nombreContacto,
				apellidoContacto, telefono, fax, lineaDireccion, lineaDireccion2, ciudad, region, pais, codigoPostal,
				codigoEmpleado, limiteCredito);
	}

	/**
	 * Metodo para verificar si el id no esta repetido y si es valido
	 * 
	 * @param clienteDao
	 * @param codigoCliente
	 * @throws MisExcepciones
	 */
	public static void validarId(ClienteDao clienteDao, int codigoCliente) throws MisExcepciones {

		if (codigoCliente < 0) {
			throw new MisExcepciones(111);
		}
		// Comprueba que no existan dos clientes con el mismo id
		for (Cliente cliente : clienteDao.getAll()) {
			if (cliente.getId() == codigoCliente) {
				throw new MisExcepciones(111);
			}
		}
	}

	/**
	 * Metodo para verificar si el documento esta bien escrito
	 * 
	 * @param tipoDocumento
	 * @param documento
	 * @throws MisExcepciones
	 */
	public static void validarDocumento(misDocumentos tipoDocumento, String documento) throws MisExcepciones {
		if (tipoDocumento == misDocumentos.DNI) {
			int caracterASCII = 0;
			if (documento.length() == 9 && Character.isLetter(documento.charAt(8))) {
				for (int i = 0; i < documento.length() - 1; i++) {
					caracterASCII = documento.charAt(i);
					if (caracterASCII > 47 && caracterASCII < 58) {
					} else {
						throw new MisExcepciones(222);
					}
				}
			} else {
				throw new MisExcepciones(222);
			}
		} else {
			int caracterASCII = 0;
			if (documento.length() == 9 && Character.isLetter(documento.charAt(8))
					&& Character.isLetter(documento.charAt(0))) {
				for (int i = 1; i < documento.length() - 1; i++) {
					caracterASCII = documento.charAt(i);
					if (caracterASCII > 47 && caracterASCII < 58) {
					} else {
						throw new MisExcepciones(333);
					}
				}
			} else {
				throw new MisExcepciones(333);
			}
		}
	}

	/**
	 * Metodo para verificar si el email esta bien escrito
	 * 
	 * @param email
	 * @throws MisExcepciones
	 */
	public static void validarEmail(String email) throws MisExcepciones {
		Pattern pattern = Pattern.compile("[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mather = pattern.matcher(email);

		if (mather.find() == false) {
			throw new MisExcepciones(444);
		}
	}

}
