package edu.generic;

import edu.hogwarts.data.EmpType;

import java.time.*;

public class Teacher extends Person {

  private EmpType employment;
  private LocalDate employmentStart;
  private LocalDate employmentEnd;

  public Teacher(
    String firstName,
    String middleName,
    String lastName,
    String dateOfBirth,
    EmpType employment,
    LocalDate employmentStart,
    LocalDate employmentEnd
  ) {
    super(firstName, middleName, lastName, dateOfBirth);
    this.employment = employment;
    this.employmentStart = employmentStart;
    this.employmentEnd = employmentEnd;
  }

  public Teacher(
    String fullName,
    String dateOfBirth,
    EmpType employment,
    LocalDate employmentStart,
    LocalDate employmentEnd
  ) {
    super(fullName, dateOfBirth);
    this.employment = employment;
    this.employmentStart = employmentStart;
    this.employmentEnd = employmentEnd;
  }

  public Teacher() {}

  public EmpType getEmployment() {
    return employment;
  }

  public LocalDate getEmploymentStart() {
    return employmentStart;
  }

  public LocalDate getEmploymentEnd() {
    return employmentEnd;
  }

  public void setEmployment(EmpType employment) {
    this.employment = employment;
  }

  public void setEmploymentStart(LocalDate employmentStart) {
    this.employmentStart = employmentStart;
  }

  public void setEmploymentEnd(LocalDate employmentEnd) {
    this.employmentEnd = employmentEnd;
  }

  public String toString() {
    return (
      "Teacher name: " +
      getFullName() +
      "\n" +
      "Employment: " +
      employment +
      "\n" +
      "Employment Start: " +
      employmentStart +
      "\n" +
      "Employment End: " +
      employmentEnd
    );
  }
}
