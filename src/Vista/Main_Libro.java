/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import controlador.Controlador_Libro;
import java.sql.Date;
import java.time.LocalDate;
import modelo.Libro;
import java.util.Scanner;
import java.util.List;
import modelo.Detalle_Libro;
/**
 *
 * @author aliss
 */
public class Main_Libro {
    private static Controlador_Libro cLibro = new Controlador_Libro();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menuLibro();
            opcion=scann.nextInt();
       
            if(opcion==1){
                agregarLibro ();
            }
            else if(opcion==2){
                 modificarLibro();
            }
            else if(opcion==3){
                eliminarLibro();
            }
            else if(opcion==4){
                buscarLibro();
            }
            else if(opcion==5){
                listarLibros();
            }
            else if(opcion==6){
                break;  
            }
            
            limpiarConsola();  
        }
        System.exit(0);
        
    }
    
    private static void menuLibro(){
        System.out.println("BIENVENIDO AL MENÚ DE LIBRO");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una de las siguientes opciones (1-6) para continuar");
        System.out.println("1.-Agregue un Libro");
        System.out.println("2.-Modifique un Libro");
        System.out.println("3.-Elimine un Libro por su id");
        System.out.println("4.-Busque un Libro por su id");
        System.out.println("5.-Liste los Libros Existentes");
        System.out.println("6.-Salir");
        System.out.print("Ingrese una opción del 1 al 6: ");
        
    }
    
    private static void limpiarConsola(){
        for(int i=0;i<=100;i++){
            System.out.println("\b");
        }
    }
    //AGREGAR LIBRO
    private static void agregarLibro(){
        limpiarConsola();
        System.out.println("Bienvenidos a la creación de un nuevo Alumno.\n");
        //Ingresar Nivel
        System.out.print("Ingrese el Nivel (ejemplo 1A):");
        String nuevoNivel =scann.nextLine().trim();
        while(nuevoNivel.length()==0){
            System.out.println("Ingrese un nivel junto a su letra (ejemplo 1A) : ");
            nuevoNivel = scann.nextLine().trim();
        }
        
        //Ingresar id sala
        
        System.out.print("Ingrese el ID de la sala:");
        String nuevoIdSalaTemp =scann.nextLine().trim();
       
        int nuevoIdSala=0;
        while(nuevoIdSala==0){
            try{
                nuevoIdSala = Integer.parseInt(nuevoIdSalaTemp);
                if(nuevoIdSala ==1 || nuevoIdSala ==2){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoIdSala =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoIdSalaTemp = scann.nextLine().trim();
        }
        
    
    //Agregar profesor
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
        
       }
    
    
    //MODIFICAR LIBRO
    private static void modificarLibro(){
        System.out.println("Bienvenido a Modificar Libro, por favor siga las instrucciones");
        if(cLibro.listarLibros().size()>0){
        System.out.print("Ingrese el ID del Libro a modificar: ");
        String idLibroTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idLibroTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idLibroTemp = scann.nextLine();
        }
        System.out.println("Buscando Libro...");
        Libro encontrado = cLibro.buscarLibro(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Libro válido, intente de nuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idLibroTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idLibroTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idLibroTemp = scann.nextLine();
            }
            System.out.println("Buscando Libro...");
            encontrado = cLibro.buscarLibro(idBuscar);
        }
        // nivel
            System.out.print(String.format("Ingrese un nuevo nivel para %s (Deje vacio para no cambiar) :", encontrado.getNivel()));
            String nuevoNivel = scann.nextLine().trim();
            if(nuevoNivel.length()>0){
                encontrado.setNivel(nuevoNivel);
            }
            
        // id sala
        
        System.out.print(String.format("Ingrese un nueva sala %s (Dejar vacio para no cambiar): ", encontrado.getIdSala()));
        String idSalaTemp = scann.nextLine().trim();
        int nuevoIdSala = 0;
        if(idSalaTemp.length()==0){
            nuevoIdSala= encontrado.getIdSala();
        }
        while (nuevoIdSala == 0){
            try{
                nuevoIdSala = Integer.parseInt(idSalaTemp);
                if(nuevoIdSala== 1 || nuevoIdSala ==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdSala= 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idSalaTemp = scann.nextLine().trim();
        }
        encontrado.setIdSala(nuevoIdSala);
        
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
        encontrado.setIdProfesor(nuevoIdProfesor);}}
    
    
    //ELIMINAR LIBRO
    private static void eliminarLibro(){
        
        if(cLibro.listarLibros().size()>0){
        System.out.print("Ingrese un ID para eliminar un Libro");
        String idLibroTemp = scann.nextLine().trim();
        int idLibro = 0 ;
        while (idLibro ==0){
            try{
                idLibro = Integer.parseInt(idLibroTemp);
                if(idLibro >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idLibro = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idLibroTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Libro...");
        Libro encontrado = cLibro.buscarLibro(idLibro);
        while(encontrado == null){
            System.out.println("la ID no es de un Libro valido");
            System.out.print("Ingrese una ID valida");
            idLibroTemp = scann.nextLine().trim();
            idLibro = 0;
            while(idLibro== 0){
                try{
                    idLibro = Integer.parseInt(idLibroTemp);
                    if(idLibro >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idLibro = 0;
                }
                System.out.print("Ingrese una ID valida");
                idLibroTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Libro...");
            encontrado = cLibro.buscarLibro(idLibro);
        }
        System.out.println(String.format("Libro Encontrado %s ",encontrado.getNivel()));
        System.out.print("Ingrese 1 para eliminar, 2 para cancelar");
        String opcion = scann.nextLine();
        if(opcion.equals("1")){
            System.out.println("Eliminando Libro...");
            cLibro.eliminarLibro(idLibro);
            System.out.println("Libro Eliminado");
        }
        }else{
            System.out.println("Debe Tener Libros antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
        
    private static void buscarLibro(){
        System.out.println("Bienvenido a Buscar Libro");
        if(cLibro.listarLibros().size()>0){
        System.out.print("Ingrese una ID de un Libro");
        String idLibroTemp = scann.nextLine();
        int idLibro = 0;
        while (idLibro ==0){
            try{
                idLibro = Integer.parseInt(idLibroTemp);
                if(idLibro>0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idLibro = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idLibroTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Libro...");
        Libro encontrado = cLibro.buscarLibro(idLibro);
        while(encontrado == null){
            System.out.println("la ID no es de un Libro  valido");
            System.out.print("Ingrese una ID valida");
            idLibroTemp = scann.nextLine().trim();
            idLibro = 0;
            while(idLibro == 0){
                try{
                    idLibro = Integer.parseInt(idLibroTemp);
                    if(idLibro >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idLibro = 0;
                }
                System.out.print("Ingrese una ID valida");
                idLibroTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Libro...");
            encontrado = cLibro.buscarLibro(idLibro);
        }
        
        System.out.println(String.format("Libro Encontrado %s ",encontrado.getNivel()));
        
        }else{
            System.out.println("Debe Tener Libros antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
    }

    private static void listarLibros(){
        List<Libro> libros = cLibro.listarLibros();
        System.out.println("Buscando Libros...");
        if(libros.size()==0){
            System.out.println("No hay Libros para mostrar");
        }
        else{
            for(Libro temp:cLibro.listarLibros()){
                System.out.println("-------------------------------------------");
                System.out.println("Nivel: "+temp.getNivel());
                System.out.println("Sala: "+temp.getIdSala());
                System.out.println("Profesor: "+ temp.getIdProfesor());  
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}

