package dao;


public class MySQLFactoryDAO extends FactoryDAO {

    @Override
    public UsuarioDAO getUsuarioDAO() {
        return  new UsuarioMySQLFactoryDAO();
    }

    @Override
    public PrestamoDAO getPrestamoDAO() {
        return new PrestamoMySQLFactoryDAO();
    }

    @Override
    public LibroDAO getLibroDAO() {
        return new LibroMySQLFactoryDAO();
    }

    @Override
    public ExistenciasDAO getExistenciasDAO() {
        return new ExistenciasMySQLFactoryDAO();
    }
}
