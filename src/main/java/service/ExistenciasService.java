package service;

import entity.Existencias;

import java.util.List;

public interface ExistenciasService {

    public abstract int insertarExistencias(Existencias existencias) throws Exception;

    public abstract List<Existencias> listarExistencias(Existencias existencias) throws Exception;
}