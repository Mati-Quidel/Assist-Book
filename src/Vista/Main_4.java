/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import modelo.Credencial;
import controlador.Controlador_Credencial;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Main_4 {
    private static Controlador_Credencial cCredencial = new Controlador_Credencial();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menuCredencial();
            opcion=scann.nextInt();
            
            if(opcion==1){
                agregarCredencial();
            }
            else if(opcion==2){
                modificarCredencial();
            }
            else if(opcion==3){
                eliminarCredencial();
            }
            else if(opcion==4){
                buscarCredencial();
            }
            else if(opcion==5){
                listarCredenciales();
            }
            else if(opcion==6){
                break;  
            }
            
            limpiarConsola();  
        }
        System.exit(0);
    }
    
    private static void menuCredencial (){
        System.out.println("BIENVENIDO AL MENÚ CREDENCIAL");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una de las siguientes opciones (1-6) para continuar");
        System.out.println("1.-Agregue una Credencial");
        System.out.println("2.-Modifique una Credencial");
        System.out.println("3.-Elimine una Credencial por su id");
        System.out.println("4.-Busque una Credencial por su id");
        System.out.println("5.-Liste las Credenciales Existentes");
        System.out.println("6.-Salir");
        System.out.print("Ingrese una opción del 1 al 6: ");
        
    }
    
    private static void limpiarConsola(){
        for(int i=0;i<=100;i++){
            System.out.println("\b");
        }
    }
    
    private static void agregarCredencial(){
        limpiarConsola();
        System.out.println("Bienvenidos a la creación de una nueva Credencial.\n");
        //Ingresando codigo credencial
        System.out.print("Ingrese rut sin puntos ni guión ni digito verificador:");
        String codigoTemp =scann.nextLine().trim();
        int nuevoCodigo=0;
        while(nuevoCodigo==0){
            try{
                nuevoCodigo = Integer.parseInt(codigoTemp);
                if(nuevoCodigo >0){
                    break;
                }
            }
                catch(NumberFormatException e){
                    nuevoCodigo =0;
                }
            System.out.println("Ingrese un valor correcto: ");
            codigoTemp = scann.nextLine().trim();
        }
        
       
        System.out.println("Creando Credencial... por favor espere");
        Credencial tempCredencial =new Credencial(nuevoCodigo);
        if(cCredencial.agregarCredencial(tempCredencial)){
            System.out.println("Credencial Agregada Correctamente");
        }
        else{
            System.out.println("Credencial no agregada");
        }
        System.out.print("Presione enter para continuar");
        scann.nextLine();
        
    }
    
    private static void modificarCredencial(){
        System.out.println("Bienvenido a Modificar Credencial, por favor siga las instrucciones");
        if(cCredencial.listarCredenciales().size()>0){
        System.out.print("Ingrese el ID de la Credencial a modificar: ");
        String idCredencialTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idCredencialTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idCredencialTemp = scann.nextLine();
        }
        System.out.println("Buscando Credencial...");
        Credencial encontrado = cCredencial.buscarCredencial(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de una Credencial válido, intente denuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idCredencialTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idCredencialTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idCredencialTemp = scann.nextLine();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cCredencial.buscarCredencial(idBuscar);
        }
          
        //codigo
        System.out.print(String.format("Ingrese un codigo rut %s (Dejar vacio para no cambiar): ", encontrado.getCodigo()));
        String codigoTemp = scann.nextLine().trim();
        int nuevoCodigo = 0;
        if(codigoTemp.length()==0){
            nuevoCodigo = encontrado.getCodigo();
        }
        while (nuevoCodigo == 0){
            try{
                nuevoCodigo = Integer.parseInt(codigoTemp);
                if(nuevoCodigo>0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoCodigo = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            codigoTemp = scann.nextLine().trim();
        }
        encontrado.setCodigo(nuevoCodigo);
        
        
     
    }else{
            System.out.println("Debe Tener Credenciales antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
    
    private static void eliminarCredencial(){
        System.out.println("Bienvenido a Eliminar Credencial");
        if(cCredencial.listarCredenciales().size()>0){
        System.out.print("Ingrese un ID para eliminar una Credencial");
        String idCredencialTemp = scann.nextLine().trim();
        int idCred = 0 ;
        while (idCred ==0){
            try{
                idCred = Integer.parseInt(idCredencialTemp);
                if(idCred >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idCred = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idCredencialTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Credencial...");
        Credencial encontrado = cCredencial.buscarCredencial(idCred);
        while(encontrado == null){
            System.out.println("la ID no es de una Credencial valida");
            System.out.print("Ingrese una ID valida");
            idCredencialTemp = scann.nextLine().trim();
            idCred = 0;
            while(idCred== 0){
                try{
                    idCred = Integer.parseInt(idCredencialTemp);
                    if(idCred >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idCred = 0;
                }
                System.out.print("Ingrese una ID valida");
                idCredencialTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Credencial...");
            encontrado = cCredencial.buscarCredencial(idCred);
        }
        System.out.println(String.format("Credencial Encontrada %s ",encontrado.getCodigo()));
        System.out.print("Ingrese 1 para eliminar, 2 para cancelar");
        String opcion = scann.nextLine();
        if(opcion.equals("1")){
            System.out.println("Eliminando Credencial...");
            cCredencial.eliminarCredencial(encontrado.getIdCredencial());
            System.out.println("Credencial Eliminada");
        }
        }else{
            System.out.println("Debe Tener Credenciales antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
    
    private static void buscarCredencial(){
        System.out.println("Bienvenido a Buscar Credencial");
        if(cCredencial.listarCredenciales().size()>0){
        System.out.print("Ingrese una ID de una Credencial");
        String idCredencialTemp = scann.nextLine();
        int idCred = 0;
        while (idCred ==0){
            try{
                idCred = Integer.parseInt(idCredencialTemp);
                if(idCred >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idCred = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idCredencialTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Credencial...");
        Credencial encontrado = cCredencial.buscarCredencial(idCred);
        while(encontrado == null){
            System.out.println("la ID no es de una Credencial valida");
            System.out.print("Ingrese una ID valida");
            idCredencialTemp = scann.nextLine().trim();
            idCred = 0;
            while(idCred== 0){
                try{
                    idCred= Integer.parseInt(idCredencialTemp);
                    if(idCred>0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idCred = 0;
                }
                System.out.print("Ingrese una ID valida");
                idCredencialTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Credencial...");
            encontrado = cCredencial.buscarCredencial(idCred);
        }
        
        System.out.println(String.format("Credencial Encontrada %s ",encontrado.getCodigo()));
        
        }else{
            System.out.println("Debe Tener Credenciales antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
    }
    
    private static void listarCredenciales(){
        List<Credencial> credenciales = cCredencial.listarCredenciales();
        System.out.println("Buscando Credencial...");
        if(credenciales.size()==0){
            System.out.println("No hay Credencial para mostrar");
        }
        else{
            for(Credencial temp:cCredencial.listarCredenciales()){
                System.out.println("-------------------------------------------");
                System.out.println("ID Credencial: "+temp.getIdCredencial());
                System.out.println("Codigo: "+temp.getCodigo());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
    
}
