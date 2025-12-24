//! JVM -> Class Loader -> Create enum -> main()
public enum Direction { // class 
    EAST('E', -1), SOUTH('S', -2), WEST('W', 1), NORTH('N', 2),; 
    // static variables carrying static values

    private char value; // E, S, W, N
    private int number; // ! Attributes can be used for presentation relationship

    //! enum constructor -> private
    //! JVM call this constructor 4 times  
    private Direction(char value, int number) { // JVM 
        this.value = value; 
        this.number = number; 
    }

    // Presentation 
    // this vs direction
    public boolean isOpposite(Direction direction) {
        return this.number * -1 == direction.getNumber(); 
    }
    
    // this 
    public Direction opposite() {
        // values 
        for (Direction d : Direction.values()) {
            if (this.number * -1 == d.getNumber()) 
                return d; 
        }
        return null; // not found (Exception, Optional)
    }

    public int getNumber() {
        return this.number; 
    }

    public char getValue() {
        return this.value; 
    }

    public static void main(String[] args) {
        System.out.println((Direction.NORTH)); // NORTH
        System.out.println(Direction.NORTH.getValue()); // "N"

        System.out.println(Direction.NORTH == Direction.NORTH); // true

        // this (Direction.EAST)
        System.out.println(Direction.EAST.isOpposite(Direction.WEST)); // true
        System.out.println(Direction.EAST.isOpposite(Direction.NORTH)); // false
        System.out.println(Direction.SOUTH.opposite()); // NORTH
    }
}
