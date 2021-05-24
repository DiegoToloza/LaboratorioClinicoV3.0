package jdbc;

import domain.*;
import java.sql.*;

public class JdbcSemen implements IGenericoJdbcMuestra {

    private Connection userConn;

    private static final String SQL_INSERT = "INSERT INTO laboratorio.semen(id_paciente, volumen, concentracion, globulos_blancos, vitalidad) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE laboratorio.semen SET volumen = ?, concentracion = ?, globulos_blancos = ?, vitalidad = ? WHERE id_paciente = ?";
    private static final String SQL_DELETE = "DELETE FROM laboratorio.semen WHERE id_paciente = ?";
    private static final String SQL_SELECT = "SELECT * FROM laboratorio.semen WHERE id_paciente = ?";

    public JdbcSemen() {

    }

    public JdbcSemen(Connection userConn) {
        this.userConn = userConn;
    }

    //METODOS
    @Override
    public void insert(IMuestraGenerica muestra) throws SQLException {
        
        Semen semen = (Semen) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setDouble(1, semen.getIdPaciente());
            ps.setDouble(2, semen.getVolumen());
            ps.setDouble(3, semen.getConcentracion());
            ps.setDouble(4, semen.getGlobulosBlancos());
            ps.setInt(5, semen.getVitalidad());
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
        
        Semen semen = (Semen) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setDouble(1, semen.getVolumen());
            ps.setDouble(2, semen.getConcentracion());
            ps.setDouble(3, semen.getGlobulosBlancos());
            ps.setInt(4, semen.getVitalidad());
            ps.setDouble(5, semen.getIdPaciente());
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

        Semen semen = (Semen) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, semen.getIdPaciente());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public Semen select(int idPaciente) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Semen semen = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setInt(1, idPaciente);
            rs = ps.executeQuery();

            while (rs.next()) {
                int nuevoIdPaciente = rs.getInt("id_paciente");
                double volumen = rs.getDouble("volumen");
                double concentracion = rs.getDouble("concentracion");
                double globulosBlancos = rs.getDouble("globulos_blancos");
                int vitalidad = rs.getInt("vitalidad");

                semen = new Semen(volumen, concentracion, globulosBlancos, vitalidad, idPaciente);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return semen;
    }
}
