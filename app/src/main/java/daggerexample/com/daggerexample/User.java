package daggerexample.com.daggerexample;

/**
 * Created by muhammadali
 * on 12/06/2016.
 */
public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
    }


}
