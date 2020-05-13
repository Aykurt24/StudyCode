package day37_Constructors;

public class Employee {
    String name;
    long id;
    long ssn;
    String jobtitle;
    double salary;
    char gender;


    public void setInfo(String name, long id, long ssn, String jobtitle, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobtitle = jobtitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString() {
        return "Name: " + name + " Id: " + id + " Ssn: " + ssn + " JobTitle: " + jobtitle + " Salary: " + salary + " Gender: " + gender;
    }


}
