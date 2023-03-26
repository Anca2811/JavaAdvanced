package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {
        //Set<String> names = new HashSet<>();
        //Set<String> names = new TreeSet<>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Anca");
        names.add("Ioana");
        names.add("Lucian");
        names.add("Anca");
        System.out.println(names);

        names.remove("Lucian");
        System.out.println(names);

        if (names.contains("Ioana")){
            System.out.println("Ioana is in the house!");
        }else {
            System.out.println("Ioana is sleeping :)");
        }
        if (names.contains("Maria")){
            System.out.println("Maria is in the house!");
        }else {
            System.out.println("Maria is sleeping :)");
        }
        Set<String> names2 = new TreeSet<>();
        names2.add("George");
        names2.add("Ioana");
        names2.add("Viorel");

        names.addAll(names2);
            System.out.println(names);


        names.clear();
        System.out.println(names);


        if (names.isEmpty()){
            System.out.println("No names in the set!");
        }else{
            System.out.println("The set contains this names!");
        }


    }
}
