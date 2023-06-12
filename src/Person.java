import java.util.Objects;

public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Person { " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    void changePerson (Person person){
        person = new Person("Ilya","Lagutenko");
    }
    void changePersonName (Person person){
        name = "Ilya";
        surname= "Lagutenko";
    }
}
