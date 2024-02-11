package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final ArrayList<String> inputs;
    private final StudentController studentController;
    private final TeacherController teacherController;

    public UserInterface(StudentController studentController, TeacherController teacherController) {
        scanner = new Scanner(System.in);
        inputs = new ArrayList<>();
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void run() {
        printWelcome();

        while (true) {
            List<HogwartsPerson> hogwartsPeople = new ArrayList<>();

            printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case "f" -> filterInput();
                case "s" -> sortInput();
                case "a" -> inputs.add("a");
                case "x" -> inputs.add("x");
            }

            if (inputs.isEmpty()) {
                printUnknownCommand();
                continue;
            } else if (inputs.get(0).equals("x")) {
                printExit();
                break;
            }
            if (inputs.size() == 2) {

                String sortBy = inputs.get(0);
                String sortDir = inputs.get(1);

                hogwartsPeople.addAll(studentController.getAllStudents());
                hogwartsPeople.addAll(teacherController.getAllTeachers());
                hogwartsPeople = sort(hogwartsPeople, sortBy, sortDir);
            } else if (inputs.get(0).equals("a")) {

                hogwartsPeople.addAll(studentController.getAllStudents());
                hogwartsPeople.addAll(teacherController.getAllTeachers());
            } else {

                String filterBy = inputs.get(0);
                hogwartsPeople.addAll(studentController.filter(filterBy));
                hogwartsPeople.addAll(teacherController.filter(filterBy));
            }


            printTableHeader();

            printTableBody(hogwartsPeople);

            inputs.clear();
        }
    }

    public List<HogwartsPerson> sort(List<HogwartsPerson> persons, String sortBy, String sortDir) {
        List<HogwartsPerson> sortedHogwartsPersons = new ArrayList<>();

        if (sortBy.equalsIgnoreCase("fornavn")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(HogwartsPerson::getFirstName))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("mellemnavn")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(HogwartsPerson::getMiddleName))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("efternavn")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(HogwartsPerson::getLastName))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("alder")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(HogwartsPerson::getAge))
                    .toList();
        } else if (sortBy.equalsIgnoreCase("hus")) {
            sortedHogwartsPersons = persons.stream()
                    .sorted(Comparator.comparing(person -> person.getHouse().toString()))
                    .toList();
        }

        if (sortDir.equalsIgnoreCase("d")) {
            //Descending. reverse arr.
            sortedHogwartsPersons = reverseList(sortedHogwartsPersons);
        }

        return sortedHogwartsPersons;
    }

    public List<HogwartsPerson> reverseList(List<HogwartsPerson> list) {
        List<HogwartsPerson> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    private void sortInput() {
        printSpecifySort();
        String sortBy = scanner.nextLine().toLowerCase();
        printSpecifySortDirection();
        String sortDir = scanner.nextLine().toLowerCase();

        inputs.add(sortBy);
        inputs.add(sortDir);
    }


    public void printUnknownCommand() {
        System.out.println("Hov, det var ikke en mulighed. Prøv igen!");
    }

    private void filterInput() {
        printSpecifyFilter();
        String filterBy = scanner.nextLine().toLowerCase();

        inputs.add(filterBy);
    }

    public void printWelcome() {
        System.out.println("Velkommen til Hogwarts Database<33");
    }

    public void printExit() {
        System.out.println("Tak for at bruge Hogwarts Database<3");
    }

    private void printCommands() {
        System.out.println("""
                Tryk 'f' for filtrering
                Tryk 's' for sortering
                Tryk 'a' for at vise alle
                Tryk 'x' for at afslutte
                """);
    }


    private void printSpecifySort() {
        System.out.println("Hvad skal der sorteres efter?");
        System.out.println("Mulige inputs ->");
        System.out.println("""
                fornavn
                mellemnavn
                efternavn
                alder
                hus
                """);
    }


    private void printSpecifySortDirection() {
        System.out.println("""
                Tryk 'a' for ascending
                Tryk 'd' for descending
                """);
    }

    private void printSpecifyFilter() {
        System.out.println("Hvad skal der filtreres efter?");
        System.out.println("Mulige inputs ->");
        System.out.println("""
                Ravenclaw
                Slytherin
                Hufflepuff
                Gryffindor
                Student
                Teacher
                """);
    }

    public void printTableHeader() {
        System.out.println(
                String.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s", "Fornavn", "|", "Mellemnavn", "|", "Efternavn", "|", "Alder", "|", "Hus",
                        "|"));
    }


    public void printTableBody(List<HogwartsPerson> hogwartsPersonList) {
        for (HogwartsPerson person : hogwartsPersonList) {
            System.out.println(
                    String.format("%10s %10s %10s %10s %10s %10s %10s %10s %10s", person.getFirstName(), "|", person.getMiddleName(), "|",
                            person.getLastName(), "|", person.getAge(), "|", person.getHouse()));
        }
    }

}