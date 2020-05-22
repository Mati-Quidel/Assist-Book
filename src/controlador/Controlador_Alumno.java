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
import modelo.Alumno;
/**
 *
 * @author Matias
 */
public class Controlador_Alumno {
    private Conexion Conect;

    public Controlador_Alumno() {
        this.setConexion(Conexion.nuevaInstancia());
    }
    private void setConexion(Conexion nuevaConexion){
        this.Conect = nuevaConexion;
    } 
    private Conexion getConexion(){
       return this.Conect;
    }
    
    public boolean agregarAlumno(Alumno nuevoAlumno){
        boolean salida = false; 
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion().prepareStatement(
                    "INSERT INTO alumno (rutAlumno,dv) VALUES(?,?)"
            );
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setString(2, nuevoAlumno.getDv());
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
    
    
}
