package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FactoryPatternTest {
    public static void main(String[] args) throws SQLException {

        Connection c = new ConnectionFactory().getConnection();

        PreparedStatement ps = c.prepareStatement("select * from tabela");

    }
}
