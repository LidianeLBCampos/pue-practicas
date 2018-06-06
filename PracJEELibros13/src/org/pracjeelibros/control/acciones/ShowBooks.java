package org.pracjeelibros.control.acciones;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pracjeelibros.dao.CategoriaDao;
import org.pracjeelibros.dao.LibroDao;
import org.pracjeelibros.model.Categoria;
import org.pracjeelibros.model.Libro;

public class ShowBooks extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		List<Libro> libros = new LibroDao().buscarTodos();
		List<Categoria> categorias = new CategoriaDao().buscarTodas();

		request.setAttribute("todos", libros);
		request.setAttribute("todas", categorias);
		
		return PREFIX + "MostrarLibros.jsp";
	}


}