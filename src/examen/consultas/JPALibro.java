package examen.consultas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import examen.jpa.DaoFactory;
import examen.jpa.DaoLibro;
import examen.modelo.Libro;

public class JPALibro extends JPAGenericDao<Libro, Integer> implements DaoLibro {

	public JPALibro() {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Libro> findByUsuarioId(String autor) {
		String jpql = "FROM Libro l WHERE l.capitulos = '" + autor + "'";
        List<Libro> libros = (List<Libro>) persistenciamanager.createQuery(jpql).getResultList();
        return libros;
	}


}
