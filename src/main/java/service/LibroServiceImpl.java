package service;

import dao.FactoryDAO;
import dao.LibroDAO;
import entity.Libro;

import java.util.List;


public class LibroServiceImpl implements  LibroService {
    FactoryDAO factory = FactoryDAO.getFactory(FactoryDAO.MYSQL_FACTORY);
    LibroDAO libroDAO = factory.getLibroDAO();
    @Override
    public int insertarLibro(Libro libro) throws Exception {
        return libroDAO.insertarLibro(libro);
    }

    @Override
    public List<Libro> listarLibro() throws Exception {
        return libroDAO.listarLibro();
    }


    @Override
    public int eliminarLibro(int id_libro) throws Exception {
        return libroDAO.eliminarLibro(id_libro);
    }
}
