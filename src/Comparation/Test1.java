package Comparation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import  java.util.List;
public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Artem");
        list.add("Nikolay");
        list.add("i");
        System.out.println("List до сортировки");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("List после сортировки");
        System.out.println(list);;
    }
}
