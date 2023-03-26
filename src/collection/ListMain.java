package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {


        //List<String> names = new ArrayList<>();
        List<String> names = new LinkedList<>();
        names.add("Ana");
        names.add("Maria");
        names.add("Narcisa");
        names.add("Vasile");
        names.add("Karina");
        System.out.println(names);

        names.remove("Narcisa");
        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        System.out.println(names.get(2));

        if (names.contains("Karina")){
            System.out.println("Karina is here!");
        }
        names.set(2, "Lucia");
        System.out.println(names);

        names.add("Ion");
        System.out.println(names);

        System.out.println(names.indexOf("Ion"));
        names.add(1, "Ion");
        System.out.println(names);
        System.out.println(names.lastIndexOf("Ion"));
    }
}
