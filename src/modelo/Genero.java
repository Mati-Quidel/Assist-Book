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
public class Genero {
    private int idGenero;
    private int tipoGenero;

    public Genero() {
       
    }

    public Genero(int idGenero, int tipoGenero) {
        this.idGenero = idGenero;
        this.tipoGenero = tipoGenero;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(int tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "idGenero=" + idGenero + ", tipoGenero=" + tipoGenero + '}';
    }

    

}

