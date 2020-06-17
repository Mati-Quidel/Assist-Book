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
    private int idASIGNATURA;
    private String nomAsig;

    public Asignatura() {
    }

    public Asignatura(int idASIGNATURA, String nomAsig) {
        this.idASIGNATURA = idASIGNATURA;
        this.nomAsig = nomAsig;
    }

    public int getIdASIGNATURA() {
        return idASIGNATURA;
    }

    public void setIdASIGNATURA(int idASIGNATURA) {
        this.idASIGNATURA = idASIGNATURA;
    }

    public String getNomAsig() {
        return nomAsig;
    }

    public void setNomAsig(String nomAsig) {
        this.nomAsig = nomAsig;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "idASIGNATURA=" + idASIGNATURA + ", nomAsig=" + nomAsig + '}';
    }
    
    
}