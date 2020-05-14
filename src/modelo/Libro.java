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
    private int idLibro;
    private String curso;
    private String asignatura;
    private String profesor;
    private int idCurso;
        
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
                    public Libro(int idLibro, String curso, String asignatura, String profesor, int idCurso) {
                        this.idLibro = idLibro;
                        this.curso = curso;
                        this.asignatura = asignatura;
                        this.profesor = profesor;
                        this.idCurso = idCurso;
        }
                        //getter y setter.
                            public int getIdLibro() {
                                return idLibro;
                            }

                            public void setIdLibro(int idLibro) {
                                this.idLibro = idLibro;
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

                            public int getIdCurso() {
                                return idCurso;
                            }

                            public void setIdCurso(int idCurso) {
                                this.idCurso = idCurso;
                            }
                
}
