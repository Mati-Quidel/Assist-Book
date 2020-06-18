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
import java.util.List;
import modelo.Curso;
/**
 *
 * @author Matias
 */
public class Controlador_Curso {

    private Conexion Conect;
    
    public Controlador_Curso() {
        this.setConexion(Conexion.nuevaInstancia());
    }
    private void setConexion(Conexion nuevaConexion){
        this.Conect = nuevaConexion;
    } 
    private Conexion getConexion(){
       return this.Conect;
    }
    
    public boolean agregarCurso(Curso nuevoCurso){
        boolean salida = false; 
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion().prepareStatement(
                    "INSERT INTO CURSO ( nivel,SALA_idSALA, ALUMNO_idALUMNO, \n" +
                    "ALUMNO_GENERO_idGENERO,ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA, \n" +
                    "ALUMNO_CREDENCIAL_idCREDENCIAL ) VALUES(?,?,?,?,?,?)"
            );
            pstm.setString(1, nuevoCurso.getNivel());
            pstm.setInt(2, nuevoCurso.getSALA_idSALA());
            pstm.setInt(3, nuevoCurso.getALUMNO_idALUMNO());
            pstm.setInt(4, nuevoCurso.getALUMNO_GENERO_idGENERO());
            pstm.setInt(5, nuevoCurso.getALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA());
            pstm.setInt(6, nuevoCurso.getALUMNO_CREDENCIAL_idCREDENCIAL());
            
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
    
    public boolean modificarCurso(Curso nuevoCurso){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "UPDATE CURSO SET nivel =?,SALA_idSALA =?, ALUMNO_idALUMNO=?, \n" +
                    "ALUMNO_GENERO_idGENERO=? ,ALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA=? , \n" +
                    "ALUMNO_CREDENCIAL_idCREDENCIAL=?  where idCURSO = ?"
                    );
            pstm.setString(1, nuevoCurso.getNivel());
            pstm.setInt(2, nuevoCurso.getSALA_idSALA());
            pstm.setInt(3, nuevoCurso.getALUMNO_idALUMNO());
            pstm.setInt(4, nuevoCurso.getALUMNO_GENERO_idGENERO());
            pstm.setInt(5, nuevoCurso.getALUMNO_ESTADO_MATRICULA_idESTADO_MATRICULA());
            pstm.setInt(6, nuevoCurso.getALUMNO_CREDENCIAL_idCREDENCIAL());
            pstm.setInt(7, nuevoCurso.getIdCURSO());
            
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
    
    public boolean eliminarCurso(int idCURSO){
        boolean salida = false;
        try{
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                    "DELETE FROM CURSO WHERE idCURSO = ?"
                    );
                        pstm.setInt(1, idCURSO);
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
    
    public Curso buscarCurso(int idCURSO){
        Curso encontrado = null;
        try{ PreparedStatement pstm = this.getConexion().obtenerConexion()
                .prepareStatement(
                    "SELECT   nivel,"
                            + "SALA_idSALA,"
                            + ",ALUMNO_idALUMNO "
                            + "from CURSO WHERE idCURSO = ?"
                    );
                pstm.setInt(1,idCURSO);
                ResultSet rs = pstm.executeQuery();
                        if(rs.first()){
                            encontrado = new Curso(
                            rs.getString(1),
                            rs.getInt(2),
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
            
    public List<Curso> listarCursos(){
        List <Curso> cursos = new ArrayList<Curso>();
        try {
            PreparedStatement pstm = this.getConexion().obtenerConexion()
                    .prepareStatement(
                      "SELECT nivel,"
                            + "SALA_idSALA"
                            + ",ALUMNO_idALUMNO "
                            + "from CURSO"   
                    );
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                Curso temp = new Curso (
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3));;
                
                
                cursos.add(temp);
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
        return cursos;
    }

    
}