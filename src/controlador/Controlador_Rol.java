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
import modelo.Rol;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author aliss
 */
public class Controlador_Rol {

    private Conexion Conect;

       public Controlador_Rol() {
           this.setConexion(Conexion.nuevaInstancia());
       }
       private void setConexion(Conexion nuevaConexion){
           this.Conect = nuevaConexion;
       } 
       private Conexion getConexion(){
          return this.Conect;
       }

       public boolean agregarRol(Rol nuevoRol){
        boolean salida = false; 
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion().prepareStatement(
                    "INSERT INTO ROL (nomUsuario,contraseñaUsuario,idProfesor, idTipoRol) VALUES(?,?,?,?)"
            );
            pstm.setString(1, nuevoRol.getNomUsuario());
            pstm.setString(2, nuevoRol.getContraseñaUsuario());
            pstm.setInt(3, nuevoRol.getIdProfesor());
            pstm.setInt(4, nuevoRol.getIdTipoRol());
            
            
            
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
    
    public boolean modificarRol(Rol nuevoRol){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "UPDATE ROL SET nomUsuario = ?,contraseñaUsuario = ?,idProfesor = ?,idTipoRol  = ? where idRol = ?"
                    );
            pstm.setString(1, nuevoRol.getNomUsuario());
            pstm.setString(2, nuevoRol.getContraseñaUsuario());
            pstm.setInt(3, nuevoRol.getIdProfesor());
            pstm.setInt(4,nuevoRol.getIdTipoRol());
            pstm.setInt(5,nuevoRol.getIdRol());
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
    
    public boolean eliminarRol(int idRol){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE FROM ROL WHERE idRol = ?"
                    );
                        pstm.setInt(1, idRol);
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
    
    public Rol buscarRol(int idRol){
        Rol encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT   nomUsuario,contraseñaUsuario,idProfesor, idTipoRol FROM ROL WHERE idRol = ?"
                    );
                pstm.setInt(1,idRol);
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Rol(
                            rs.getString(1),     
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getInt(4));
                           
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
            
    public List<Rol> listarRoles(){
        List <Rol> roles = new ArrayList<Rol>();
        try {
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                      "SELECT nomUsuario,contraseñaUsuario,idProfesor, idTipoRol FROM ROL"   
                    );
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Rol temp = new Rol (
                        rs.getString(1),     
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4));;
                roles.add(temp);
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
        return roles;
   }
}
