package org.pracjeelibros.control.acciones;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pracjeelibros.dao.LibroDao;
import org.pracjeelibros.model.Libro;

public class DeleteBook extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		String isbn = request.getParameter("isbn");
		Libro libro = new Libro();
		libro.setIsbn(isbn);
		
		LibroDao libroDao = new LibroDao();
		libroDao.borrar(libro);
		
		return "showBooks.do";
	}

}
