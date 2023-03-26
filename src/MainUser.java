import java.util.*;

public class MainUser {
    public static <Users> void main(String[] args) {
        User ion = new User("Ion is ", 30);
        User ion2 = new User("Ion is ", 30);

        User dorin = new User("Dorin is ", 55);
        User costel = new User("Costel is ", 14);

        //Set<User> users = new HashSet<>();
        Set<User> users = new TreeSet<>();
        users.add(ion);
        users.add(ion2);
        users.add(dorin);
        users.add(costel);

        System.out.println(users);

        List<User> userList = new ArrayList<>();
        userList.add(ion);
        userList.add(ion2);
        userList.add(dorin);
        userList.add(costel);

        System.out.println("List before sorting: " + userList);
        Collections.sort(userList);
        System.out.println("List after sorting: " + userList);

        Comparator<User> ageComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        };

        userList.sort(ageComparator);
        System.out.println("List after comparator: " + userList);

        Set<User> users2 = new TreeSet<>(ageComparator);
        users2.add(ion);
        users2.add(ion2);
        users2.add(dorin);
        users2.add(costel);
        
        System.out.println("List of users2 " + users2);
    }
}



