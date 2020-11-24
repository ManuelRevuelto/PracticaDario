package DAO;

import java.util.ArrayList;
import java.util.List;
import MODEL.Cliente;

public class ClienteDao implements IClienteDao {
	
	private List<Cliente> misClientes = new ArrayList<Cliente>();
	public ClienteDao() {
		misClientes.add(new Cliente(0, "Manuel", "Manu", "Revuelto", 601345678, 0, "c/ Sevilla", null, "Zgz", "Zgz", "España", 50006, 0, 0));
	}
	
	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return misClientes;
	}
	
	@Override
	public void guardar(Cliente dat) {
		// TODO Auto-generated method stub
		misClientes.add(dat);
	}

	@Override
	public void actualizar(int id, Cliente cl) {
		// TODO Auto-generated method stub
		Cliente c2 = null;
		for (Cliente cliente : misClientes) {
			if (id == cliente.getId()) {
				c2 = cliente;
				break;
			}
		}
		if (c2==null) {
			System.out.println("No he encontrado el cliente");
		} else {
			misClientes.set(misClientes.indexOf(c2), cl);
		}
	}
	
	@Override
	public void eliminar(Cliente dat) {
		// TODO Auto-generated method stub
		misClientes.remove(dat);
	}

}
