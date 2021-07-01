package jdbc;

import domain.Medico;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class JdbcMedico {

    private Connection userConn;

    private static final String SQL_INSERT = "INSERT INTO laboratorio.medico(nombre, edad, genero, nacionalidad, especializacion, telefono, email) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE laboratorio.medico SET nombre = ?, edad = ?, genero = ?, nacionalidad = ?, especializacion = ?, telefono = ?, email = ? WHERE id_medico = ?";
    private static final String SQL_DELETE = "DELETE FROM laboratorio.medico WHERE id_medico = ?";
    private static final String SQL_SELECT = "SELECT * FROM laboratorio.medico";
    private static final String SQL_SELECT_ONE = "SELECT * FROM laboratorio.medico WHERE id_medico = ?";
    private static final String SQL_MAX_ID = "SELECT MAX(id_medico) AS id_medico FROM laboratorio.medico";

    public JdbcMedico() {
    }

    public JdbcMedico(Connection userConn) {
        this.userConn = userConn;
    }

    ///METODOS
    public void insert(Medico medico) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, medico.getNombre());
            ps.setInt(2, medico.getEdad());
            ps.setString(3, medico.getGenero());
            ps.setString(4, medico.getNacionalidad());
            ps.setString(5, medico.getEspecializacion());
            ps.setString(6, medico.getTelefono());
            ps.setString(7, medico.getCorreoElectronico()); 
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }
    
    public void update(Medico medico) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, medico.getNombre());
            ps.setInt(2, medico.getEdad());
            ps.setString(3, medico.getGenero());
            ps.setString(4, medico.getNacionalidad());
            ps.setString(5, medico.getEspecializacion());
            ps.setString(6, medico.getTelefono());
            ps.setString(7, medico.getCorreoElectronico());
            ps.setInt(8, medico.getId());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public void delete(Medico medico) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, medico.getId());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public List<Persona> select() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Persona> listaMedicos = new ArrayList<>();

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idMedico = rs.getInt("id_medico");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String nacionalidad = rs.getString("nacionalidad");
                String especializacion = rs.getString("especializacion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                Medico medico = new Medico(idMedico, especializacion, telefono, email, nombre, edad, genero, nacionalidad);
                listaMedicos.add(medico);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }

        return listaMedicos;
    }

    public Medico select(int idMedico) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Medico medico = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT_ONE);
            ps.setInt(1, idMedico);
            rs = ps.executeQuery();

            while (rs.next()) {
                int newIdMedico = rs.getInt("id_medico");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String nacionalidad = rs.getString("nacionalidad");
                String especializacion = rs.getString("especializacion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                medico = new Medico(newIdMedico, especializacion, telefono, email, nombre, edad, genero, nacionalidad);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return medico;
    }
    
    
    
    
    public Integer ultimoId() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Integer maxId = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_MAX_ID);
            rs = ps.executeQuery();

            while (rs.next()) {
                maxId = rs.getInt("id_medico");
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }

        return maxId;
    }
}
