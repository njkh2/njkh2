package TransportManagement.Classes;

import java.util.Date;

public class Bill{
        /*create table bill(
	bill_number int auto_increment primary key,
    party_name varchar(50),
    import_export String ,
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

    int bill_number;
    String party_name;
    String import_export;
    String pickup_from;
    String pickup_to;
    String back_to;
    long truck_charge;
    long less_advance;
    long extra;
    long balance;
    String vehicle_number;
    String container_number;
    String load_date;
    String empty_date;

    int id;

    public Bill(int id,int bill_number, String party_name, String import_export, String pickup_from, String pickup_to, String back_to, long truck_charge, long less_advance, long extra, long balance, String vehicle_number, String container_number, String load_date, String empty_date) {
        this.id = id;
        this.bill_number = bill_number;
        this.party_name = party_name;
        this.import_export = import_export;
        this.pickup_from = pickup_from;
        this.pickup_to = pickup_to;
        this.back_to = back_to;
        this.truck_charge = truck_charge;
        this.less_advance = less_advance;
        this.extra = extra;
        this.balance = balance;
        this.vehicle_number = vehicle_number;
        this.container_number = container_number;
        this.load_date = load_date;
        this.empty_date = empty_date;
    }

    public Bill() {
    }

    public int getBill_number() {
        return bill_number;
    }

    public void setBill_number(int bill_number) {
        this.bill_number = bill_number;
    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public String isImport_export() {
        return import_export;
    }

    public void setImport_export(String import_export) {
        this.import_export = import_export;
    }

    public String getPickup_from() {
        return pickup_from;
    }

    public void setPickup_from(String pickup_from) {
        this.pickup_from = pickup_from;
    }

    public String getPickup_to() {
        return pickup_to;
    }

    public void setPickup_to(String pickup_to) {
        this.pickup_to = pickup_to;
    }

    public String getBack_to() {
        return back_to;
    }

    public void setBack_to(String back_to) {
        this.back_to = back_to;
    }

    public long getTruck_charge() {
        return truck_charge;
    }

    public void setTruck_charge(long truck_charge) {
        this.truck_charge = truck_charge;
    }

    public long getLess_advance() {
        return less_advance;
    }

    public void setLess_advance(long less_advance) {
        this.less_advance = less_advance;
    }

    public long getExtra() {
        return extra;
    }

    public void setExtra(long extra) {
        this.extra = extra;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getContainer_number() {
        return container_number;
    }

    public void setContainer_number(String container_number) {
        this.container_number = container_number;
    }

    public String getLoad_date() {
        return load_date;
    }

    public void setLoad_date(String load_date) {
        this.load_date = load_date;
    }

    public String getEmpty_date() {
        return empty_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpty_date(String empty_date) {
        this.empty_date = empty_date;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bill_number=" + bill_number +
                ", party_name='" + party_name + '\'' +
                ", import_export=" + import_export +
                ", pickup_from='" + pickup_from + '\'' +
                ", pickup_to='" + pickup_to + '\'' +
                ", back_to='" + back_to + '\'' +
                ", truck_charge=" + truck_charge +
                ", less_advance=" + less_advance +
                ", extra=" + extra +
                ", balance=" + balance +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", container_number='" + container_number + '\'' +
                ", load_date=" + load_date +
                ", empty_date=" + empty_date +
                '}';
    }
}