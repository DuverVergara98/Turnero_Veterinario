package com.veterinaria.turnero.model;

public class Turno {
    private Integer idTurno;
    private String codigoTurno;
    private Integer idMascota;
    private Integer idPrioridad;
    private Integer idMedico;
    private String estado;

    public Turno() {}

    public Turno(Integer idTurno, String codigoTurno, Integer idMascota, Integer idPrioridad, Integer idMedico, String estado) {
        this.idTurno = idTurno;
        this.codigoTurno = codigoTurno;
        this.idMascota = idMascota;
        this.idPrioridad = idPrioridad;
        this.idMedico = idMedico;
        this.estado = estado;
    }

    public Integer getIdTurno() { return idTurno; }
    public void setIdTurno(Integer idTurno) { this.idTurno = idTurno; }

    public String getCodigoTurno() { return codigoTurno; }
    public void setCodigoTurno(String codigoTurno) { this.codigoTurno = codigoTurno; }

    public Integer getIdMascota() { return idMascota; }
    public void setIdMascota(Integer idMascota) { this.idMascota = idMascota; }

    public Integer getIdPrioridad() { return idPrioridad; }
    public void setIdPrioridad(Integer idPrioridad) { this.idPrioridad = idPrioridad; }

    public Integer getIdMedico() { return idMedico; }
    public void setIdMedico(Integer idMedico) { this.idMedico = idMedico; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
