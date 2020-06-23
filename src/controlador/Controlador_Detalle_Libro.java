/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Conexion.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import modelo.Detalle_Libro;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author aliss
 */
public class Controlador_Detalle_Libro {
    private Conexion Conect;

    public Controlador_Detalle_Libro() {
        this.setConexion(Conexion.nuevaInstancia());
    }
    private void setConexion(Conexion nuevaConexion){
        this.Conect = nuevaConexion;
    } 
    private Conexion getConexion(){
       return this.Conect;
    }
    
    public boolean agregarDetalle(Detalle_Libro nuevoDetalle_Libro){
        boolean salida = false; 
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion().prepareStatement(
                    "INSERT INTO DETALLE_ALUMNO (fechaAsis,idLibro,, idAlumno,idAsignatura, idTipoAsis) VALUES(?,?,?,?,?)"
            );
            
            pstm.setDate(1,nuevoDetalle_Libro.getFechaAsis());
            pstm.setInt(2,nuevoDetalle_Libro.getIdLibro());
            pstm.setInt(3,nuevoDetalle_Libro.getIdAlumno());
            pstm.setInt(4, nuevoDetalle_Libro.getIdAsignatura());
            pstm.setInt(5, nuevoDetalle_Libro.getIdTipoAsis());
            
            
            
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
    
    public boolean modificarDetalle(Detalle_Libro nuevoDetalle_Libro){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "UPDATE DETALLE_LIBRO SET fechaAsis = ?,idLibro = ?,idAlumno = ?,idAsignatura = ?, idTipoAsis = ? where idDetalle = ?"
                    );
            
            pstm.setDate(1,nuevoDetalle_Libro.getFechaAsis());
            pstm.setInt(2,nuevoDetalle_Libro.getIdLibro());
            pstm.setInt(3,nuevoDetalle_Libro.getIdAlumno());
            pstm.setInt(4, nuevoDetalle_Libro.getIdAsignatura());
            pstm.setInt(5, nuevoDetalle_Libro.getIdTipoAsis());
            pstm.setInt(6, nuevoDetalle_Libro.getIdDetalle());
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
    
    public boolean eliminarDetalle(int idDetalle){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE DETALLE_LIBRO FROM DETALLE_LIBRO WHERE idDetalle = ?"
                    );
                        pstm.setInt(1, idDetalle);
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
    
    public Detalle_Libro buscarDetalle(int idDetalle){
        Detalle_Libro encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT fechaAsis,idLibro,idAlumno, idAsignatura, idTipoAsis FROM DETALLE_LIBRO WHERE idDetalle = ?"
                    );
                pstm.setInt(1,idDetalle);
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Detalle_Libro(
                            rs.getDate(1),        
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getInt(4),
                            rs.getInt(5));
                           
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
            
    public List<Detalle_Libro> listarDetalles(){
        List <Detalle_Libro> detalles = new ArrayList<Detalle_Libro>();
        try {
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                      "SELECT fechaAsis,idLibro,idAlumo,idAsignatura, idTipoAsis FROM DETALLE_LIBRO"   
                    );
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Detalle_Libro temp = new Detalle_Libro (
                        rs.getDate(1),        
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getInt(5));
                detalles.add(temp);
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
        return detalles;
    }
}
