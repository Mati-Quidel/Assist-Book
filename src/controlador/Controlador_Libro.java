/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Libro;
/**
 *
 * @author Matias
 */
public class Controlador_Libro {
    private Conexion Conect;

    public Controlador_Libro() {
        this.setConexion(Conexion.nuevaInstancia());
    }
    private void setConexion(Conexion nuevaConexion){
        this.Conect = nuevaConexion;
    } 
    private Conexion getConexion(){
       return this.Conect;
    }
    
    public boolean agregarLibro(Libro nuevoLibro){
        boolean salida = false; 
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion().prepareStatement(
                    "INSERT INTO LIBRO (nivel, idSala, idProfesor) VALUES(?,?,?)"
            );
            pstm.setString(1, nuevoLibro.getNivel());
            pstm.setInt(2, nuevoLibro.getIdSala());
            pstm.setInt(3, nuevoLibro.getIdProfesor());
            if(pstm.executeUpdate()==1){
                salida = true;
            }
        }
        catch(ClassNotFoundException e){
            System.out.println("Clase no encontrada "+e.getMessage());
        }
        catch(SQLException e){
            System.out.println(String.format("Error SQL %s : %s",e.getSQLState(),e.getMessage()));
        }
        catch(Exception e){
            System.out.println("otra excepion "+e.getMessage());
        }
        finally{
            this.getConexion().cerrarConexion();
        }
        return salida;
    }
     public boolean modificarLibro(Libro nuevoLibro){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "UPDATE LIBRO SET nivel = ?,idSala = ?,idProfesor = ? where idLibro= ?"
                    );
            pstm.setString(1, nuevoLibro.getNivel());
            pstm.setInt(2, nuevoLibro.getIdSala());
            pstm.setInt(3, nuevoLibro.getIdProfesor());
            pstm.setInt(5,nuevoLibro.getIdLibro());
            if(pstm.executeUpdate() == 1){
                salida = true; 
            } 
            
       }
        catch(ClassNotFoundException e){
            System.out.println("Clase no encontrada"+e.getMessage());
        }
        catch(SQLException e){
            System.out.println(String.format("Error SQL %s : %s",e.getSQLState(),e.getMessage()));
        }
        catch(Exception e){
            System.out.println("Otro error "+e.getMessage());
        }
        finally{
            this.getConexion().cerrarConexion();
        }
        return salida;
    }
    
    public boolean eliminarLibro(int idLibro){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE LIBRO FROM LIBRO WHERE idLibro = ?"
                    );
                        pstm.setInt(1, idLibro);
                        if(pstm.executeUpdate() == 1) {
                            salida = true;
                        }

                                }
        catch(ClassNotFoundException e){
            System.out.println("Error, Clase no encontrada "+e.getMessage() );
        }
        catch(SQLException e) {
            System.out.println(String.format("Error SQL %s : %s",e.getSQLState(),e.getMessage()));
        }
        catch(Exception e) {
            System.out.println("Otra excepción "+e.getMessage());
        }
        finally{
            this.getConexion().cerrarConexion();
        }
        return salida;

    }
    
    public Libro buscarLibro(int idLibro){
        Libro encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT nivel, idSala, idProfesor FROM LIBRO WHERE idLibro = ?"
                    );
                pstm.setInt(1,idLibro);
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Libro(
                            rs.getString(1),
                            rs.getInt(2), 
                            rs.getInt(3));
                        }
        
        
        }
        catch(ClassNotFoundException e){
            System.out.println("ERROR, Clase no encontrada "+e.getMessage());
        }
        catch(SQLException e){
            System.out.println(String.format("ERROR SQL %s : %s",e.getSQLState(),e.getMessage()));
        }    
        catch(Exception e){
            System.out.println("Otra excepción "+e.getMessage());
        }
       finally{
            this.getConexion().cerrarConexion();
        }
        return encontrado;
    
    }
            
    public List<Libro> listarLibros(){
        List <Libro> libros = new ArrayList <Libro>();
        try {
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                      "SELECT nivel, idSala, idProfesor FROM LIBRO"      
                    );
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Libro temp = new Libro(
                        rs.getString(1),
                        rs.getInt(2), 
                        rs.getInt(3));;
                libros.add(temp);
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Clase no encontrada " + e.getMessage());
        }
        catch(SQLException e){
            System.out.println(String.format("ERROR SQL %s : %s",e.getSQLState(),e.getMessage()));
        }    
        catch(Exception e){
            System.out.println("Otra excepción "+e.getMessage());
        }
        finally{
            this.getConexion().cerrarConexion();
        }
        return libros;
    }

    
    
}
    
    
    
    
    
    
    
    

