
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int id;

    public Person(String firstName, String lastName, String gender, int id){
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.gender = gender; 
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getId() {
        return id;
    }

}
