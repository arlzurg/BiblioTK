package entity;

public class Libro {

	int id_libro;
	String Codigo_clasificacion;
	String Titulo;
	String Formato;
	String ISBN;
	String Autor;
	String Pie_imprenta;
	int Paginas;
	String Descripcion;
	String Idioma;
	int Vistas;
	
	public int getCodigo_libro() {
		return id_libro;
	}
	public void setCodigo_libro(int codigo_libro) {
		id_libro = codigo_libro;
	}
	public String getCodigo_clasificacion() {
		return Codigo_clasificacion;
	}
	public void setCodigo_clasificacion(String codigo_clasificacion) {
		Codigo_clasificacion = codigo_clasificacion;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getFormato() {
		return Formato;
	}
	public void setFormato(String formato) {
		Formato = formato;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getPie_imprenta() {
		return Pie_imprenta;
	}
	public void setPie_imprenta(String pie_imprenta) {
		Pie_imprenta = pie_imprenta;
	}
	public int getPaginas() {
		return Paginas;
	}
	public void setPaginas(int paginas) {
		Paginas = paginas;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getIdioma() {
		return Idioma;
	}
	public void setIdioma(String idioma) {
		Idioma = idioma;
	}
	public int getVistas() {
		return Vistas;
	}
	public void setVistas(int vistas) {
		Vistas = vistas;
	}
}
