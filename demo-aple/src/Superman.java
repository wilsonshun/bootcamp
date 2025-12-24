// ! Parent Class: Class or Abstract Class
// 1. Human has no abstract method
// ! can only extend 1, implements can be multiple 

    // Abstract fly()

    public Superman(String name) {
        super(name); 
        System.out.println("Superman Constructor...");
    }

    //! 冇紅線即係 compile time OK
    @Override // ! 暗示唔係佢自身，而係繼承
    public void fly() {
        System.out.println(Person.SUPERMAN_FLY_SPEED);
    }

    // @Override -> Not working 
    // public void run() {
    
    //}

    public static void main(String[] args) {
        //! JVM -> static block execution -> main()
        // new Superman("Ken").run(); 
    }
}
