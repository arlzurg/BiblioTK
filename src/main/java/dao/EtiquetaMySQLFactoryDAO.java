package dao;

import entity.Etiqueta;

import java.util.List;

/**
 * Created by Alejandro on 24/11/2016.
 */
public class EtiquetaMySQLFactoryDAO implements EtiquetaDAO {
    @Override
    public int insertar(Etiqueta etiqueta) throws Exception {
        return 0;
    }

    @Override
    public List<Etiqueta> listar() throws Exception {
        return null;
    }

    @Override
    public int eliminar(int id) throws Exception {
        return 0;
    }

    @Override
    public List<Etiqueta> buscar(Etiqueta etiqueta) throws Exception {
        return null;
    }
}
