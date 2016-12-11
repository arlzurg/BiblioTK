package util;

import entity.Libro;
import spark.Request;

public class LibroRequestDraw extends Libro {

    private Request request;

    public LibroRequestDraw(Request request) {
        this.request = request;


        //if(this.request.queryParams("id_libro")!=null)
        //    super.setId_libro(Integer.parseInt(this.request.queryParams("id_libro")));
        if(this.request.queryParams("codigo_libro")!=null)
            super.setCodigo_libro(Integer.parseInt(this.request.queryParams("codigo_libro")));

        super.setCodigo_clasificacion(this.request.queryParams("codigo_clasificacion"));

        super.setTitulo(this.request.queryParams("titulo"));

        super.setFormato(this.request.queryParams("formato"));

        super.setISBN(this.request.queryParams("isbn"));

        super.setAutor(this.request.queryParams("autor"));

        super.setPie_imprenta(this.request.queryParams("pie_imprenta"));

        if(this.request.queryParams("paginas")!=null)
            super.setPaginas(Integer.parseInt(this.request.queryParams("paginas")));

        super.setDescripcion(this.request.queryParams("descripcion"));

        super.setIdioma(this.request.queryParams("idioma"));

        if(this.request.queryParams("vistas")!=null)
            super.setVistas(Integer.parseInt(this.request.queryParams("vistas")));
    }
}
