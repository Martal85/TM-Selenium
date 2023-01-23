package utils;
import com.github.javafaker.*;

public class FakerUtils {
    private String firstName;
    private String lastName;
    private String userEmail;
    private String phoneNumber;
    private String userEmail2;
    private Faker faker;

    public FakerUtils() {
        faker = new Faker();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        userEmail = faker.internet().emailAddress();
        userEmail2 = faker.internet().emailAddress();
        phoneNumber = faker.phoneNumber().subscriberNumber(9);
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserEmail2() {
        return userEmail2;
    }

    public Faker getFaker() {
        return faker;
    }

    public String getPhoneNumber() { return phoneNumber;}
}
