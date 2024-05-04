
package Model;
import java.sql.*;
import javax.swing.JOptionPane;
public class MLogin {
    private ResultSet rs;
    private Connection conn;
    private boolean x;
    public boolean checkUserM(String a,String b)
    {
        try
        {
            DatabaseConnect ob = new DatabaseConnect();
            conn=ob.sqlDBConnection();
            
            Statement stm = conn.createStatement();
            rs = stm.executeQuery("Select * from Customer_details where password = '"+b+"' and username = '"+a+"'");
            
            x = rs.next();
            
            conn.close();
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return x;
    }
}
