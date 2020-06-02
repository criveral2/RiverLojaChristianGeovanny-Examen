package examen.jpa;

import java.util.List;


import examen.modelo.Libro;

public interface DaoCapitulo extends GenericDao<Libro, Integer> {
	 public abstract Libro findByTituloCap(String titulo);

	
}
