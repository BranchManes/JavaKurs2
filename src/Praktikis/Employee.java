package Praktikis;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    public int result = 0;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Employee o) {
        result= this.id - o.id;
        if(result ==0){
            return this.name.compareTo(o.name);
        }
        else return  result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class EmpoloyeeTest {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Jhon", 569);
        Employee e2 = new Employee("Djorh", 5890);
        Employee e3 = new Employee("Buri", 630789);
        Employee e4 = new Employee("Lenna", 896543);
        Employee e5 = new Employee("Natalya", 56);
        Employee e6 = new Employee("Aizek", 79);
        Employee e7 = new Employee("Lori", 563478);
        Employee e8 = new Employee("Lori", 56);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}


