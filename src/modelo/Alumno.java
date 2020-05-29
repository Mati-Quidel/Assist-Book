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
    private int idGENERO;
    private int idESTADO_MATRICULA;
    private int idCREDENCIAL;
  //Constructor sin parametros.
    public Alumno(){
    
    }
  //Constructor con parametros
    public Alumno(int nuevoRutAlumno, String nuevoNomcompAlumno, int nuevoGenero) {
    
        this.setRutAlumno(nuevoRutAlumno);
        this.setNomcompAlumno(nuevoNomcompAlumno);
        this.setIdGENERO(nuevoGenero);
        
        
    }
  // Construtor con parametros desde BD
    public Alumno(int idALUMNO, int rutAlumno, String nomcompAlumno, int idGENERO, int idESTADO_MATRICULA, int idCREDENCIAL) {
        this.idALUMNO = idALUMNO;
        this.rutAlumno = rutAlumno;
        this.idESTADO_MATRICULA = idESTADO_MATRICULA;
        this.idGENERO = idGENERO;
        this.idCREDENCIAL= idCREDENCIAL;
     
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

    public int getIdESTADO_MATRICULA() {
        return idESTADO_MATRICULA;
    }

    public void setIdESTADO_MATRICULA(int idMATRICULA) {
        this.idESTADO_MATRICULA = idMATRICULA;
    }

    public int getIdGENERO() {
        return idGENERO;
    }

    public void setIdGENERO(int idGENERO) {
        this.idGENERO = idGENERO;
    }

    public int getIdCREDENCIAL() {
        return idCREDENCIAL;
    }

    public void setIdCREDENCIAL(int idCURSO) {
        this.idCREDENCIAL= idCURSO;
    }
    
    
}
    