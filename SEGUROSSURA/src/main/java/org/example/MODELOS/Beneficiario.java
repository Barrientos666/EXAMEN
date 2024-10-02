package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {

    private Long id;
    private String nombres;
    private String apellidos;
    private String numeroIdentificacion;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private LocalDate fechaNacimiento; // Formato: dd/MM/yyyy
    private String relacionConAsegurado; // Ej: Cónyuge, Hijo, Padre

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombres, String apellidos, String numeroIdentificacion, String direccion, String telefono, String correoElectronico, LocalDate fechaNacimiento, String relacionConAsegurado) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.relacionConAsegurado = relacionConAsegurado;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRelacionConAsegurado() {
        return relacionConAsegurado;
    }

    public void setRelacionConAsegurado(String relacionConAsegurado) {
        this.relacionConAsegurado = relacionConAsegurado;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", relacionConAsegurado='" + relacionConAsegurado + '\'' +
                '}';
    }
}
