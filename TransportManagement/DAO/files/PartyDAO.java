package TransportManagement.DAO.files;

import TransportManagement.Classes.Party;
import TransportManagement.Classes.Truck;
import TransportManagement.DBConnection.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PartyDAO {

    public void add(Party party) {
        try{
            String Query = "INSERT INTO party VALUES(?,?,?,?)";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setString(1,party.getParty_name());
            statement.setString(2,party.getAddress());
            statement.setDouble(3,party.getMobile());
            statement.setInt(4,party.getId());
            int rowAffected = statement.executeUpdate();
            if(rowAffected==0){
                System.out.println("Cannot Insert values");
                return;
            }
            System.out.println("Party Inserted Successfully");
            return;
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void delete(int id, String partyName) {
        try{
            String Query = "DELETE FROM party WHERE id = ? AND party_name = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,partyName);
            int rowAffected = statement.executeUpdate();
            if(rowAffected==0){
                System.out.println("Data Could not Delete");
                return;
            }
            System.out.println("party Deleted Succesfully");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void view(int id, String party_name) {
        try{
            Connection connection = DBconnection.getConnection();
            String Query = "SELECT * FROM party WHERE id = ? AND party_name = ?";
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,party_name);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                String Address = set.getString(2);
                double mobile = set.getDouble(3);
                Party party = new Party(party_name,Address,mobile,id);
                System.out.println(party);
                return;
            }else{
                System.out.println("Truck not found");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<Party> viewAll(int id) {
        List<Party> parties = new ArrayList<>();
        try{
            String Query = "SELECT * FROM party WHERE id = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            ResultSet set = statement.executeQuery();
            while(set.next()){
                int user = set.getInt("id");
                String name = set.getString(1);
                String address = set.getString(2);
                double Mobile = set.getDouble(3);
                Party party = new Party(name,address,Mobile,id);
                parties.add(party);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return parties;
    }
}
