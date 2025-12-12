import java.math.BigDecimal;

public class Circle {
    // ! Attributes
    private double radius; 

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius; 
    }
    
    // ! Instance Methods
    public boolean isTooBig() {
        return this.area() >= 40; 
    }
    
    // get set 
    public void setRadius(double radius) {
    this.radius = radius; 
}

    public double getRadius() {
        return this.radius; 
    }

    // Method -> Presentation 
    // ! Circle area is a presentation of radius 
    public double area() {
        // return this.radius * this.radius * Math.PI;  // ! Double * Double CANNOT 
        return BigDecimal.valueOf(this.radius)
            .multiply(BigDecimal.valueOf(this.radius)) //
            .multiply(BigDecimal.valueOf(Math.PI)) // 
            .doubleValue(); 
    }

    public static void main(String[] args) {
        System.out.println(Math.PI);

    Circle c1 = new Circle(); 
    System.out.println(c1.getRadius()); // 0.0 
    c1.setRadius(3.5); 
    System.out.println(c1.getRadius()); // 3.5 
    System.out.println(c1.area()); // 38.48451000647496

    // ! Area counted as below is also working but not suggested 
    double c1Area = c1.getRadius() * c1.getRadius() * Math.PI;
    System.out.println(c1Area); // 38.48451000647496

    Circle c2 = new Circle(3.9); 
    System.out.println(c2.getRadius());
    System.out.println(c2.area());
    }
}