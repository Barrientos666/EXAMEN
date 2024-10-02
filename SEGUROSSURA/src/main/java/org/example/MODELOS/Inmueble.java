package org.example.MODELOS;

public class Inmueble {

    private Long id;
    private String direccion;
    private String tipoInmueble; // Ej: Casa, Apartamento, Local Comercial
    private String numeroRegistro; // Número de registro o escritura
    private double valorComercial; // Valor del inmueble
    private double area; // Área en metros cuadrados
    private int anioConstruccion; // Año de construcción
    private String propietario; // Nombre del propietario
    private String estado; // Estado del inmueble (Ej: Nuevo, Usado, En Renovación)

    public Inmueble() {
    }

    public Inmueble(Long id, String direccion, String tipoInmueble, String numeroRegistro, double valorComercial, double area, int anioConstruccion, String propietario, String estado) {
        this.id = id;
        this.direccion = direccion;
        this.tipoInmueble = tipoInmueble;
        this.numeroRegistro = numeroRegistro;
        this.valorComercial = valorComercial;
        this.area = area;
        this.anioConstruccion = anioConstruccion;
        this.propietario = propietario;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", tipoInmueble='" + tipoInmueble + '\'' +
                ", numeroRegistro='" + numeroRegistro + '\'' +
                ", valorComercial=" + valorComercial +
                ", area=" + area +
                ", anioConstruccion=" + anioConstruccion +
                ", propietario='" + propietario + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

