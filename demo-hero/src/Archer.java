public class Archer extends Hero {

    public Archer() {
        super(1, Heroes.maxHP(Heroes.ARCHER, 1)); 
    }

    @Override
    public int getRole() {
        return Heroes.ARCHER; 
    }

    // ! Presentation
    public int getPA(){ 
        return Heroes.pa(getRole(), super.getLevel()); 
    }

    // ! Presentation
    public boolean isCD() {
        return Math.random() <= Heroes.cc(this.getRole(), super.getLevel()); 
    }

    public double getCD() {
        return this.getPA() * Heroes.cdMULTIPLIER(this.getRole(), super.getLevel()); 
    }

    // this vs hero 
    public void attack(Hero hero) {
        double toBeDeducted = this.isCD() ? this.getCD() : this.getPA(); 
        hero.deductHp((int)(toBeDeducted));
    }

    public static void main(String[] args) {
        Archer archer = new Archer(); 
        System.out.println(archer.getHp());
        System.out.println(archer.getPA());

        System.out.println(Math.random()); // 0-1
        // 
        
    }
    }
