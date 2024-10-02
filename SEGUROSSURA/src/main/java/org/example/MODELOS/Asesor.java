package org.example.MODELOS;

import java.time.LocalDate;

public class Asesor {

    private Long id;
    private String nombreCompleto;
    private String numeroIdentificacion;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String nacionalidad;
    private LocalDate fechaContratacion; // Formato: dd/MM/yyyy
    private String puesto; // Ej: Asesor de Seguros
    private String departamento; // Ej: Ventas
    private String experiencia; // Años de experiencia


    public Asesor() {
    }

    public Asesor(Long id, String nombreCompleto, String numeroIdentificacion, String direccion, String telefono, String correoElectronico, String nacionalidad, LocalDate fechaContratacion, String puesto, String departamento, String experiencia) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.numeroIdentificacion = numeroIdentificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nacionalidad = nacionalidad;
        this.fechaContratacion = fechaContratacion;
        this.puesto = puesto;
        this.departamento = departamento;
        this.experiencia = experiencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Asesor{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", puesto='" + puesto + '\'' +
                ", departamento='" + departamento + '\'' +
                ", experiencia='" + experiencia + '\'' +
                '}';
    }
}