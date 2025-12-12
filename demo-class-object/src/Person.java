import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
    // Height, Weight
    private double height; 
    private double weight; 

    // bmi = weight / height^2 

    public String bodyIndex() {
        double bmi = this.bmi(); 

    if (this.bmi() < 18.5) {
        return "Under Weight"; 
    }   else if (bmi < 25.0) {
        return "Normal Weight";
    }   else if (bmi < 30.0) {
        return "Over Weight";  
    }   else if (bmi < 35.0 ) {
        return "Obses Type I";  
    }   else if (bmi < 40.0) {
        return "Obese Type II";     
    }   else {
        return "Obses Type III"; 
    }
}

    public double bmi() {
        return BigDecimal.valueOf(this.weight) // 
            .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2, RoundingMode.HALF_UP) // 
            .doubleValue(); 
    }   

    public double getHeight() {
        return this.height; 
    }

    public double getWeight() {
        return this.weight; 
    }

    // ! void -> no return 
    public void setHeight(double height) {
        this.height = height; 
    }

    public void setWeight(double weight) {
        this.weight = weight; 
    }

    public static void main(String[] args) {
        Person p1 = new Person(); 
        p1.setHeight(173);
        p1.setWeight(79); 
        System.out.println(p1.getHeight());
        System.out.println(p1.getWeight());

        Person[] persons = new Person[2]; 
        persons[0] = new Person(); 
        persons[1] = p1; 

        System.out.println(persons[0].getHeight());
        System.out.println(persons[1].getHeight());
        System.out.println(p1.getHeight());

        persons[1].setWeight(60);
        persons[1].setHeight(1.73); 
        System.out.println(p1.getWeight()); // 60


        System.out.println(persons[1].bmi()); // 20.05
        System.out.println(persons[1].bodyIndex()); // Normal Weight



        
    }
}
