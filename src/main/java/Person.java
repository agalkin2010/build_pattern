import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected Integer age = null;
    protected String city = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return (this.age != null) ? true : false;
    }

    public boolean hasAddress() {
        return (this.city != null) ? true : false;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }

    public String getAddress() {
        return this.city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    public void happyBirthday() {
        if (this.age != null) {
            this.age = this.age.intValue() + 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder()
                .setAge(0)
                .setSurname(this.surname)
                .setAddress(this.city);
        return personBuilder;
    }


    @Override
    public String toString() {
        return this.name + " " +
                this.surname + " " +
                this.getAge().getAsInt() + " " +
                this.city;
    }

    @Override
    public int hashCode() {
        return this.age.hashCode();
    }

}
