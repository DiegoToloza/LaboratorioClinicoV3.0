package jdbc;

import domain.*;
import java.sql.*;
import java.util.*;

public class JdbcOrina implements IGenericoJdbcMuestra {

    private Connection userConn;

    private static final String SQL_INSERT = "INSERT INTO laboratorio.orina(id_paciente, glucosa, densidad, ph, sodio) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE laboratorio.orina SET glucosa = ?, densidad = ?, ph = ?, sodio = ? WHERE id_paciente = ?";
    private static final String SQL_DELETE = "DELETE FROM laboratorio.orina WHERE id_paciente = ?";
    private static final String SQL_SELECT = "SELECT * FROM laboratorio.orina WHERE id_paciente = ?";

    public JdbcOrina() {

    }

    public JdbcOrina(Connection userConn) {
        this.userConn = userConn;
    }

    //METODOS
    @Override
    public void insert(IMuestraGenerica muestra) throws SQLException {

        Orina orina = (Orina) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, orina.getIdPaciente());
            ps.setDouble(2, orina.getGlucosa());
            ps.setDouble(3, orina.getDensidad());
            ps.setInt(4, orina.getpH());
            ps.setInt(5, orina.getSodio());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void update(IMuestraGenerica muestra) throws SQLException {

        Orina orina = (Orina) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setDouble(1, orina.getGlucosa());
            ps.setDouble(2, orina.getDensidad());
            ps.setInt(3, orina.getpH());
            ps.setInt(4, orina.getSodio());
            ps.setInt(5, orina.getIdPaciente());
            ps.executeUpdate();

        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void delete(IMuestraGenerica muestra) throws SQLException {
        
        Orina orina = (Orina) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, orina.getIdPaciente());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public Orina select(int idPaciente) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Orina orina = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setInt(1, idPaciente);
            rs = ps.executeQuery();

            while (rs.next()) {
                int nuevoIdPaciente = rs.getInt("id_paciente");
                double glucosa = rs.getDouble("glucosa");
                double densidad = rs.getDouble("densidad");
                int ph = rs.getInt("ph");
                int sodio = rs.getInt("sodio");

                orina = new Orina(glucosa, densidad, ph, sodio, nuevoIdPaciente);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return orina;
    }
}
