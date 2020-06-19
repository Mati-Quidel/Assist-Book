/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import controlador.Controlador_Profesor;
import modelo.Profesor;
import java.util.Scanner;
import java.util.List;
/**
 *
 * @author Matias
 */
public class Main_2 {
    private static Controlador_Profesor cProfesor = new Controlador_Profesor();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menuAlumno();
            opcion=scann.nextInt();
       
            if(opcion==1){
                agregarProfesor();
            }
            else if(opcion==2){
                modificarProfesor();
            }
            else if(opcion==3){
                eliminarProfesor();
            }
            else if(opcion==4){
                buscarProfesor();
            }
            else if(opcion==5){
                listarProfesor();
            }
            else if(opcion==6){
                break;  
            }
            
            limpiarConsola();  
        }
        System.exit(0);
    }
    
    private static void menuAlumno (){
        System.out.println("BIENVENIDO AL MENÚ DE PROFESOR");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una de las siguientes opciones (1-6) para continuar");
        System.out.println("1.-Agregue un Profesor");
        System.out.println("2.-Modifique un Profesor");
        System.out.println("3.-Elimine un Profesor por su id");
        System.out.println("4.-Busque un Profesor por su id");
        System.out.println("5.-Liste los Profesores Existentes");
        System.out.println("6.-Salir");
        System.out.print("Ingrese una opción del 1 al 6: ");
        
    }
    
    private static void limpiarConsola(){
        for(int i=0;i<=100;i++){
            System.out.println("\b");
        }
    }
    
    private static void agregarProfesor(){
        limpiarConsola();
        System.out.println("Bienvenido a la creación de un nuevo Profesor.\n");
        //Ingresando Rut Profesor
        System.out.print("Ingrese rut sin puntos ni guión ni digito verificador:");
        String rutProfeTemp =scann.nextLine().trim();
        int nuevoRutProfe=0;
        while(nuevoRutProfe==0){
            try{
                nuevoRutProfe = Integer.parseInt(rutProfeTemp);
                if(nuevoRutProfe >0){
                    break;
                }
            }
                catch(NumberFormatException e){
                    nuevoRutProfe =0;
                }
            System.out.println("Ingrese un valor correcto: ");
            rutProfeTemp = scann.nextLine().trim();
        }
        
        //Ingresando Nombre Profesor
        System.out.print("Ingrese nombre y 2 apellidos del Alumno:");
        String nuevoNomProfe =scann.nextLine().trim();
        while(nuevoNomProfe.length()==0){
            System.out.print("El nombre es obligatorio, porfavor ingrese un nombre");
                    nuevoNomProfe = scann.nextLine().trim();
        }
                    
       
    }
    
    private static void modificarProfesor(){
        System.out.println("Bienvenido a Modificar Alumno, por favor siga las instrucciones");
        if(cProfesor.listarProfesores().size()>0){
        System.out.print("Ingrese el ID del Profesor a modificar: ");
        String idProfesorTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idProfesorTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idProfesorTemp = scann.nextLine();
        }
        System.out.println("Buscando Profesor...");
        Profesor encontrado = cProfesor.buscarProfesor(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Profesor válido, intente denuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idProfesorTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idProfesorTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idProfesorTemp = scann.nextLine();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cProfesor.buscarProfesor(idBuscar);
        }
             // nombre
            System.out.print(String.format("Ingrese un nuevo nombre para %s (Deje vacio para no cambiar) :", encontrado.getNomProfe()));
            String nuevoNomProfe = scann.nextLine().trim();
            if(nuevoNomProfe.length()>0){
                encontrado.setNomProfe(nuevoNomProfe);
            }
            
        //rut Profesor
        System.out.print(String.format("Ingrese un nuevo rut %s (Dejar vacio para no cambiar): ", encontrado.getRutProfe()));
        String rutProfeTemp = scann.nextLine().trim();
        int nuevoRutProfe = 0;
        if(rutProfeTemp.length()==0){
            nuevoRutProfe = encontrado.getRutProfe();
        }
        while (nuevoRutProfe == 0){
            try{
                nuevoRutProfe = Integer.parseInt(rutProfeTemp);
                if(nuevoRutProfe>0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoRutProfe = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            rutProfeTemp = scann.nextLine().trim();
        }
        encontrado.setRutProfe(nuevoRutProfe);
        
        
        
        System.out.println("Actualizando Profesor...");
        if(cProfesor.modificarProfesor(encontrado)){
            System.out.println("Profesor Modificado correctamente");
        }
        else{
           
            System.out.println("No modificado");
            }
        }else{
            System.out.println("Debe Tener Profesores antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
     
    }
    
    private static void eliminarProfesor (){
        System.out.println("Bienvenido a Eliminar Profesor");
        if(cProfesor.listarProfesores().size()>0){
        System.out.print("Ingrese un ID para eliminar un Profesor");
        String idProfesorTemp = scann.nextLine().trim();
        int idProfe = 0 ;
        while (idProfe ==0){
            try{
                idProfe = Integer.parseInt(idProfesorTemp);
                if(idProfe >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idProfe = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idProfesorTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Profesor...");
        Profesor encontrado = cProfesor.buscarProfesor(idProfe);
        while(encontrado == null){
            System.out.println("la ID no es de un Profesor valido");
            System.out.print("Ingrese una ID valida");
            idProfesorTemp = scann.nextLine().trim();
            idProfe = 0;
            while(idProfe== 0){
                try{
                    idProfe = Integer.parseInt(idProfesorTemp);
                    if(idProfe >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idProfe = 0;
                }
                System.out.print("Ingrese una ID valida");
                idProfesorTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Profesor...");
            encontrado = cProfesor.buscarProfesor(idProfe);
        }
        System.out.println(String.format("Profesor Encontrado %s ",encontrado.getNomProfe()));
        System.out.print("Ingrese 1 para eliminar, 2 para cancelar");
        String opcion = scann.nextLine();
        if(opcion.equals("1")){
            System.out.println("Eliminando Profesor...");
            cProfesor.eliminarProfesor(idProfe);
            System.out.println("Profesor Eliminado");
        }
        }else{
            System.out.println("Debe Tener Profesor antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
    
    private static void buscarProfesor(){
        System.out.println("Bienvenido a Buscar Profesor");
        if(cProfesor.listarProfesores().size()>0){
        System.out.print("Ingrese una ID de un Profesor");
        String idProfesorTemp = scann.nextLine();
        int idProfe = 0;
        while (idProfe ==0){
            try{
                idProfe = Integer.parseInt(idProfesorTemp);
                if(idProfe >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idProfe = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idProfesorTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Profesor...");
        Profesor encontrado = cProfesor.buscarProfesor(idProfe);
        while(encontrado == null){
            System.out.println("la ID no es de un Alumno valido");
            System.out.print("Ingrese una ID valida");
            idProfesorTemp = scann.nextLine().trim();
            idProfe = 0;
            while(idProfe== 0){
                try{
                    idProfe = Integer.parseInt(idProfesorTemp);
                    if(idProfe >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idProfe = 0;
                }
                System.out.print("Ingrese una ID valida");
                idProfesorTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Profesor...");
            encontrado = cProfesor.buscarProfesor(idProfe);
        }
        
        System.out.println(String.format("Profesor Encontrado %s ",encontrado.getNomProfe()));
        
        }else{
            System.out.println("Debe Tener Profesores antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
    }
    
    private static void listarProfesor(){
        List<Profesor> profesor = cProfesor.listarProfesores();
        System.out.println("Buscando Profesores...");
        if(profesor.size()==0){
            System.out.println("No hay Profesores para mostrar");
        }
        else{
            for(Profesor temp:cProfesor.listarProfesores()){
                System.out.println("-------------------------------------------");
                System.out.println("nombre: "+temp.getNomProfe()+ " Rut: "+temp.getRutProfe());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}

