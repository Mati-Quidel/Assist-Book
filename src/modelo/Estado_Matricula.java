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
public class Estado_Matricula {
    private int idMatricula;
    private String estado;

    public Estado_Matricula() {
    }

    public Estado_Matricula(int idMatricula, String estado) {
        this.idMatricula = idMatricula;
        this.estado = estado;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estado_Matricula{" + "idMatricula=" + idMatricula + ", estado=" + estado + '}';
    }
    
    
    
}
