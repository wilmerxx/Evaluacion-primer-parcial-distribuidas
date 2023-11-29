package wmscevaluacion.wmscevaluacion1.wmscControladores;

public class Paciente {
    private String identificacion;
    private String nombre;
    private String ciudad;
    private boolean tieneEnfermedadCronica;
    private String direccion;

    // Constructor para inicializar los atributos del paciente
    public Paciente(String identificacion, String nombre, String ciudad, boolean tieneEnfermedadCronica, String direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.tieneEnfermedadCronica = tieneEnfermedadCronica;
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isTieneEnfermedadCronica() {
        return tieneEnfermedadCronica;
    }

    public void setTieneEnfermedadCronica(boolean tieneEnfermedadCronica) {
        this.tieneEnfermedadCronica = tieneEnfermedadCronica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", tieneEnfermedadCronica=" + tieneEnfermedadCronica +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
