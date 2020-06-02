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
                    "INSERT INTO Rol (idROL,nombreUsuario,contraseñaUsuario ) VALUES(?,?,?)"
            );
            pstm.setInt(1, nuevoRol.getIdROL());
            pstm.setString(2, nuevoRol.getNombreUsuario());
            pstm.setString(3, nuevoRol.getContraseñaUsuario());
            
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
                    "UPDATE ROL SET nombreUsuario = ?,contraseñaUsuario = ? where idROL = ?"
                    );
            pstm.setString(1, nuevoRol.getNombreUsuario());
            pstm.setString(2, nuevoRol.getContraseñaUsuario());
            pstm.setInt(3,nuevoRol.getIdROL());
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
   }
