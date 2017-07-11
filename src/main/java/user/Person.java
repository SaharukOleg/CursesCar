package user;


public class Person {

private String name;
private String lastname;
private String dateOfBirsday;
private String category;
private String city;
private String transmission;
private String number;

    public Person(String name, String lastname, String dateOfBirsday, String category, String city, String transmission, String number) {
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirsday = dateOfBirsday;
        this.category = category;
        this.city = city;
        this.transmission = transmission;
        this.number = number;
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

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (lastname != null ? !lastname.equals(person.lastname) : person.lastname != null) return false;
        if (dateOfBirsday != null ? !dateOfBirsday.equals(person.dateOfBirsday) : person.dateOfBirsday != null)
            return false;
        if (category != null ? !category.equals(person.category) : person.category != null) return false;
        if (city != null ? !city.equals(person.city) : person.city != null) return false;
        if (transmission != null ? !transmission.equals(person.transmission) : person.transmission != null)
            return false;
        return number != null ? number.equals(person.number) : person.number == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (dateOfBirsday != null ? dateOfBirsday.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
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
