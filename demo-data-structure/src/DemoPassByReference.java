import java.util.ArrayList;
import java.util.Arrays;

public class DemoPassByReference {
    public static void main(String[] args) {
        sum(10, 3); // 103

        int x = 15; 
        System.out.println(sum(x,6)); //106
        System.out.println(x); // 15

        //! Array (pass by Reference)
        int[] arr = new int[] {-9, -100, 74};
        addOne(arr); 
        System.out.println(Arrays.toString(arr));
    }

    ArrayList<Cat> cats = new ArrayList<>(); 
    cats.add(new Cat("Sue")); 

    doubleTheCats(cats); 
    System.out.println(cats); // Sue


    // ! Pass by Value: All Primitives, String, All Wrapper Classes (8 + 8 + 1)

    // ! Pass by Reference: Array, All Other Class 

    //! Primitive
    public static int sum(int x, int y) { // ! Pass by value (a copy of value)
        x = 100; 
        return x + y; 
    }
    public static void addOne(int[] arr) { // ! Pass by reference
        if (arr == null)
            return; 
        for (int i = 0; i < arr.length; i++) {
            arr[i]++; 
        }
    }

    public void doubleTheCat(ArrayList<Cat> cats) { //! Pass by Reference
        ArrayList<Cat> doubleCats = new ArrayList<>(); 
        for (Cat cat : cats) { // lock arrayList
            doubleCats.add(cat); 
            doubleCats.add(cat); 
        }
        // System.out.println("double=" + doubleCats);
        cats = doubleCats; //! Still having problems
    }
}
