package examen.jpa;


import examen.modelo.Autor;

public interface DaoAutor extends GenericDao<Autor, String> {
	public abstract Autor findUsuario(String correo, String contrasenia);
	public abstract Autor findByAutor(String autor);
}
