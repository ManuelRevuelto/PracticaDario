package DAO;

import java.util.List;

public interface DAO<Datos> {

	List<Datos> getAll();

	void guardar(Datos dat);

	void actualizar(Datos dat, String[] params);

	void eliminar(Datos dat);

}
