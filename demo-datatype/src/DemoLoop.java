public class DemoLoop {
    public static void main(String[] args) {
        int x = 3; 
        x *= 3; 
        x *= 3;
        System.out.println(x); 

    // for (initization; criteria to continue; modifier)
    // Step 1: 1 = 0
    // Step 2: check if i < 4 (Yes)
    // Step 3: x *= 3
    // Step 4: i++, i -> 1
    // Step 5: i < 4 (Yes)
    // Step 6: x *=3 

    // Step 7: i++, i -> 2
    // Step 8: i < 4 (Yes)
    // Step 9: x *=3 

    // Step 10: i++, i -> 3
    // Step 11: i < 4 (Yes)
    // Step 12: x *=3 

    // Step 13: i++, i -> 4
    // Step 14: i < 4 (No) -> Exit Loop

    x = 3; 
    for (int i = 0; i < 4; i++){
        x *=3; 
    }
    System.out.println(x); // 243

    //print 50 hello
    for (int i = 0; i < 50; i++){ // 0 - 49
        System.out.println("hello");
    }

    // 0 - 100 
    // print event numbers
    // for loop + if 
    for (int i = 0; i <= 100; i++){ // 0 - 100
        if (i % 2 == 0){
            System.out.println(i);}
    }

    // 0 - 20
    // print odd numbers and the number > 5
    for (int i = 0; i <= 20; i++)
        if (i > 5 && i % 2 >= 1){
            System.out.println("odd numbers and the number > 5.");
        }
    
    // leap year 
    // divided by 100, not a leap year, unless divided by 400 (i.e. 2000 is a leap year)
    // i.e. 2100 is not a leap year 
    int year = 2100; 
    boolean isLeapYear = false; 
    if (year % 4 == 0){
        if (year % 100 == 0) {
            if (year % 400 == 0){
                isLeapYear = true; // 2000
            } 
        } else {
            isLeapYear = true; //2004
        }
    }
        System.out.println(isLeapYear);

        isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); 
        System.out.println(isLeapYear);

        // sum up 1 - 100
        int total = 0; 
        for (int i = 0; i <= 100; i++){
            total += i; 
        }
            System.out.println(total);

        // the number of value between 1 and 100, which can be divided by 6
        int count = 0; 
        for (int i = 1; i <= 100; i++){
            if (i % 6 ==0){
                count++; 
            }
        }
            System.out.println("the number of values between 1 and 100, which can be divided by 6 is " + count);

        // convert 1 - 100 into char values, then concat them together
        String result = ""; 
        for (int i = 1; i <= 100; i++) {
            result += (char) i; // String + any type of value -> String 
        }
        System.out.println(result);

        //! break -> exit earlier 
        // the first number between 1 and 50, which is divided by 7. 
        int target = -1; 
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                target = i; 
                break; // break loop
            }
        }
        if (target == -1) {
            System.out.println("Not Found."); 
            }   else {
                System.out.println("Target=" + target);
            }
        
    // ! continue -> skip the rest 
    for (int i = 0; i < 20; i++) {
        if (i % 2 == 0) {
            System.out.println("Hello!!");
            continue; // goes to modifier (i++)
        }
        System.out.println("Goodbye!!");
    }

    for (int i = 0; i < 20; i++) {
     if (i % 2 ==0){
        System.out.println("Hello!!!");
     }   else {
        System.out.println("Sammi!!");
        System.out.println("Goodbye!!");
     }
    }

    // Find the largest number < 1000, divided by 7; 
    int largestNumber = 0; 
    for (int i = 0; i < 1000; i += 7) {
        largestNumber = i; 
        }
        System.out.println(largestNumber);

    while(true) {
        if (largestNumber + 7 >= 1000) {
            break; 
        }
        largestNumber += 7; 
    }
    System.out.println(largestNumber);

    //String currentTime2 = "23:42"; 
    //int secondToAdd = 6500; 
    int h = 23;
    int m = 42; 
    int totalSecond2 = (h * 3600) + (m * 60); 
    System.out.println(totalSecond2); 

    int secondToAdd2 = (totalSecond2 + 6500); 
    System.out.println(secondToAdd2);

    int hours = secondToAdd2 / 3600;
    int minutes = (secondToAdd2 % 3600) / 60; 
    int seconds = (secondToAdd2 % 60); 

    System.out.println(hours + ";" + minutes + ";" + seconds); 

    // Vincent's approach 
    String currentTime = "23:42:00"; 
    int secondToAdd = 6500; 
    int currentHour = (currentTime.charAt(0) - '0') * 10 + (currentTime.charAt(1) - '0'); 
    int currentMinute = (currentTime.charAt(3) - '0') * 10 + (currentTime.charAt(4) - '0'); 
    int currentSecond = (currentTime.charAt(6) - '0') * 10 + (currentTime.charAt(7) - '0'); 
    int currentTimeInSecond = currentHour * 60 * 60 + currentMinute * 60 + currentSecond; 

    int todayTotalSecond = (currentTimeInSecond + secondToAdd) % (24 * 60 * 60); 
    System.out.println(todayTotalSecond); //5420

    int todayHour = todayTotalSecond / (60 * 60); // prefix 
    int todayMinute = todayTotalSecond % (60 * 60) / 60; // prefix 
    int todaySecond = todayTotalSecond % (60 * 60) % 60; 

    String todayHourInString = (todayHour < 10 ? "0" : "") + todayHour; 
    String todayMinuteInString = (todayMinute < 10 ? "0" : "") + todayMinute;
    String todaySecondInString = (todaySecond < 10 ? "0" : "") + todaySecond;


    String todayTime = todayHourInString + ":" + todayMinuteInString + ":" + todaySecondInString; 
    System.out.println(todayTime); // 01:30:20

     // Keep double a given number, until it just > 10000. What is the number? 
    int n = 9; 
    target = n; 
    while (target <= 10000) {
        if (target * 2 > 10000) {
            target *= 2; 
            break; 
        }
        target *= 2; 
    }
    System.out.println(target);

    String s10 = "HELLOXWORLD"; 
    int idx = -1; 
    // Find the index of "X", -1 of not found. 
    // i.e. Use loop, not indexOf() 
    for (int i = 0; i < s10.length(); i++) {
        if (s10.charAt(i) == 'X') {
            idx = i; 
            break; 
        }
    }
    System.out.println("The index of X =" +idx);

    // get the prime numbers between 1 and 50
    //int number = 47; // true
    // check if the number is prime first
    int number = 2; // true 
    boolean isPrime = true; 
    if (number >= 2){
        for (int i = 2; i < number; i++) {
            if (number % 1 == 0) {
                isPrime = false; 
                break; 
        }
    }
    }   else {
        isPrime = false; 
    }
    if (isPrime) {
        System.out.println("The number " + number + " is a prime number." );
    } else {
        System.out.println("The number " + number + "is not a prime number.");
    }
    
    // outer loop 
    for (int i = 0; i < 3; i++) {
    // inner loop
        for (int j = 0; j < 3; j++) {
            System.out.println("i=" + i + ", j=" + j);
        }
    }

    // *
    // **
    // *** 
    // ****
   int k = 4; 
   for (int i = 0; i < k; i++) { // row 
    for (int j = 0; j < i + 1; j++) { // print *
        System.out.print("*");
    }
    System.out.println();
   }

   //...*
   //..***
   //.*****

   int o = 0; 
   while (o < 10); {
    System.out.println("hello");
    o++; // flexible for modifier 
    } 
    for (int i = 0; i < 10; i++) {
        // Normally, we don't use additional modifier in the for loop content // 10000 lines
    }

    int o = 0; 
    while (0 < 1000) {
        if (o % 2 == 0) {
            o++; // flexbile for modifer
        }
        if (o % 7 == 0) {
            o++; 
        }
        o++; 
        if (o > 20)
            break; 
    }
    System.out.println("0=" + o);
    }
}