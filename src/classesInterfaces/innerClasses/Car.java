package classesInterfaces.innerClasses;

/*   Create the Car class which will store information about a car make and type. It
        should contain getter and setter methods.*/
public class Car {
    private String make;
    private String type;
    private Engine engine;


    public Car(String make, String type) {
        this.make = make;
        this.type = type;
        this.engine = new Engine();
        engine.setEngineType();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }
    /*Implement the Engine class which will be a nested non-static class under the Car class.
    This class should contain the eld: engine type and setEngine method which will set a type based on the car type.
     If the car type is economy , then the engine type should be set to diesel .
     If the car type is luxury , then the engine type should be de ned as electric .
     Otherwise, the engine type should be de ned as petrol

*/

    class Engine {
        private String engineType;

        public void setEngineType() {
            if (type.equals("economy")) {
                engineType = "diesel";
            } else if (type.equals("luxury")) {
                engineType = "electric";
            } else {
                engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}





