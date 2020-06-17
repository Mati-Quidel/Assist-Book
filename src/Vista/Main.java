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
public class Main {
    private static Controlador_Alumno cAlumno = new Controlador_Alumno();
    private static Scanner scann = new Scanner(System.in);
    
    public static void main ( String...args){
        int opcion = 0;
        while(opcion<=6){
            menu();
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
    
    private static void menu (){
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
        String nuevoNomcompAlumno =scann.nextLine().trim();
        while(nuevoNomcompAlumno.length()==0){
            System.out.print("El nombre es obligatorio, porfavor ingrese un nombre");
                    nuevoNomcompAlumno = scann.nextLine().trim();
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
        
        //ingresar estado matricula
        
        System.out.print("Ingrese 1 ya que su matricula es activa:");
        String nuevoESTADO_MATRICULA_idESTADO_MATRICULATemp =scann.nextLine().trim();
       
        int nuevoESTADO_MATRICULA_idESTADO_MATRICULA=0;
        while(nuevoESTADO_MATRICULA_idESTADO_MATRICULA==0){
            try{
                nuevoESTADO_MATRICULA_idESTADO_MATRICULA = Integer.parseInt(nuevoESTADO_MATRICULA_idESTADO_MATRICULATemp);
                if(nuevoESTADO_MATRICULA_idESTADO_MATRICULA ==1){
                    break;
                }
                
            }
                catch(NumberFormatException e){
                   nuevoESTADO_MATRICULA_idESTADO_MATRICULA =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoESTADO_MATRICULA_idESTADO_MATRICULATemp = scann.nextLine().trim();
        }
        
        
       // ingresar id credencial
       
       System.out.print("Ingrese id credencial, si no lo conoce, ponga su rut sin punto si guion:");
        String nuevoCREDENCIAL_idCREDENCIALTemp =scann.nextLine().trim();
       
        int nuevoCREDENCIAL_idCREDENCIAL=0;
        while(nuevoCREDENCIAL_idCREDENCIAL==0){
            try{
                nuevoCREDENCIAL_idCREDENCIAL = Integer.parseInt(nuevoCREDENCIAL_idCREDENCIALTemp);
                if(nuevoCREDENCIAL_idCREDENCIAL >0){
                    break;
                }
            }
                catch(NumberFormatException e){
                   nuevoCREDENCIAL_idCREDENCIAL =0;
                }
            System.out.println("Ingrese un valor correcto: ");
           nuevoCREDENCIAL_idCREDENCIALTemp = scann.nextLine().trim();
        }
        System.out.println("Creando Alumno... por favor espere");
        Alumno tempAlumno =new Alumno(nuevoRutAlumno,nuevoNomcompAlumno,nuevoGENERO_idGENERO, nuevoESTADO_MATRICULA_idESTADO_MATRICULA,nuevoCREDENCIAL_idCREDENCIAL);
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
        System.out.print("Ingrese el ID del alumno a modificar: ");
        String idALUMNOTemp = scann.nextLine().trim();
        int idBuscar = 0;
        while (idBuscar ==0){
            try{
                idBuscar = Integer.parseInt(idALUMNOTemp);
                if(idBuscar > 0){
                    break;
                }
            }
            catch(NumberFormatException e){
                idBuscar = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idALUMNOTemp = scann.nextLine();
        }
        System.out.println("Buscando Alumno...");
        Alumno encontrado = cAlumno.buscarAlumno(idBuscar);
        while(encontrado == null){
            System.out.println("La ID no es de un Alumno válido, intente denuevo");
            System.out.print("Vuelva a ingresar una ID ");
            idALUMNOTemp = scann.nextLine();
            idBuscar =0;
            while(idBuscar ==0){
                try{
                    idBuscar = Integer.parseInt(idALUMNOTemp);
                    if(idBuscar > 0){
                    break;
                }
                    
                }
                catch(NumberFormatException e){
                    idBuscar = 0;
                }
                System.out.print("Debe ingresar una ID valida: ");
                idALUMNOTemp = scann.nextLine();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cAlumno.buscarAlumno(idBuscar);
        }
            
            System.out.print(String.format("Ingrese un nuevo nombre para %s (Deje vacio para no cambiar) :", encontrado.getNomcompAlumno()));
            String nuevoNomcompAlumno = scann.nextLine().trim();
            if(nuevoNomcompAlumno.length()>0){
                encontrado.setNomcompAlumno(nuevoNomcompAlumno);
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
        
        //ESTADO MATRICULA
        System.out.print(String.format("Ingrese un nuevo E.Matricula %s (Dejar vacio para no cambiar): ", encontrado.getESTADO_MATRICULA_idESTADO_MATRICULA()));
        String ESTADO_MATRICULA_idESTADO_MATRICULATemp = scann.nextLine().trim();
        
        int nuevoESTADO_MATRICULA_idESTADO_MATRICULA = 0;
        
        if(ESTADO_MATRICULA_idESTADO_MATRICULATemp.length()==0){
            nuevoESTADO_MATRICULA_idESTADO_MATRICULA = encontrado.getESTADO_MATRICULA_idESTADO_MATRICULA();
        }
        while (nuevoESTADO_MATRICULA_idESTADO_MATRICULA == 0){
            try{
                nuevoESTADO_MATRICULA_idESTADO_MATRICULA = Integer.parseInt(ESTADO_MATRICULA_idESTADO_MATRICULATemp);
                if(nuevoESTADO_MATRICULA_idESTADO_MATRICULA ==1){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoESTADO_MATRICULA_idESTADO_MATRICULA = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            ESTADO_MATRICULA_idESTADO_MATRICULATemp = scann.nextLine().trim();
        }
        encontrado.setESTADO_MATRICULA_idESTADO_MATRICULA(nuevoESTADO_MATRICULA_idESTADO_MATRICULA);
        
        //credencial
        System.out.print(String.format("Ingrese un nuevo ID credencial %s (Dejar vacio para no cambiar): ", encontrado.getCREDENCIAL_idCREDENCIAL()));
        String CREDENCIAL_idCREDENCIALTemp = scann.nextLine().trim();
        
        int nuevoCREDENCIAL_idCREDENCIAL = 0;
        if(CREDENCIAL_idCREDENCIALTemp.length()==0){
            nuevoCREDENCIAL_idCREDENCIAL= encontrado.getCREDENCIAL_idCREDENCIAL();
        }
        while (nuevoCREDENCIAL_idCREDENCIAL == 0){
            try{
                nuevoCREDENCIAL_idCREDENCIAL = Integer.parseInt(CREDENCIAL_idCREDENCIALTemp);
                if(nuevoCREDENCIAL_idCREDENCIAL>0){
                    break;
                }
            }
            catch(NumberFormatException e){
                nuevoCREDENCIAL_idCREDENCIAL = 0;
            }
            System.out.println("Ingrese un valor correcto: ");
            CREDENCIAL_idCREDENCIALTemp = scann.nextLine().trim();
        }
        encontrado.setCREDENCIAL_idCREDENCIAL(nuevoCREDENCIAL_idCREDENCIAL);
        
        System.out.println("Actualizando Alumno...");
        if(cAlumno.modificarAlumno(encontrado)){
            System.out.println("Producto Modificado correctamente");
        }
        else{
            System.out.println("No modificado");
        }
        System.out.print("Presione Enter para continuar");
        scann.nextLine();
     
    }
    
    private static void eliminarAlumno (){
        System.out.println("Bienvenido a Eliminar Alumno");
        System.out.print("Ingrese un ID para eliminar un alumno");
        String idALUMNOTemp = scann.nextLine().trim();
        int idAlum = 0 ;
        while (idAlum ==0){
            try{
                idAlum = Integer.parseInt(idALUMNOTemp);
                if(idAlum >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idAlum = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idALUMNOTemp = scann.nextLine().trim();
        }
        System.out.println("Buscando Alumno...");
        Alumno encontrado = cAlumno.buscarAlumno(idAlum);
        while(encontrado == null){
            System.out.println("la ID no es de un Alumno valido");
            System.out.print("Ingrese una ID valida");
            idALUMNOTemp = scann.nextLine().trim();
            idAlum = 0;
            while(idAlum== 0){
                try{
                    idAlum = Integer.parseInt(idALUMNOTemp);
                    if(idAlum >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idAlum = 0;
                }
                System.out.print("Ingrese una ID valida");
                idALUMNOTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cAlumno.buscarAlumno(idAlum);
        }
        System.out.println(String.format("Alumno Encontrado %s ",encontrado.getNomcompAlumno()));
        System.out.print("Ingrese 1 para eliminar, 2 para cancelar");
        String opcion = scann.nextLine();
        if(opcion.equals("1")){
            System.out.println("Eliminando Alumno...");
            cAlumno.eliminarAlumno(encontrado.getIdALUMNO());
            System.out.println("Alumno Eliminado");
        }
        System.out.print("Presione Enter para continuar...");
        scann.nextLine();
    }
    
    private static void buscarAlumno(){
        System.out.println("Bienvenido a Buscar Alumno");
        System.out.print("Ingrese una ID de un alumno");
        String idALUMNOTemp = scann.nextLine();
        int idAlum = 0;
        while (idAlum ==0){
            try{
                idAlum = Integer.parseInt(idALUMNOTemp);
                if(idAlum >0){
                   break;
                }
            }
            catch(NumberFormatException e){
                idAlum = 0;
            }
            System.out.print("Debe ingresar una ID valida: ");
            idALUMNOTemp = scann.nextLine().trim();
        
        }
        System.out.println("Buscando Alumno...");
        Alumno encontrado = cAlumno.buscarAlumno(idAlum);
        while(encontrado == null){
            System.out.println("la ID no es de un Alumno valido");
            System.out.print("Ingrese una ID valida");
            idALUMNOTemp = scann.nextLine().trim();
            idAlum = 0;
            while(idAlum== 0){
                try{
                    idAlum = Integer.parseInt(idALUMNOTemp);
                    if(idAlum >0){
                        break;
                    }
                }
                catch(NumberFormatException e){
                    idAlum = 0;
                }
                System.out.print("Ingrese una ID valida");
                idALUMNOTemp = scann.nextLine().trim();
            }
            System.out.println("Buscando Alumno...");
            encontrado = cAlumno.buscarAlumno(idAlum);
        }
        System.out.println(String.format("Alumno Encontrado %s ",encontrado.getNomcompAlumno()));
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
                System.out.println("nombre: "+temp.getNomcompAlumno()+ "Rut: "+temp.getRutAlumno());
                System.out.println("-------------------------------------------");
            }
            System.out.println("Terminado\n");
            System.out.print("Presione una tecla y Enter para continuar.");
            scann.next();
        }
        
    }
}

