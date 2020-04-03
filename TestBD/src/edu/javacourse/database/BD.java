package edu.javacourse.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BD
{
    public static void main(String[] args) {
        BD m = new BD();
        m.testDatabase();
    }

    private void testDatabase() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:postgresql://35.228.220.249:5432/postgres";
        String login = "postgres";
        String password = "12KokTeL";
        try ( Connection con = DriverManager.getConnection(url, login, password)){

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("insert into employees (first_name, last_name, middle_name, phone, email)\n" +
                    "values('Ванька', 'Иван', 'Иванович', '88005553535', '1@dkgk.ru');\n");
                stmt.close();
            Statement stmt1 = con.createStatement();
                ResultSet rs1 = stmt1.executeQuery("SELECT first_name FROM employees WHERE id  = 11\n");
                while (rs1.next()) {
                    String str = rs1.getString("first_name");
                    // + ":"+ rs.getString(1)//;
                    System.out.println("Contact:" + str);

                }
            stmt1.close();
            }
            catch (Exception e) {
                System.out.println("XyJIe");
            e.printStackTrace();
        }
        }

    }
