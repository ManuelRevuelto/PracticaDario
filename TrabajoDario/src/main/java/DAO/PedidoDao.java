package DAO;

import java.util.ArrayList;
import java.util.List;

import MODEL.Pedido;

public class PedidoDao implements DAO<Pedido> {

	private List <Pedido> misPedidos = new ArrayList<Pedido>();
	public PedidoDao() {
		misPedidos.add(new Pedido(0, 12/10/2020, 18/10/2020, 18/10/2020, true, null, 0));
	}
	@Override
	public List<Pedido> getAll() {
		// TODO Auto-generated method stub
		return misPedidos;
	}

	@Override
	public void guardar(Pedido dat) {
		// TODO Auto-generated method stub
		misPedidos.add(dat);
	}

	@Override
	public void actualizar(Pedido dat, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Pedido dat) {
		// TODO Auto-generated method stub
		misPedidos.remove(dat);
	}

	
}
