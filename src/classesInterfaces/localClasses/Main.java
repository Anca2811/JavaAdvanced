package classesInterfaces.localClasses;

public class Main {
    public static void main(String[] args) {
        createLocalClass();

    }

    public static void createLocalClass(){
        class Pair{
            private String key;
            private int value;

            public Pair(String key, int value) {
                this.key = key;
                this.value = value;
            }

            @Override
            public String toString() {
                return "Pair{" +
                        "key='" + key + '\'' +
                        ", value=" + value +
                        '}';
            }
        }

        Pair pair1 = new Pair("Batman", 35);
        Pair pair2 = new Pair("Robbie", 25);
        System.out.println(pair1);
        System.out.println(pair2);

    }
}
