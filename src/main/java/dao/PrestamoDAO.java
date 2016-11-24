package dao;

import entity.Prestamo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Debra on 24/11/2016.
 */
public interface PrestamoDAO {
    ArrayList<Prestamo> listarPrestamos(Prestamo prestamo) throws SQLException;
    int insertarPrestamo(Prestamo prestamo);
}
