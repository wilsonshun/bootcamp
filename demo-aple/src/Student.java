public class Student {
    private final Subject[] subjects = new Subject[] { // 
        new Subject("CHIN"), // 
        new Subject("ENG"), // 
        new Subject("MATH") // 
    }; 

    // add / drop
    public void changeFirstSubject(Subject subject) {
        this.subjects[0] = subject; 
    }

    public void changeSecondSubject(Subject subject) {
        this.subjects[1] = subject; 
    }

    public void changeThirdSubject(Subject subject) {
        this.subjects[2] = subject; 
    }

    public String showSubjects() {
        return this.subjects[0].getName() + "," // 
            + this.subjects[1].getName() + "," // 
            + this.subjects[2].getName(); 

    }

    public double averageScore() {
        double totalScore = 0.0; 
        totalScore += (this.subjects[0].getScore() + this.subjects[1].getScore() + this.subjects[2].getScore()); 
        return totalScore / 3; 
    }

    // setScore 
    public void setScore(int index, int score) {
        this.subjects[index].setScore(score); 
    }


    //! Students can only take 3 subjects 
    //! Each student by default will take CHIN, ENG & MATH only 

    public static void main(String[] args) {
        // MATH => HISTORY
        Student s = new Student(); 
        s.changeSubject(0, new Subject("HISTORY")); 
        System.out.println(s.showSubjects());
        System.out.println(s.averageScore());

    }
}
