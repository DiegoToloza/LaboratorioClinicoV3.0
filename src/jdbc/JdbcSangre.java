package jdbc;

import domain.*;
import java.sql.*;

public class JdbcSangre implements IGenericoJdbcMuestra {

    private Connection userConn;

    private static final String SQL_INSERT = "INSERT INTO laboratorio.sangre(id_paciente, hemoglobina, reticulocitos, neutrofilos, plaquetas) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE laboratorio.sangre SET hemoglobina = ?, reticulocitos = ?, neutrofilos = ?, plaquetas = ? WHERE id_paciente = ?";
    private static final String SQL_DELETE = "DELETE FROM laboratorio.sangre WHERE id_paciente = ?";
    private static final String SQL_SELECT = "SELECT * FROM laboratorio.sangre WHERE id_paciente = ?";

    public JdbcSangre() {

    }

    public JdbcSangre(Connection userConn) {
        this.userConn = userConn;
    }

    //METODOS
    @Override
    public void insert(IMuestraGenerica muestra) throws SQLException {
        
        Sangre sangre = (Sangre) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setDouble(1, sangre.getIdPaciente());
            ps.setDouble(2, sangre.getHemogoblina());
            ps.setDouble(3, sangre.getReticulocitos());
            ps.setInt(4, sangre.getNeutrofilos());
            ps.setInt(5, sangre.getPlaquetas());
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
        
        Sangre sangre = (Sangre) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setDouble(1, sangre.getHemogoblina());
            ps.setDouble(2, sangre.getReticulocitos());
            ps.setDouble(3, sangre.getNeutrofilos());
            ps.setInt(4, sangre.getPlaquetas());
            ps.setDouble(5, sangre.getIdPaciente());
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
        
        Sangre sangre = (Sangre) muestra;
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, sangre.getIdPaciente());
            ps.executeUpdate();
        } finally {
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
    }

    public Sangre select(int idPaciente) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Sangre sangre = null;

        try {
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setInt(1, idPaciente);
            rs = ps.executeQuery();

            while (rs.next()) {
                int nuevoIdPaciente = rs.getInt("id_paciente");
                double hemoglobina = rs.getDouble("hemoglobina");
                double reticulocitos = rs.getDouble("reticulocitos");
                int neutrofilos = rs.getInt("neutrofilos");
                int plaquetas = rs.getInt("plaquetas");
                
                sangre = new Sangre(hemoglobina, reticulocitos, neutrofilos, plaquetas, idPaciente);

            }
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null) {
                Conexion.close(conn);
            }
        }
        return sangre;
    }
}
