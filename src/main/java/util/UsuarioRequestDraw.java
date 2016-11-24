package util;

import entity.Usuario;
import spark.Request;

import java.text.ParseException;

public class UsuarioRequestDraw extends Usuario {
    private Request request;

    public UsuarioRequestDraw(Request request) throws ParseException {
        this.request = request;

        if(this.request.queryParams("id_usuario")!=null)
            super.setId_usuario(Integer.parseInt(this.request.queryParams("id_usuario")));
        super.setCodigo_usuario(this.request.queryParams("codigo_usuario"));
        super.setUsername(this.request.queryParams("username"));

        super.setPassword(this.request.queryParams("password"));

        super.setNombres(this.request.queryParams("nombres"));
        super.setEstado(this.request.queryParams("estado"));

        super.setApellido_paterno(this.request.queryParams("apellido_paterno"));

        super.setApellido_materno(this.request.queryParams("apellido_materno"));

        super.setTelefono(Integer.parseInt(this.request.queryParams("telefono")));

        super.setEmail(this.request.queryParams("email"));
    }
}
