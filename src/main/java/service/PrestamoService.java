package service;

import entity.Prestamo;

import java.util.ArrayList;


public interface PrestamoService {
    public abstract int insertarPrestamo(Prestamo prestamo) throws Exception;

    public abstract ArrayList<Prestamo> listarUsuarios(Prestamo prestamo) throws Exception;
}
