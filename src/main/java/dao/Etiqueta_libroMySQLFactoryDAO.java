package dao;

import entity.Etiqueta_libro;

import java.util.List;

/**
 * Created by Alejandro on 24/11/2016.
 */
public class Etiqueta_libroMySQLFactoryDAO implements Etiqueta_libroDAO {
    @Override
    public int insertar(Etiqueta_libro etiqueta_libro) throws Exception {
        return 0;
    }

    @Override
    public List<Etiqueta_libro> buscar(Etiqueta_libro etiqueta_libro) throws Exception {
        return null;
    }

    @Override
    public int eliminar(Etiqueta_libro etiqueta_libro) throws Exception {
        return 0;
    }
}
