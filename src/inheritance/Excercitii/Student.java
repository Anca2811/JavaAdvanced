package inheritance.Excercitii;
/*Implement the Student class. It should extend the Person class.
Implementation should meet the below criteria:
three fields: type of study, year of study, study price three-arguments constructor:
type of study, year of study, study price getter methods which will be responsible for
returning declared fields setter methods which will be responsible for setting declared fields
toString method which should return details information about a student
*/
public class Student extends Person {

    private String typeOfStudy;
    private int yearOfStudy;
    private double priceOfStudy;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, double priceOfStudy) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.priceOfStudy = priceOfStudy;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getPriceOfStudy() {
        return priceOfStudy;
    }

    public void setPriceOfStudy(double priceOfStudy) {
        this.priceOfStudy = priceOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", priceOfStudy=" + priceOfStudy +
                '}';
    }

    @Override
    public String getFavoriteCoffee(){
        return "Ness";
    }
}
