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
import modelo.Genero;
import java.util.List;
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
                    "INSERT INTO ALUMNO (rutAlumno,nomAlumno,idGenero,idMatricula,idLibro) VALUES(?,?,?,?.?)"
            );
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setString(2, nuevoAlumno.getNomAlumno());
            pstm.setInt(3, nuevoAlumno.getIdGenero());
            pstm.setInt(5,nuevoAlumno.getIdMatricula());
            pstm.setInt(6,nuevoAlumno.getIdLibro());
            
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
                    "UPDATE ALUMNO SET rutAlumno = ?,nomAlumno = ?,idGenero = ?,"
                            + "idMatricula = ?, idLibro = ? where idALumno = ?"
                    );
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setString(2, nuevoAlumno.getNomAlumno());
            pstm.setInt(3, nuevoAlumno.getIdGenero());
            pstm.setInt(5,nuevoAlumno.getIdMatricula());
            pstm.setInt(6,nuevoAlumno.getIdLibro());
            pstm.setInt(6,nuevoAlumno.getIdAlumno());
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
    
    public boolean eliminarAlumno(int idAlumno){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE ALUMNO FROM ALUMNO WHERE idALumno = ?"
                    );
                        pstm.setInt(1, idAlumno);
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
    
    public Alumno buscarAlumno(int idAlumno){
        Alumno encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT   rutAlumno,nomAlumno,idGenero,idCredencial,idMatricula, idLibro from ALUMNO WHERE idAlumno = ?"
                    );
                pstm.setInt(1,idAlumno);
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Alumno(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getInt(6));
                           
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
            
    public List<Alumno> listarAlumnos(){
        List <Alumno> alumnos = new ArrayList<Alumno>();
        try {
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                      "SELECT rutAlumno,nomAlumno,idGenero,idCredencial,idMatricula, idLibro from ALUMNO" 
                    );
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Alumno temp = new Alumno (
                        rs.getInt(1),
                            rs.getString(2),
                            rs.getInt(3),
                            rs.getInt(4),
                            rs.getInt(5),
                            rs.getInt(6));
                alumnos.add(temp);
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
        return alumnos;
    }
}

