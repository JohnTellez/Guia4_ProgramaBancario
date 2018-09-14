package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Datos_servicio {
    
    private final String tabla = "cuenta";
    
    public void guardar(Connection conexion, Datos dato) throws SQLException{
        
        try{
            PreparedStatement consulta;
            if(dato.getId_cuenta()== null){
                consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(num_cuenta, nombre, tipo, monto, estado) VALUES(?, ?, ?, ?, ?)");
                consulta.setInt(1, dato.getNum_cuenta());
                consulta.setString(2, dato.getNombre());
                consulta.setString(3, dato.getTipo());
                consulta.setInt(4, 0);
                consulta.setString(5, "activa");
            }else{
                consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET num_cuenta = ?, nombre = ?, tipo = ?, monto = ?, estado = ? WHERE id_cuenta = ?");
                consulta.setInt(1, dato.getNum_cuenta());
                consulta.setString(2, dato.getNombre());
                consulta.setString(3, dato.getTipo());
                consulta.setInt(4,  dato.getMonto());
                consulta.setString(5, dato.getEstado());
                consulta.setInt(6, dato.getId_cuenta());
            }
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public Datos recuperarPorId(Connection conexion, int id_cuenta) throws SQLException {
        Datos tarea = null;
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT num_cuenta, nombre, tipo, monto, estado FROM " + this.tabla + " WHERE id_cuenta = ?" );
            consulta.setInt(1, id_cuenta);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                tarea = new Datos(id_cuenta, resultado.getInt("num_cuenta"), resultado.getString("nombre"), 
                        resultado.getString("tipo"), resultado.getInt("monto"), resultado.getString("estado"));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return tarea;
    }
    
    public void eliminar(Connection conexion, Datos tarea) throws SQLException{
        try{
            PreparedStatement consulta = conexion.prepareStatement("DELETE FROM " + this.tabla + " WHERE id_cuenta = ?");
            consulta.setInt(1, tarea.getId_cuenta());
            consulta.executeUpdate();
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
    }
    
    public List<Datos> recuperarTodas(Connection conexion) throws SQLException{
        List<Datos> tareas = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT id_cuenta, num_cuenta, nombre, tipo, monto, estado FROM " + this.tabla + " ORDER BY id_cuenta");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                tareas.add(new Datos(resultado.getInt("id_cuenta"), resultado.getInt("num_cuenta"), resultado.getString("nombre"), 
                        resultado.getString("tipo"), resultado.getInt("monto"), resultado.getString("estado")));
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return tareas;
    } 
    
    public List<Datos> recuperarEstado(Connection conexion, String estado) throws SQLException{
        List<Datos> tareas = new ArrayList<>();
        try{
            PreparedStatement consulta = conexion.prepareStatement("SELECT id_cuenta, num_cuenta, nombre, tipo, monto, estado FROM " + this.tabla + " ORDER BY id_cuenta");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                if(resultado.getString("estado").equals(estado)){
                tareas.add(new Datos(resultado.getInt("id_cuenta"), resultado.getInt("num_cuenta"), resultado.getString("nombre"), 
                        resultado.getString("tipo"), resultado.getInt("monto"), resultado.getString("estado")));
                }
            }
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
        return tareas;
    }    
    
}