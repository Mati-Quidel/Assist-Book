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
public class Curso {
    private int idCURSO;
    private String nivel;
    private int SALA_idSALA;
    private int ALUMNO_idALUMNO;
    private int ALUMNO_GENERO_idGENERO;
    private int ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
    private int ALUMNO_CREDENCIAL_idCREDENCIAL;

    public Curso(String nuevoNivel, int nuevoSALA_idSALA, int nuevoALUMNO_idALUMNO, 
                int nuevoALUMNO_GENERO_idGENERO, 
                int nuevoALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA, 
                int nuevoALUMNO_CREDENCIAL_idCREDENCIAL) {
        this.nivel = (nuevoNivel);
        this.SALA_idSALA = (nuevoSALA_idSALA);
        this.ALUMNO_idALUMNO = (nuevoALUMNO_idALUMNO);
        this.ALUMNO_GENERO_idGENERO = (nuevoALUMNO_GENERO_idGENERO);
        this.ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA = (nuevoALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA);
        this.ALUMNO_CREDENCIAL_idCREDENCIAL = (nuevoALUMNO_CREDENCIAL_idCREDENCIAL);
    }

    public Curso(String nivel, int SALA_idSALA, int ALUMNO_idALUMNO) {
        this.nivel = nivel;
        this.SALA_idSALA = SALA_idSALA;
        this.ALUMNO_idALUMNO = ALUMNO_idALUMNO;
    }

    
    
    public Curso(int idCURSO, String nivel, int SALA_idSALA, int ALUMNO_idALUMNO, 
            int ALUMNO_GENERO_idGENERO, int ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA, 
            int ALUMNO_CREDENCIAL_idCREDENCIAL) {
        this.idCURSO = idCURSO;
        this.nivel = nivel;
        this.SALA_idSALA = SALA_idSALA;
        this.ALUMNO_idALUMNO = ALUMNO_idALUMNO;
        this.ALUMNO_GENERO_idGENERO = ALUMNO_GENERO_idGENERO;
        this.ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA = ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
        this.ALUMNO_CREDENCIAL_idCREDENCIAL = ALUMNO_CREDENCIAL_idCREDENCIAL;
    }

    public int getIdCURSO() {
        return idCURSO;
    }

    public void setIdCURSO(int idCURSO) {
        this.idCURSO = idCURSO;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getSALA_idSALA() {
        return SALA_idSALA;
    }

    public void setSALA_idSALA(int SALA_idSALA) {
        this.SALA_idSALA = SALA_idSALA;
    }

    public int getALUMNO_idALUMNO() {
        return ALUMNO_idALUMNO;
    }

    public void setALUMNO_idALUMNO(int ALUMNO_idALUMNO) {
        this.ALUMNO_idALUMNO = ALUMNO_idALUMNO;
    }

    public int getALUMNO_GENERO_idGENERO() {
        return ALUMNO_GENERO_idGENERO;
    }

    public void setALUMNO_GENERO_idGENERO(int ALUMNO_GENERO_idGENERO) {
        this.ALUMNO_GENERO_idGENERO = ALUMNO_GENERO_idGENERO;
    }

    public int getALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA() {
        return ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
    }

    public void setALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA(int ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA) {
        this.ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA = ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
    }

    public int getALUMNO_CREDENCIAL_idCREDENCIAL() {
        return ALUMNO_CREDENCIAL_idCREDENCIAL;
    }

    public void setALUMNO_CREDENCIAL_idCREDENCIAL(int ALUMNO_CREDENCIAL_idCREDENCIAL) {
        this.ALUMNO_CREDENCIAL_idCREDENCIAL = ALUMNO_CREDENCIAL_idCREDENCIAL;
    }

    @Override
    public String toString() {
        return "Curso{" + "idCURSO=" + idCURSO + 
                ", nivel=" + nivel + ", SALA_idSALA=" + SALA_idSALA + 
                ", ALUMNO_idALUMNO=" + ALUMNO_idALUMNO + 
                ", ALUMNO_GENERO_idGENERO=" + ALUMNO_GENERO_idGENERO + 
                ", ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA=" + ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA + 
                ", ALUMNO_CREDENCIAL_idCREDENCIAL=" + ALUMNO_CREDENCIAL_idCREDENCIAL + '}';
    }
    
    

   
    
}
