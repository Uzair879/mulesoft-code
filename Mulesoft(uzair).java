JDBC Connectivity by creating a new table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestApplication {
   static final String DB_URL = "jdbc:mysql://localhost/movies.db";
   static final String USER = "guest";
   static final String PASS = "guest123";

   public static void main(String[] args) {
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
                String sql = "CREATE TABLE movies" +
                      "(moviename         TEXT, "+
                      "lead_actor        TEXT,"+
                      "actress           TEXT,"+
                      "year_of_release    INT,"+
                      "director_name     TEXT)";

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}

SQL Queries : 

INSERT INTO movies VALUES ('Bajrangi Bhaijaan','Salman','Kareena',2012,'UZAIR');
INSERT INTO movies VALUES ('phir hera pheri','Akshay','Shilpa',2011,'VINAMRA');
INSERT INTO movies VALUES ('golmaal','Ajay','kiara',2013,'SUHAS');
INSERT INTO movies VALUES ('chup chup ke','Shahid','malaika',2015,'SONAL');
INSERT INTO movies VALUES ('hulchul','Shahrukh','preeti',2016,'VANDHANA');

SELECT * FROM movies;
SELECT * FROM movies where lead_actor='Salman';
