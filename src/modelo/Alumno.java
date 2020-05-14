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
public class Alumno {
    private int idAlumno;
    private int rutAlumno;
    private String dv;
    private String nombreAlumno;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    private String genero;
    private int idMatricula;
    private int idColegio;
    private int idComuna;
    private int idGenero;
    private int idCurso;
    private int idSala;
    private int idLibro;
  //Constructor sin parametros.
    public Alumno(){
    
    }
  //Constructor con parametros
    public Alumno(int nuevoRutAlumno, String nuevoNombreAlumno, String nuevoApellidoPaterno, String nuevoApellidoMaterno, Date nuevaFechaNacimiento, String nuevoGenero) {
    
        this.rutAlumno = nuevoRutAlumno;
        this.nombreAlumno = nuevoNombreAlumno;
        this.apellidoPaterno = nuevoApellidoPaterno;
        this.apellidoMaterno = nuevoApellidoMaterno;
        this.fechaNacimiento = nuevaFechaNacimiento;
        this.genero = nuevoGenero;
    }
  // Construtor con parametros desde BD
    public Alumno(int idAlumno, int rutAlumno, String dv, String nombreAlumno, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String genero, int idMatricula, int idColegio, int idComuna, int idGenero, int idCurso, int idSala, int idLibro) {
        this.idAlumno = idAlumno;
        this.rutAlumno = rutAlumno;
        this.dv = dv;
        this.nombreAlumno = nombreAlumno;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.idMatricula = idMatricula;
        this.idColegio = idColegio;
        this.idComuna = idComuna;
        this.idGenero = idGenero;
        this.idCurso = idCurso;
        this.idSala = idSala;
        this.idLibro = idLibro;
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

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public int getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    
}
    
           
