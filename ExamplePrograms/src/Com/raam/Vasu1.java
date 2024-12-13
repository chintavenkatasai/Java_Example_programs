package Com.raam;

import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    int age;
    String name;

    Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }
}

public class Vasu1 {
    public static void main(String[] args) {
        Set<Employee> ss = new TreeSet<>();
        ss.add(new Employee(1, 23, "sai"));
        ss.add(new Employee(2, 24, "naveen"));
        ss.add(new Employee(3, 25, "vasu"));
        ss.add(new Employee(4,26,"arun"));

        for (Employee e : ss) {
            System.out.println(e.id + " " + e.name + " " + e.age);
        }
    }
}
