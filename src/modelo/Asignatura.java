/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aliss
 */
public class Asignatura {
    private int idAsignatura;
    private String nomAsignatura;

    public Asignatura() {
    }

    public Asignatura(String nuevoNomAsignatura) {
        this.nomAsignatura = nuevoNomAsignatura;
    }

    public Asignatura(int idAsignatura, String nomAsignatura) {
        this.idAsignatura = idAsignatura;
        this.nomAsignatura = nomAsignatura;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }
    
    

    @Override
    public String toString() {
        return "Asignatura{" + "idAsignatura=" + idAsignatura + ", nomAsignatura=" + nomAsignatura + '}';
    }
    
    
    
}