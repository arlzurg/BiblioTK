package dao;

import entity.Prestamo;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Debra on 24/11/2016.
 */
public class PrestamoMySQLFactoryDAO implements PrestamoDAO {
    private Connection connection  = null;
    private Statement stmt = null;

    public PrestamoMySQLFactoryDAO() {
        this.connection = new util.Connection().getConnection();
    }

    @Override
    public ArrayList<Prestamo> listarPrestamos(Prestamo prestamo) throws SQLException {
        Connection connection  = null;
        Statement stmt = null;
        PreparedStatement psmt= null;

        ArrayList<Prestamo> lista = new ArrayList<Prestamo>();

        connection = this.connection;

        return null;

    }

    @Override
    public int insertarPrestamo(Prestamo prestamo) {
        PreparedStatement ps = null;
        int last = 0;

        try {
            ps = this.connection.prepareStatement("INSERT INTO usuario VALUES (NULL ,?,?,?,?,?)"
                    , Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,prestamo.getCodigo_prestamo());
            ps.setString(2,prestamo.getCodigo_existencia());
            ps.setDate(3, new Date(prestamo.getFecha_prestamo().getTime()));
            ps.setDate(4, new Date(prestamo.getFecha_devolucion().getTime()));
            ps.setString(5,prestamo.getCodigo_alumno());

            ps.executeUpdate();




            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                last = rs.getInt(0);
            }
            System.out.println(last);
            prestamo.setId_prestamo(last);





        } catch (SQLException e) {
            e.printStackTrace();
        }


        //psmt = connection.prepareStatement("SELECT * FROM usuario WHERE nombre = ?")

        return last;

    }

}

