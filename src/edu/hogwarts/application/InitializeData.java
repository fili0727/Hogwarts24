package edu.hogwarts.application;

import edu.hogwarts.data.EmpType;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.House;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InitializeData {
    private List<House> houses;
    private StudentController studentController;
    private TeacherController teacherController;

    public InitializeData(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
        houses = new ArrayList<>();
    }

    public void createData() {
        initiateHouses();
        createStudentsArr();
        createTeachersArr();
    }
    public void createStudentsArr() {
        ArrayList<HogwartsStudent> students = new ArrayList<>();

        students.add(new HogwartsStudent(houses.get(0), true, "Draco Malfoy", "05-06-1980", 1991,1998,true));
        students.add(new HogwartsStudent(houses.get(0), true, "Vincent Crabbe", "01-01-1980", 1991,1998,true));
        students.add(new HogwartsStudent(houses.get(0), true, "Gregory Goyle", "01-01-1980", 1991,1998,true));


        students.add(new HogwartsStudent(houses.get(1), true, "Harry Potter", "31-07-1980", 1991,1998,true));
        students.add(new HogwartsStudent(houses.get(1), true, "Ron Weasley", "01-03-1980", 1991,1998,true));
        students.add(new HogwartsStudent(houses.get(1), true, "Hermione Granger", "19-09-1979", 1991,1998,true));

        students.add(new HogwartsStudent(houses.get(2), true, "Hannah Abbott", "01-01-1979", 1991,1998,true));
        students.add(new HogwartsStudent(houses.get(2), true, "Susan Bones", "01-01-1979", 1991,1998,true));
        students.add(new HogwartsStudent(houses.get(2), true, "Cedric Diggory", "01-01-1977", 1991,1998,true));

        students.add(new HogwartsStudent(houses.get(3), true, "Terry Boot", "01-01-1979", 1991,1998,true));

        for (HogwartsStudent student : students) {
            studentController.createStudent(student);
        }
    }

    public void createTeachersArr() {
        ArrayList<HogwartsTeacher> teachers = new ArrayList<>();


        teachers.add(new HogwartsTeacher(houses.get(0), true, "Severus Snape", "09-01-1960", EmpType.HEAD_OF_SLYTHERIN_HOUSE, LocalDate.now(),null));
        teachers.add(new HogwartsTeacher(houses.get(1), false, "Albus Percival Wulfric Brian Dumbledore", "01-08-1881", EmpType.HEADMASTER, LocalDate.now(),null));
        teachers.add(new HogwartsTeacher(houses.get(2), true, "Pomona Sprout", "15-05-1950", EmpType.HEAD_OF_HUFFLEPUFF_HOUSE, LocalDate.now(),null));
        teachers.add(new HogwartsTeacher(houses.get(3), true, "Filius Flitwick", "17-10-1958", EmpType.HEAD_OF_RAVENCLAW_HOUSE, LocalDate.now(),null));

        for (HogwartsTeacher teacher : teachers) {
            teacherController.createTeacher(teacher);
        }
    }

    private void initiateHouses() {
        this.houses.add(new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"}));
        this.houses.add(new House("Gryffindor", "Godric Gryffindor", new String[]{"Scarlet", "Gold"}));
        this.houses.add(new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"}));
        this.houses.add(new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Bronze"}));
    }
}
