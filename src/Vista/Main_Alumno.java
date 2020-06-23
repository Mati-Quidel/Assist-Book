/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import controlador.Controlador_Alumno;
import modelo.Alumno;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author aliss
 */
public class Main_Alumno {
    private static Controlador_Alumno cAlumno = new Controlador_Alumno();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menuAlumno();
            opcion=scann.nextInt();
            
            if(opcion==1){
                agregarAlumno();
            }
            else if(opcion==2){
                modificarAlumno();
            }
            else if(opcion==3){
                eliminarAlumno();
            }
            else if(opcion==4){
                buscarAlumno();
            }
            else if(opcion==5){
                listarAlumnos();
            }
            else if(opcion==6){
                break;  
            }
            
            limpiarConsola();  
        }
        System.exit(0);
    }
    
    private static void menuAlumno (){
        System.out.println("BIENVENIDO AL MENÚ ALUMNO");
        System.out.println("-----------------------------------");
        System.out.println("Seleccione una de las siguientes opciones (1-6) para continuar");
        System.out.println("1.-Agregue un Alumno");
        System.out.println("2.-Modifique un Alumno");
        System.out.println("3.-Elimine un Alumno por su id");
        System.out.println("4.-Busque un Alumno por su id");
        System.out.println("5.-Liste los Alumnos Existentes");
        System.out.println("6.-Salir");
        System.out.print("Ingrese una opción del 1 al 6: ");
        
    }
    
    private static void limpiarConsola(){
        for(int i=0;i<=100;i++){
            System.out.println("\b");
        }
    }
    
    private static void agregarAlumno(){
        limpiarConsola();
        System.out.println("Bienvenidos a la creación de un nuevo Alumno.\n");
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
        String nuevoIdGeneroTemp =scann.nextLine().trim();
       
        int nuevoIdGenero=0;
        while(nuevoIdGenero==0){
            try{
                nuevoIdGenero = Integer.parseInt(nuevoIdGeneroTemp);
                if(nuevoIdGenero ==1 || nuevoIdGenero==2){
                    break;
                
                }
            }
                catch(NumberFormatException e){
                    nuevoIdGenero =0;
                }
            System.out.println("Ingrese un valor correcto: ");
            nuevoIdGeneroTemp = scann.nextLine().trim();
        }
        
        //ingresar estado matricula
        
        System.out.print("Ingrese 1 ya que su matricula es activa:");
        String nuevoIdMatriculaTemp =scann.nextLine().trim();
       
        int nuevoIdMatricula=0;
        while(nuevoIdMatricula==0){
            try{
                nuevoIdMatricula = Integer.parseInt(nuevoIdMatriculaTemp);
                if(nuevoIdMatricula ==1){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoIdMatricula =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoIdMatriculaTemp = scann.nextLine().trim();
        }
        
        // ingresar id Libro
       
       System.out.print("Ingrese id Libro :");
        String nuevoIdLibroTemp =scann.nextLine().trim();
       
        int nuevoIdLibro=0;
        while(nuevoIdLibro==0){
            try{
                nuevoIdLibro = Integer.parseInt(nuevoIdLibroTemp);
                if(nuevoIdLibro >0){
                    break;
                }
            }
                catch(NumberFormatException e){
                   nuevoIdLibro =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoIdLibroTemp = scann.nextLine().trim();
        }
        
        
       
        System.out.println("Creando Alumno... por favor espere");
        Alumno tempAlumno =new Alumno(nuevoRutAlumno,nuevoNomAlumno,nuevoIdGenero,nuevoIdMatricula, nuevoIdLibro);
        if(cAlumno.agregarAlumno(tempAlumno)){
            System.out.println("Alumno Agregado Correctamente");
        }
        else{
            System.out.println("Alumno no agregado");
        }
        System.out.print("Presione enter para continuar");
        scann.nextLine();
        
    }
    
    private static void modificarAlumno(){
        System.out.println("Bienvenido a Modificar Alumno, por favor siga las instrucciones");
        if(cAlumno.listarAlumnos().size()>0){
        System.out.print("Ingrese el ID del alumno a modificar: ");
        String idAlumnoTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idAlumnoTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idAlumnoTemp = scann.nextLine();
        }
        System.out.println("Buscando Alumno...");
        Alumno encontrado = cAlumno.buscarAlumno(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Alumno válido, intente denuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idAlumnoTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idAlumnoTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idAlumnoTemp = scann.nextLine();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cAlumno.buscarAlumno(idBuscar);
        }
            
            System.out.print(String.format("Ingrese un nuevo nombre para %s (Deje vacio para no cambiar) :", encontrado.getNomAlumno()));
            String nuevoNomAlumno = scann.nextLine().trim();
            if(nuevoNomAlumno.length()>0){
                encontrado.setNomAlumno(nuevoNomAlumno);
            }
            
        //rut alumno
        System.out.print(String.format("Ingrese un nuevo rut %s (Dejar vacio para no cambiar): ", encontrado.getRutAlumno()));
        String rutAlumnoTemp = scann.nextLine().trim();
        int nuevoRutAlumno = 0;
        if(rutAlumnoTemp.length()==0){
            nuevoRutAlumno = encontrado.getRutAlumno();
        }
        while (nuevoRutAlumno == 0){
            try{
                nuevoRutAlumno = Integer.parseInt(rutAlumnoTemp);
                if(nuevoRutAlumno>0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoRutAlumno = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            rutAlumnoTemp = scann.nextLine().trim();
        }
        encontrado.setRutAlumno(nuevoRutAlumno);
        
        //genero alumno
        
        System.out.print(String.format("Ingrese un nuevo genero %s (Dejar vacio para no cambiar): ", encontrado.getIdGenero()));
        String idGeneroTemp = scann.nextLine().trim();
        int nuevoIdGenero = 0;
        if(idGeneroTemp.length()==0){
            nuevoIdGenero = encontrado.getIdGenero();
        }
        while (nuevoIdGenero == 0){
            try{
                nuevoIdGenero = Integer.parseInt(idGeneroTemp);
                if(nuevoIdGenero == 1 || nuevoIdGenero ==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdGenero = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idGeneroTemp = scann.nextLine().trim();
        }
        encontrado.setIdGenero(nuevoIdGenero);
        
        //ESTADO MATRICULA
        System.out.print(String.format("Ingrese un nuevo E.Matricula %s (Dejar vacio para no cambiar): ", encontrado.getIdMatricula()));
        String idMatriculaTemp = scann.nextLine().trim();
        
        int nuevoIdMatricula = 0;
        
        if(idMatriculaTemp.length()==0){
            nuevoIdMatricula = encontrado.getIdMatricula();
        }
        while (nuevoIdMatricula == 0){
            try{
                nuevoIdMatricula = Integer.parseInt(idMatriculaTemp);
                if(nuevoIdMatricula ==1){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdMatricula = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idMatriculaTemp = scann.nextLine().trim();
        }
        encontrado.setIdMatricula(nuevoIdMatricula);
        
        //Libro
        System.out.print(String.format("Ingrese un nuevo ID Libro %s (Dejar vacio para no cambiar): ", encontrado.getIdCredencial()));
        String idLibroTemp = scann.nextLine().trim();
        
        int nuevoIdLibro = 0;
        if(idLibroTemp.length()==0){
            nuevoIdLibro= encontrado.getIdLibro();
        }
        while (nuevoIdLibro == 0){
            try{
                nuevoIdLibro = Integer.parseInt(idLibroTemp);
                if(nuevoIdLibro>0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoIdLibro = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            idLibroTemp = scann.nextLine().trim();
        }
        encontrado.setIdCredencial(nuevoIdLibro);
        
        System.out.println("Actualizando Alumno...");
        if(cAlumno.modificarAlumno(encontrado)){
            System.out.println("Alumno Modificado correctamente");
        }
        else{
           
            System.out.println("No modificado");
            }
        }else{
            System.out.println("Debe Tener Alumnos antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
     
    }
    
    private static void eliminarAlumno (){
        System.out.println("Bienvenido a Eliminar Alumno");
        if(cAlumno.listarAlumnos().size()>0){
        System.out.print("Ingrese un ID para eliminar un alumno");
        String idAlumnoTemp = scann.nextLine().trim();
        int idAlum = 0 ;
        while (idAlum ==0){
            try{
                idAlum = Integer.parseInt(idAlumnoTemp);
                if(idAlum >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idAlum = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idAlumnoTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Alumno...");
        Alumno encontrado = cAlumno.buscarAlumno(idAlum);
        while(encontrado == null){
            System.out.println("la ID no es de un Alumno valido");
            System.out.print("Ingrese una ID valida");
            idAlumnoTemp = scann.nextLine().trim();
            idAlum = 0;
            while(idAlum== 0){
                try{
                    idAlum = Integer.parseInt(idAlumnoTemp);
                    if(idAlum >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idAlum = 0;
                }
                System.out.print("Ingrese una ID valida");
                idAlumnoTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cAlumno.buscarAlumno(idAlum);
        }
        System.out.println(String.format("Alumno Encontrado %s ",encontrado.getNomAlumno()));
        System.out.print("Ingrese 1 para eliminar, 2 para cancelar");
        String opcion = scann.nextLine();
        if(opcion.equals("1")){
            System.out.println("Eliminando Alumno...");
            cAlumno.eliminarAlumno(encontrado.getIdAlumno());
            System.out.println("Alumno Eliminado");
        }
        }else{
            System.out.println("Debe Tener Alumnos antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
    
    private static void buscarAlumno(){
        System.out.println("Bienvenido a Buscar Alumno");
        if(cAlumno.listarAlumnos().size()>0){
        System.out.print("Ingrese una ID de un alumno");
        String idAlumnoTemp = scann.nextLine();
        int idAlum = 0;
        while (idAlum ==0){
            try{
                idAlum = Integer.parseInt(idAlumnoTemp);
                if(idAlum >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idAlum = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idAlumnoTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Alumno...");
        Alumno encontrado = cAlumno.buscarAlumno(idAlum);
        while(encontrado == null){
            System.out.println("la ID no es de un Alumno valido");
            System.out.print("Ingrese una ID valida");
            idAlumnoTemp = scann.nextLine().trim();
            idAlum = 0;
            while(idAlum== 0){
                try{
                    idAlum = Integer.parseInt(idAlumnoTemp);
                    if(idAlum >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idAlum = 0;
                }
                System.out.print("Ingrese una ID valida");
                idAlumnoTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cAlumno.buscarAlumno(idAlum);
        }
        
        System.out.println(String.format("Alumno Encontrado %s ",encontrado.getNomAlumno()));
        
        }else{
            System.out.println("Debe Tener Alumnos antes de usar esta opción");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
    }
    
    private static void listarAlumnos(){
        List<Alumno> alumnos = cAlumno.listarAlumnos();
        System.out.println("Buscando Alumnos...");
        if(alumnos.size()==0){
            System.out.println("No hay alumnos para mostrar");
        }
        else{
            for(Alumno temp:cAlumno.listarAlumnos()){
                System.out.println("-------------------------------------------");
                System.out.println("nombre: "+temp.getNomAlumno()+ " Rut: "+temp.getRutAlumno());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}

