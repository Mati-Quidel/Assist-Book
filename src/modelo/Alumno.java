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
public class Alumno {
    private int idALUMNO;
    private int rutAlumno;
    private String nomcompAlumno;
    private int idMATRICULA;
    private int idGENERO;
    private int idCURSO;
    private int idSALA;
    private int idLIBRO;
  //Constructor sin parametros.
    public Alumno(){
    
    }
  //Constructor con parametros
    public Alumno(int nuevoRutAlumno, String nuevoNomcompAlumno, int nuevoGenero) {
    
        this.rutAlumno = nuevoRutAlumno;
        this.nomcompAlumno = nuevoNomcompAlumno;
        this.idGENERO = nuevoGenero;
    }
  // Construtor con parametros desde BD
    public Alumno(int idALUMNO, int rutAlumno, String nomcompAlumno, int idGENERO, int idMATRICULA, int idCURSO, int idSALA, int idLIBRO) {
        this.idALUMNO = idALUMNO;
        this.rutAlumno = rutAlumno;
        this.idMATRICULA = idMATRICULA;
        this.idGENERO = idGENERO;
        this.idCURSO = idCURSO;
        this.idSALA = idSALA;
        this.idLIBRO = idLIBRO;
    }

    public int getIdALUMNO() {
        return idALUMNO;
    }

    public void setIdALUMNO(int idALUMNO) {
        this.idALUMNO = idALUMNO;
    }

    public int getRutAlumno() {
        return rutAlumno;
    }

    public void setRutAlumno(int rutAlumno) {
        this.rutAlumno = rutAlumno;
    }

    public String getNomcompAlumno() {
        return nomcompAlumno;
    }

    public void setNomcompAlumno(String nombreAlumno) {
        this.nomcompAlumno = nombreAlumno;
    }

    public int getIdMATRICULA() {
        return idMATRICULA;
    }

    public void setIdMATRICULA(int idMATRICULA) {
        this.idMATRICULA = idMATRICULA;
    }

    public int getIdGENERO() {
        return idGENERO;
    }

    public void setIdGENERAL(int idGENERO) {
        this.idGENERO = idGENERO;
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

    public void setIdSala(int idSALA) {
        this.idSALA = idSALA;
    }

    public int getIdLIBRO() {
        return idLIBRO;
    }

    public void setIdLIBRO(int idLIBRO) {
        this.idLIBRO = idLIBRO;
    }
    
    
}
    
           
