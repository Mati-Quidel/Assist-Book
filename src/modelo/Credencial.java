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
public class Credencial {
    private int idCREDENCIAL;
    private int codigo;

    public Credencial(int nuevoCodigo) {
        this.codigo = (nuevoCodigo);
    }

    

    public Credencial(int idCREDENCIAL, int codigo) {
        this.idCREDENCIAL = idCREDENCIAL;
        this.codigo = codigo;
    }

    public int getIdCREDENCIAL() {
        return idCREDENCIAL;
    }

    public void setIdCREDENCIAL(int idCREDENCIAL) {
        this.idCREDENCIAL = idCREDENCIAL;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Credencial{" + "idCREDENCIAL=" + idCREDENCIAL + ", codigo=" + codigo + '}';
    }
    
    
}