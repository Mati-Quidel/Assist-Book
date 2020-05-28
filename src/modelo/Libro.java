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
    private String curso;
    private String asignatura;
    private String profesor;
    private int idCURSO;
    private int idSALA;
        
        //Constructor sin parametros.
        public Libro() {
    }
         
            //constructor con parametros.
            public Libro(String curso, String asignatura, String profesor) {
                this.curso = curso;
                this.asignatura = asignatura;
                this.profesor = profesor;
        }

                //constructor con parametros BD.
                    public Libro(int idLIBRO, String curso, String asignatura, String profesor, int idCURSO, int idSALA) {
                        this.idLIBRO = idLIBRO;
                        this.curso = curso;
                        this.asignatura = asignatura;
                        this.profesor = profesor;
                        this.idCURSO = idCURSO;
                        this.idSALA = idSALA;
        }
                        //getter y setter.
                            public int getIdLIBRO() {
                                return idLIBRO;
                            }

                            public void setIdLIBRO(int idLIBRO) {
                                this.idLIBRO = idLIBRO;
                            }

                            public String getCurso() {
                                return curso;
                            }

                            public void setCurso(String curso) {
                                this.curso = curso;
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

                            public void setIdCurso(int idCURSO) {
                                this.idCURSO = idCURSO;
                            }
                            public int getidSALA() {
                                return idSALA;
                            }
                            public void setidCURSO(int idSALA) {
                                this.idSALA = idSALA;
                            }

                
}
