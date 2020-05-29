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
    private int idSALA;
    private int idALUMNO;
    private int idGENERO;
    private int idESTADO_MATRICULA;
    private int idCREDENCIAL;

    public Curso() {
    }

    public Curso(int idCURSO, String nivel, int idSALA, int idALUMNO, int idGENERO, int idESTADO_MATRICULA, int idCREDENCIAL) {
        this.idCURSO = idCURSO;
        this.nivel = nivel;
        this.idSALA = idSALA;
        this.idALUMNO = idALUMNO;
        this.idGENERO = idGENERO;
        this.idESTADO_MATRICULA = idESTADO_MATRICULA;
        this.idCREDENCIAL = idCREDENCIAL;
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

    public int getIdSALA() {
        return idSALA;
    }

    public void setIdSALA(int idSALA) {
        this.idSALA = idSALA;
    }

    public int getIdALUMNO() {
        return idALUMNO;
    }

    public void setIdALUMNO(int idALUMNO) {
        this.idALUMNO = idALUMNO;
    }

    public int getIdGENERO() {
        return idGENERO;
    }

    public void setIdGENERO(int idGENERO) {
        this.idGENERO = idGENERO;
    }

    public int getIdESTADO_MATRICULA() {
        return idESTADO_MATRICULA;
    }

    public void setIdESTADO_MATRICULA(int idESTADO_MATRICULA) {
        this.idESTADO_MATRICULA = idESTADO_MATRICULA;
    }

    public int getIdCREDENCIAL() {
        return idCREDENCIAL;
    }

    public void setIdCREDENCIAL(int idCREDENCIAL) {
        this.idCREDENCIAL = idCREDENCIAL;
    }
    
    
    
}
