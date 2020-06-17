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
public class Profesor {
    private int idPROFESOR;
    private int rutcProfe;
    private String nomcompProfe;
    private int GENERO_idGENERO;
    private int ROL_idTIPOROL;
    private int ROL_TIPOROL_idTIPOROL;

    public Profesor(int nuevoRutcProfe, String nuevoNomcompProfe, int nuevoGENERO_idGENERO, int nuevoROL_idTIPOROL, int nuevoROL_TIPOROL_idTIPOROL) {
        this.rutcProfe = (nuevoRutcProfe);
        this.nomcompProfe = (nuevoNomcompProfe);
        this.GENERO_idGENERO = (nuevoGENERO_idGENERO);
        this.ROL_idTIPOROL = (nuevoROL_idTIPOROL);
        this.ROL_TIPOROL_idTIPOROL = (nuevoROL_TIPOROL_idTIPOROL);
    }

    public Profesor(int rutcProfe, String nomcompProfe) {
        this.rutcProfe = rutcProfe;
        this.nomcompProfe = nomcompProfe;
    }

    public Profesor(int idPROFESOR, int rutcProfe, String nomcompProfe, int GENERO_idGENERO, int ROL_idTIPOROL, int ROL_TIPOROL_idTIPOROL) {
        this.idPROFESOR = idPROFESOR;
        this.rutcProfe = rutcProfe;
        this.nomcompProfe = nomcompProfe;
        this.GENERO_idGENERO = GENERO_idGENERO;
        this.ROL_idTIPOROL = ROL_idTIPOROL;
        this.ROL_TIPOROL_idTIPOROL = ROL_TIPOROL_idTIPOROL;
    }

    public int getIdPROFESOR() {
        return idPROFESOR;
    }

    public void setIdPROFESOR(int idPROFESOR) {
        this.idPROFESOR = idPROFESOR;
    }

    public int getRutcProfe() {
        return rutcProfe;
    }

    public void setRutcProfe(int rutcProfe) {
        this.rutcProfe = rutcProfe;
    }

    public String getNomcompProfe() {
        return nomcompProfe;
    }

    public void setNomcompProfe(String nomcompProfe) {
        this.nomcompProfe = nomcompProfe;
    }

    public int getGENERO_idGENERO() {
        return GENERO_idGENERO;
    }

    public void setGENERO_idGENERO(int GENERO_idGENERO) {
        this.GENERO_idGENERO = GENERO_idGENERO;
    }

    public int getROL_idTIPOROL() {
        return ROL_idTIPOROL;
    }

    public void setROL_idTIPOROL(int ROL_idTIPOROL) {
        this.ROL_idTIPOROL = ROL_idTIPOROL;
    }

    public int getROL_TIPOROL_idTIPOROL() {
        return ROL_TIPOROL_idTIPOROL;
    }

    public void setROL_TIPOROL_idTIPOROL(int ROL_TIPOROL_idTIPOROL) {
        this.ROL_TIPOROL_idTIPOROL = ROL_TIPOROL_idTIPOROL;
    }

    @Override
    public String toString() {
        return "Profesor{" + "idPROFESOR=" + idPROFESOR + ", rutcProfe=" + rutcProfe + ", nomcompProfe=" + nomcompProfe + ", GENERO_idGENERO=" + GENERO_idGENERO + ", ROL_idTIPOROL=" + ROL_idTIPOROL + ", ROL_TIPOROL_idTIPOROL=" + ROL_TIPOROL_idTIPOROL + '}';
    }

    
    
    

    
    
}
            
            
