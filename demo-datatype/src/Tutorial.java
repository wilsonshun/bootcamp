public class Tutorial {
    public static void main(String[] args) {
        String name = "Sammi"; 
        System.out.println("I love " + "Sammi");

        System.out.print("Hello World! ");
        System.out.println("I will print on the same line");
        System.out.println(3 + 3);
        System.out.println(2 * 5);

        System.out.println("Sammi" + "Cheng");
        String sammi = "Sammi"; 
        String cheng = "Cheng";
        String sc = sammi + cheng; 
        System.out.println(sc);

        int items = 50; 
        float costPerItem = 9.99f; 
        float totalCost = items * costPerItem; 
        char currency = '$'; 
        System.out.println("Number of Items " + items);
        System.out.println("Total Cost is " + currency + totalCost);

        int x = 10; 
        int y = 3; 

        System.out.println(x + y); // 13
        System.out.println(x - 7); // 7 
        System.out.println(x * y); // 30 
        System.out.println(x / 7); // 3
        System.out.println(x % y); // 1
        int z = 5; 
        ++z; 
        System.out.println(z); // 6
        System.out.println(--z); // 5

        int peopleInRoom = 0; 
        // 3 people enter
        peopleInRoom++; 
        peopleInRoom++; 
        peopleInRoom++;  

        System.out.println("The no. of people in room " + peopleInRoom + ".");

        // 1 person leaves
        peopleInRoom--; 

        System.out.println("The no. of people in room " + peopleInRoom + ".");

        int savings = 100; 
        savings += 50; // savings + 50
        System.out.println("Total savings is " + "$" + savings + ".");

        boolean isLoggedIn = true; 
        boolean isAdmin = false; 
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has Acess " + (isLoggedIn || isAdmin));
        System.out.println("Not Logged In: " + (!isLoggedIn));

        String a = "Java "; 
        String b = "is "; 
        String c = "fun!"; 
        String result = a. concat(b).concat(c);
        System.out.println(result);

        Math.sqrt(64); 
        Math.pow(2, 8); 

        int x2 = 5; 
        ++x2; 
        ++x2; 
        ++x2; 
        System.out.println(x2);

        int x3 = 5; 
        x3++; 
        x3++; 
        x3++; 
        System.out.println(x3);

        String txt = "Sammi Cheng"; 
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("Cheng"));
        System.out.println(txt.charAt(6));

        String txt1 = "Dodo Cheng"; 
        System.out.println(txt.equals(txt1));

        String w1 = "Raining"; 
        String w2 = "Sunny"; 
        String w3 = "Normal"; 
        String w = w3; 
        if (w.equals(w1)) {
            System.out.println("Today is " + w1 + ". Please remember to bring an umbrella.");
        }  else if (w.equals(w2)) {
            System.out.println("Today is " + w2 + ". Please rememeber to bring sunglasses.");
        }   else {
            System.out.println("Today is " + w3 + ". Please go outside normally.");
        }

        int weather = 3; 
        if (weather == 1) {
        System.out.println("Bring an umbrella");
        } else if (weather == 2) {
        System.out.println("Bring your sunglasses."); 
        } else {
                System.out.println("Just go outside normally.");
            }
        
        boolean isRainy = true; 
        boolean isSunny = true; 
        String result2 = (isRainy) ? "Bring an umbrella" : "Bring your sunglasses"; 
        System.out.println(result2);
        
    
        String result3 = (isRainy) 
        ? "Bring an umbrella"
        : (isSunny) 
        ? "Bring your sunglasses"
        : "Just go out normally"; 
        System.out.println(result3);

       int i = 1; 

       while (i <= 5) {
        System.out.println(i);
        i++; 
       }

       int number3 = 0; 
       while (number3 !=7) {
        number3 = (int)(Math.random() * 10); 
        System.out.println("Generated " + number3);
       }
       System.out.println("Found 7!");

       int number4 = (int) Math.random() * 100; // 0 - 99
       System.out.println(number4);

       int number2 = -1; 
       while (number2 != 44) {
        number2 = (int) (Math.random() * 100); // 0 - 99
       System.out.println("Generated: " + number2);
        }
        System.out.println("Found 44");

        String[] fruits = {"Apple", "Orange", "Grapes", "Banana"}; 
        int fruitIndex = 0;
        while (fruitIndex < fruits.length) {
            System.out.println(fruits[fruitIndex]);
            fruitIndex++;
        } 

        String test = "Hello World"; 
        System.out.println(test);
        
        int test2 = 9;  
        if (test2 % 2 == 0) {
            System.out.println("This number is an even number");
        }   else {
            System.out.println("This number is an odd number.");
        }

        int countdown = 3; 
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");

        String[] colors = {"Red", "Blue", "Yellow", "Green"}; 
        int colorsIndex = 0; 
        while (colorsIndex < colors.length) {
            System.out.println(colors[colorsIndex]);
            colorsIndex++;  
        }

        String[] animals = {"Pigs", "Dogs", "Cats", "Birds"}; 
        int animalsIndex = 0; 
        while (animalsIndex < animals.length) {
            System.out.println(animals[animalsIndex]);
            animalsIndex++;
        }
    
        String[] singers = {"Sammi", "Anita", "Karen", "Sandy"}; 
        int singersIndex = 0; 
        while (singersIndex < singers.length) {
            System.out.println(singers[singersIndex]);
            singersIndex++; 
        }

        int exercise1 = 1; 
        while (exercise1 <= 10) {
        System.out.println(exercise1);
        exercise1++; 
        }

        int exercise2 = 2; 
        while (exercise2 <= 20) {
            if (exercise2 % 2 == 0) {
                System.out.println(exercise2);
            } exercise2++; 
        }

        int exercise3 = 1; 
        int sum3 = 0; 
        while (exercise3 <= 100) {
            sum3 += exercise3; 
            exercise3++; 
        }
        System.out.println("Sum = " + sum3);

        int exercise4 = 10; 
        while (exercise4 >= 1) {
            System.out.println(exercise4);
            exercise4--;
        }

        String exercise5 = "Sammi Cheng"; 
        int idxExercise5 = 0; 
        while (idxExercise5 < exercise5.length()) {
        System.out.println(exercise5.charAt(idxExercise5));
        idxExercise5++; 
        }

        int exercise6 = 1; 
        while (exercise6 % 7 != 0) {
            exercise6++; 
        }
        System.out.println("First divisible by 7 is " + exercise6);

        int dice = 1; 
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice++; 
            }

        


    }   
} 