package Model;
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseConnect {
    Connection conn;
    public Connection sqlDBConnection() {
    try {
        String sql = "jdbc:mysql://localhost:3306/ChubbyFoodDB"; 
        conn = DriverManager.getConnection(sql, "root", "");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return conn;
}

}
