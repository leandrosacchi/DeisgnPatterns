package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection(){
        try {
            String banco = System.getenv("tipoBanco");

            if ("mysql".equals(banco)){
                return DriverManager.getConnection("jdbc:mysql//localhost:3306/banco", "usuario", "senha");
            } else {
                return DriverManager.getConnection("jdbc:postgres//localhost:3306/banco", "usuario", "senha");
            }
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
}
