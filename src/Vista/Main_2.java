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
        
        //Ingresando Nombre Alumno
        System.out.print("Ingrese nombre y 2 apellidos del Alumno:");
        String nuevoNomcompProfe =scann.nextLine().trim();
        while(nuevoNomcompProfe.length()==0){
            System.out.print("El nombre es obligatorio, porfavor ingrese un nombre");
                    nuevoNomcompProfe = scann.nextLine().trim();
        }
                    
        //Ingresando Genero
        
        System.out.print("Ingrese su genero/ 1 si es femenino, 2 si es masculino:");
        String nuevoGENERO_idGENEROTemp =scann.nextLine().trim();
       
        int nuevoGENERO_idGENERO=0;
        while(nuevoGENERO_idGENERO==0){
            try{
                nuevoGENERO_idGENERO = Integer.parseInt(nuevoGENERO_idGENEROTemp);
                if(nuevoGENERO_idGENERO ==1 || nuevoGENERO_idGENERO==2){
                    break;
                
                }
            }
                catch(NumberFormatException e){
                    nuevoGENERO_idGENERO =0;
                }
            System.out.println("Ingrese un valor correcto: ");
            nuevoGENERO_idGENEROTemp = scann.nextLine().trim();
        }
        
        //ingresar El tipo de Rol
        
        System.out.print("Ingrese 1 si el Rol es administrador de lo contrario ingrese 2:");
        String nuevoROL_TIPOROL_idTIPOROLTemp =scann.nextLine().trim();
       
        int nuevoROL_TIPOROL_idTIPOROL=0;
        while(nuevoROL_TIPOROL_idTIPOROL==0){
            try{
                nuevoROL_TIPOROL_idTIPOROL = Integer.parseInt(nuevoROL_TIPOROL_idTIPOROLTemp);
                if(nuevoROL_TIPOROL_idTIPOROL ==1 || nuevoROL_TIPOROL_idTIPOROL ==2){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoROL_TIPOROL_idTIPOROL =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoROL_TIPOROL_idTIPOROLTemp = scann.nextLine().trim();
        }
        
        
       // ingresar id credencial
       
       System.out.print("Ingrese id de ROL, si no lo conoce, ponga su rut sin punto si guion:");
        String nuevoROL_idTIPOROLTemp =scann.nextLine().trim();
       
        int nuevoROL_idTIPOROL=0;
        while(nuevoROL_idTIPOROL==0){
            try{
                nuevoROL_idTIPOROL = Integer.parseInt(nuevoROL_idTIPOROLTemp);
                if(nuevoROL_idTIPOROL >0){
                    break;
                }
            }
                catch(NumberFormatException e){
                   nuevoROL_idTIPOROL =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoROL_idTIPOROLTemp = scann.nextLine().trim();
        }
        System.out.println("Creando Profesor... por favor espere");
        Profesor tempProfesor =new Profesor(nuevoRutProfe,nuevoNomcompProfe,nuevoGENERO_idGENERO, nuevoROL_TIPOROL_idTIPOROL,nuevoROL_idTIPOROL);
        if(cProfesor.agregarProfesor(tempProfesor)){
            System.out.println("Profesor Agregado Correctamente");
        }
        else{
            System.out.println("Alumno no agregado");
        }
        System.out.print("Presione enter para continuar");
        scann.nextLine();
        
    }
    
    private static void modificarProfesor(){
        System.out.println("Bienvenido a Modificar Alumno, por favor siga las instrucciones");
        if(cProfesor.listarProfesores().size()>0){
        System.out.print("Ingrese el ID del Profesor a modificar: ");
        String idPROFESORTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idPROFESORTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idPROFESORTemp = scann.nextLine();
        }
        System.out.println("Buscando Profesor...");
        Profesor encontrado = cProfesor.buscarProfesor(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Profesor válido, intente denuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idPROFESORTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idPROFESORTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idPROFESORTemp = scann.nextLine();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cProfesor.buscarProfesor(idBuscar);
        }
            
            System.out.print(String.format("Ingrese un nuevo nombre para %s (Deje vacio para no cambiar) :", encontrado.getNomcompProfe()));
            String nuevoNomcompProfe = scann.nextLine().trim();
            if(nuevoNomcompProfe.length()>0){
                encontrado.setNomcompProfe(nuevoNomcompProfe);
            }
            
        //rut Profesor
        System.out.print(String.format("Ingrese un nuevo rut %s (Dejar vacio para no cambiar): ", encontrado.getRutcProfe()));
        String rutProfeTemp = scann.nextLine().trim();
        int nuevoRutProfe = 0;
        if(rutProfeTemp.length()==0){
            nuevoRutProfe = encontrado.getRutcProfe();
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
        
        //genero alumno
        
        System.out.print(String.format("Ingrese un nuevo genero %s (Dejar vacio para no cambiar): ", encontrado.getGENERO_idGENERO()));
        String GENERO_idGENEROTemp = scann.nextLine().trim();
        int nuevoGENERO_idGENERO = 0;
        if(GENERO_idGENEROTemp.length()==0){
            nuevoGENERO_idGENERO = encontrado.getGENERO_idGENERO();
        }
        while (nuevoGENERO_idGENERO == 0){
            try{
                nuevoGENERO_idGENERO = Integer.parseInt(GENERO_idGENEROTemp);
                if(nuevoGENERO_idGENERO == 1 || nuevoGENERO_idGENERO ==2){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoGENERO_idGENERO = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            GENERO_idGENEROTemp = scann.nextLine().trim();
        }
        encontrado.setGENERO_idGENERO(nuevoGENERO_idGENERO);
        
        //Rol
        System.out.print(String.format("Ingrese un nuevo ROL %s (Dejar vacio para no cambiar): ", encontrado.getROL_TIPOROL_idTIPOROL()));
        String ROL_TIPOROL_idTIPOROLTemp = scann.nextLine().trim();
        
        int nuevoROL_TIPOROL_idTIPOROL = 0;
     
        if(ROL_TIPOROL_idTIPOROLTemp.length()==0){
            nuevoROL_TIPOROL_idTIPOROL = encontrado.getROL_TIPOROL_idTIPOROL();
        }
        while (nuevoROL_TIPOROL_idTIPOROL == 0){
            try{
                nuevoROL_TIPOROL_idTIPOROL = Integer.parseInt(ROL_TIPOROL_idTIPOROLTemp);
                if(nuevoROL_TIPOROL_idTIPOROL ==1){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoROL_TIPOROL_idTIPOROL = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            ROL_TIPOROL_idTIPOROLTemp = scann.nextLine().trim();
        }
        encontrado.setROL_TIPOROL_idTIPOROL(nuevoROL_TIPOROL_idTIPOROL);
        
        //rol
        System.out.print(String.format("Ingrese un nuevo ID de ROL %s (Dejar vacio para no cambiar): ", encontrado.getROL_idTIPOROL()));
        String ROL_idTIPOROLTemp = scann.nextLine().trim();
        
        int nuevoROL_idTIPOROL = 0;
        if(ROL_idTIPOROLTemp.length()==0){
            nuevoROL_idTIPOROL = encontrado.getROL_idTIPOROL();
        }
        while (nuevoROL_idTIPOROL == 0){
            try{
                nuevoROL_idTIPOROL = Integer.parseInt(ROL_idTIPOROLTemp);
                if(nuevoROL_idTIPOROL>0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoROL_idTIPOROL = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            ROL_idTIPOROLTemp = scann.nextLine().trim();
        }
        encontrado.setROL_idTIPOROL(nuevoROL_idTIPOROL);
        
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
        String idPROFESORTemp = scann.nextLine().trim();
        int idProfe = 0 ;
        while (idProfe ==0){
            try{
                idProfe = Integer.parseInt(idPROFESORTemp);
                if(idProfe >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idProfe = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idPROFESORTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Profesor...");
        Profesor encontrado = cProfesor.buscarProfesor(idProfe);
        while(encontrado == null){
            System.out.println("la ID no es de un Profesor valido");
            System.out.print("Ingrese una ID valida");
            idPROFESORTemp = scann.nextLine().trim();
            idProfe = 0;
            while(idProfe== 0){
                try{
                    idProfe = Integer.parseInt(idPROFESORTemp);
                    if(idProfe >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idProfe = 0;
                }
                System.out.print("Ingrese una ID valida");
                idPROFESORTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Profesor...");
            encontrado = cProfesor.buscarProfesor(idProfe);
        }
        System.out.println(String.format("Profesor Encontrado %s ",encontrado.getNomcompProfe()));
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
        String idPROFESORTemp = scann.nextLine();
        int idProfe = 0;
        while (idProfe ==0){
            try{
                idProfe = Integer.parseInt(idPROFESORTemp);
                if(idProfe >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idProfe = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idPROFESORTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Profesor...");
        Profesor encontrado = cProfesor.buscarProfesor(idProfe);
        while(encontrado == null){
            System.out.println("la ID no es de un Alumno valido");
            System.out.print("Ingrese una ID valida");
            idPROFESORTemp = scann.nextLine().trim();
            idProfe = 0;
            while(idProfe== 0){
                try{
                    idProfe = Integer.parseInt(idPROFESORTemp);
                    if(idProfe >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idProfe = 0;
                }
                System.out.print("Ingrese una ID valida");
                idPROFESORTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Profesor...");
            encontrado = cProfesor.buscarProfesor(idProfe);
        }
        
        System.out.println(String.format("Profesor Encontrado %s ",encontrado.getNomcompProfe()));
        
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
                System.out.println("nombre: "+temp.getNomcompProfe()+ " Rut: "+temp.getRutcProfe());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}

