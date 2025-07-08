public class ComparingOfHealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String height;
    private String weight;

    public ComparingOfHealthRecords(String firstName, String lastName, String gender, String birthDay, String birthMonth, String birthYear, String height, String weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }
    public String getBirthMonth() {
        return birthMonth;
    }
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    public String getBirthYear() {
        return birthYear;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getHeight() {
        return height;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getWeight() {
        return weight;
    }
}
