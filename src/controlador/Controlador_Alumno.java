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
import java.util.ArrayList;
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
                    "INSERT INTO alumno (rutAlumno,nomcompAlumno,idGENERO ) VALUES(?,?,?)"
            );
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setString(2, nuevoAlumno.getNomcompAlumno());
            pstm.setInt(3, nuevoAlumno.getIdGENERO());
            
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
    
    public boolean modificarAlumno(Alumno nuevoAlumno){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "UPDATE ALUMNO SET rutAlumno = ?,nomcompAlumno = ? where id = ?"
                    );
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setString(2, nuevoAlumno.getNomcompAlumno());
            pstm.setInt(4,nuevoAlumno.getIdALUMNO());
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
    
    public boolean eliminarAlumno(int id){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE FROM ALUMNO WHERE id = ?"
                    );
                        pstm.setInt(1, id);
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
    
    public Alumno buscarAlumno(int id){
        Alumno encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT idALUMNO, rutAlumno, nomcompAlumno from ALUMNO WHERE id = ?"
                    );
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Alumno(
                            rs.getInt(1),
                            rs.getString(2), 
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
            
    public List<Alumno>


}
