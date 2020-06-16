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
    private int GENERO_idGENERO;
    private int ESTADO_MATRICULA_idESTADO_MATRICULA;
    private int CREDENCIAL_idCREDENCIAL;
  //Constructor parametros ingresar información.
    
    public Alumno(int nuevoRutAlumno, String nuevoNomcompAlumno, int nuevoGENERO_idGENERO,
                  int nuevoESTADO_MATRICULA_idESTADO_MATRICULA, int nuevoCREDENCIAL_idCREDENCIAL){
        this.rutAlumno = (nuevoRutAlumno);
        this.nomcompAlumno = (nuevoNomcompAlumno);
        this.GENERO_idGENERO = (nuevoGENERO_idGENERO);
        this.ESTADO_MATRICULA_idESTADO_MATRICULA = (nuevoESTADO_MATRICULA_idESTADO_MATRICULA);
        this.CREDENCIAL_idCREDENCIAL = (nuevoCREDENCIAL_idCREDENCIAL);
    }
  //Constructor con parametros

    public Alumno(int idALUMNO, int rutAlumno, String nomcompAlumno, int GENERO_idGENERO, int ESTADO_MATRICULA_idESTADO_MATRICULA, int CREDENCIAL_idCREDENCIAL) {
        this.idALUMNO = idALUMNO;
        this.rutAlumno = rutAlumno;
        this.nomcompAlumno = nomcompAlumno;
        this.GENERO_idGENERO = GENERO_idGENERO;
        this.ESTADO_MATRICULA_idESTADO_MATRICULA = ESTADO_MATRICULA_idESTADO_MATRICULA;
        this.CREDENCIAL_idCREDENCIAL = CREDENCIAL_idCREDENCIAL;
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

    public void setNomcompAlumno(String nomcompAlumno) {
        this.nomcompAlumno = nomcompAlumno;
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

    public Alumno( int rutAlumno, String nomcompAlumno) {
   
        this.rutAlumno = rutAlumno;
        this.nomcompAlumno = nomcompAlumno;
    }

    
    @Override
    public String toString() {
        return "Alumno{" + "idALUMNO=" + idALUMNO + ", rutAlumno=" + rutAlumno + ", nomcompAlumno=" + nomcompAlumno + ", GENERO_idGENERO=" + GENERO_idGENERO + ", ESTADO_MATRICULA_idESTADO_MATRICULA=" + ESTADO_MATRICULA_idESTADO_MATRICULA + ", CREDENCIAL_idCREDENCIAL=" + CREDENCIAL_idCREDENCIAL + '}';
    }
   
}
    