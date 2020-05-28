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
    private int rutProfe;
    private String nomcompProfe;
    private String genero;
    private int idUSUARIO;
    private int idGENERO;
    private int idTIPOROL;

    //Constructor sin parametros
    public Profesor() {
        }
        //constructor con parametros
        public Profesor(int rutProfe, String nomcompProfe,String genero) {
            this.rutProfe = rutProfe;
            this.nomcompProfe = nomcompProfe;
            this.genero = genero;
                }
                //constructor con todos los parametros.
                public Profesor(int idPROFESOR, int rutProfe, String nomcompProfe, String genero, int idUSUARIO, int idGENERO, int idTIPOROL) {
                    this.idPROFESOR = idPROFESOR;
            this.rutProfe = rutProfe;
            this.nomcompProfe = nomcompProfe;
            this.genero = genero;
            this.idUSUARIO = idUSUARIO;
            this.idGENERO = idGENERO;
            this.idTIPOROL = idTIPOROL;
        }

                //Getter y Setter

    public int getIdPROFESOR() {
        return idPROFESOR;
    }

    public void setIdPROFESOR(int idPROFESOR) {
        this.idPROFESOR = idPROFESOR;
    }

    public int getRutProfe() {
        return rutProfe;
    }

    public void setRutProfe(int rutProfe) {
        this.rutProfe = rutProfe;
    }

    public String getNomcompProfe() {
        return nomcompProfe;
    }

    public void setNomcompProfe(String nomcompProfe) {
        this.nomcompProfe = nomcompProfe;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdUSUARIO() {
        return idUSUARIO;
    }

    public void setIdUSUARIO(int idUSUARIO) {
        this.idUSUARIO = idUSUARIO;
    }

    public int getIdGENERO() {
        return idGENERO;
    }

    public void setIdGENERO(int idGENERO) {
        this.idGENERO = idGENERO;
    }

    public int getIdTIPOROL() {
        return idTIPOROL;
    }

    public void setIdTIPOROL(int idTIPOROL) {
        this.idTIPOROL = idTIPOROL;
    }
    
}
            
            
