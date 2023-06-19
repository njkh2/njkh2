package TransportManagement.DAO.files;

import TransportManagement.Classes.user;
import TransportManagement.DBConnection.DBconnection;

import java.sql.*;
import java.util.*;

public class AuthenticationDAO  {
    public static int singup(user user) throws SQLException{
        String Query = "INSERT INTO Authenticate (name,password) values(?,?)";
        Connection connection = DBconnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(Query);
        statement.setString(1, user.getUsername());
        statement.setString(2,
                user.getPassword());
        statement.execute();
        int id = getId(user);
        if( id == -1){
            System.out.println("There was an error while creating your account");
            return -1;
        }
        System.out.println("Your id is "+id);
        System.out.println("please note it down");
        return id;
    }

    private static int getId(user user)throws SQLException {
        String Query = "SELECT id FROM authenticate WHERE name = ? AND password = ?";
        Connection connection = DBconnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(Query);
        statement.setString(1,user.getUsername());
        statement.setString(2,user.getPassword());
        ResultSet set = statement.executeQuery();
        int id = -1;
        if(set.next()){
            id = set.getInt("id");
            return id;
        }
        return id;
    }

    public static boolean login(int id, String password) {
        try{
            String Query = "SELECT name FROM authenticate WHERE id = ? AND password = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,password);
            ResultSet set = statement.executeQuery();
            String username;
            if(set.next()){
                username = set.getString("name");
                System.out.println("Welcome "+username);
                return true;
            }
            System.out.println("No user found");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
