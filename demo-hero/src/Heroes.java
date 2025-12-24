// Cannot be extended 

import java.util.Arrays;

public final class Heroes {
    public static final int STARTING_LEVEL = 1;
    public static final int WARRIOR = 0; 
    public static final int ARCHER = 1; 
    public static final int MAGE = 2; 


    /**
     * array[0]: Warrior
     * array[1]: Archer
     * array[2]: Mage 
     */

    // Role, Level
    // 2D Array
    public static final int[][] MAX_HP = new int[][] { // 
        {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, // 
        {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, // 
        {10, 20, 30, 40, 50, 60, 70, 80, 90, 100} // 
    }; 

 public static final int[][] PA = new int[][] { // 
        {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, // 
        {2, 3, 4, 5, 6, 7, 8, 9, 10, 11},// 
        {2, 3, 4, 5, 6, 7, 8, 9, 10, 11} // 
}; 

 public static final double[][] CC = new double[][] { // 
        {0.2, 0.22, 0.24, 0.26, 0.28, 0.3, 0.32, 0.34, 0.36, 0.38}, //
        {0.2, 0.22, 0.24, 0.26, 0.28, 0.3, 0.32, 0.34, 0.36, 0.38}, //
        {0.2, 0.22, 0.24, 0.26, 0.28, 0.3, 0.32, 0.34, 0.36, 0.38} //
    }; 

 public static final double[][] CD_MULTIPLIER = new double[][] { // 
        {1.5, 1.5, 1.6, 1.6, 1.7, 1.7, 1.8, 1.8, 1.9, 1.9, 2.1, 2.1}, // 
        {1.5, 1.5, 1.6, 1.6, 1.7, 1.7, 1.8, 1.8, 1.9, 1.9, 2.1, 2.1}, // 
        {1.5, 1.5, 1.6, 1.6, 1.7, 1.7, 1.8, 1.8, 1.9, 1.9, 2.1, 2.1}
};

public static double cdMULTIPLIER(int role, int level) {
    return CD_MULTIPLIER[role][level - 1]; 
}

public static double cc(int role, int level) {
    return CC[role][level - 1]; 
}

public static int maxHP(int role, int level) {
    return MAX_HP[role][level - 1]; 
}

public static int pa(int role, int level) {
    return PA[role][level - 1]; 
}

public static void main(String[] args) {
    System.out.println(Arrays.toString(MAX_HP[0]));
}
// ! Presentation
public int getPA(){ 
        return Heroes.pa(getRole(), super.getLevel()); 
    }

public double getCD() {
        return this.getPA() * Heroes.cdMULTIPLIER(this.getRole(), super.getLevel()); 
    }

public boolean isCD() {
        return Math.random() <= Heroes.cc(this.getRole(), super.getLevel()); 
    }
}