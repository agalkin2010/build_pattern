public class PersonBuilder {
    private String name = null;
    private String surname = null;
    private Integer age = null;
    private String city = null;
    private Person person = null;


    public PersonBuilder setName(String name) {
        if (name.equals("") || name == null) {
            throw new IllegalArgumentException("Имя не может быть пустым значением");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname.equals("") || surname == null) {
            throw new IllegalArgumentException("Фамилия не может быть пустым значением");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("Не заполнены необходимые поля");
        }
        if (this.age == null) {
            person = new Person(this.name, this.surname);
            person.setAddress(this.city);
        } else {
            person = new Person(this.name, this.surname, this.age.intValue());
            person.setAddress(this.city);
        }
        return person;
    }

}
