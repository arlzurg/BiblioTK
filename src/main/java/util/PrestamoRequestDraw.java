package util;

import entity.Prestamo;
import spark.Request;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PrestamoRequestDraw extends Prestamo {
    private Request request;

    public PrestamoRequestDraw(Request request) throws ParseException {
        this.request = request;

        if (this.request.queryParams("id_prestamo") != null)
            super.setId_prestamo(Integer.parseInt(this.request.queryParams("id_prestamo")));
        super.setCodigo_prestamo(this.request.queryParams("codigo_prestamo"));

        super.setCodigo_existencia(this.request.queryParams("codigo_existencia"));

        super.setCodigo_alumno(this.request.queryParams("codigo_alumno"));

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        if (this.request.queryParams("fecha_devolucion") != null)
            super.setFecha_devolucion(formatter.parse(this.request.queryParams("fecha_devolucion")));

        SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyyy");
        if (this.request.queryParams("fecha_prestamo") != null)
            super.setFecha_devolucion(formatter2.parse(this.request.queryParams("fecha_prestamo")));

    }
}
