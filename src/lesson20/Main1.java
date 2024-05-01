package lesson20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_40?user=root&password=S2023qL_n_1");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()){
                int id = rs.getInt("id");
                String surname = rs.getString("surname");
                String name = rs.getString("name");
                String groupe = rs.getString("groupe");
                String date = rs.getString("date");
                System.out.println(id + " " + surname + " " + name + " " + groupe + " " + date);
            }

            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
