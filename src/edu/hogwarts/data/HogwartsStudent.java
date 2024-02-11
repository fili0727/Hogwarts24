package edu.hogwarts.data;

import edu.generic.Student;
import java.util.ArrayList;

public class HogwartsStudent extends Student implements HogwartsPerson {

  private House house;
  private boolean prefect;

  public HogwartsStudent(
    House house,
    boolean prefect,
    String firstName,
    String middleName,
    String lastName,
    String dateOfBirth,
    int enrollmentYear,
    int graduationYear,
    boolean graduated
  ) {
    super(
      firstName,
      middleName,
      lastName,
      dateOfBirth,
      enrollmentYear,
      graduationYear,
      graduated
    );
    this.house = house;
    this.prefect = prefect;
  }

  public HogwartsStudent(
    House house,
    boolean prefect,
    String fullName,
    String dateOfBirth,
    int enrollmentYear,
    int graduationYear,
    boolean graduated
  ) {
    super(fullName, dateOfBirth, enrollmentYear, graduationYear, graduated);
    this.house = house;
    this.prefect = prefect;
  }

  public HogwartsStudent() {}

  public House getHouse() {
    return house;
  }

  public boolean isPrefect() {
    return prefect;
  }



  public void setHouse(House house) {
    this.house = house;
  }

  public void setPrefect(boolean prefect) {
    this.prefect = prefect;
  }


  public String toString() {
    return (
      "Hogwarts Student: " +
      getFullName() +
      " House: " +
      house +
      " Prefect: " +
      prefect

    );
  }
}
