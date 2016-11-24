package util;

import entity.Existencias;
import spark.Request;

public class ExistenciasRequestDraw extends Existencias {
	
	private Request request;

    public ExistenciasRequestDraw(Request request) {
        this.request = request;

        if(this.request.queryParams("id_existencias")!=null)
            super.setId_Existencias(Integer.parseInt(this.request.queryParams("id_existencias")));

        super.setCodigo_libro(this.request.queryParams("codigo_libro"));

        super.setCodigo_existencia(this.request.queryParams("codigo_existencia"));
        
        super.setUbicacion(this.request.queryParams("ubicacion"));

        super.setEstado(this.request.queryParams("estado"));
        
        super.setTipo_prestamo(this.request.queryParams("tipo_prestamo"));

    }
}
