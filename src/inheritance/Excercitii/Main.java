package inheritance.Excercitii;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("George","Unirii","IT",2015,150);
        Person staff = new Staff("Ionut","Josif", "Economie", 7000);

        //System.out.println(student);
        //System.out.println(staff);
        //System.out.println(student.getFavoriteCoffee());
        //System.out.println(staff.getFavoriteCoffee());

        //polymorphism example:
        printPersonInfo(student);
        printPersonInfo(staff);
    }

    public static void printPersonInfo(Person personInfo){
        System.out.println(personInfo);
        System.out.println(personInfo.getFavoriteCoffee());
    }
}
