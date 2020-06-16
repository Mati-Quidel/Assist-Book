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
public class Asistencia {
    private int idASISTENCIA;
    private Date fecha;
    private int ASIGNATURA_idASIGNATURA;
    private int TIPO_ASISTENCIA_idTIPO_ASISTENCIA;
    private int LIBRO_idLIBRO;
    private int CURSO_idCURSO;
    private int SALA_idSALA;
    private int ALUMNO_idALUMNO;
    private int GENERO_idGENERO;
    private int ESTADO_MATRICULA_idESTADO_MATRICULA;
    private int CREDENCIAL_idCREDENCIAL;

    public Asistencia(Date nuevaFecha, int nuevoTIPO_ASISTENCIA_idTIPO_ASISTENCIA) {
        this.fecha = (nuevaFecha);
        this.TIPO_ASISTENCIA_idTIPO_ASISTENCIA = (nuevoTIPO_ASISTENCIA_idTIPO_ASISTENCIA);
    }

    public Asistencia(int idASISTENCIA, Date fecha, int ASIGNATURA_idASIGNATURA, 
            int TIPO_ASISTENCIA_idTIPO_ASISTENCIA, int LIBRO_idLIBRO, int CURSO_idCURSO, 
            int SALA_idSALA, int ALUMNO_idALUMNO, int GENERO_idGENERO, 
            int ESTADO_MATRICULA_idESTADO_MATRICULA, int CREDENCIAL_idCREDENCIAL) {
        this.idASISTENCIA = idASISTENCIA;
        this.fecha = fecha;
        this.ASIGNATURA_idASIGNATURA = ASIGNATURA_idASIGNATURA;
        this.TIPO_ASISTENCIA_idTIPO_ASISTENCIA = TIPO_ASISTENCIA_idTIPO_ASISTENCIA;
        this.LIBRO_idLIBRO = LIBRO_idLIBRO;
        this.CURSO_idCURSO = CURSO_idCURSO;
        this.SALA_idSALA = SALA_idSALA;
        this.ALUMNO_idALUMNO = ALUMNO_idALUMNO;
        this.GENERO_idGENERO = GENERO_idGENERO;
        this.ESTADO_MATRICULA_idESTADO_MATRICULA = ESTADO_MATRICULA_idESTADO_MATRICULA;
        this.CREDENCIAL_idCREDENCIAL = CREDENCIAL_idCREDENCIAL;
    }

    public int getIdASISTENCIA() {
        return idASISTENCIA;
    }

    public void setIdASISTENCIA(int idASISTENCIA) {
        this.idASISTENCIA = idASISTENCIA;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getASIGNATURA_idASIGNATURA() {
        return ASIGNATURA_idASIGNATURA;
    }

    public void setASIGNATURA_idASIGNATURA(int ASIGNATURA_idASIGNATURA) {
        this.ASIGNATURA_idASIGNATURA = ASIGNATURA_idASIGNATURA;
    }

    public int getTIPO_ASISTENCIA_idTIPO_ASISTENCIA() {
        return TIPO_ASISTENCIA_idTIPO_ASISTENCIA;
    }

    public void setTIPO_ASISTENCIA_idTIPO_ASISTENCIA(int TIPO_ASISTENCIA_idTIPO_ASISTENCIA) {
        this.TIPO_ASISTENCIA_idTIPO_ASISTENCIA = TIPO_ASISTENCIA_idTIPO_ASISTENCIA;
    }

    public int getLIBRO_idLIBRO() {
        return LIBRO_idLIBRO;
    }

    public void setLIBRO_idLIBRO(int LIBRO_idLIBRO) {
        this.LIBRO_idLIBRO = LIBRO_idLIBRO;
    }

    public int getCURSO_idCURSO() {
        return CURSO_idCURSO;
    }

    public void setCURSO_idCURSO(int CURSO_idCURSO) {
        this.CURSO_idCURSO = CURSO_idCURSO;
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

    public int getGENERO_idGENERO() {
        return GENERO_idGENERO;
    }

    public void setGENERO_idGENERO(int GENERO_idGENERO) {
        this.GENERO_idGENERO = GENERO_idGENERO;
    }

    public int getESTADO_MATRICULA_idESTADO_MATRICULA() {
        return ESTADO_MATRICULA_idESTADO_MATRICULA;
    }

    public void setESTADO_MATRICULA_idESTADO_MATRICULA(int ESTADO_MATRICULA_idESTADO_MATRICULA) {
        this.ESTADO_MATRICULA_idESTADO_MATRICULA = ESTADO_MATRICULA_idESTADO_MATRICULA;
    }

    public int getCREDENCIAL_idCREDENCIAL() {
        return CREDENCIAL_idCREDENCIAL;
    }

    public void setCREDENCIAL_idCREDENCIAL(int CREDENCIAL_idCREDENCIAL) {
        this.CREDENCIAL_idCREDENCIAL = CREDENCIAL_idCREDENCIAL;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "idASISTENCIA=" + idASISTENCIA + 
                ", fecha=" + fecha + ", ASIGNATURA_idASIGNATURA=" + ASIGNATURA_idASIGNATURA + 
                ", TIPO_ASISTENCIA_idTIPO_ASISTENCIA=" + TIPO_ASISTENCIA_idTIPO_ASISTENCIA + 
                ", LIBRO_idLIBRO=" + LIBRO_idLIBRO + ", CURSO_idCURSO=" + CURSO_idCURSO + 
                ", SALA_idSALA=" + SALA_idSALA + ", ALUMNO_idALUMNO=" + ALUMNO_idALUMNO + 
                ", GENERO_idGENERO=" + GENERO_idGENERO + ", ESTADO_MATRICULA_idESTADO_MATRICULA=" + ESTADO_MATRICULA_idESTADO_MATRICULA +
                ", CREDENCIAL_idCREDENCIAL=" + CREDENCIAL_idCREDENCIAL + '}';
    }
    
}  