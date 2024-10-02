package org.example.MODELOS;

import java.time.LocalDate;

public class Agencia {

    private Long id;
    private String nombreAgencia;
    private String numeroRegistro; // Número de registro de la agencia
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String nacionalidad; // Nacionalidad de la agencia (si aplica)
    private LocalDate fechaFundacion; // Formato: dd/MM/yyyy
    private String tipoServicios; // Ej: Seguros de Vida, Salud, Auto
    private String representanteLegal; // Nombre del representante legal

    public Agencia() {
    }

    public Agencia(Long id, String nombreAgencia, String numeroRegistro, String direccion, String telefono, String correoElectronico, String nacionalidad, LocalDate fechaFundacion, String tipoServicios, String representanteLegal) {
        this.id = id;
        this.nombreAgencia = nombreAgencia;
        this.numeroRegistro = numeroRegistro;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nacionalidad = nacionalidad;
        this.fechaFundacion = fechaFundacion;
        this.tipoServicios = tipoServicios;
        this.representanteLegal = representanteLegal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
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

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getTipoServicios() {
        return tipoServicios;
    }

    public void setTipoServicios(String tipoServicios) {
        this.tipoServicios = tipoServicios;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "id=" + id +
                ", nombreAgencia='" + nombreAgencia + '\'' +
                ", numeroRegistro='" + numeroRegistro + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                ", tipoServicios='" + tipoServicios + '\'' +
                ", representanteLegal='" + representanteLegal + '\'' +
                '}';
    }
}