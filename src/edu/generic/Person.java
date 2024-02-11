package edu.generic;

import java.time.LocalDate;

public class Person {

  private String firstName;
  private String lastName;
  private String middleName;

  private LocalDate dateOfBirth;

  public Person(String firstName, String middleName, String lastName, String dateOfBirth) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    setDateOfBirth(dateOfBirth);
  }

  public Person() {}

  public Person(String fullName, String dateOfBirth) {
    setFullName(fullName);
    setDateOfBirth(dateOfBirth);
  }

  public void makeHarry() {
    firstName = "Harry";
    lastName = "Potter";
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getFullName() {
    if (middleName != null) {
      return firstName + " " + middleName + " " + lastName;
    } else {
      return firstName + " " + lastName;
    }
  }

    public int getAge() {
      LocalDate now = LocalDate.now();

      return dateOfBirth.until(now).getYears();
    }

  public void setFullName(String fullName) {
    String[] names = fullName.split(" ");

    this.firstName = names[0];
    this.lastName = names[names.length - 1];

    if (names.length > 2) {
      middleName = names[1];
    } else {
      middleName = null;
    }
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  private void setDateOfBirth(String dateOfBirth) {
    String[] dates = dateOfBirth.split("-");
    this.dateOfBirth = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
  }


  public String toString() {
    return (
      "{\nfirstName: " +
      firstName +
      ",\n middleName: " +
      middleName +
      ",\n lastName: " +
      lastName +
      "\n}"
    );
  }

  public static void main(String[] args) {}
}
