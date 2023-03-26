import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class User implements Comparable<User>{
    public String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(User o) {
        // = 0 - if object match
        // < 0 - this.name < o.name
        // > 0 - this.name > o.name
        return this.name.compareTo(o.name);

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

