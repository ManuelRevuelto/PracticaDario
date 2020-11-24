package DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import MODEL.Pedido;

public class PedidoDao implements IPedidoDao {

	private List<Pedido> misPedidos = new ArrayList<Pedido>();

	@SuppressWarnings("deprecation")
	public PedidoDao() {
		misPedidos.add(BuilderPedidoDao.build(0, new Date(System.currentTimeMillis()), new Date(120, 10, 29), null,
				false, null, 0, misPedidos));
	}

	@Override
	public List<Pedido> getAll() {
		// TODO Auto-generated method stub
		return misPedidos;
	}

	@Override
	public void guardar(Pedido pd) {
		// TODO Auto-generated method stub
		misPedidos.add(pd);
	}

	@Override
	public void actualizar(int id, Pedido pd) {
		// TODO Auto-generated method stub
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
		}
	}

	@Override
	public void eliminar(Pedido pd) {
		// TODO Auto-generated method stub
		misPedidos.remove(pd);
	}
}
