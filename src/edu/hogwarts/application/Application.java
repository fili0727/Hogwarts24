package edu.hogwarts.application;

public class Application{

    private final StudentController studentController;
    private final TeacherController teacherController;
    private final UserInterface userInterface;

    public Application() {
     this.studentController = new StudentController();
     this.teacherController = new TeacherController();
     this.userInterface = new UserInterface(studentController, teacherController);
    }

//forvirret

  public static void main(String[] args) {

    new Application().start();

  }

  public void start(){
        new InitializeData(studentController, teacherController).createData();
        userInterface.run();
  }
}
