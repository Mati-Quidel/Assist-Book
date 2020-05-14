/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Matias
 */
public class Profesor {
    private int idProfesor;
    private int rutProfe;
    private String dv;
    private String nomProfe;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento; 
    private String genero;
    private int idUsuario;
    private int idGenero;

    //Constructor sin parametros
    public Profesor() {
        }
        //constructor con parametros
        public Profesor(int rutProfe, String nomProfe, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String genero) {
            this.rutProfe = rutProfe;
            this.nomProfe = nomProfe;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.fechaNacimiento = fechaNacimiento;
            this.genero = genero;
                }
                //constructor con todos los parametros.
                public Profesor(int idProfesor, int rutProfe, String dv, String nomProfe, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String genero, int idUsuario, int idGenero) {
                    this.idProfesor = idProfesor;
            this.rutProfe = rutProfe;
            this.dv = dv;
            this.nomProfe = nomProfe;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.fechaNacimiento = fechaNacimiento;
            this.genero = genero;
            this.idUsuario = idUsuario;
            this.idGenero = idGenero;
        }

                //Getter y Setter
                    public int getIdProfesor() {
        return idProfesor;
    }

                    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

                    public int getRutProfe() {
        return rutProfe;
    }

                    public void setRutProfe(int rutProfe) {
        this.rutProfe = rutProfe;
    }

                    public String getDv() {
        return dv;
    }

                    public void setDv(String dv) {
                        this.dv = dv;
                    }

                    public String getNomProfe() {
        return nomProfe;
    }

                    public void setNomProfe(String nomProfe) {
        this.nomProfe = nomProfe;
    }

                    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

                    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

                    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

                    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

                    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

                    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

                    public String getGenero() {
        return genero;
    }

                    public void setGenero(String genero) {
        this.genero = genero;
    }

                    public int getIdUsuario() {
        return idUsuario;
    }

                    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

                    public int getIdGenero() {
        return idGenero;
    }

                    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    
    
    
    
    
    
    
}
            
            
