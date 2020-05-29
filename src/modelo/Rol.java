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
    private int idTIPOROL;

    public Rol(String nuevoNombreUsuario, String nuevaContraseñaUsuario) {
        this.setNombreUsuario(nuevoNombreUsuario);
        this.setContraseñaUsuario(nuevaContraseñaUsuario);
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

    public Rol(int idROL, int idTIPOROL) {
        this.idROL = idROL;
        this.idTIPOROL = idTIPOROL;
    }

    public int getIdROL() {
        return idROL;
    }

    public void setIdROL(int idROL) {
        this.idROL = idROL;
    }

    public int getIdTIPOROL() {
        return idTIPOROL;
    }

    public void setIdTIPOROL(int idTIPOROL) {
        this.idTIPOROL = idTIPOROL;
    }
    
    
}
