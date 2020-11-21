package DAO;

import java.util.ArrayList;
import java.util.List;
import MODEL.Cliente;

public class ClienteDao implements DAO<Cliente> {
	
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
	public void actualizar(Cliente dat, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Cliente dat) {
		// TODO Auto-generated method stub
		misClientes.remove(dat);
	}

	
}
