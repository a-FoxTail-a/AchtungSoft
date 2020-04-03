package com.SuperSoft.home;


import java.sql.*;

public class BD
{
//    public static void main(String[] args) {
//        BD m = new BD();
//        m.testDatabase("test","test","test","123","test@mail.ru");
//    }

    public void testDatabase(String first_name,String last_name,String middle_name,String phone,String email) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:postgresql://35.228.220.249:5432/postgres";
        String login = "postgres";
        String password = "12KokTeL";
        try ( Connection con = DriverManager.getConnection(url, login, password)){

            PreparedStatement preparedStatement = con.prepareStatement("insert into employees (first_name, last_name, middle_name, phone, email) " +
                    "values(?, ?, ?, ?, ?);");

            preparedStatement.setString(1, first_name);
            preparedStatement.setString(2, last_name);
            preparedStatement.setString(3, middle_name);
            preparedStatement.setString(4, phone);
            preparedStatement.setString(5, email);

            preparedStatement.executeUpdate();
//            while(resultSet.next()){
//
//                int id = resultSet.getInt("Id");
//                String name = resultSet.getString("ProductName");
//                int price = resultSet.getInt("Price");
//
//                System.out.printf("%d. %s - %d \n", id, name, price);
//            }


//
//                Statement stmt = con.createStatement();
//                stmt.execute("insert into employees (first_name, last_name, middle_name, phone, email)\n" +
//                    "values('Ванька', 'Иван', 'Иванович', '88005553535', '1@dkgk.ru');\n");
//                stmt.close();

//
//            Statement stmt1 = con.createStatement();
//                ResultSet rs1 = stmt1.executeQuery("SELECT first_name FROM employees WHERE id  = 11\n");
//                while (rs1.next()) {
//                    String str = rs1.getString("first_name");
//                    // + ":"+ rs.getString(1)//;
//                    System.out.println("Contact:" + str);
//                }
//            stmt1.close();
            }
            catch (Exception e) {
                System.out.println("XyJIe");
            e.printStackTrace();
        }
        }

    }
