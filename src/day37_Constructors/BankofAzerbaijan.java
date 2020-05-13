package day37_Constructors;

import java.util.ArrayList;

public class BankofAzerbaijan {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResourses.employee3);
        list.add(HumanResourses.employee5);
        System.out.println(list.get(0));

    }
}
