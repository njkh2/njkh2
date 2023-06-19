package TransportManagement.Management;

import TransportManagement.Classes.Truck;
import TransportManagement.DAO.files.TruckDAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class TruckManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TruckDAO DAO = new TruckDAO();
    public static void Options(int id) {
        System.out.println("This your truck terminal");
        System.out.println("1.view All Trucks");
        System.out.println("2.view particular Truck");
        System.out.println("3.Add Truck");
        System.out.println("4.Delete Truck");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch(choice){
            case 1-> viewAllTrucks(id);
            case 2-> viewTruck(id);
            case 3-> addTruck(id);
            case 4-> deleteTruck(id);
            default-> System.out.println("Wrong choice");
        }
    }

    private static void deleteTruck(int id) {
        try{
            System.out.println("Enter Truck Number to Delete");
            String truckNumber = scanner.next();
            DAO.delete(id,truckNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void addTruck(int id) {
        try{
    /*
    id int,
    vehicle_number varchar(20) primary key,
    passing_expire date,
    permit_expire date,
    Insurance_expire date,
    foreign key (id) references authenticate(id)*
    */
            System.out.println("Enter following details to add truck");
            System.out.println("Vehicle Number ");
            String vehicle_number = scanner.next();
            System.out.println("passing Expiry (yyyy-mm-dd)");
            String passing = scanner.next();
            System.out.println("permit Expiry (yyyy-mm-dd)");
            String permit = scanner.next();
            System.out.println("Insurance Expiry (yyyy-mm-dd)");
            String Insurance = scanner.next();
            Truck truck = new Truck(id,vehicle_number,passing,permit,Insurance);
            DAO.add(truck);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void viewTruck(int id) {
        try{
            System.out.println("Enter truck number");
            String Truck_number = scanner.next();
            DAO.view(id,Truck_number);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void viewAllTrucks(int id) {
        List<Truck> Trucks = new ArrayList<>();
        try{
            Trucks.addAll(DAO.viewAll(id));
            if(Trucks.isEmpty()){
                System.out.println("No Trucks");
                return;
            }
            for (Truck truck : Trucks) {
                System.out.println(truck);
            }
            return;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
