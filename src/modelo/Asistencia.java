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
    private int idAsistencia;
    private Date fecha;
    private int tipoAsistencia;

    public Asistencia() {
    }

    public Asistencia(int idAsistencia, Date fecha, int tipoAsistencia) {
        this.idAsistencia = idAsistencia;
        this.fecha = fecha;
        this.tipoAsistencia = tipoAsistencia;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
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
   
}
