package Part_1;

class Student{
    public String name;
    public int age;
}
public class Assignments {
    public static void main(String[] args) {
        Student stud1 = new Student();
        //assign reference two different values
        Student studcopy1 = stud1;
        Student studcopy2 = stud1;
        //change objects properties reaching it by variables
        studcopy1.name = "Jeka";
        studcopy2.age = 18;
        //checking if this is still the same object that's been changed
        System.out.println(studcopy1.age);
        System.out.println(studcopy2.name);
    }
}