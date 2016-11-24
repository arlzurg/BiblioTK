package dao;

/**
 * Created by Debra on 23/11/2016.
 */
public abstract class FactoryDAO {
    public static final int TXT_FACTORY = 1;
    public static final int MYSQL_FACTORY = 2;

    public abstract UsuarioDAO getUsuarioDAO();
    public abstract PrestamoDAO getPrestamoDAO();
    public abstract LibroDAO getLibroDAO();
    public abstract ExistenciasDAO getExistenciasDAO();



    public static FactoryDAO getFactory(int claveFactory){
        switch(claveFactory){
            case TXT_FACTORY:
                return null;//new TxtFactoryDao();
            case MYSQL_FACTORY:
                return new MySQLFactoryDAO();
            default:
                throw new IllegalArgumentException();
        }
    }
}
