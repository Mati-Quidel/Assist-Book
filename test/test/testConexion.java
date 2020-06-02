/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import Conexion.Conexion;
import java.sql.SQLException;
/**
 *
 * @author Matias
 */
public class testConexion {
    public static void main(String... args){
        Conexion con = null;
        try{
                con = Conexion.nuevaInstancia();
                    if(!con.obtenerConexion().isClosed()){
                        System.out.println("Conexion abierta");
                    }
                    else{
                        System.out.println("Conexion cerrada");}
        }
        catch(ClassNotFoundException e){
            System.out.println("Clase no encontrada "+e.getMessage());
        } 
        catch(SQLException e){
            System.out.println(String.format("error de SQL %s y codigo %s", e.getMessage(), e.getSQLState()));
        }
        catch(Exception e){
            System.out.println("Error General "+e.getMessage());
        }
        finally{
        con.cerrarConexion();
            System.out.println("Conexion cerrada");
        }
    }
}
