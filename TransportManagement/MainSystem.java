package TransportManagement;
import TransportManagement.Classes.user;
import TransportManagement.DAO.files.*;
import TransportManagement.Management.BillManagement;
import TransportManagement.Management.DriverManagement;
import TransportManagement.Management.PartyManagement;
import TransportManagement.Management.TruckManagement;

import java.util.Scanner;
public class MainSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Radhe Radhe\n welcome to our Transport Management System");
        System.out.println("1.Login \n2.Signup");
        int choice = scanner.nextInt();
        switch(choice){
            case 1-> login();
            case 2-> signup();
            default-> System.out.println("Wrong input");
        }
    }

    private static void signup() {
        try{
            System.out.println("Enter userName ");
            String name = scanner.next();
            System.out.println("Enter password");
            String password = scanner.next();
            user User = new user(name,password);
            int id = AuthenticationDAO.singup(User);
            if(id == -1){
                System.out.println("cant create account");
                return;
            }
            userOption(id);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void userOption(int id) {
        System.out.println("1.all data");
        System.out.println("2.Truck");
        System.out.println("3.Driver");
        System.out.println("4.Parties");
        System.out.println("5.Bills");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch(choice){
            case 1 -> viewAllDataDAO.DisplayAll(id);
            case 2 -> TruckManagement.Options(id);
            case 3 -> DriverManagement.Options(id);
            case 4 -> PartyManagement.Options(id);
            case 5 -> BillManagement.Options(id);
            default -> System.out.println("Wrong choice");
        }
    }

    private static void login() {
        try{
            System.out.println("Enter your user id");
            int id = scanner.nextInt();
            System.out.println("Enter your password");
            String password = scanner.next();
            boolean isValid = AuthenticationDAO.login(id,password);
            if(isValid){
                System.out.println("login successful");
                userOption(id);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
