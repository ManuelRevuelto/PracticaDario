package MODEL;

import java.util.Date;

public class Pedido {

	private int codigoPedido;
	private Date fechaPedido;
	private Date fechaEsperada;
	private Date fechaEntrega;
	private misEstados estado;
	private String comentarios;
	private int codigoCliente;

	////////

	public Pedido(int codigoPedido, Date fechaPedido, Date fechaEsperada, Date fechaEntrega, misEstados estado,
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

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public Date getFechaEsperada() {
		return fechaEsperada;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public misEstados getEstado() {
		return estado;
	}

	public void setEstado(misEstados estado) {
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

	@Override
	public String toString() {
		return "Pedido [codigoPedido=" + codigoPedido + ", fechaPedido=" + fechaPedido + ", fechaEsperada="
				+ fechaEsperada + ", fechaEntrega=" + fechaEntrega + ", estado=" + estado + ", comentarios="
				+ comentarios + ", codigoCliente=" + codigoCliente + "]";
	}
}
