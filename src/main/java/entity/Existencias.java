package entity;

public class Existencias{
	int Id_Existencias;
	String Codigo_libro;
	String Codigo_existencia;
	String Ubicacion;
	String Estado;
	String Tipo_prestamo;

	public int getId_Existencias() {
		return Id_Existencias;
	}

	public void setId_Existencias(int id_Existencias) {
		Id_Existencias = id_Existencias;
	}

	public String getCodigo_libro() {
		return Codigo_libro;
	}

	public void setCodigo_libro(String codigo_libro) {
		Codigo_libro = codigo_libro;
	}

	public String getCodigo_existencia() {
		return Codigo_existencia;
	}

	public void setCodigo_existencia(String codigo_existencia) {
		Codigo_existencia = codigo_existencia;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getTipo_prestamo() {
		return Tipo_prestamo;
	}

	public void setTipo_prestamo(String tipo_prestamo) {
		Tipo_prestamo = tipo_prestamo;
	}
}