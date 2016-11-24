package dao;

import entity.Libro;

import java.util.List;

public interface LibroDAO {

	int insertarLibro(Libro libro) throws Exception;
    List<Libro> listarLibro() throws Exception;
    int eliminarLibro(int codigo) throws Exception;

}
