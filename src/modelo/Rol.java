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
public class Rol {
    private int idROL;
    private String nombreUsuario;
    private String contraseñaUsuario;
    private int TIPOROL_idTIPOROL;

    public Rol(String nuevoNombreUsuario, String nuevoContraseñaUsuario, int nuevoTIPOROL_idTIPOROL) {
        this.nombreUsuario = (nuevoNombreUsuario);
        this.contraseñaUsuario = (nuevoContraseñaUsuario);
        this.TIPOROL_idTIPOROL = (nuevoTIPOROL_idTIPOROL);
    }

    public Rol(int idROL, String nombreUsuario, String contraseñaUsuario, int TIPOROL_idTIPOROL) {
        this.idROL = idROL;
        this.nombreUsuario = nombreUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.TIPOROL_idTIPOROL = TIPOROL_idTIPOROL;
    }

    public int getIdROL() {
        return idROL;
    }

    public void setIdROL(int idROL) {
        this.idROL = idROL;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getTIPOROL_idTIPOROL() {
        return TIPOROL_idTIPOROL;
    }

    public void setTIPOROL_idTIPOROL(int TIPOROL_idTIPOROL) {
        this.TIPOROL_idTIPOROL = TIPOROL_idTIPOROL;
    }

    @Override
    public String toString() {
        return "Rol{" + "idROL=" + idROL + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1aUsuario=" + contraseñaUsuario + ", TIPOROL_idTIPOROL=" + TIPOROL_idTIPOROL + '}';
    }
    
    

   
    
}
