package inheritance.Excercitii;
/*Implement the Lecturer class. It should extend the Person class.
Implementation should meet the below criteria: two elds: specialization,
salary two-arguments constructor: specialization, salary
getter methods which will be responsible for returning declared elds
setter methods which will be responsible for setting declared elds toString
method which should return details information about a lecturer
Please provide an example usage of above implementation.*/

public class Staff extends Person {

    private String specialization;
    private double salary;

    public Staff(String name, String address, String specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String getFavoriteCoffee() {
        return "Kopi Luwak";
    }
}
