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
public class Profesor {
    private int idProfesor;
    private int rutProfe;
    private int nomProfe;

    public Profesor() {
    }

    public Profesor(int nuevoRutProfe, int nuevoNomProfe) {
        this.rutProfe = nuevoRutProfe;
        this.nomProfe = nuevoNomProfe;
    }

    public Profesor(int idProfesor, int rutProfe, int nomProfe) {
        this.idProfesor = idProfesor;
        this.rutProfe = rutProfe;
        this.nomProfe = nomProfe;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getRutProfe() {
        return rutProfe;
    }

    public void setRutProfe(int rutProfe) {
        this.rutProfe = rutProfe;
    }

    public int getNomProfe() {
        return nomProfe;
    }

    public void setNomProfe(int nomProfe) {
        this.nomProfe = nomProfe;
    }

    @Override
    public String toString() {
        return "Profesor{" + "idProfesor=" + idProfesor + ", rutProfe=" + rutProfe + ", nomProfe=" + nomProfe + '}';
    }
    

}            
