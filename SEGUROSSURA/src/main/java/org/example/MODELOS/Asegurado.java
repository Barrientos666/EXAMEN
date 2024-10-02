package org.example.MODELOS;

public class Asegurado {

    // Datos Personales
    private Long id;
    private String nombres;
    private String apellido;
    private String numeroIdentificacion;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String nacionalidad;
    private String ocupacion; // Ej: Agente de seguros, Asesor de ventas
    private String departamento; // Ej: Ventas, Atención al Cliente
    private String estadoCivil;

    public Asegurado() {
    }

    public Asegurado(Long id, String nombres, String apellido, String numeroIdentificacion, String direccion, String telefono, String correoElectronico, String nacionalidad, String ocupacion, String departamento, String estadoCivil) {
        this.id = id;
        this.nombres = nombres;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nacionalidad = nacionalidad;
        this.ocupacion = ocupacion;
        this.departamento = departamento;
        this.estadoCivil = estadoCivil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", departamento='" + departamento + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}







