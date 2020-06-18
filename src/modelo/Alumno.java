/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author Matias
 */
public class Alumno {
    private int idAlumno;
    private int rutAlumno;
    private String nomAlumno;
    private int idGenero;
    private int idCredencial;
    private int idMatricula;

    public Alumno() {
    }

    public Alumno( int nuevoRutAlumno, String nuevoNomAlumno, int nuevoIdGenero, int nuevoIdCredencial, int nuevoIdMatricula) {
        this.rutAlumno = (nuevoRutAlumno);
        this.nomAlumno = (nuevoNomAlumno);
        this.idGenero = (nuevoIdGenero);
        this.idCredencial = (nuevoIdCredencial);
        this.idMatricula = (nuevoIdMatricula);
    }

    public Alumno(int idAlumno, int rutAlumno, String nomAlumno, int idGenero, int idCredencial, int idMatricula) {
        this.idAlumno = idAlumno;
        this.rutAlumno = rutAlumno;
        this.nomAlumno = nomAlumno;
        this.idGenero = idGenero;
        this.idCredencial = idCredencial;
        this.idMatricula = idMatricula;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getRutAlumno() {
        return rutAlumno;
    }

    public void setRutAlumno(int rutAlumno) {
        this.rutAlumno = rutAlumno;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdCredencial() {
        return idCredencial;
    }

    public void setIdCredencial(int idCredencial) {
        this.idCredencial = idCredencial;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", rutAlumno=" + rutAlumno + ", nomAlumno=" + nomAlumno + ", idGenero=" + idGenero + ", idCredencial=" + idCredencial + ", idMatricula=" + idMatricula + '}';
    }
    
    
    
    
   
}
    