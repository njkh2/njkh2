package TransportManagement.Management;

import TransportManagement.Classes.Driver;
import TransportManagement.Classes.Party;
import TransportManagement.Classes.Truck;
import TransportManagement.DAO.files.DriverDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DriverDAO DAO = new DriverDAO();
    public static void Options(int id) {
        System.out.println("Driver Management");
        System.out.println("1.View ALl Drivers");
        System.out.println("2.View Driver");
        System.out.println("3.Add Driver");
        System.out.println("4.Delete Driver");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch(choice){
            case 1-> viewAllDrivers(id);
            case 2-> viewDriver(id);
            case 3-> addDriver(id);
            case 4-> deleteDriver(id);
            default -> System.out.println("Wrong choice");
        }
    }

    private static void deleteDriver(int id) {
        try{
            System.out.println("Enter License Number");
            String license_number = scanner.next();
            DAO.delete(id,license_number);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void addDriver(int id) {
        try{
            System.out.println("Enter following details to add Driver");
            System.out.println("Vehicle Number ");
            String vehicle_number = scanner.next();
            System.out.println("license number");
            String license = scanner.next();
            System.out.println("name of Driver");
            String name = scanner.next();
            System.out.println("Mobile");
            long mobile = scanner.nextLong();
            Driver driver = new Driver(license,vehicle_number,name,mobile,id);
            DAO.add(driver);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void viewDriver(int id) {
        try{
            System.out.println("Enter License Number");
            String license = scanner.next();
            DAO.view(id,license);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void viewAllDrivers(int id) {
        List<Driver> drivers = new ArrayList<>();
        try{
            drivers.addAll(DAO.viewAll(id));
            if(drivers.isEmpty()){
                System.out.println("No Driver data found");
                return;
            }
            for (Driver driver : drivers) {
                System.out.println(driver);
            }
            return;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
