package dao;

import entity.Usuario;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Debra on 23/11/2016.
 */
public interface UsuarioDAO {
    Usuario buscarUsuario(String username);

    ArrayList<Usuario> listarUsuarios(Usuario usuario) throws SQLException;
    int insertarUsuario(Usuario usuario);
    void modificarUsuario(Usuario usuario);
    boolean validarUsuario(String username, String password);
}
