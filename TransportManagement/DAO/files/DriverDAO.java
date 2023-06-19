package TransportManagement.DAO.files;

import TransportManagement.Classes.Driver;
import TransportManagement.Classes.Party;
import TransportManagement.DBConnection.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DriverDAO {

    public void add(Driver driver) {
        try{
            String Query = "INSERT INTO driver VALUES(?,?,?,?,?)";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1,driver.getLicense());
            statement.setString(2,driver.getVehicle_number());
            statement.setString(3,driver.getDriver_name());
            statement.setLong(4,driver.getMobile());
            statement.setInt(5,driver.getId());
            int rowAffected = statement.executeUpdate();
            if(rowAffected==0){
                System.out.println("Cannot Insert values");
                return;
            }
            System.out.println("Driver record Inserted Successfully");
            return;
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<Driver> viewAll(int id) {
        List<Driver> drivers = new ArrayList<>();
        try{
            String Query = "SELECT * FROM driver WHERE id = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            ResultSet set = statement.executeQuery();
            while(set.next()){
                int user = set.getInt("id");
                String license = set.getString(1);
                String vehicle_number = set.getString(2);
                String name = set.getString(3);
                long Mobile = set.getLong(4);
                Driver driver = new Driver(license,vehicle_number,name,Mobile,user);
                drivers.add(driver);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return drivers;
    }

    public void view(int id, String license) {
        try{
            Connection connection = DBconnection.getConnection();
            String Query = "SELECT * FROM driver WHERE id = ? AND license = ?";
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,license);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                int user = set.getInt("id");
                String vehicle_number = set.getString(2);
                String name = set.getString(3);
                long Mobile = set.getLong(4);
                Driver driver = new Driver(license,vehicle_number,name,Mobile,user);
                System.out.println(driver);
                return;
            }else{
                System.out.println("Truck not found");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(int id, String license_number) {
        try{
            String Query = "DELETE FROM driver WHERE id = ? AND license = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,license_number);
            int rowAffected = statement.executeUpdate();
            if(rowAffected==0){
                System.out.println("Data Could not Delete");
                return;
            }
            System.out.println("Driver data Deleted Succesfully");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
