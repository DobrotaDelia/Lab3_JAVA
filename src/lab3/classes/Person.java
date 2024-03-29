package lab3.classes;


public class Person {
    private String lastName;
    private String FirstName;

    //constructor with parameter
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.FirstName = firstName;
    }

    //Getters and Setters for the attributes
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

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                '}';
    }
}

