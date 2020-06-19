/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.Controlador_Rol;
import java.util.List;
import java.util.Scanner;
import modelo.Rol;

/**
 *
 * @author Matias
 */
public class Main_Rol {
    private static Controlador_Rol cRol = new Controlador_Rol();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menuRol();
            opcion=scann.nextInt();
       
            if(opcion==1){
                agregarRol();
            }
            else if(opcion==2){
                modificarRol();
            }
            else if(opcion==3){
                eliminarRol();
            }
            else if(opcion==4){
                buscarRol();
            }
            else if(opcion==5){
                listarRoles();
            }
            else if(opcion==6){
                break;  
            }
            
            limpiarConsola();  
        }
        System.exit(0);
    }
    
    private static void menuRol (){
        System.out.println("BIENVENIDO AL MENÚ DE Rol");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una de las siguientes opciones (1-6) para continuar");
        System.out.println("1.-Agregue un Rol");
        System.out.println("2.-Modifique un Rol");
        System.out.println("3.-Elimine un Rol por su id");
        System.out.println("4.-Busque un Rol por su id");
        System.out.println("5.-Liste los Roles Existentes");
        System.out.println("6.-Salir");
        System.out.print("Ingrese una opción del 1 al 6: ");
        
    }
    
    private static void limpiarConsola(){
        for(int i=0;i<=100;i++){
            System.out.println("\b");
        }
    }
    
    private static void agregarRol(){
        limpiarConsola();
        System.out.println("Bienvenido a la creación de un nuevo Rol.\n");
        //Ingresando Usuario
        System.out.print("Ingrese el Usuario:");
        String nomUsuarioRol =scann.nextLine().trim();
        while(nomUsuarioRol.length()==0){
            System.out.println("Ingrese un nombre de usuario: ");
            nomUsuarioRol = scann.nextLine().trim();
        }
        
        //Ingresando Contraseña
        System.out.print("Ingrese la contraseña del Usuario:");
        String nuevaContraseña =scann.nextLine().trim();
        while(nuevaContraseña.length()==0){
            System.out.print("La contraseña es obligatoria, porfavor ingrese una contraseña");
                    nuevaContraseña = scann.nextLine().trim();
        }
        
        //Ingresar id profesor
        
        System.out.print("Ingrese el ID del profesor:");
        String nuevoIdProfesorTemp =scann.nextLine().trim();
       
        int nuevoIdProfesor=0;
        while(nuevoIdProfesor==0){
            try{
                nuevoIdProfesor = Integer.parseInt(nuevoIdProfesorTemp);
                if(nuevoIdProfesor ==1 || nuevoIdProfesor ==2){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoIdProfesor =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoIdProfesorTemp = scann.nextLine().trim();
        }
        
        //Ingresando tipo Rol
        System.out.print("Ingrese el Rol del Usuario, 1 es Administrador, 2 es Profesor ");
        String nuevoIdTipoRolTemp = scann.nextLine().trim();
        int nuevoIdTipoRol = 0;
        while(nuevoIdTipoRol==0){
            try{
                nuevoIdTipoRol = Integer.parseInt(nuevoIdTipoRolTemp);
                if(nuevoIdTipoRol >0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdTipoRol =0;
            }
            System.out.println("Ingrese un valor correcto: ");
            nuevoIdTipoRolTemp = scann.nextLine().trim();
        }
        
        
    }
    //modificar rol
    private static void modificarRol(){
        System.out.println("Bienvenido a Modificar Rol, por favor siga las instrucciones");
        if(cRol.listarRoles().size()>0){
        System.out.print("Ingrese el ID del Rol a modificar: ");
        String idRolTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idRolTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idRolTemp = scann.nextLine();
        }
        System.out.println("Buscando Rol...");
        Rol encontrado = cRol.buscarRol(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Rol válido, intente de nuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idRolTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idRolTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idRolTemp = scann.nextLine();
            }
            System.out.println("Buscando Rol...");
            encontrado = cRol.buscarRol(idBuscar);
        }
            
        // modificar usuario
            System.out.print(String.format("Ingrese un nuevo nombre de usuario para %s (Deje vacio para no cambiar) :", encontrado.getNomUsuario()));
            String nuevoUsuario = scann.nextLine().trim();
            if(nuevoUsuario.length()>0){
                encontrado.setNomUsuario(nuevoUsuario);
            }
            
        //contraseña rol
        System.out.print(String.format("Ingrese una nueva contraseña %s (Dejar vacio para no cambiar): ", encontrado.getContraseñaUsuario()));
        String nuevaContraseña = scann.nextLine().trim();
        if(nuevaContraseña.length()>0) {
            encontrado.getContraseñaUsuario();
            }
        
        // id profesor
        
        System.out.print(String.format("Ingrese un nuevo profesor %s (Dejar vacio para no cambiar): ", encontrado.getIdProfesor()));
        String idProfesorTemp = scann.nextLine().trim();
        int nuevoIdProfesor = 0;
        if(idProfesorTemp.length()==0){
            nuevoIdProfesor= encontrado.getIdProfesor();
        }
        while (nuevoIdProfesor == 0){
            try{
                nuevoIdProfesor = Integer.parseInt(idProfesorTemp);
                if(nuevoIdProfesor== 1 || nuevoIdProfesor ==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdProfesor= 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idProfesorTemp = scann.nextLine().trim();
        }
        encontrado.setIdProfesor(nuevoIdProfesor);
        
        
        //tipo Rol
        
        System.out.print(String.format("Ingrese un nuevo Rol %s (Dejar vacio para no cambiar): ", encontrado.getIdTipoRol()));
        String idTipoRolTemp = scann.nextLine().trim();
        int nuevoIdTipoRol = 0;
        if(idTipoRolTemp.length()==0){
            nuevoIdTipoRol= encontrado.getIdTipoRol();
        }
        while (nuevoIdTipoRol == 0){
            try{
                nuevoIdTipoRol = Integer.parseInt(idTipoRolTemp);
                if(nuevoIdTipoRol == 1 || nuevoIdTipoRol ==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdTipoRol= 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idTipoRolTemp = scann.nextLine().trim();
        }
        encontrado.setIdTipoRol(nuevoIdTipoRol);
        }
        }
    

    private static void eliminarRol (){
        System.out.println("Bienvenido a Eliminar Rol");
        if(cRol.listarRoles().size()>0){
        System.out.print("Ingrese un ID para eliminar un Rol");
        String idROLTemp = scann.nextLine().trim();
        int idRol = 0 ;
        while (idRol ==0){
            try{
                idRol = Integer.parseInt(idROLTemp);
                if(idRol >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idRol = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idROLTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Rol...");
        Rol encontrado = cRol.buscarRol(idRol);
        while(encontrado == null){
            System.out.println("la ID no es de un Rol valido");
            System.out.print("Ingrese una ID valida");
            idROLTemp = scann.nextLine().trim();
            idRol = 0;
            while(idRol== 0){
                try{
                    idRol = Integer.parseInt(idROLTemp);
                    if(idRol >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idRol = 0;
                }
                System.out.print("Ingrese una ID valida");
                idROLTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Rol...");
            encontrado = cRol.buscarRol(idRol);
        }
        System.out.println(String.format("Rol Encontrado %s ",encontrado.getNomUsuario()));
        System.out.print("Ingrese 1 para eliminar, 2 para cancelar");
        String opcion = scann.nextLine();
        if(opcion.equals("1")){
            System.out.println("Eliminando Rol...");
            cRol.eliminarRol(idRol);
            System.out.println("Rol Eliminado");
        }
        }else{
            System.out.println("Debe Tener Roles antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
    
    private static void buscarRol(){
        System.out.println("Bienvenido a Buscar Rol");
        if(cRol.listarRoles().size()>0){
        System.out.print("Ingrese una ID de un Rol");
        String idRolTemp = scann.nextLine();
        int idRol = 0;
        while (idRol ==0){
            try{
                idRol = Integer.parseInt(idRolTemp);
                if(idRol >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idRol = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idRolTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Rol...");
        Rol encontrado = cRol.buscarRol(idRol);
        while(encontrado == null){
            System.out.println("la ID no es de un A  valido");
            System.out.print("Ingrese una ID valida");
            idRolTemp = scann.nextLine().trim();
            idRol = 0;
            while(idRol == 0){
                try{
                    idRol = Integer.parseInt(idRolTemp);
                    if(idRol >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idRol = 0;
                }
                System.out.print("Ingrese una ID valida");
                idRolTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Rol...");
            encontrado = cRol.buscarRol(idRol);
        }
        
        System.out.println(String.format("Rol Encontrado %s ",encontrado.getNomUsuario()));
        
        }else{
            System.out.println("Debe Tener Roles antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
    }
    
    private static void listarRoles(){
        List<Rol> roles = cRol.listarRoles();
        System.out.println("Buscando Roles...");
        if(roles.size()==0){
            System.out.println("No hay Roles para mostrar");
        }
        else{
            for(Rol temp:cRol.listarRoles()){
                System.out.println("-------------------------------------------");
                System.out.println("Usuario: "+temp.getNomUsuario()+ " Contraseña: "+temp.getContraseñaUsuario());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}

