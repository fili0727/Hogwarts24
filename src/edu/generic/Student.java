package edu.generic;

public class Student extends Person {

  private int enrollmentYear;
  private int graduationYear;
  private boolean graduated;

  public Student(
    String firstName,
    String middleName,
    String lastName,
    String dateOfBirth,
    int enrollmentYear,
    int graduationYear,
    boolean graduated
  ) {
    super(firstName, middleName, lastName, dateOfBirth);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = graduated;
  }

  public Student(
    String fullName,
    String dateOfBirth,
    int enrollmentYear,
    int graduationYear,
    boolean graduated
  ) {
    super(fullName, dateOfBirth);
    this.enrollmentYear = enrollmentYear;
    this.graduationYear = graduationYear;
    this.graduated = graduated;
  }

  public Student() {}

  public int getEnrollmentYear() {
    return enrollmentYear;
  }

  public int getGraduationYear() {
    return graduationYear;
  }

  public boolean isGraduated() {
    return graduated;
  }

  public void setEnrollmentYear(int enrollmentYear) {
    this.enrollmentYear = enrollmentYear;
  }

  public void setGraduationYear(int graduationYear) {
    this.graduationYear = graduationYear;
  }

  public void setGraduated(boolean graduated) {
    this.graduated = graduated;
  }

  public String toString() {
    return (
      "Student name:" +
      super.getFullName() +
      "\n" +
      " Enrollment year: " +
      enrollmentYear +
      "\n" +
      " Graduation year " +
      graduationYear +
      "\n" +
      " Is graduated? " +
      (graduated ? "Yes" : "No")
    );
  }
}
