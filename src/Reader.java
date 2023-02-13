public class Reader {
    public String Name;
    private String Address;
    private int EGN;

    private Reader(){
        this.Name = "Chicheneca";
        this.Address = "Na parkinga";
        this.EGN = 6969;

    }

    public Reader(String name, String address, int EGN) {
        Name = name;
        Address = address;
        this.EGN = EGN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getEGN() {
        return EGN;
    }

    public void setEGN(int EGN) {
        this.EGN = EGN;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", EGN=" + EGN +
                '}';
    }
}
