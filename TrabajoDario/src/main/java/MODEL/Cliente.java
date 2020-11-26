package MODEL;

import DAO.misDocumentos;

public class Cliente {

	private misDocumentos tipoDocumento;
	private String documento;

	private String email;
	private String password;
	private int codigoCliente;
	private String nombreCliente;
	private String nombreContacto;
	private String apellidoContacto;
	private int telefono;
	private int fax;
	private String lineaDireccion;
	private String lineaDireccion2;
	private String ciudad;
	private String region;
	private String pais;
	private int codigoPostal;
	private int codigoEmpleado;
	private int limiteCredito;

	///////// Constructor de clientes

	public Cliente(misDocumentos tipoDocumento, String documento, String email, String password, int codigoCliente,
			String nombreCliente, String nombreContacto, String apellidoContacto, int telefono, int fax,
			String lineaDireccion, String lineaDireccion2, String ciudad, String region, String pais, int codigoPostal,
			int codigoEmpleado, int limiteCredito) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.email = email;
		this.password = password;
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.nombreContacto = nombreContacto;
		this.apellidoContacto = apellidoContacto;
		this.telefono = telefono;
		this.fax = fax;
		this.lineaDireccion = lineaDireccion;
		this.lineaDireccion2 = lineaDireccion2;
		this.ciudad = ciudad;
		this.region = region;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
		this.codigoEmpleado = codigoEmpleado;
		this.limiteCredito = limiteCredito;
	}

	//////// Getters and setters
	public misDocumentos getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(misDocumentos tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return codigoCliente;
	}

	public void setId(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getApellidoContacto() {
		return apellidoContacto;
	}

	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getLineaDireccion() {
		return lineaDireccion;
	}

	public void setLineaDireccion(String lineaDireccion) {
		this.lineaDireccion = lineaDireccion;
	}

	public String getLineaDireccion2() {
		return lineaDireccion2;
	}

	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public int getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", password" + password + ", codigoCliente=" + codigoCliente + ", nombreCliente="
				+ nombreCliente + ", nombreContacto=" + nombreContacto + ", apellidoContacto=" + apellidoContacto
				+ ", telefono=" + telefono + ", fax=" + fax + ", lineaDireccion=" + lineaDireccion
				+ ", lineaDireccion2=" + lineaDireccion2 + ", ciudad=" + ciudad + ", region=" + region + ", pais="
				+ pais + ", codigoPostal=" + codigoPostal + ", codigoEmpleado=" + codigoEmpleado + ", limiteCredito="
				+ limiteCredito + "]";
	}
}
