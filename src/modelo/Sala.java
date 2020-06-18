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
public class Sala {
    private int idSala;
    private String tipoSala;

    public Sala() {
    }

    public Sala(int idSala, String tipoSala) {
        this.idSala = idSala;
        this.tipoSala = tipoSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }

    @Override
    public String toString() {
        return "Sala{" + "idSala=" + idSala + ", tipoSala=" + tipoSala + '}';
    }
    
    
}
