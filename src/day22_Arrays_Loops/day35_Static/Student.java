package day22_Arrays_Loops.day35_Static;

public class Student {  // for CybertekSchool
    /*
    create a custom class called student
            Attribute:
                name, id, gpa,
                SchoolName = "Cybertek";

            actions:
                setInfo(): name, id, gpa
                printSchoolName():
                toString():
     */


    static String school = "Cybertek";
    String name;
    int id;
    double gpa;

    public static void printSchoolName() {
        System.out.println("School name is " + school);
    }

    public void setInfo(String name, int id, double gpa) { // if we are using any instance , the method should not be static
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String toString() {
        return "Name: " + name + ", School Name: " + school;
    }


}
