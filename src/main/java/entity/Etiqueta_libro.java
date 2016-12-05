package entity;

/**
 * Created by Alejandro on 24/11/2016.
 */
public class Etiqueta_libro {
    int id_etiqueta_libro;
    String codigo_libro;
    String codigo_etiqueta;

    public int getId_etiqueta_libro() {
        return id_etiqueta_libro;
    }

    public void setId_etiqueta_libro(int id_etiqueta_libro) {
        this.id_etiqueta_libro = id_etiqueta_libro;
    }

    public String getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(String codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public String getCodigo_etiqueta() {
        return codigo_etiqueta;
    }

    public void setCodigo_etiqueta(String codigo_etiqueta) {
        this.codigo_etiqueta = codigo_etiqueta;
    }
}
