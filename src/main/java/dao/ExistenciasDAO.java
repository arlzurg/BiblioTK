package dao;

import entity.Existencias;

import java.util.List;

public interface ExistenciasDAO {

    int insertarExistencias(Existencias existencias) throws Exception;

    List<Existencias> listarExistencias(Existencias existencias) throws Exception;

    int eliminarExistencias(int id_existencia) throws Exception;


}