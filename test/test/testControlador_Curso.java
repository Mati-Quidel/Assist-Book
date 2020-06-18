/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import controlador.Controlador_Curso;
import  modelo.Curso;
import java.util.List;
/**
 *
 * @author Matias
 */

public class testControlador_Curso {
    private static final Controlador_Curso cCurso = new Controlador_Curso();


    public static void main (String... args){
       //testAgregarCurso();
       //testBuscarCurso(1);
       //testModificarCurso();
       //testEliminarCurso(278);
       testListarCursos();
    }

    public static void testEliminarCurso(int idAEliminar){
        if(cCurso.eliminarCurso(idAEliminar)){
            System.out.println("Eliminado correctamente");
        }else{
            System.out.println("No se elimino");
        }
    }

    public static void testBuscarCurso (int idBuscar){
        Curso encontrado = cCurso.buscarCurso(1);
        if(encontrado != null){
            System.out.println("El Curso "+encontrado.getNivel()
                                +" en la sala "+encontrado.getSALA_idSALA()
                                +" de Alumnos "+encontrado.getALUMNO_idALUMNO ());

        }
        else{
            System.out.println("Curso no encontrado");
        }
    }

    public static void testListarCursos(){
        List<Curso> cursos = cCurso.listarCursos();
                for(Curso temp:cursos){
                    System.out.println("El Curso "+temp.getNivel()
                                        +" en la sala "+temp.getSALA_idSALA()
                                         +" de Alumno "+temp.getAlumno().getNomcompAlumno());
                }
    }
}