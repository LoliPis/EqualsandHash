package passortsThings;

import java.util.Objects;

public class Passport {
    private String passportNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthDate;

    public Passport(String passportNumber, String firstName, String lastName, String middleName, String birthDate) {
        if (passportNumber != null && !passportNumber.isBlank() && !passportNumber.isEmpty()) {
            this.passportNumber = passportNumber;
        }
        if (firstName != null && !firstName.isBlank() && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
        if (lastName != null && !lastName.isBlank() && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
        this.middleName = middleName;
        if (birthDate != null && !birthDate.isEmpty() && !birthDate.isBlank()) {
            this.birthDate = birthDate;
        }
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber) && Objects.equals(firstName, passport.firstName) && Objects.equals(lastName, passport.lastName) && Objects.equals(middleName, passport.middleName) && Objects.equals(birthDate, passport.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber, firstName, lastName, middleName, birthDate);
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
