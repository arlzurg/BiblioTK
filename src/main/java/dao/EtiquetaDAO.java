package dao;

import entity.Etiqueta;

import java.util.List;

/**
 * Created by Alejandro on 24/11/2016.
 */
public interface EtiquetaDAO {
    int insertar(Etiqueta etiqueta) throws Exception;
    List<Etiqueta> listar() throws Exception;
    int eliminar(int id) throws Exception;
    List<Etiqueta> buscar(Etiqueta etiqueta) throws Exception;
}
