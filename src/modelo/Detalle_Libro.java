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
    private int idLibro;
    private int idAlumno;
    private int idAsignatura;
    private int idTipoAsis;
    
    

    public Detalle_Libro() {
    }

    public Detalle_Libro( Date nuevaFechaAsis,int nuevoIdLibro,int nuevoIdAlumno, int nuevoIdAsignatura, int nuevoIdTipoAsis ) {
        this.fechaAsis = (nuevaFechaAsis);
        this.idLibro = (nuevoIdLibro);
        this.idAlumno=(nuevoIdAlumno);
        this.idAsignatura = (nuevoIdAsignatura);
        this.idTipoAsis = (nuevoIdTipoAsis);
        
        
    }

    public Detalle_Libro(int idDetalle, Date fechaAsis, int idLibro, int idAlumno, int idAsignatura, int idTipoAsis) {
        this.idDetalle = idDetalle;
        this.fechaAsis = fechaAsis;
        this.idLibro = idLibro;
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.idTipoAsis = idTipoAsis;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Date getFechaAsis() {
        return fechaAsis;
    }

    public void setFechaAsis(Date fechaAsis) {
        this.fechaAsis = fechaAsis;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getIdTipoAsis() {
        return idTipoAsis;
    }

    public void setIdTipoAsis(int idTipoAsis) {
        this.idTipoAsis = idTipoAsis;
    }

    @Override
    public String toString() {
        return "Detalle_Libro{" + "idDetalle=" + idDetalle + ", fechaAsis=" + fechaAsis + ", idLibro=" + idLibro + ", idAlumno=" + idAlumno + ", idAsignatura=" + idAsignatura + ", idTipoAsis=" + idTipoAsis + '}';
    }
    
    

   
}


