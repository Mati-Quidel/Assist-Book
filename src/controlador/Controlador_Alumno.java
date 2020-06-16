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
                    "INSERT INTO ALUMNO (rutAlumno,nomcompAlumno,GENERO_idGENERO,"
                            + "ESTADO_MATRICULA_idESTADO_MATRICULA,CREDENCIAL_idCREDENCIAL ) VALUES(?,?,?,?,?)"
            );
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setString(2, nuevoAlumno.getNomcompAlumno());
            pstm.setInt(3, nuevoAlumno.getGENERO_idGENERO());
            pstm.setInt(4,nuevoAlumno.getESTADO_MATRICULA_idESTADO_MATRICULA());
            pstm.setInt(5,nuevoAlumno.getCREDENCIAL_idCREDENCIAL());
            
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
                    "UPDATE ALUMNO SET rutAlumno = ?,nomcompAlumno = ? ,GENERO_idGENERO = ?,"
                            + "ESTADO_MATRICULA_idESTADO_MATRICULA = ?,"
                            + "CREDENCIAL_idCREDENCIAL = ? where idALUMNO = ?"
                    );
            pstm.setInt(1, nuevoAlumno.getRutAlumno());
            pstm.setString(2, nuevoAlumno.getNomcompAlumno());
            pstm.setInt(3, nuevoAlumno.getGENERO_idGENERO());
            pstm.setInt(4,nuevoAlumno.getESTADO_MATRICULA_idESTADO_MATRICULA());
            pstm.setInt(5,nuevoAlumno.getCREDENCIAL_idCREDENCIAL());
            pstm.setInt(6,nuevoAlumno.getIdALUMNO());
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
    
    public boolean eliminarAlumno(int idALUMNO){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE FROM ALUMNO WHERE idALUMNO = ?"
                    );
                        pstm.setInt(1, idALUMNO);
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
    
    public Alumno buscarAlumno(int idALUMNO){
        Alumno encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT   rutAlumno, nomcompAlumno from ALUMNO WHERE idALUMNO = ?"
                    );
                pstm.setInt(1,idALUMNO);
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Alumno(
                            rs.getInt(1),
                            rs.getString(2));
                           
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
                      "SELECT rutAlumno,nomcompAlumno from ALUMNO"   
                    );
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Alumno temp = new Alumno (
                        rs.getInt(1),
                        rs.getString(2)
                      
                );
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

