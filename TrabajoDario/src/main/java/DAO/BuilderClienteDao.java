package DAO;

import MODEL.Cliente;

public class BuilderClienteDao {

	public static Cliente build(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto,
			int telefono, int fax, String lineaDireccion, String lineaDireccion2, String ciudad, String region,
			String pais, int codigoPostal, int codigoEmpleado, int limiteCredito) {
		
		
		
		return new Cliente(codigoCliente, nombreCliente, nombreContacto, apellidoContacto, telefono, fax, lineaDireccion, lineaDireccion2, 
				ciudad, region, pais, codigoPostal, codigoEmpleado, limiteCredito);
	}
		
}
