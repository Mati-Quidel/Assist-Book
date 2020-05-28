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
    private int idASIGNATURA;
    private int idTIPO_ASISTENCIA;
    private int idLIBRO;
    private int idCURSO;
    private int idSALA;
    private int idALUMNO;
    private int idGENERO;
    private int idESTADO_MATRICULA;
    private int idCREDENCIAL;
    
    
    public Asistencia() {
    }
    
    
     public Asistencia(int idASISTENCIA, Date fecha, int idTIPO_ASISTENCIA) {
        this.idASISTENCIA = idASISTENCIA;
        this.fecha = fecha;
        this.idTIPO_ASISTENCIA = idTIPO_ASISTENCIA;}
     
     public Asistencia(int idASIGNATURA,int idLIBRO,int idCURSO,int idSALA,int idALUMNO, int idGENERO,
     int idESTADO_MATRICULA,int idCREDENCIAL) {
        this.idASIGNATURA = idASIGNATURA;
        this.idLIBRO = idLIBRO;
        this.idCURSO = idCURSO;
        this.idSALA = idSALA;
        this.idALUMNO = idALUMNO;
        this.idGENERO = idGENERO;
        this.idESTADO_MATRICULA = idESTADO_MATRICULA;
        this.idCREDENCIAL = idCREDENCIAL;
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

    public int getIdASIGNATURA() {
        return idASIGNATURA;
    }

    public void setIdASIGNATURA(int idASIGNATURA) {
        this.idASIGNATURA = idASIGNATURA;
    }

    public int getIdTIPO_ASISTENCIA() {
        return idTIPO_ASISTENCIA;
    }

    public void setIdTIPO_ASISTENCIA(int idTIPO_ASISTENCIA) {
        this.idTIPO_ASISTENCIA = idTIPO_ASISTENCIA;
    }

    public int getIdLIBRO() {
        return idLIBRO;
    }

    public void setIdLIBRO(int idLIBRO) {
        this.idLIBRO = idLIBRO;
    }

    public int getIdCURSO() {
        return idCURSO;
    }

    public void setIdCURSO(int idCURSO) {
        this.idCURSO = idCURSO;
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