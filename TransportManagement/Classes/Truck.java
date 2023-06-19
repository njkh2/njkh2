package TransportManagement.Classes;

import java.util.*;

public class Truck{
        /*id int,
    vehicle_number varchar(20) primary key,
    passing_expire String,
    permit_expire String,
    Insurance_expire String,
    foreign key (id) references authenticate(id)*/

    int id;
    String vehicle_number;
    String passing_expire;
    String permit_expire;
    String insurance_expire;

    public Truck(int id, String vehicle_number, String passing_expire, String permit_expire, String insurance_expire) {
        this.id = id;
        this.vehicle_number = vehicle_number;
        this.passing_expire = passing_expire;
        this.permit_expire = permit_expire;
        this.insurance_expire = insurance_expire;
    }

    public Truck() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getPassing_expire() {
        return passing_expire;
    }

    public void setPassing_expire(String passing_expire) {
        this.passing_expire = passing_expire;
    }

    public String getPermit_expire() {
        return permit_expire;
    }

    public void setPermit_expire(String permit_expire) {
        this.permit_expire = permit_expire;
    }

    public String getInsurance_expire() {
        return insurance_expire;
    }

    public void setInsurance_expire(String insurance_expire) {
        this.insurance_expire = insurance_expire;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "vehicle_number='" + vehicle_number + '\'' +
                ", passing_expire='" + passing_expire + '\'' +
                ", permit_expire='" + permit_expire + '\'' +
                ", insurance_expire='" + insurance_expire + '\'' +
                '}';
    }
}