/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
/**
 *
 * @author Matias
 */
public class Asistencia {
    private int idASISTENCIA;
    private Date fecha;
    private int tipoAsistencia;
    private int idLIBRO;
    private int idCURSO;
    private int idSALA;
    private int idASIGNATURA;
    public Asistencia() {
    }

    public Asistencia(int idASISTENCIA, Date fecha, int tipoAsistencia) {
        this.idASISTENCIA = idASISTENCIA;
        this.fecha = fecha;
        this.tipoAsistencia = tipoAsistencia;
    }

    public int getIdASISTENCIA() {
        return idASISTENCIA;
    }

    public void setIdASISTENCIA(int idASISTENCIA) {
        this.idASISTENCIA = idASISTENCIA;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(int tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    public int getIdLIBRO() {
        return idLIBRO;
    }

    public void setIdLIBRO(int idLIBRO) {
        this.idLIBRO = idLIBRO;
    }

    public int getIdCURSO() {
        return idCURSO;
    }

    public void setIdCURSO(int idCURSO) {
        this.idCURSO = idCURSO;
    }

    public int getIdSALA() {
        return idSALA;
    }

    public void setIdSALA(int idSALA) {
        this.idSALA = idSALA;
    }

    public int getIdASIGNATURA() {
        return idASIGNATURA;
    }

    public void setIdASIGNATURA(int idASIGNATURA) {
        this.idASIGNATURA = idASIGNATURA;
    }
    
}