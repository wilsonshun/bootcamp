public class Warrior extends Hero {
    private static final int STARTING_LEVEL = Heroes.STARTING_LEVEL; 
    private String name; 

    public Warrior() {
        super(STARTING_LEVEL, STARTING_LEVEL)
    }
    
    public Warrior(String name) {
        super(STARTING_LEVEL, Heroes.maxHP(Heroes.WARRIOR, STARTING_LEVEL)); 
        this.name = name; 
    }

    @Override
    public int getRole() {
        return Heroes.WARRIOR; 
    }

    // defence X 2 扣 MP 
    public void superDefense() {
        System.out.println("Warrior special skills.");
    }

    //! 
    // public void attack(Hero hero) {
    // double toBeDeducted = this.isCD() ? this.getCD() : this.getPA(); 
    // hero.deductHp((int)(toBeDeducted));
    // }

    public static void main(String[] args) {
        Archer archer = new Archer(); 
        System.out.println(archer.getHp());
        System.out.println(archer.getPa());

        System.out.println(Math.random()); // 0 - 1

        Warrior warrior = new Warrior(); 

        System.out.println(warrior.getHp()); // 10 
        archer.attack(warrior); 
        System.out.println((warrior.getHp())); // 7
        

        //! Polymorphism 
        Archer a1 = new Archer(); 

        // Object Reference Type can be different to Object Type. 
        Hero hero = new Archer(); 
        // Archer a2 = new Hero(); // Error

        // ! Why do we need Parent Class? 
        Hero[] myHeroes = new Hero[2];
        myHeroes[0] = new Warrior("Jenny");
        myHeroes[1] = new Archer("Sammi"); 
        myHeroes[2] = new Warrior("Tommy"); 

        // Object Reference Type -> Hero
        // Object Type -> Warrior
        Hero target = new Warrior(); 

        for (Hero h : myHeroes) {
            // ! 未撳 Run 即係 Compile Time
            // ! 1. During compile time, Java will not confirm the actual object type. 
            // ! 2. Based on Object Reference Type for calling method. 
            h.attack(target); 
        }
        // ! Because Cat did not extend Hero 
        // Hero h1 = new Cat(); 

        // Hero Cat
        // Object o = new Cat(); 
        Object o = new Cat(); // !hiding
        o = new Warrior(); 
        o = new Archer(); 

        Object[] heroes = new Object[2]; 
        heroes[0] = new Warrior(); 
        heroes[1] = new Archer(); 

        // Based on Object Reference Type for calling method
        // heroes[1].attack(hero); 

        Hero[] heroes2 = new Hero[2]; 
        heroes2[0] = new Warrior(); 
        heroes2[1] = new Archer(); 

        heroes2[1].attack(hero); 
        
        for (Hero h : myHeroes) {
            if (h instanceof Warrior) {     
            Warrior w1 = (Warrior) h; 
            w1.superDefense(); 
            }
            h.attack(target); 
        }
    }
}
    



