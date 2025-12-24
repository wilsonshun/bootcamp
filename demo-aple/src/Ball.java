public class Ball {
    private Color color;

    // ! private Constructor
    public Ball (Color color) {
        this.color = color; 
    }

    public Color getColor() {
        return this.color; 
    }
    
    // if Parameter is String, we usually use static method to control Constructor
    public static Ball ofRed() {
        return new Ball(Color.RED); 
    }
}
