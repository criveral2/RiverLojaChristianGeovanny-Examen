package examen.consultas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import examen.jpa.DaoCapitulo;
import examen.modelo.Autor;
import examen.modelo.Libro;



public class JPACapitulo extends JPAGenericDao<Libro, String> implements DaoCapitulo {

	public JPACapitulo(Class<Libro> persisten) {
		super(persisten);,
		// TODO Auto-generated constructor stub
	}


	@Override
	public Libro findByTituloCap(String titulo) {
		String sql = "FROM Libro l, Capitulo c WHERE c.titulo = '" + titulo + "'";
       Libro libros = (Libro) persistenciamanager.createQuery(sql).getResultList();
        return libros;
	}
	


	
	/**	
	

	@Override
	public Usuario findUsuario(String correo, String contrasenia) {
		String sql = "FROM Usuario u WHERE u.correo = '" + correo + "' AND u.contrasenia = '" + contrasenia+"'";
        Usuario user = (Usuario) persistenciamanager.createQuery(sql).getSingleResult();
        user.getTelefono().size();
    
        return user;
	}

	@Override
	public Usuario findBycorreo(String correo) {
		Usuario users = null;   
        String jpql = "FROM Usuario u WHERE u.cedula = '" + correo + "' OR u.correo = '" + correo + "'";
        users =  (Usuario) persistenciamanager.createQuery(jpql).getSingleResult();
    return users;
	}
	
	
	
	


	//---------------------------------------------------------------------------------------

	@Override
	public Usuario findBycorreo(String correo) {
		// TODO Auto-generated method stub
		Usuario usu = null;
		ResultSet rs = conexionUno.query("SELECT * FROM usuario WHERE usu_correo = '" + correo + "';");
		try {
			if (rs != null && rs.next()) {
				usu = new Usuario(rs.getString("usu_cedula"), rs.getString("usu_nombre"), rs.getString("usu_apellido"),
						rs.getNString("usu_correo"), rs.getNString("usu_pass"));
				List<Telefono> telefono = DaoFactory.getFactory().getTelefonoDAO().findByUsuarioId(usu.getCedula());
				usu.setTelefono(telefono);
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUserDAO:findById): " + e.getMessage());
		}
		return usu;
	}
	
	
	**/
	//----------------------------------------------------------------------------------------



}