package entity;

/**
 * Created by Alejandro on 24/11/2016.
 */
public class Etiqueta {
    int id_etiqueta;
    String codigo_etiqueta;
    String nombre;

    public int getId_etiqueta() {
        return id_etiqueta;
    }

    public void setId_etiqueta(int id_etiqueta) {
        this.id_etiqueta = id_etiqueta;
    }

    public String getCodigo_etiqueta() {
        return codigo_etiqueta;
    }

    public void setCodigo_etiqueta(String codigo_etiqueta) {
        this.codigo_etiqueta = codigo_etiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
