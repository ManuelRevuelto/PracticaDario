package DAO;

import java.util.List;

import MODEL.Cliente;

public interface IClienteDao {

	List<Cliente> getAll();

	void guardar(Cliente cl);

	void actualizar(int id, Cliente cl);

	void eliminar(Cliente cl);

}
