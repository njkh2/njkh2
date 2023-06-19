package TransportManagement.Management;

import TransportManagement.Classes.Bill;
import TransportManagement.Classes.Driver;
import TransportManagement.DAO.files.BillsDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BillsDAO DAO = new BillsDAO();
    public static void Options(int id) {
        System.out.println("Bill Management");
        System.out.println("1.view All Bills");
        System.out.println("2.Add Bill");
        System.out.println("3.View Bill by Bill Number");
        System.out.println("4.View Bill by Party");
        System.out.println("Enter your choice ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1-> viewAllBills(id);
            case 2-> addBill(id);
            case 3-> viewByBill(id);
            case 4-> viewByParty(id);
            default-> System.out.println("Wrong choice");
        }
    }

    private static void viewByParty(int id) {
        try{
            System.out.println("Enter party name for sorting");
            String party_name = scanner.next();
            List<Bill> bills = DAO.viewByParty(id,party_name);
            for(Bill bill : bills){
                System.out.println(bill);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void viewByBill(int id) {
        try{
            System.out.println("Enter Bill Number");
            int bill_number = scanner.nextInt();
            DAO.view(id,bill_number);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void addBill(int id) {
             /*create table bill(
	bill_number int auto_increment primary key,
    party_name varchar(50),
    import_export varchar(10) ,
    pickup_from varchar(20),
    pickup_to varchar(20),
    back_to varchar(20),
    Truck_charge bigint ,
    less_advance bigint,
    extra bigint ,
    balance bigint,
    vehicle_number varchar(20),
    container_number varchar(20),
    load_date date,
    empty_date date,
    foreign key(party_name) references party(party_name),
    foreign key(vehicle_number) references vehicle(vehicle_number)
);*/

        try{
            System.out.println("Enter following details to add Bill");
            System.out.println("Bill Number");
            int bill_number = scanner.nextInt();
            System.out.println("party name");
            String partyName = scanner.next();
            System.out.println("Import or Export");
            String import_export = scanner.next();
            System.out.println("pick up from");
            String from = scanner.next();
            System.out.println("to");
            String to = scanner.next();
            System.out.println("Back to");
            String back_to = scanner.next();
            System.out.println("Truck Charge");
            long truck_charge = scanner.nextLong();
            System.out.println("Advance received");
            long advance = scanner.nextLong();
            System.out.println("Diten or extra charges");
            long extra = scanner.nextLong();
            System.out.println("Balance is ");
            long balance = truck_charge+extra - advance;
            System.out.println(balance);
            System.out.println("Vehicle number");
            String vehicle_number = scanner.next();
            System.out.println("Container Number");
            String container_number = scanner.next();
            System.out.println("Loaded Date(yyyy-mm-dd)");
            String load = scanner.next();
            System.out.println("empty date (yyyy-mm-dd)");
            String empty = scanner.next();
            Bill bill;
            bill = new Bill(id,bill_number,partyName,import_export,from,to,back_to,truck_charge,advance,extra,balance,vehicle_number,container_number,load,empty);
            DAO.add(bill);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void viewAllBills(int id) {
        try{
            List<Bill> bills = new ArrayList<>(DAO.viewAll(id));
            if(bills.isEmpty()){
                System.out.println("No Bill data found");
                return;
            }
            for (Bill bill : bills) {
                System.out.println(bill);
            }
            return;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
