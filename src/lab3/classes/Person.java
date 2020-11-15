package lab3.classes;

public class Person {
    private String lastName;
    private String FirstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
}

