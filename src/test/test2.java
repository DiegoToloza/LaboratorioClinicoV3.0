package test;

import domain.*;
import java.sql.SQLException;
import jdbc.*;

public class test2 {

    public static void main(String[] args) throws SQLException {
        JdbcSangre xd = new JdbcSangre();
        Sangre sangre = xd.select(2);
        System.out.println(sangre.escribir());
        
        
    }
}
