public class DemoArray {
    public static void main(String[] args) {
        int x = 3; 
        int y = 10; 
        int z = 18; 
        System.out.println(y);

        // Array - store a set of same type of values
        // array is a variable name 
        // 'int [] arr' is to describe the type of variable 
        // array 必項 define 長度
        // arr[0] -> head address 
        int[] arr = new int [4]; // auto-allocate appropriate memory location
        arr[0] = 23; 
        arr[1] = 49; 
        arr[2] = 71; 
        arr[3] = 100; 
        // arr[4] = 02; // ArrayIndexOutofBoundsException 

        // ! arr.length
        System.out.println("arr.length=" + arr.length); //4
        for (int i = 0; i < arr.length; i++) { // 0 - 3
            System.out.println(arr[i]); // read 
        }

        // String []
        // apple, banana, kiwi 
        // for loop
        String[] arr2 = new String[3]; 
        arr2[0] = "apple"; 
        arr2[1] = "banana"; 
        arr2[2] = "kiwi"; 
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        } 

        // char[]
        // i j k a b 
        char[] arr3 = new char[5]; 
        arr3[0] = 'i'; 
        arr3[1] = 'j'; 
        arr3[2] = 'k'; 
        arr3[3] = 'a'; 
        arr3[4] = 'b'; 
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // boolean[]
        // true, false, true
        boolean[] arr4 = new boolean [3]; 
        arr4[0] = true; 
        arr4[1] = false;
        arr4[2] = false; 
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        } 

    // "John", "Tommy", "Steven"
    String[] names = new String[] {"John", "Tommy", "Steven"}; // already defined the length 
    System.out.println(names.length); // 3
    for (int i = 0; i < names.length; i++) {
        System.out.println(names[i]);
    }

    }
}
