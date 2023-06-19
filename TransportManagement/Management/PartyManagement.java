package TransportManagement.Management;

import TransportManagement.Classes.Party;
import TransportManagement.Classes.Truck;
import TransportManagement.DAO.files.PartyDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PartyDAO DAO = new PartyDAO();
    public static void Options(int id) {
        System.out.println("Party Management");
        System.out.println("1. View All parties");
        System.out.println("2. View party");
        System.out.println("3. Add party");
        System.out.println("4. Delete party");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch(choice){
            // using these methods we will call the DAO methods
            case 1-> viewAllParty(id);
            case 2-> viewParty(id);
            case 3-> addParty(id);
            case 4-> deleteParty(id);
            default-> System.out.println("Wrong choice");
        }
    }
    private static void deleteParty(int id) {
        try{
            System.out.println("Enter Party name to Delete");
            String PartyName = scanner.next();
            DAO.delete(id,PartyName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void addParty(int id) {
        try{
            System.out.println("Enter following details to add party");
            System.out.println("Name of Company");
            String name= scanner.next();

            System.out.println("Contact Number");
            double mobile = scanner.nextLong();
            System.out.println("Address od company");
            String address = scanner.next();
            Party party = new Party(name, address, mobile, id);
            DAO.add(party);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void viewParty(int id) {
        try{
            System.out.println("Enter Party name");
            String party_name = scanner.next();
            DAO.view(id,party_name);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void viewAllParty(int id) {
        List<Party> parties = new ArrayList<>();
        try{
            parties.addAll(DAO.viewAll(id));
            if(parties.isEmpty()){
                System.out.println("No Trucks");
                return;
            }
            for (Party party : parties) {
                System.out.println(party);
            }
            return;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
