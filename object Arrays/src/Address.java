public class Address {

   private int flatNo;
  private  String streetName;

    public int getFlatNo() {
        return flatNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo=" + flatNo +
                ", streetName='" + streetName + '\'' +
                '}';
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address(int flatNo, String streetName) {
        this.flatNo = flatNo;
        this.streetName = streetName;
    }
}
