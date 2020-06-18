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
    private int idRol;
    private String nomUsuario;
    private String contraseñaUsuario;
    private int idProfesor;
    private int idTipoRol;

    public Rol() {
    }

    public Rol(String nuevoNomUsuario, String nuevoContraseñaUsuario, int nuevoIdProfesor, int nuevoIdTipoRol) {
        this.nomUsuario = (nuevoNomUsuario);
        this.contraseñaUsuario = (nuevoContraseñaUsuario);
        this.idProfesor = (nuevoIdProfesor);
        this.idTipoRol = (nuevoIdTipoRol);
    }

    public Rol(int idRol, String nomUsuario, String contraseñaUsuario, int idProfesor, int idTipoRol) {
        this.idRol = idRol;
        this.nomUsuario = nomUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.idProfesor = idProfesor;
        this.idTipoRol = idTipoRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getIdTipoRol() {
        return idTipoRol;
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    @Override
    public String toString() {
        return "Rol{" + "idRol=" + idRol + ", nomUsuario=" + nomUsuario + ", contrase\u00f1aUsuario=" + contraseñaUsuario + ", idProfesor=" + idProfesor + ", idTipoRol=" + idTipoRol + '}';
    }
    
    
    
    

   
    
}
