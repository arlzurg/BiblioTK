package dao;

import entity.Etiqueta_libro;

import java.util.List;

/**
 * Created by Alejandro on 24/11/2016.
 */
public interface Etiqueta_libroDAO {
    int insertar(Etiqueta_libro etiqueta_libro) throws Exception;
    List<Etiqueta_libro> buscar(Etiqueta_libro etiqueta_libro) throws Exception;
    int eliminar(Etiqueta_libro etiqueta_libro) throws Exception;
}
