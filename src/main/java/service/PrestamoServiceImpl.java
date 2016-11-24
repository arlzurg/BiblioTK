package service;

import dao.FactoryDAO;
import dao.PrestamoDAO;
import entity.Prestamo;

import java.util.ArrayList;


public class PrestamoServiceImpl implements PrestamoService{
    FactoryDAO factory = FactoryDAO.getFactory(FactoryDAO.MYSQL_FACTORY);
    PrestamoDAO prestamoDAO = factory.getPrestamoDAO();


    @Override
    public int insertarPrestamo(Prestamo prestamo) throws Exception {
        return prestamoDAO.insertarPrestamo(prestamo);
    }

    @Override
    public ArrayList<Prestamo> listarUsuarios(Prestamo prestamo) throws Exception {
        return prestamoDAO.listarPrestamos(prestamo);
    }
}
