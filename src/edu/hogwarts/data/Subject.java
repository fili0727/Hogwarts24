package edu.hogwarts.data;

public class Subject {

  private String name;
  private String schoolYear;
  private boolean elective;

  public Subject(String name, String schoolYear, boolean elective) {
    this.name = name;
    this.schoolYear = schoolYear;
    this.elective = elective;
  }

  public Subject() {}

  public String getName() {
    return name;
  }

  public String getSchoolYear() {
    return schoolYear;
  }

  public boolean isElective() {
    return elective;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSchoolYear(String schoolYear) {
    this.schoolYear = schoolYear;
  }

  public void setElective(boolean elective) {
    this.elective = elective;
  }

  public String toString() {
    return (
      "Subject: " +
      name +
      " School year: " +
      schoolYear +
      " Elective: " +
      elective
    );
  }
}
