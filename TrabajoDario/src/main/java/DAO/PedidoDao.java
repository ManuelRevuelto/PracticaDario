package DAO;

import java.util.ArrayList;
import java.util.List;
import MODEL.Pedido;

public class PedidoDao implements IPedidoDao {
	List<Pedido> misPedidos = new ArrayList<Pedido>();

	public PedidoDao(List<Pedido> misPedidos) {
		this.misPedidos = misPedidos;
	}

	@Override
	public List<Pedido> getAll() {
		return misPedidos;
	}

	@Override
	public void guardar(Pedido pd) {
		misPedidos.add(pd);
	}

	@Override
	public void actualizar(int id, Pedido pd) {
		Pedido p2 = null;
		for (Pedido pedido : misPedidos) {
			if (id == pedido.getId()) {
				p2 = pedido;
				break;
			}
		}
		if (p2 == null) {
			System.out.println("No he encontrado el pedido");
		} else {
			misPedidos.set(misPedidos.indexOf(p2), pd);
			System.out.println("El cliente ha sido actualizado con exito");
		}
	}

	@Override
	public void eliminar(Pedido pd) {
		misPedidos.remove(pd);
	}
}
