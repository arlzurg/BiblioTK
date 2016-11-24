package service;

import entity.Libro;

import java.util.List;

public interface LibroService {

    public abstract int insertarLibro(Libro libro) throws Exception;

    List<Libro> listarLibro() throws Exception;
    int eliminarLibro(int id_libro)throws Exception;
}
