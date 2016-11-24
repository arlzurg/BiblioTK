package entity;

import java.util.Date;

public class Prestamo {
    int id_prestamo;
    String codigo_prestamo;
    String codigo_existencia;
    String codigo_alumno;
    Date fecha_prestamo;
    Date fecha_devolucion;

    public Prestamo() {
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public String getCodigo_prestamo() {
        return codigo_prestamo;
    }

    public void setCodigo_prestamo(String codigo_prestamo) {
        this.codigo_prestamo = codigo_prestamo;
    }

    public String getCodigo_existencia() {
        return codigo_existencia;
    }

    public void setCodigo_existencia(String codigo_existencia) {
        this.codigo_existencia = codigo_existencia;
    }

    public String getCodigo_alumno() {
        return codigo_alumno;
    }

    public void setCodigo_alumno(String codigo_alumno) {
        this.codigo_alumno = codigo_alumno;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }
}
