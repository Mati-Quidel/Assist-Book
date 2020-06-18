/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import controlador.Controlador_Rol;
import  modelo.Rol;
import java.util.List;
/**
 *
 * @author aliss
 */
public class testControlador_Rol {
    private static final Controlador_Rol cRol = new Controlador_Rol();
    
    public static void main (String... args){
       //testAgregarRol();
       //testBuscarRol(1);
       //testModificarRol();
       //testEliminarRol();
       //testListarRoles();
    }
    
    public static void testAgregarRol(){
        Rol nuevoRol = new Rol ("mati.quidel","profe2020",0,0);
        if(cRol.agregarRol(nuevoRol)){
            System.out.println(String.format("El Rol %s fue agregado", nuevoRol.getNomUsuario()));
        }else{
            System.out.println("No se agrego");
        }
    }

    public static void testBuscarRol (int idBuscar){
        Rol encontrado = cRol.buscarRol(1);
        if(encontrado != null){
            System.out.println("El Rol es "+encontrado.getNomUsuario()
                                +" con contraseña "+encontrado.getContraseñaUsuario());
            
        }
        else{
            System.out.println("Rol no encontrado");
        }
    }

    public static void testModificarRol(){
        Rol RolAMod = new Rol("","",0,0);
        if(cRol.modificarRol(RolAMod)){
            System.out.println("Modificado Correctamente");
        }else{
            System.out.println("No Modificado");
        }
    }

    public static void testEliminarRol(int idAEliminar){
        if(cRol.eliminarRol(idAEliminar)){
            System.out.println("Eliminado correctamente");
        }else{
            System.out.println("No se elimino");
        }
    }
   
    public static void testListarRoles(){
        List<Rol> roles = cRol.listarRoles();
                for(Rol temp:roles){
                    System.out.println("nombre: "+temp.getNomUsuario()+ 
                            " tipo rol (1 = Admin/ 2 = Profesor): "+temp.getIdTipoRol());
                }
    }
    
}
