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
public class Main_3 {
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
        String nombreUsuarioRol =scann.nextLine().trim();
        while(nombreUsuarioRol.length()==0){
            System.out.println("Ingrese un nombre de usuario: ");
            nombreUsuarioRol = scann.nextLine().trim();
        }
        
        //Ingresando Contraseña
        System.out.print("Ingrese la contraseña del Usuario:");
        String nuevaContraseña =scann.nextLine().trim();
        while(nuevaContraseña.length()==0){
            System.out.print("La contraseña es obligatoria, porfavor ingrese una contraseña");
                    nuevaContraseña = scann.nextLine().trim();
        }
        //Ingresando Rol
        System.out.print("Ingrese el Rol del Usuario, 1 es Administrador, 2 es Profesor ");
        String RolTemp = scann.nextLine().trim();
        int nuevoRol = 0;
        while(nuevoRol==0){
            try{
                nuevoRol = Integer.parseInt(RolTemp);
                if(nuevoRol >0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoRol =0;
            }
            System.out.println("Ingrese un valor correcto: ");
            RolTemp = scann.nextLine().trim();
        }
        
        
    }
    //modificar rol
    private static void modificarRol(){
        System.out.println("Bienvenido a Modificar Rol, por favor siga las instrucciones");
        if(cRol.listarRoles().size()>0){
        System.out.print("Ingrese el ID del Rol a modificar: ");
        String idROLTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idROLTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idROLTemp = scann.nextLine();
        }
        System.out.println("Buscando Rol...");
        Rol encontrado = cRol.buscarRol(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Rol válido, intente de nuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idROLTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idROLTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idROLTemp = scann.nextLine();
            }
            System.out.println("Buscando Rol...");
            encontrado = cRol.buscarRol(idBuscar);
        }
            
            System.out.print(String.format("Ingrese un nuevo nombre de usuario para %s (Deje vacio para no cambiar) :", encontrado.getNombreUsuario()));
            String nuevoUsuario = scann.nextLine().trim();
            if(nuevoUsuario.length()>0){
                encontrado.setNombreUsuario(nuevoUsuario);
            }
            
        //rut Profesor
        System.out.print(String.format("Ingrese una nueva contraseña %s (Dejar vacio para no cambiar): ", encontrado.getContraseñaUsuario()));
        String nuevaContraseña = scann.nextLine().trim();
        if(nuevaContraseña.length()>0) {
            encontrado.getContraseñaUsuario();
            }
        
        
        //Rol
        
        System.out.print(String.format("Ingrese un nuevo Rol %s (Dejar vacio para no cambiar): ", encontrado.getTIPOROL_idTIPOROL()));
        String TIPOROL_idTIPOROLTemp = scann.nextLine().trim();
        int nuevoTIPOROL_idTIPOROL = 0;
        if(TIPOROL_idTIPOROLTemp.length()==0){
            nuevoTIPOROL_idTIPOROL = encontrado.getTIPOROL_idTIPOROL();
        }
        while (nuevoTIPOROL_idTIPOROL == 0){
            try{
                nuevoTIPOROL_idTIPOROL = Integer.parseInt(TIPOROL_idTIPOROLTemp);
                if(nuevoTIPOROL_idTIPOROL == 1 || nuevoTIPOROL_idTIPOROL ==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoTIPOROL_idTIPOROL = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            TIPOROL_idTIPOROLTemp = scann.nextLine().trim();
        }
        encontrado.setTIPOROL_idTIPOROL(nuevoTIPOROL_idTIPOROL);
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
        System.out.println(String.format("Rol Encontrado %s ",encontrado.getNombreUsuario()));
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
        String idROLTemp = scann.nextLine();
        int idRol = 0;
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
            System.out.println("la ID no es de un A  valido");
            System.out.print("Ingrese una ID valida");
            idROLTemp = scann.nextLine().trim();
            idRol = 0;
            while(idRol == 0){
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
        
        System.out.println(String.format("Rol Encontrado %s ",encontrado.getNombreUsuario()));
        
        }else{
            System.out.println("Debe Tener Roles antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
    }
    
    private static void listarRoles(){
        List<Rol> Rol = cRol.listarRoles();
        System.out.println("Buscando Roles...");
        if(Rol.size()==0){
            System.out.println("No hay Roles para mostrar");
        }
        else{
            for(Rol temp:cRol.listarRoles()){
                System.out.println("-------------------------------------------");
                System.out.println("Usuario: "+temp.getNombreUsuario()+ " Contraseña: "+temp.getContraseñaUsuario());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}

