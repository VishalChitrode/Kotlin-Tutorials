import java.util.Objects;

public class Addresses {
    private String street = null;
    private String city = null;
    private int zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Addresses addresses = (Addresses) o;
        return zip == addresses.zip && Objects.equals(street, addresses.street) && Objects.equals(city, addresses.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zip);
    }
}
