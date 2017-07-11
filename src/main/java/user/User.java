package user;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class User {

    private String name;
    private String lastname;
    private String dateOfBirsday;
    private String category;
    private String city;
    private String transmission;
    private String number;

    public User(String name, String lastName, String date, String nameCity, String korobka, String phoneNumber) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirsday() {
        return dateOfBirsday;
    }

    public void setDateOfBirsday(String dateOfBirsday) {
        this.dateOfBirsday = dateOfBirsday;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(name, user.name)
                .append(lastname, user.lastname)
                .append(dateOfBirsday, user.dateOfBirsday)
                .append(category, user.category)
                .append(city, user.city)
                .append(transmission, user.transmission)
                .append(number, user.number)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(lastname)
                .append(dateOfBirsday)
                .append(category)
                .append(city)
                .append(transmission)
                .append(number)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirsday='" + dateOfBirsday + '\'' +
                ", category='" + category + '\'' +
                ", city='" + city + '\'' +
                ", transmission='" + transmission + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
