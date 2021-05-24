package jdbc;

import domain.IMuestraGenerica;
import java.sql.SQLException;

public interface IGenericoJdbcMuestra {

    public void insert(IMuestraGenerica muestra) throws SQLException;

    public void update(IMuestraGenerica muestra) throws SQLException;

    public void delete(IMuestraGenerica muestra) throws SQLException;
}
