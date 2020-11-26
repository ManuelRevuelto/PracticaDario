package DAO;

import java.util.ArrayList;
import java.util.List;
import MODEL.Cliente;

public class ClienteDao implements IClienteDao {
	List<Cliente> misClientes = new ArrayList<Cliente>();

	public ClienteDao(List<Cliente> misClientes) {
		this.misClientes = misClientes;
	}

	@Override
	public List<Cliente> getAll() {
		return misClientes;
	}

	@Override
	public void guardar(Cliente dat) {
		misClientes.add(dat);
	}

	@Override
	public void actualizar(int id, Cliente cl) {
		Cliente c2 = null;
		for (Cliente cliente : misClientes) {
			if (id == cliente.getId()) {
				c2 = cliente;
				break;
			}
		}
		if (c2 == null) {
			System.out.println("No he encontrado el cliente");
		} else {
			misClientes.set(misClientes.indexOf(c2), cl);
			System.out.println("El cliente ha sido actualizado con exito");
		}
	}

	@Override
	public void eliminar(Cliente dat) {
		misClientes.remove(dat);
	}
}
