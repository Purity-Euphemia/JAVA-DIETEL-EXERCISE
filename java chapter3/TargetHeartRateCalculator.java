import java.time.LocalDate;
import java.time.Period;

public class TargetHeartRateCalculator {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public TargetHeartRateCalculator(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthDay;
        this.birthDay = birthMonth;
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getAge() {
        LocalDate birtDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birtDate, currentDate);
        return period.getYears() + " years old";
    }

    public int getMaximumRate() {
        return 220 - getAge().length();
    }

    public void displayInfo() {
        System.out.println("full Name: " + getFullName());
        System.out.println("Date of Birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age: " + getAge() + " years old");
        System.out.println("Maximum Rate: " + getMaximumRate());
    }



}