package DAO;

import java.util.List;

import MODEL.Pedido;

public interface IPedidoDao {

	List<Pedido> getAll();

	void guardar(Pedido pd);

	void actualizar(int id, Pedido pd);

	void eliminar(Pedido pd);
}
