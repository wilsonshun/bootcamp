public class Cat {
    // ! Attributes
    private String name; 
    private int age; // >= 18 Adult 

    // Implicitly exist constructor // ! 唔寫都存在
    // ! Constructor: The process of building the object 
    public Cat() {

    }

    public boolean isAdult() {
        return this.age >= 18; 
    }
    
    // ! instance method or object method ()
    public void setName(String name) {
        this.name = name; // this.name = my name 
    }

    public String getName() {
        return this.name; 
    }

    // getAge, setAge 
    public void setAge(int age) {
        this.age = age; 
    }

    public int getAge() {
        return this.age; 
    }

    public static void main(String[] args) { 
        // ! "new" is to 呼喚 Constructor  "Cat()" -> create Cat object
        Cat c1 = new Cat(); // name, age
        c1.setName("John");
        System.out.println(c1.getName()); // John
        c1.setAge(18); 
        System.out.println(c1.getAge()); // 18

        Cat c10 = c1; 
        c10.setName("Peter"); 
        System.out.println(c1.getName()); // Peter
        System.out.println(c10.getName()); // Peter

        Cat c2 = new Cat(); // name, age 
        Cat c3 = new Cat(); 

        String s1 = new String(); 

        // Excel row (new data) x column (phone, email, name)
        // OOP (object oriented program); (c1.name, c1.age) -> similar to 1 row in Excel 
        // OOP; ()

        if (c2.getAge() >= 18) {    // Adult Definition 

        }
        if(c2.isAdult()) {

        }
    }
}
