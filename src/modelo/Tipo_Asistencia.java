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
public class Tipo_Asistencia {
    private int idTipoAsis;
    private String tipoAsis;

    public Tipo_Asistencia() {
    }

    public Tipo_Asistencia(int idTipoAsis, String tipoAsis) {
        this.idTipoAsis = idTipoAsis;
        this.tipoAsis = tipoAsis;
    }

    public int getIdTipoAsis() {
        return idTipoAsis;
    }

    public void setIdTipoAsis(int idTipoAsis) {
        this.idTipoAsis = idTipoAsis;
    }

    public String getTipoAsis() {
        return tipoAsis;
    }

    public void setTipoAsis(String tipoAsis) {
        this.tipoAsis = tipoAsis;
    }

    @Override
    public String toString() {
        return "Tipo_Asistencia{" + "idTipoAsis=" + idTipoAsis + ", tipoAsis=" + tipoAsis + '}';
    }
    
    
}
