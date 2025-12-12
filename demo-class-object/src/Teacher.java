public class Teacher {
    private Candy[] candies; 

    // A teacher has 22 candies; 
    // 5 students; 
    // main: distribute
    // Finally, teacher has no candies 
    // Show all candies for each student 

    public static void main(String[] args) {
        // new Candy("RED") -> Private Constructor 
        Candy[] candies = new Candy[] {
            Candy.ofRed(), Candy.ofRed(), Candy.ofRed(), Candy.ofRed(), Candy.ofRed(), Candy.ofRed(), Candy.ofRed(), //
            Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(), //
            Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue()
        }; 
        System.out.println(candies.length);
    }



}
