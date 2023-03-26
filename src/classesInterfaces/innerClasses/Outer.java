package classesInterfaces.innerClasses;

public class Outer {
    private int number;
    private static double salary = 25.3d;

    public Outer(int number) {
        this.number = number;
    }

    public void print() {
        System.out.println("Bau bau");
    }

    public static void printDoi() {
        System.out.println("Bau bau doi");
    }

    static class NestedStatic {
        public void printNestedStatic() {

            System.out.println(salary);
            printDoi();
        }
    }

    class Nested {

        public void printNested() {

            System.out.println(number);
            System.out.println(salary);
            print();
            printDoi();
        }
    }
}
