/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import controlador.Controlador_Detalle_Libro;
import modelo.Detalle_Libro;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author aliss
 */
public class Main_DetalleLibro {
    private static Controlador_Detalle_Libro cDLibro = new Controlador_Detalle_Libro();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menuDetalle_Libro();
            opcion=scann.nextInt();
       
            if(opcion==1){
                agregarDetalle();
            }
            else if(opcion==2){
                modificarDetalle();
            }
            else if(opcion==3){
                eliminarDetalle();
            }
            else if(opcion==4){
                buscarDetalle();
            }
            else if(opcion==5){
                listarDetalles();
            }
            else if(opcion==6){
                break;  
            }
            
            limpiarConsola();  
        }
        System.exit(0);
    }
    
    private static void menuDetalle_Libro(){
        System.out.println("BIENVENIDO AL MENÚ DE Detalle_Libro");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una de las siguientes opciones (1-6) para continuar");
        System.out.println("1.-Agregue un Detalle");
        System.out.println("2.-Modifique un Detalle");
        System.out.println("3.-Elimine un Detalle por su id");
        System.out.println("4.-Busque un Detalle por su id");
        System.out.println("5.-Liste los Detalles Existentes");
        System.out.println("6.-Salir");
        System.out.print("Ingrese una opción del 1 al 6: ");
        
    }
    
    private static void limpiarConsola(){
        for(int i=0;i<=100;i++){
            System.out.println("\b");
        }
    }
    
    private static void agregarDetalle(){
        limpiarConsola();
        System.out.println("Bienvenido a la creación de un nuevo Detalle.\n");
        
        //Ingresar id Libro
        
        System.out.print("Ingrese el ID de la Libro:");
        String nuevoIdLibroTemp =scann.nextLine().trim();
       
        int nuevoIdLibro=0;
        while(nuevoIdLibro==0){
            try{
                nuevoIdLibro = Integer.parseInt(nuevoIdLibroTemp);
                if(nuevoIdLibro ==1 || nuevoIdLibro ==2){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoIdLibro =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoIdLibroTemp = scann.nextLine().trim();
        }
        //Ingresar id Asignatura
        
        System.out.print("Ingrese el ID de la Asignatura:");
        String nuevoIdAsignaturaTemp =scann.nextLine().trim();
       
        int nuevoIdAsignatura=0;
        while(nuevoIdAsignatura==0){
            try{
                nuevoIdAsignatura = Integer.parseInt(nuevoIdAsignaturaTemp);
                if(nuevoIdAsignatura ==1 || nuevoIdAsignatura ==2){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoIdAsignatura =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoIdAsignaturaTemp = scann.nextLine().trim();
        }
        
        //Ingresar id tipo asistencia
        
        System.out.print("Ingrese el ID (1 asistente / 2 inasistente):");
        String nuevoIdTipoAsisTemp =scann.nextLine().trim();
       
        int nuevoIdTipoAsis=0;
        while(nuevoIdTipoAsis==0){
            try{
                nuevoIdTipoAsis = Integer.parseInt(nuevoIdTipoAsisTemp);
                if(nuevoIdTipoAsis ==1 || nuevoIdTipoAsis ==2){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoIdTipoAsis =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoIdTipoAsisTemp = scann.nextLine().trim();
        }
       
    }
    //modificar rol
    private static void modificarDetalle(){
        System.out.println("Bienvenido a Modificar Detalle Libro, por favor siga las instrucciones");
        if(cDLibro.listarDetalles().size()>0){
        System.out.print("Ingrese el ID del Detalle a modificar: ");
        String idDetalleTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idDetalleTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idDetalleTemp = scann.nextLine();
        }
        System.out.println("Buscando Detalle...");
        Detalle_Libro encontrado = cDLibro.buscarDetalle(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Detalle válido, intente de nuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idDetalleTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idDetalleTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idDetalleTemp = scann.nextLine();
            }
            System.out.println("Buscando Detalle...");
            encontrado = cDLibro.buscarDetalle(idBuscar);
        }
         // id Libro
        
        System.out.print(String.format("Ingrese un nuevo Libro %s (Dejar vacio para no cambiar): ", encontrado.getIdLibro()));
        String idLibroTemp = scann.nextLine().trim();
        int nuevoIdLibro = 0;
        if(idLibroTemp.length()==0){
            nuevoIdLibro= encontrado.getIdLibro();
        }
        while (nuevoIdLibro == 0){
            try{
                nuevoIdLibro = Integer.parseInt(idLibroTemp);
                if(nuevoIdLibro== 1 || nuevoIdLibro==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdLibro = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idLibroTemp = scann.nextLine().trim();
        }
        encontrado.setIdLibro(nuevoIdLibro);   
        
        // id Asignatura
        
        System.out.print(String.format("Ingrese un nueva asignatura %s (Dejar vacio para no cambiar): ", encontrado.getIdAsignatura()));
        String idAsignaturaTemp = scann.nextLine().trim();
        int nuevoIdAsignatura = 0;
        if(idAsignaturaTemp.length()==0){
            nuevoIdAsignatura= encontrado.getIdAsignatura();
        }
        while (nuevoIdAsignatura == 0){
            try{
                nuevoIdAsignatura = Integer.parseInt(idAsignaturaTemp);
                if(nuevoIdAsignatura== 1 || nuevoIdAsignatura==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdAsignatura = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idAsignaturaTemp = scann.nextLine().trim();
        }
        encontrado.setIdAsignatura(nuevoIdAsignatura);
        
        // id TIPO ASISTENCIA
        
        System.out.print(String.format("Ingrese un nuevo tipo de asistencia  %s (Dejar vacio para no cambiar): ", encontrado.getIdTipoAsis()));
        String idTipoAsisTemp = scann.nextLine().trim();
        int nuevoIdTipoAsis = 0;
        if(idTipoAsisTemp.length()==0){
            nuevoIdTipoAsis= encontrado.getIdTipoAsis();
        }
        while (nuevoIdTipoAsis == 0){
            try{
                nuevoIdTipoAsis= Integer.parseInt(idTipoAsisTemp);
                if(nuevoIdTipoAsis== 1 || nuevoIdTipoAsis==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdTipoAsis = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idTipoAsisTemp = scann.nextLine().trim();
        }
        encontrado.setIdTipoAsis(nuevoIdTipoAsis);
       
        
            }
        }
    

    private static void eliminarDetalle(){
        System.out.println("Bienvenido a Eliminar Detalle");
        if(cDLibro.listarDetalles().size()>0){
        System.out.print("Ingrese un ID para eliminar un Detalle");
        String idDetalleTemp = scann.nextLine().trim();
        int idDetalle = 0 ;
        while (idDetalle ==0){
            try{
                idDetalle = Integer.parseInt(idDetalleTemp);
                if(idDetalle >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idDetalle = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idDetalleTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Detalle...");
        Detalle_Libro encontrado = cDLibro.buscarDetalle(idDetalle);
        while(encontrado == null){
            System.out.println("la ID no es de un Detalle valido");
            System.out.print("Ingrese una ID valida");
            idDetalleTemp = scann.nextLine().trim();
            idDetalle = 0;
            while(idDetalle== 0){
                try{
                    idDetalle = Integer.parseInt(idDetalleTemp);
                    if(idDetalle >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idDetalle = 0;
                }
                System.out.print("Ingrese una ID valida");
                idDetalleTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Detalle...");
            encontrado = cDLibro.buscarDetalle(idDetalle);
        }
        System.out.println(String.format("Detalle Encontrado %s ",encontrado.getIdDetalle()));
        System.out.print("Ingrese 1 para eliminar, 2 para cancelar");
        String opcion = scann.nextLine();
        if(opcion.equals("1")){
            System.out.println("Eliminando Detalle...");
            cDLibro.eliminarDetalle(idDetalle);
            System.out.println("Detalle Eliminado");
        }
        }else{
            System.out.println("Debe Tener Detalles antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
    
    private static void buscarDetalle(){
        System.out.println("Bienvenido a Buscar Detalle");
        if(cDLibro.listarDetalles().size()>0){
        System.out.print("Ingrese una ID de un Detalle");
        String idDetalleTemp = scann.nextLine();
        int idDetalle = 0;
        while (idDetalle ==0){
            try{
                idDetalle = Integer.parseInt(idDetalleTemp);
                if(idDetalle>0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idDetalle = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idDetalleTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Detalle...");
        Detalle_Libro encontrado = cDLibro.buscarDetalle(idDetalle);
        while(encontrado == null){
            System.out.println("la ID no es de un Detalle valido");
            System.out.print("Ingrese una ID valida");
            idDetalleTemp = scann.nextLine().trim();
            idDetalle = 0;
            while(idDetalle == 0){
                try{
                    idDetalle = Integer.parseInt(idDetalleTemp);
                    if(idDetalle >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idDetalle = 0;
                }
                System.out.print("Ingrese una ID valida");
                idDetalleTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Detalle...");
            encontrado = cDLibro.buscarDetalle(idDetalle);
        }
        
        System.out.println(String.format("Detalle Encontrado %s ",encontrado.getIdDetalle()));
        
        }else{
            System.out.println("Debe Tener Libros antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
    }
    
    private static void listarDetalles(){
        List<Detalle_Libro> detalles = cDLibro.listarDetalles();
        System.out.println("Buscando Detalles...");
        if(detalles.size()==0){
            System.out.println("No hay Detalles para mostrar");
        }
        else{
            for(Detalle_Libro temp:cDLibro.listarDetalles()){
                System.out.println("-------------------------------------------");
                System.out.println("Asistencia: "+temp.getIdTipoAsis());
                System.out.println("Asignatura: "+ temp.getIdAsignatura());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}
