/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import controlador.Controlador_Profesor;
import  modelo.Profesor;
import java.util.List;
/**
 *
 * @author aliss
 */
public class testControlador_Profesor {
    
    private static final Controlador_Profesor cProfesor = new Controlador_Profesor();
    
    public static void main (String... args){
       //testAgregarProfesor();
       //testBuscarProfesor(1);
       //testModificarProfesor();
       //testEliminarProfesor(278);
       testListarProfesores();
    }
    
    public static void testAgregarProfesor(){
        Profesor nuevoProfesor = new Profesor (20597810,"Matias Quidel Arancibia");
        if(cProfesor.agregarProfesor(nuevoProfesor)){
            System.out.println(String.format("El Profesor %s fue agregado", nuevoProfesor.getNomProfe()));
        }else{
            System.out.println("No se agrego");
        }
    }

    public static void testBuscarProfesor (int idBuscar){
        Profesor encontrado = cProfesor.buscarProfesor(1);
        if(encontrado != null){
            System.out.println("El Profesor es "+encontrado.getNomProfe()
                                +" de rut "+encontrado.getRutProfe());
            
        }
        else{
            System.out.println("Profesor no encontrado");
        }
    }

    public static void testModificarProfesor(){
        Profesor profeAMod = new Profesor(20597810,"Matias Alfonso Quidel Arancibia");
        if(cProfesor.modificarProfesor(profeAMod)){
            System.out.println("Modificado Correctamente");
        }else{
            System.out.println("No Modificado");
        }
    }

    public static void testEliminarProfesor(int idAEliminar){
        if(cProfesor.eliminarProfesor(idAEliminar)){
            System.out.println("Eliminado correctamente");
        }else{
            System.out.println("No se elimino");
        }
    }
   
    public static void testListarProfesores(){
        List<Profesor> profesores = cProfesor.listarProfesores();
                for(Profesor temp:profesores){
                    System.out.println("nombre: "+temp.getNomProfe()+ " Rut: "+temp.getRutProfe());
                }
    }
}
