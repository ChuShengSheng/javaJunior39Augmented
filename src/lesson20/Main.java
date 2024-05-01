package lesson20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_40?user=root&password=S2023qL_n_1");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select t.id, t.name_of_term as name_term, t.duration, d.id as id_disc, d.discipline from term_discipline as td\n" +
                    "left join term as t on td.id_term = t.id\n" +
                    "left join discipline as d on td.id_discipline = d.id\n" +
                    "where td.id_term = 1 and d.status = '1'\n");

            Term term = null;
            while (rs.next()){
                if(term == null){
                    term = new Term();
                    term.setId(rs.getInt("id"));
                    term.setTerm(rs.getString("name_term"));
                    term.setDuration(rs.getString("duration"));
                }

                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id_disc"));
                discipline.setDiscipline(rs.getString("discipline"));
                term.addDiscipline(discipline);
            }

            System.out.println(term);
            for(Discipline d: term.getDisciplines()){
                System.out.println(d);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
