package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MSignin {
    private int rowsInserted;

    public int newCusRegM(String a, String b, String c, String d, String e, String f, String g, int h, String i) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            if (d.equals(e)) {
                DatabaseConnect ob = new DatabaseConnect();
                conn = ob.sqlDBConnection();

                String query = "INSERT INTO Customer_details (Username, Fname, Lastname, Password, Email, Address, Phone, DOB) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                    pst = conn.prepareStatement(query);

                    pst.setString(1, a);
                    pst.setString(2, b);
                    pst.setString(3, c);
                    pst.setString(4, d);
                    pst.setString(5, f);
                    pst.setString(6, g);
                    pst.setInt(7, h); // Change this to setInt to match the database schema
                    pst.setString(8, i);

                rowsInserted = pst.executeUpdate();
            } else {
                rowsInserted = -1; // Passwords don't match
            }
        } 
        catch(Exception x)
        {
            JOptionPane.showMessageDialog(null, x.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        return rowsInserted;
    }
}
