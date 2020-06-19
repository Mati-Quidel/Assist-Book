/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import controlador.Controlador_Credencial;
import  modelo.Credencial;
import java.util.List;
/**
 *
 * @author aliss
 */
public class testControlador_Credencial {
    private static final Controlador_Credencial cCredencial = new Controlador_Credencial();
    
    public static void main (String... args){
       //testAgregarCredencial();
       //testBuscarCredencial(1);
       //testModificarCredencial();
       //testEliminarCredencial();
       testListarCredenciales();
    }
    
    public static void testAgregarCredencial(){
        Credencial nuevoCredencial = new Credencial (0);
        if(cCredencial.agregarCredencial(nuevoCredencial)){
            System.out.println(String.format("La Credencial %s fue agregado", nuevoCredencial.getCodigo()));
        }else{
            System.out.println("No se agrego");
        }
    }

    public static void testBuscarCredencial (int idBuscar){
        Credencial encontrado = cCredencial.buscarCredencial(1);
        if(encontrado != null){
            System.out.println("Credencial de ID "+encontrado.getIdCredencial()
                                +" con codigo "+encontrado.getCodigo());
            
        }
        else{
            System.out.println("Credencial no encontrada");
        }
    }

    public static void testModificarCredencial(){
        Credencial CredAMod = new Credencial(0);
        if(cCredencial.modificarCredencial(CredAMod)){
            System.out.println("Modificada Correctamente");
        }else{
            System.out.println("No Modificada");
        }
    }

    public static void testEliminarCredencial(int idAEliminar){
        if(cCredencial.eliminarCredencial(idAEliminar)){
            System.out.println("Eliminada correctamente");
        }else{
            System.out.println("No se elimino");
        }
    }
   
    public static void testListarCredenciales(){
        List<Credencial> credenciales = cCredencial.listarCredenciales();
                for(Credencial temp:credenciales){
                    System.out.println("ID credencial : "+temp.getIdCredencial()+ 
                            " codigo : "+temp.getCodigo());
                }
    }
}
