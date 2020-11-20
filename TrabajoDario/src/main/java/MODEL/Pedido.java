package MODEL;

public class Pedido {
	
	private int codigoPedido;
	private int fechaPedido;
	private int fechaEsperada;
	private int fechaEntrega;
	private Boolean estado;
	private String comentarios;
	private int codigoCliente;
	
	////////
	
	public Pedido(int codigoPedido, int fechaPedido, int fechaEsperada, int fechaEntrega, Boolean estado,
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
	
	public int getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public int getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(int fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public int getFechaEsperada() {
		return fechaEsperada;
	}
	public void setFechaEsperada(int fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}
	public int getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(int fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
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
}
