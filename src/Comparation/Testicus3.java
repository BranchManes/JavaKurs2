package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Testicus3 {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        Students st1 = new Students("Ivan", "Petrov");
        Students st2 = new Students("Inna", "Berezkina");
        Students st3 = new Students("Zhullia", "Lorkina");
        Students st4 = new Students("Andrey", "Tid");
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        System.out.println(list);
        Collections.sort(list, new SurnameComparator()); // Теперь сортирует только по компаратору
        System.out.println(list);
    }

}

class Students implements Comparable<Students> {
    private String name;
    private String surname;


    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return this.name.compareTo(o.name);
    }
}

class SurnameComparator implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}