package examen.jpa;

import java.util.List;


import examen.modelo.Libro;

public interface DaoLibro extends GenericDao<Libro, Integer> {
	 public abstract List<Libro> findByUsuarioId(String ctitulo);

	
}
