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
import modelo.Asistencia;
/**
 *
 * @author Matias
 */
public class Controlador_Asistencia {
   private Conexion Conect;

    public Controlador_Asistencia() {
        this.setConexion(Conexion.nuevaInstancia());
    }
    private void setConexion(Conexion nuevaConexion){
        this.Conect = nuevaConexion;
    } 
    private Conexion getConexion(){
       return this.Conect;
    }
    
    public boolean agregarAsistencia(Asistencia nuevaAsistencia){
        boolean salida = false; 
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion().prepareStatement(
                    "INSERT INTO ASISTENCIA (TIPO_ASISTENCIA_idTIPO_ASISTENCIA,Fecha) VALUES(?,?)"
            );
            pstm.setInt(1, nuevaAsistencia.getTIPO_ASISTENCIA_idTIPO_ASISTENCIA());
            pstm.setDate(2, (Date) nuevaAsistencia.getFecha());
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
    
    public boolean modificarAsistencia(Asistencia nuevaAsistencia){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "UPDATE ASISTENCIA SET TIPO_ASISTENCIA_idTIPO_ASISTENCIA = ?"
                            + ",nomcompAlumno = ? ,Fecha = ? where idASISTENCIA = ?"
                    );
            pstm.setInt(1, nuevaAsistencia.getTIPO_ASISTENCIA_idTIPO_ASISTENCIA());
            pstm.setDate(2,(Date) nuevaAsistencia.getFecha());
            pstm.setInt(3, nuevaAsistencia.getIdASISTENCIA());
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
