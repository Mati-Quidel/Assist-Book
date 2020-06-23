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
import modelo.Profesor;
import java.util.List;

/**
 *
 * @author aliss
 */
public class Controlador_Profesor {
    private Conexion Conect;
    
    public Controlador_Profesor() {
        this.setConexion(Conexion.nuevaInstancia());
    }
    private void setConexion(Conexion nuevaConexion){
        this.Conect = nuevaConexion;
    } 
    private Conexion getConexion(){
       return this.Conect;
    }
    
    public boolean agregarProfesor(Profesor nuevoProfesor){
        boolean salida = false; 
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion().prepareStatement(
                    "INSERT INTO PROFESOR (rutProfe,nomProfe) VALUES(?,?)");
            
            pstm.setInt(1, nuevoProfesor.getRutProfe());
            pstm.setString(2, nuevoProfesor.getNomProfe());
        
            
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
     public boolean modificarProfesor(Profesor nuevoProfesor){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "UPDATE PROFESOR SET rutProfe = ?,nomProfe = ? where idProfesor = ?"
                    );
            
            pstm.setInt(1, nuevoProfesor.getRutProfe());
            pstm.setString(2, nuevoProfesor.getNomProfe());
            pstm.setInt(6, nuevoProfesor.getIdProfesor());
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
    
    public boolean eliminarProfesor(int idProfesor){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE PROFESOR FROM PROFESOR WHERE idProfesor = ?"
                    );
                        pstm.setInt(1, idProfesor);
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
    
    public Profesor buscarProfesor(int idProfesor){
        Profesor encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT rutProfe,nomProfe from PROFESOR WHERE idProfesor = ?"
                    );
                pstm.setInt(1,idProfesor);
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Profesor(
                            rs.getInt(1),
                            rs.getString(2)
                            );
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
            
    public List<Profesor> listarProfesores(){
        List <Profesor> profesores = new ArrayList<Profesor>();
        try {
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                      "SELECT rutProfe,nomProfe FROM PROFESOR "      
                    );
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Profesor temp = new Profesor(
                        rs.getInt(1),
                        rs.getString(2)
                );
                profesores.add(temp);
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
        return profesores;
    }
    
}