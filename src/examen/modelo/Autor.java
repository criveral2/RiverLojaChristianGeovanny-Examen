package examen.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor implements Serializable{

	private static long serialVersionUiD = 1L;
	
	@Id
	private String cedula;
	
	
	
}
