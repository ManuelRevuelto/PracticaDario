package MODEL;

import java.util.Date;

public class Pedido {

	private int codigoPedido;
	private Date fechaPedido;
	private Date fechaEsperada;
	private Date fechaEntrega;
	private boolean estado;
	private String comentarios;
	private int codigoCliente;

	////////

	public Pedido(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega, boolean estado,
			String comentarios, int codigoCliente) {
		super();
		this.codigoPedido = codigoPedido;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.comentarios = comentarios;
		this.codigoCliente = codigoCliente;
	}

	////////

	public int getId() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Date getFechaEsperada() {
		return fechaEsperada;
	}

	public void setFechaEsperada(Date fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", fechaPedido=" + fechaPedido + ", fechaEsperada="
				+ fechaEsperada + ", fechaEntrega=" + fechaEntrega + ", estado=" + estado + ", comentarios="
				+ comentarios + ", codigoCliente=" + codigoCliente + "]";
	}
}
