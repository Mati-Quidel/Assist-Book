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
    private int idCURSO;
    private int idSALA;
    private int idALUMNO;
    private int idGENERO;
    private int idESTADO_MATRICULA;
    private int idCREDENCIAL;
        
        //Constructor sin parametros.
        public Libro() {
    }
         
            //constructor con parametros.
            public Libro(String asignatura, String profesor) {
                
                this.asignatura = asignatura;
                this.profesor = profesor;
        }

    public Libro(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Libro(int aInt, int aInt0, String string, String string0) {
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

    public int getIdCURSO() {
        return idCURSO;
    }

    public void setIdCURSO(int idCURSO) {
        this.idCURSO = idCURSO;
    }
            

                //constructor con parametros BD.
                    public Libro(int idLIBRO, String curso, String asignatura, String profesor, int idCURSO, int idSALA,
                    int idALUMNO,int idGENERO,int idESTADO_MATRICULA, int idCREDENCIAL) {
                        this.idLIBRO = idLIBRO;
                        this.asignatura = asignatura;
                        this.profesor = profesor;
                        this.idCURSO = idCURSO;
                        this.idSALA = idSALA;
                        this.idALUMNO= idALUMNO;
                        this.idGENERO =idGENERO;
                        this.idESTADO_MATRICULA = idESTADO_MATRICULA;
                        this.idCREDENCIAL = idCREDENCIAL;
        }
                        //getter y setter.

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
