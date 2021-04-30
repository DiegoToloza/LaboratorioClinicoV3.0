package jdbc;

import domain.*;
import java.sql.*;
import java.util.*;

public class JdbcPaciente {

    private Connection userConn;

    private static final String SQL_INSERT = "INSERT INTO laboratorio.paciente(nombre, edad, genero, nacionalidad, telefono, email, id_medico) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE laboratorio.paciente SET nombre = ?, edad = ?, genero = ?, nacionalidad = ?, telefono = ?, email = ?, id_medico = ? WHERE id_paciente = ?";
    private static final String SQL_DELETE = "DELETE FROM laboratorio.paciente WHERE id_paciente = ?";
    private static final String SQL_SELECT = "SELECT * FROM laboratorio.paciente";
    private static final String SQL_SELECT_SOMEONE = "SELECT * FROM laboratorio.paciente WHERE id_medico = ?";
    private static final String SQL_SELECT_ONE = "SELECT * FROM laboratorio.paciente WHERE id_paciente = ?";
    private static final String SQL_MAX_ID = "SELECT MAX(id_paciente) AS id_paciente FROM laboratorio.paciente";

    public JdbcPaciente() {

    }

    public JdbcPaciente(Connection userConn) {
        this.userConn = userConn;
    }

    //METODOS
    public void insert(Paciente paciente) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setString(3, paciente.getGenero());
            ps.setString(4, paciente.getNacionalidad());
            ps.setString(5, paciente.getTelefono());
            ps.setString(6, paciente.getCorreoElectronico());
            ps.setInt(7, paciente.getIdMedico());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public void update(Paciente paciente) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getEdad());
            ps.setString(3, paciente.getGenero());
            ps.setString(4, paciente.getNacionalidad());
            ps.setString(5, paciente.getTelefono());
            ps.setString(6, paciente.getCorreoElectronico());
            ps.setInt(7, paciente.getIdMedico());
            ps.setInt(8, paciente.getIdPaciente());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public void delete(Paciente paciente) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, paciente.getIdPaciente());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public List<Paciente> select() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Paciente> listaPacientes = new ArrayList<>();

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idPaciente = rs.getInt("id_paciente");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String nacionalidad = rs.getString("nacionalidad");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                int idMedico = rs.getInt("id_medico");

                Paciente paciente = new Paciente(idPaciente, telefono, email, nombre, edad, genero, nacionalidad, idMedico);
                listaPacientes.add(paciente);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }

        return listaPacientes;
    }
    
        
            

    public Map<Integer,Paciente> selectMedico(int idDeMedico) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Map<Integer,Paciente> mapaPacientes = new HashMap<>();

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT_SOMEONE);
            ps.setInt(1, idDeMedico);
            rs = ps.executeQuery();

            while (rs.next()) {
                int idPaciente = rs.getInt("id_paciente");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String nacionalidad = rs.getString("nacionalidad");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                int idMedico = rs.getInt("id_medico");

                Paciente paciente = new Paciente(idPaciente, telefono, email, nombre, edad, genero, nacionalidad, idMedico);
                mapaPacientes.put(paciente.getIdPaciente(),paciente);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }

        return mapaPacientes;
    }

    public Paciente select(int idPaciente) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Paciente paciente = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT_ONE);
            ps.setInt(1, idPaciente);
            rs = ps.executeQuery();

            while (rs.next()) {
                int newIdPaciente = rs.getInt("id_paciente");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String genero = rs.getString("genero");
                String nacionalidad = rs.getString("nacionalidad");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                int idMedico = rs.getInt("id_medico");

                paciente = new Paciente(newIdPaciente, telefono, email, nombre, edad, genero, nacionalidad, idMedico);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return paciente;
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
                maxId = rs.getInt("id_paciente");
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
