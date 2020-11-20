package DAO;

import MODEL.Pedido;

public class BuilderPedidoDao {

	public static Pedido build(int codigoPedido, int fechaPedido, int fechaEsperada, int fechaEntrega, Boolean estado,
			String comentarios, int codigoCliente) {
		
		
		return new Pedido(codigoPedido, fechaPedido, fechaEsperada, fechaEntrega, estado,
				comentarios, codigoCliente);
	}
}
