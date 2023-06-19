package TransportManagement.Classes;

public class Party{
        /*party_name varchar(50) primary key,
    Address varchar(200),
    Mobile Bigint*/

    String party_name;
    String Address;
    double Mobile;
    int id;

    public Party(String party_name, String address, double mobile , int id) {
        this.party_name = party_name;
        this.Address = address;
        this.Mobile = mobile;
        this.id = id;
    }

    public Party() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getMobile() {
        return Mobile;
    }

    public void setMobile(double mobile) {
        Mobile = mobile;
    }

    @Override
    public String toString() {
        return "Party{" +
                "party_name='" + party_name + '\'' +
                ", Address='" + Address + '\'' +
                ", Mobile=" + Mobile +
                '}';
    }
}