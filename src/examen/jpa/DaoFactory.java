package examen.jpa;

public abstract class DaoFactory {
	protected static DaoFactory factory = new JPADAOFactory();

	public static DaoFactory getFactory() {
		return factory;
	}



	public abstract DaoAutor getAutorDAO();
	public abstract DaoLibro getLibroDAO();
	public abstract DaoCapitulo getCapituloDAO();

	

}
