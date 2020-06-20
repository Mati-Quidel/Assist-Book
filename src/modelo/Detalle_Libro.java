/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Matias
 */
public class Detalle_Libro {
    private int idDetalle;
    private Date fechaAsis;
    private int idAlumno;
    private int idTipoAsis;
    private int idProfesor;
    private int idAsignatura;
    private int idLibro;

    public Detalle_Libro() {
    }

    public Detalle_Libro(int nuevoIdAlumno, Date nuevaFechaAsis, int nuevoIdTipoAsis, int nuevoIdProfesor, int nuevoIdAsignatura, int nuevoIdLibro) {
        this.idAlumno = nuevoIdAlumno;
        this.fechaAsis = nuevaFechaAsis;
        this.idTipoAsis = nuevoIdTipoAsis;
        this.idProfesor = nuevoIdProfesor;
        this.idAsignatura = nuevoIdAsignatura;
        this.idLibro = nuevoIdLibro;
    }

    public Detalle_Libro(int idDetalle, Date fechaAsis, int idAlumno, int idTipoAsis, int idProfesor, int idAsignatura, int idLibro) {
        this.idDetalle = idDetalle;
        this.fechaAsis = fechaAsis;
        this.idAlumno = idAlumno;
        this.idTipoAsis = idTipoAsis;
        this.idProfesor = idProfesor;
        this.idAsignatura = idAsignatura;
        this.idLibro = idLibro;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }
    public int getIdAlumno() {
        return idAlumno;
    }

    public Date getFechaAsis() {
        return fechaAsis;
    }

    public Date setFechaAsis(Date fechaAsis) {
        this.fechaAsis = fechaAsis;
        return fechaAsis;
    }


    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdTipoAsis() {
        return idTipoAsis;
    }

    public void setIdTipoAsis(int idTipoAsis) {
        this.idTipoAsis = idTipoAsis;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    @Override
    public String toString() {
        return "Detalle_Libro{" + "idDetalle=" + idDetalle + ", fechaAsis=" + fechaAsis + ", idAlumno=" + idAlumno + ", idTipoAsis=" + idTipoAsis + ", idProfesor=" + idProfesor + ", idAsignatura=" + idAsignatura + ", idLibro=" + idLibro + '}';
    }
}


