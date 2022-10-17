public class Gamer {
    private int id;
    private String firstName;
    private String lastName;
    private int birtOfYear;
    private long identityNumber;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirtOfYear() {
        return birtOfYear;
    }

    public void setBirtOfYear(int birtOfYear) {
        this.birtOfYear = birtOfYear;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
