package co.edu.unbosque.bluemarketfinal.services;

import co.edu.unbosque.bluemarketfinal.model.Artist;
import co.edu.unbosque.bluemarketfinal.model.Buyer;
import co.edu.unbosque.bluemarketfinal.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServices {

    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String URL = "jdbc:postgresql://localhost/BlueMarket";
    static final String USER = "postgres";
    static final String PASSWORD = "Pacolindo.23";

    public UserServices(){}

    public User addElement(String name, String mail, String password, String role){
        System.out.println("Name = " + name + ", email = " + mail + ", password = " + password + ", role = " + role);
        User response = null;
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); Statement statement = connection.createStatement()){
            Class.forName(JDBC_DRIVER);
            System.out.println("name = " + name + ", email = " + mail + ", password = " + password + ", role = " + role);
            String query = "INSERT INTO userapp(password,email,role,name) VALUES('" + password +"', '" + mail +"', '" + role +"', '" + name +"')";
            statement.execute(query);
            if(role.equals("Artist")) {
                query = "INSERT  INTO Artist(name, fcoins) VALUES('" + name + "')";
                response = new Artist(name, mail, password, role);
            }else {
                query = "INSERT INTO Buyer(name, fcoins) VALUES('" + name + "')";
                response = new Buyer(name, mail, password, role);
            }
            statement.execute(query);
        } catch(SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
        return response;
    }



    public List <User> getList(String username, String password){
        List <User> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); Statement statement = connection.createStatement()){
            Class.forName(JDBC_DRIVER);
            String query = "SELECT  * FROM userapp";
            ResultSet result = statement.executeQuery(query);
            while(result.next()){
                String name = result.getString("name");
                String email = result.getString("email");
                String key = result.getString("password");
                String role = result.getString("role");
                if(optionalNull(role))
                    list.add(new Artist(name.equals("null") ? "vacio" : name, email, key, "Artist"));
                else
                    list.add(new Buyer(name.equals("null") ? "vacio" : name, email, key, "Shopper"));
            }
        } catch(SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
        return list;
    }

    public User updateFcoins(String username, double fcoins){
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); Statement statement = connection.createStatement()){
            Class.forName(JDBC_DRIVER);
            String query = "UPDATE Artist SET 2 = '" + fcoins + "' WHERE name = '" + username + "'";
            statement.execute(query);
        } catch(SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }
        return null;
    }

    private boolean optionalNull(String role){
        return Optional.ofNullable(role).orElse("Artist").equalsIgnoreCase("Artist");
    }
}
