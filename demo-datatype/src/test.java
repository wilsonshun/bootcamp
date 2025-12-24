public class test {
    public static void main(String[] args) {
int num = 123;
int reversed = 0;

 while (num > 0) {
    int digit = num % 10;  // get last digit
    System.out.println(digit);
    reversed = reversed * 10 + digit;  
    num = num / 10;           
    System.out.println(num); 
    // remove last digit
}

System.out.println(reversed);    // prints 321

int num2 = 123;
int reversed2 = 0;

System.out.println(num2 % 10);

    }
}
