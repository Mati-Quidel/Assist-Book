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

    private static final Controlador_Alumno cAlumno = new Controlador_Alumno();
    
    public static void main (String... args){
       //testAgregarAlumno();
       //testBuscarAlumno(279);
       //testModificarAlumno();
       //testEliminarAlumno(278);
       //testListarAlumnos();
    }
    
    public static void testAgregarAlumno(){
        Alumno nuevoAlumno = new Alumno (18977887,"Gómez Veas Alisson",1,1,278);
        if(cAlumno.agregarAlumno(nuevoAlumno)){
            System.out.println(String.format("El alumno %s fue agregado", nuevoAlumno.getNomcompAlumno()));
        }else{
            System.out.println("No se agrego");
        }
    }

    public static void testBuscarAlumno (int idBuscar){
        Alumno encontrado = cAlumno.buscarAlumno(279);
        if(encontrado != null){
            System.out.println("El alumno es "+encontrado.getNomcompAlumno()
                                +" de rut "+encontrado.getRutAlumno());
            
        }
        else{
            System.out.println("Alumno no encontrado");
        }
    }

    public static void testModificarAlumno(){
        Alumno alumAMod = new Alumno(18977887,"Gómez Veas Alisson",1,1,278);
        if(cAlumno.modificarAlumno(alumAMod)){
            System.out.println("Modificado Correctamente");
        }else{
            System.out.println("No Modificado");
        }
    }

    public static void testEliminarAlumno(int idAEliminar){
        if(cAlumno.eliminarAlumno(idAEliminar)){
            System.out.println("Eliminado correctamente");
        }else{
            System.out.println("No se elimino");
        }
    }
   
    public static void testListarAlumnos(){
        List<Alumno> alumnos = cAlumno.listarAlumnos();
                for(Alumno temp:alumnos){
                    System.out.println("nombre: "+temp.getNomcompAlumno()+ " Rut: "+temp.getRutAlumno());
                }
    }
    
}
