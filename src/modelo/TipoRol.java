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
public class TipoRol {
    private int idTipoRol;
    private String tipoRol;

    public TipoRol() {
    }

    public TipoRol(int idTipoRol, String tipoRol) {
        this.idTipoRol = idTipoRol;
        this.tipoRol = tipoRol;
    }

    public int getIdTipoRol() {
        return idTipoRol;
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    @Override
    public String toString() {
        return "TipoRol{" + "idTipoRol=" + idTipoRol + ", tipoRol=" + tipoRol + '}';
    }
    
    
}
