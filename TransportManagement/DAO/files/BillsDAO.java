package TransportManagement.DAO.files;

import TransportManagement.Classes.Bill;
import TransportManagement.Classes.Driver;
import TransportManagement.DBConnection.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BillsDAO {

    public void add(Bill bill) {
        try{
            String Query = "INSERT INTO bill VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,bill.getBill_number());
            statement.setString(2,bill.getParty_name());
            statement.setString(3,bill.isImport_export());
            statement.setString(4,bill.getPickup_from());
            statement.setString(5,bill.getPickup_to());
            statement.setString(6,bill.getBack_to());
            statement.setLong(7,bill.getTruck_charge());
            statement.setLong(8,bill.getLess_advance());
            statement.setLong(9,bill.getExtra());
            statement.setLong(10,bill.getBalance());
            statement.setString(11,bill.getVehicle_number());
            statement.setString(12,bill.getContainer_number());
            statement.setString(13,bill.getLoad_date());
            statement.setString(14,bill.getEmpty_date());
            statement.setInt(15,bill.getBill_number());
            int rowAffected = statement.executeUpdate();
            if(rowAffected==0){
                System.out.println("Cannot Insert values");
                return;
            }
            System.out.println("Bill Inserted Successfully");
            return;
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void view(int id, int bill_number) {
        try{
            Connection connection = DBconnection.getConnection();
            String Query = "SELECT * FROM bill WHERE id = ? AND bill_number = ?";
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setInt(2,bill_number);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                int bill_num = set.getInt(1);
                String party_name = set.getString(2);
                String import_export = set.getString(3);
                String pickup_from = set.getString(4);
                String pickup_to = set.getString(5);
                String back_to = set.getString(6);
                long truck_charge = set.getLong(7);
                long less_advance = set.getLong(8);
                long extra = set.getLong(9);
                long balance = set.getLong(10);
                String vehicle_number = set.getString(11);
                String container_number = set.getString(12);
                String load_date = set.getString(13);
                String empty_date = set.getString(14);

                int user = id;
                Bill bill;
                bill = new Bill(id,bill_num,party_name,import_export,pickup_from,pickup_to,back_to,truck_charge,less_advance,extra,balance,vehicle_number,container_number,load_date,empty_date);

                System.out.println(bill);
                return;
            }else{
                System.out.println("Truck not found");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<Bill> viewAll(int id) {
        List<Bill> bills = new ArrayList<>();
        try{
            String Query = "SELECT * FROM bill WHERE id = ?";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            ResultSet set = statement.executeQuery();
            while(set.next()){
                int bill_num = set.getInt(1);
                String party_name = set.getString(2);
                String import_export = set.getString(3);
                String pickup_from = set.getString(4);
                String pickup_to = set.getString(5);
                String back_to = set.getString(6);
                long truck_charge = set.getLong(7);
                long less_advance = set.getLong(8);
                long extra = set.getLong(9);
                long balance = set.getLong(10);
                String vehicle_number = set.getString(11);
                String container_number = set.getString(12);
                String load_date = set.getString(13);
                String empty_date = set.getString(14);

                int user = id;
                Bill bill;
                bill = new Bill(id,bill_num,party_name,import_export,pickup_from,pickup_to,back_to,truck_charge,less_advance,extra,balance,vehicle_number,container_number,load_date,empty_date);

                bills.add(bill);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return bills;
    }

    public List<Bill> viewByParty(int id, String party_n) {
        List<Bill> bills = new ArrayList<>();
        try{
            String Query = "SELECT * FROM bill WHERE id = ? AND party_name = ? ";
            Connection connection = DBconnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(Query);
            statement.setInt(1,id);
            statement.setString(2,party_n);
            ResultSet set = statement.executeQuery();
            while(set.next()){
                int bill_num = set.getInt(1);
                String party_name = set.getString(2);
                String import_export = set.getString(3);
                String pickup_from = set.getString(4);
                String pickup_to = set.getString(5);
                String back_to = set.getString(6);
                long truck_charge = set.getLong(7);
                long less_advance = set.getLong(8);
                long extra = set.getLong(9);
                long balance = set.getLong(10);
                String vehicle_number = set.getString(11);
                String container_number = set.getString(12);
                String load_date = set.getString(13);
                String empty_date = set.getString(14);

                int user = id;
                Bill bill;
                bill = new Bill(id,bill_num,party_name,import_export,pickup_from,pickup_to,back_to,truck_charge,less_advance,extra,balance,vehicle_number,container_number,load_date,empty_date);

                bills.add(bill);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return bills;
    }
}
