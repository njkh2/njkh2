package TransportManagement.DAO.files;

import TransportManagement.Classes.Truck;
import TransportManagement.DBConnection.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TruckDAO {
    public void delete(int id, String truckNumber) {
        try{
            String Query = "DELETE FROM vehicle WHERE id = ? AND vehicle_number = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,truckNumber);
            int rowAffected = statement.executeUpdate();
            if(rowAffected==0){
                System.out.println("Data Could not Delete");
                return;
            }
            System.out.println("Truck Deleted Succesfully");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void add(Truck truck) {
        try{
            String Query = "INSERT INTO vehicle VALUES (?,?,?,?,?)";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,truck.getId());
            statement.setString(2,truck.getVehicle_number());
            statement.setString(3,truck.getPassing_expire());
            statement.setString(4,truck.getPermit_expire());
            statement.setString(5,truck.getInsurance_expire());
            int rowAffected = statement.executeUpdate();
            if(rowAffected==0){
                System.out.println("Cannot add truck");
                return;
            }
            System.out.println("Truck added successfully");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<Truck> viewAll(int id) {
        List<Truck> Trucks = new ArrayList<>();
        try{
            String Query = "SELECT * FROM vehicle WHERE id = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            ResultSet set = statement.executeQuery();
            while(set.next()){
                int user = set.getInt("id");
                String Vehicle_number = set.getString("vehicle_number");
                String passing_date = set.getString("passing_expire");
                String permit_date = set.getString("permit_expire");
                String insurance = set.getString("Insurance_expire");
                Truck truck = new Truck(id,Vehicle_number,passing_date,permit_date,insurance);
                Trucks.add(truck);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return Trucks;
    }

    public void view(int id, String truck_number) {
        try{
            Connection connection = DBconnection.getConnection();
            String Query = "SELECT * FROM vehicle WHERE id = ? AND vehicle_number = ?";
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,truck_number);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                String passing = set.getString("passing_expire");
                String permit = set.getString(4);
                String Insurance = set.getString(5);
                Truck truck = new Truck(id,truck_number,passing,permit,Insurance);
                System.out.println(truck);
                return;
            }else{
                System.out.println("Truck not found");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
