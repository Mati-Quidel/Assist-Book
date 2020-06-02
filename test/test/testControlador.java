/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import controlador.Controlador_Alumno;
import  modelo.Alumno;
import java.util.List;
/**
 *
 * @author aliss
 */
public class testControlador {

    private static Controlador_Alumno cAlumno = new Controlador_Alumno();
    
    public static void main (String... args){
        //testBuscarAlumno(1);
        testListarAlumnos();
    }

    public static void testBuscarAlumno (int idBuscar){
        Alumno encontrado = cAlumno.buscarAlumno(1);
        if(encontrado != null){
        System.out.println(encontrado.toString());
        }
        else{
            System.out.println("Alumno no encontrado");
        }
    }

    public static void testListarAlumnos(){
        List<Alumno> Alumno = cAlumno.listarAlumnos();
        for(Alumno tem:Alumno){
        System.out.println(tem.toString());
        }
    }

}
