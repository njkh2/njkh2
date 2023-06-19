package TransportManagement.Classes;
public class Driver{
    /*
    * create table Driver (
license varchar(25) primary key,
vehicle_number varchar(20),
Driver_name varchar(50),
Mobile bigint ,
foreign key (vehicle_number) references vehicle(vehicle_number)
);
    * */
    String license ;
    String vehicle_number;
    String driver_name;
    long mobile;
    int id;

    public Driver(String license, String vehicle_number, String driver_name, long mobile,int id) {
        this.license = license;
        this.vehicle_number = vehicle_number;
        this.driver_name = driver_name;
        this.mobile = mobile;
        this.id = id;
    }

    public Driver() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "license='" + license + '\'' +
                ", vehicle_number='" + vehicle_number + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}