/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import controlador.Controlador_Alumno;
import java.util.Scanner;

/**
 *
 * @author aliss
 */
public class Main {
    private static Controlador_Alumno cAlumno = new Controlador_Alumno();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menu();
            opcion=scann.nextInt();
            
            if(opcion==1){
                
            }
            else if(opcion==2){
                
            }
            else if(opcion==3){
                
            }
            else if(opcion==4){
                
            }
            else if(opcion==5){
                
            }
            else if(opcion==6){
                break;  
            }
            
            limpiarConsola();  
        }
        System.exit(0);
    }
    
    private static void menu (){
        System.out.println("BIENVENIDO AL WIZAR DEL CRUD ALUMNO");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una de las siguientes opciones (1-6) para continuar");
        System.out.println("1.-Agregue un Alumno");
        System.out.println("2.-Modifique un Alumno");
        System.out.println("3.-Elimine un Alumno por su id");
        System.out.println("4.-Busque un Alumno por su id");
        System.out.println("5.-Liste los Alumnos Existentes");
        System.out.println("6.-Salir");
        System.out.print("Ingrese una opción del 1 al 6");
        
    }
    
    private static void limpiarConsola(){
        for(int i=0;i<=100;i++){
            System.out.println("\b");
        }
    }
    
    private static void agregarAlumno(){
        limpiarConsola();
        System.out.println("Bienvenidos a la creación de un nuevo Alumno");
        //Ingresando Rut Alumno
        System.out.print("Ingrese rut sin puntos ni guión ni digito verificador:");
        String rutAlumnoTemp =scann.nextLine().trim();
        int nuevoRutAlumno=0;
        while(nuevoRutAlumno==0){
            try{
                nuevoRutAlumno = Integer.parseInt(rutAlumnoTemp);
                if(nuevoRutAlumno >0){
                    break;
                }
            }
                catch(NumberFormatException e){
                    nuevoRutAlumno =0;
                }
            System.out.println("Ingrese un valor correcto: ");
            rutAlumnoTemp = scann.nextLine().trim();
        }
        
        //Ingresando Nombre Alumno
        System.out.print("Ingrese nombre y 2 apellidos del Alumno:");
        String nuevoNomAlumno =scann.nextLine().trim();
        while(nuevoNomAlumno.length()==0){
            System.out.print("El nombre es obligatorio, porfavor ingrese un nombre");
                    nuevoNomAlumno = scann.nextLine().trim();
        }
                    
        //Ingresando Genero
        
        System.out.print("Ingrese su genero/ 1 si es femenino, 2 si es masculino:");
        String IdGeneroTemp =scann.nextLine().trim();
       
        int nuevoIdGenero=0;
        while(nuevoIdGenero==0){
            try{
                nuevoIdGenero = Integer.parseInt(IdGeneroTemp);
                if(nuevoIdGenero ==1){
                    break;
                }
                else if(nuevoIdGenero ==2){
                    break;
                }
            }
                catch(NumberFormatException e){
                    nuevoRutAlumno =0;
                }
            System.out.println("Ingrese un valor correcto: ");
            rutAlumnoTemp = scann.nextLine().trim();
        }
    }
}
