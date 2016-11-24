package service;

import dao.ExistenciasDAO;
import dao.FactoryDAO;
import entity.Existencias;

import java.util.List;

/**
 * Created by Debra on 24/11/2016.
 */
public class ExistenciasServiceImpl implements ExistenciasService {
    FactoryDAO factory = FactoryDAO.getFactory(FactoryDAO.MYSQL_FACTORY);
    ExistenciasDAO existenciasDAO = factory.getExistenciasDAO();


    @Override
    public int insertarExistencias(Existencias existencias) throws Exception {
        return existenciasDAO.insertarExistencias(existencias);
    }

    @Override
    public List<Existencias> listarExistencias(Existencias existencias) throws Exception {
        return existenciasDAO.listarExistencias(existencias);
    }
}
