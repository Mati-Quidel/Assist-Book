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
public class Libro {
    private int idLIBRO;
    private String asignatura;
    private String profesor;
    private int CURSO_idCURSO;
    private int CURSO_SALA_idSALA;
    private int CURSO_ALUMNO_idALUMNO;
    private int CURSO_ALUMNO_GENERO_idGENERO;
    private int CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
    private int CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL;

    public Libro(String nuevoAsignatura, String nuevoProfesor, int nuevoCURSO_idCURSO, 
            int nuevoCURSO_SALA_idSALA, int nuevoCURSO_ALUMNO_idALUMNO, int nuevoCURSO_ALUMNO_GENERO_idGENERO, 
            int nuevoCURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA, int nuevoCURSO_ALUMNO_CREDENCIAL_idCREDENCIAL) {
       
        this.asignatura = (nuevoAsignatura);
        this.profesor = (nuevoProfesor);
        this.CURSO_idCURSO = (nuevoCURSO_idCURSO);
        this.CURSO_SALA_idSALA = (nuevoCURSO_SALA_idSALA);
        this.CURSO_ALUMNO_idALUMNO = (nuevoCURSO_ALUMNO_idALUMNO);
        this.CURSO_ALUMNO_GENERO_idGENERO = ( nuevoCURSO_ALUMNO_GENERO_idGENERO);
        this.CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA = (nuevoCURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA);
        this.CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL = (nuevoCURSO_ALUMNO_CREDENCIAL_idCREDENCIAL);
    }

    public Libro(int idLIBRO, String asignatura, String profesor, 
            int CURSO_idCURSO, int CURSO_SALA_idSALA, int CURSO_ALUMNO_idALUMNO, 
            int CURSO_ALUMNO_GENERO_idGENERO, int CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA,
            int CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL) {
        
        this.idLIBRO = idLIBRO;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.CURSO_idCURSO = CURSO_idCURSO;
        this.CURSO_SALA_idSALA = CURSO_SALA_idSALA;
        this.CURSO_ALUMNO_idALUMNO = CURSO_ALUMNO_idALUMNO;
        this.CURSO_ALUMNO_GENERO_idGENERO = CURSO_ALUMNO_GENERO_idGENERO;
        this.CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA = CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
        this.CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL = CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL;
    }

    public Libro(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdLIBRO() {
        return idLIBRO;
    }

    public void setIdLIBRO(int idLIBRO) {
        this.idLIBRO = idLIBRO;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCURSO_idCURSO() {
        return CURSO_idCURSO;
    }

    public void setCURSO_idCURSO(int CURSO_idCURSO) {
        this.CURSO_idCURSO = CURSO_idCURSO;
    }

    public int getCURSO_SALA_idSALA() {
        return CURSO_SALA_idSALA;
    }

    public void setCURSO_SALA_idSALA(int CURSO_SALA_idSALA) {
        this.CURSO_SALA_idSALA = CURSO_SALA_idSALA;
    }

    public int getCURSO_ALUMNO_idALUMNO() {
        return CURSO_ALUMNO_idALUMNO;
    }

    public void setCURSO_ALUMNO_idALUMNO(int CURSO_ALUMNO_idALUMNO) {
        this.CURSO_ALUMNO_idALUMNO = CURSO_ALUMNO_idALUMNO;
    }

    public int getCURSO_ALUMNO_GENERO_idGENERO() {
        return CURSO_ALUMNO_GENERO_idGENERO;
    }

    public void setCURSO_ALUMNO_GENERO_idGENERO(int CURSO_ALUMNO_GENERO_idGENERO) {
        this.CURSO_ALUMNO_GENERO_idGENERO = CURSO_ALUMNO_GENERO_idGENERO;
    }

    public int getCURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA() {
        return CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
    }

    public void setCURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA(int CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA) {
        this.CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA = CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA;
    }

    public int getCURSO_ALUMNO_CREDENCIAL_idCREDENCIAL() {
        return CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL;
    }

    public void setCURSO_ALUMNO_CREDENCIAL_idCREDENCIAL(int CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL) {
        this.CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL = CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL;
    }

    @Override
    public String toString() {
        return "Libro{" + "idLIBRO=" + idLIBRO + ", asignatura=" + asignatura + 
                ", profesor=" + profesor + ", CURSO_idCURSO=" + CURSO_idCURSO + 
                ", CURSO_SALA_idSALA=" + CURSO_SALA_idSALA + 
                ", CURSO_ALUMNO_idALUMNO=" + CURSO_ALUMNO_idALUMNO + 
                ", CURSO_ALUMNO_GENERO_idGENERO=" + CURSO_ALUMNO_GENERO_idGENERO + 
                ", CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA=" + CURSO_ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA + 
                ", CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL=" + CURSO_ALUMNO_CREDENCIAL_idCREDENCIAL + '}';
    }
   
                
}
