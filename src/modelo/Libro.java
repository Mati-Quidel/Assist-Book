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
public class Libro {
    private int idLibro;
    private String nivel;
    private int idSala;
    private int idProfesor;

    public Libro(String nuevoNivel, int nuevoIdSala, int nuevoIdProfesor) {
        this.nivel = (nuevoNivel);
        this.idSala = (nuevoIdSala);
        this.idProfesor = (nuevoIdProfesor);
    }

    public Libro(int idLibro, String nivel, int idSala, int idProfesor) {
        this.idLibro = idLibro;
        this.nivel = nivel;
        this.idSala = idSala;
        this.idProfesor = idProfesor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLibro=" + idLibro + ", nivel=" + nivel + ", idSala=" + idSala + ", idProfesor=" + idProfesor + '}';
    }
    
    
    
    
   
                
}
