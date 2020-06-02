package examen.jpa;

import examen.consultas.JPALibro;
import examen.consultas.JPAAutor;

public class JPADAOFactory extends DaoFactory {



	@Override
	public DaoAutor getAutorDAO() {
		return new JPAAutor();
	}

	@Override
	public DaoLibro getLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibro();
	}

	@Override
	public DaoCapitulo getCapituloDAO() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
