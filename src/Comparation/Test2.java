package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(563,"Nik","Mikius",569);
        Employee e2 = new Employee(390,"Djodj","Djojius",1356);
        Employee e3 = new Employee(153,"Rijard","Rijardius",730);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println("Лист до сортировки:"+list);
        Collections.sort(list);
        System.out.println("Лист после сортировки:" +list);
        System.out.println(e1.compareTo(e2));


        }
    }


class  Employee implements  Comparable <Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id == o.id){
        return 0;
        }
        else if(this.id < o.id){
            return -1;

        }
        else {
            return 1;
        }

    }
}

