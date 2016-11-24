package dao;

import entity.Etiqueta_libro;

import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Alejandro on 24/11/2016.
 */
public class Etiqueta_libroMySQLFactoryDAO implements Etiqueta_libroDAO {
    private Connection connection = null;
    private Statement stmt = null;

    public Etiqueta_libroMySQLFactoryDAO() {
        this.connection = new util.Connection().getConnection();
    }

    @Override
    public int insertar(Etiqueta_libro etiqueta_libro) throws Exception {
        PreparedStatement ps =null;
        int last = 0;
        try {
            ps = this.connection.prepareStatement("INSERT INTO etiqueta_libro VALUES (NULL,?,?)",Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,etiqueta_libro.getCodigo_libro());
            ps.setString(2,etiqueta_libro.getCodigo_etiqueta());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                    last= rs.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return last;
    }

    @Override
    public List<Etiqueta_libro> buscar(Etiqueta_libro etiqueta_libro) throws Exception {
        Connection connection = null;
        PreparedStatement ps =null;
        ArrayList<Etiqueta_libro> lista =new ArrayList<Etiqueta_libro>();
        try {
            connection=this.connection;
            String sql = "SELECT * FROM etiqueta_libro";
            ArrayList<String> params = new ArrayList<String>();
            HashMap<String,String> map = new HashMap<String,String>();

            if(etiqueta_libro.getCodigo_libro()!=null){
                map.put("codigo_libro",etiqueta_libro.getCodigo_libro());
            }
            if(etiqueta_libro.getCodigo_etiqueta()!=null){
                map.put("codigo_etiqueta",etiqueta_libro.getCodigo_etiqueta());
            }

            for (String param : map.keySet()){
                if(param.contains("id")){
                    params.add(param+" = ? ");
                }else {
                    params.add(param+" LIKE ? ");
                }
            }
            String[] arrParams = new String[params.size()];
            arrParams = params.toArray(arrParams);
            if(arrParams.length>0){
                sql += " WHERE ";
                sql += String.join(" AND ",arrParams);
            }

            sql +=" ORDER BY id_etiqueta_libro ASC";
            System.out.printf(sql);
            ps=connection.prepareStatement(sql);

            if (arrParams.length > 0) {
                int index = 1;
                for (Map.Entry<String, String> entry  : map.entrySet()) {
                    if(entry.getKey().contains("id")){
                        ps.setString(index, entry.getValue());
                    }else{
                        ps.setString(index, "%" + entry.getValue() + "%");
                    }
                    index++;
                }
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Etiqueta_libro s = new Etiqueta_libro();
                s.setId_etiqueta_libro(rs.getInt("id_etiqueta_libro"));
                s.setCodigo_libro(rs.getString("codigo_libro"));
                s.setCodigo_etiqueta(rs.getString("codigo_etiqueta"));

                lista.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            return lista;
        }
    }

    @Override
    public int eliminar(Etiqueta_libro etiqueta_libro) throws Exception {
        PreparedStatement ps = null;
        int valor;
        try {
            ps = this.connection.prepareStatement("DELETE FROM etiqueta_libro WHERE id_etiqueta_libro = ?");
            ps.setInt(1, etiqueta_libro.getId_etiqueta_libro());
            valor = ps.executeUpdate();

            if (valor > 0) {
                return valor;
            } else return 0;

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
