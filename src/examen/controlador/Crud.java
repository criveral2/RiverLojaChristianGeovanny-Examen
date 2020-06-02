package examen.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.ParseInfo;



/**
 * Servlet implementation class EliminarTel
 */
@WebServlet("/Crud")
public class Crud extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Crud() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/**
		 * Recuperamos los metodos recibidos por el formulario de registros utilizamos el metodo request
		 * 	
		 */
		
		
		System.out.println("entro al servlet");
		String editar = request.getParameter("EditTel");
		String eliminar = request.getParameter("ElimTel");
		String agregarTel = request.getParameter("agregarTel");
		String url = "";
		
		
		   /**
	         * Referenciamos a nuestro metodo el cual nos permitira utiliza el query para modificar
	         * el telefono
	         * 
	         * Creamos un if y dependiendo del parametro que llegue por el metodo get 
	         * empleara la seccion de codigo dependiendo de su funcionalidad\
	         * en cada seccion envia como parametro los valores optenidos de las etiquetas y las
	         * envia a las respectivas peticiones (querys)
	         * una vez realizadas el valor obtenido de las consultas son enviadas como respuestas a las diferentes paginas
	         */
	        
		 
		 

				if(agregarTel != null) {
					System.out.println("Entraste a agregar");
					System.out.println(agregarTel);
					request.setAttribute("cedula", agregarTel);
					getServletContext().getRequestDispatcher("/RiveraLojaChristianGeovanny-Examen/AgregarLibro.jsp").forward(request, response);
				}else {
					response.sendRedirect("/Listar");
				}
			
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
