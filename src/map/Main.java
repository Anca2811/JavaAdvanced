package map;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Name 1 ", 10);
        people.put("Name 2 ", 20);
        people.put("Name 3 ", 30);
        people.put("Name 3 ", 50);

        for (String key: people.keySet()){
            System.out.println(key + "and value is: " + people.get(key));

        }
        System.out.println("______________________________");

        for (Integer value : people.values()){
            System.out.println("Printing the values: " + value);
        }
        System.out.println("______________________________");

        for (Map.Entry<String, Integer> pair : people.entrySet()){
            System.out.println("Printing pair: " + pair.getKey() + ", and the value: " + pair.getValue());
        }
    }
}
