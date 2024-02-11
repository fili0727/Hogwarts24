package edu.hogwarts.data;

import java.util.ArrayList;
import edu.generic.Student;
import java.time.*;


public class YearGroup {

  private int schoolYear;
  private LocalDate beginningOfSchoolYear;
  private ArrayList<Student> students;

  public YearGroup(int schoolYear, LocalDate beginningOfSchoolYear) {
    this.schoolYear = schoolYear;
    this.beginningOfSchoolYear = beginningOfSchoolYear;
    this.students = new ArrayList<>();
  }

  public YearGroup() {}

  public int getSchoolYear() {
    return schoolYear;
  }

  public LocalDate getBeginningOfSchoolYear() {
    return beginningOfSchoolYear;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void setSchoolYear(int schoolYear) {
    this.schoolYear = schoolYear;
  }

  public void setBeginningOfSchoolYear(LocalDate beginningOfSchoolYear) {
    this.beginningOfSchoolYear = beginningOfSchoolYear;
  }

  public void setStudents(ArrayList<Student> students) {
    this.students = students;
  }

  public String toString() {
    return (
      "YearGroup: " +
      schoolYear +
      " Beginning of school year " +
      beginningOfSchoolYear +
      " Students: " +
      students
    );
  }
}
