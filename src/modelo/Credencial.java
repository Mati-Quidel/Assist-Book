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
public class Credencial {
    private int idCredencial;
    private int idAlumno;
    private int idColegio;
    private int idComuna;

    public Credencial() {
    }

    public Credencial(int idCredencial, int idAlumno, int idColegio, int idComuna) {
        this.idCredencial = idCredencial;
        this.idAlumno = idAlumno;
        this.idColegio = idColegio;
        this.idComuna = idComuna;
    }

    public int getIdCredencial() {
        return idCredencial;
    }

    public void setIdCredencial(int idCredencial) {
        this.idCredencial = idCredencial;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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
 
}
