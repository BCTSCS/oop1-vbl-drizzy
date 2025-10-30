public class Monster {
    private int arms;
    private int eyes;
    private int legs;
    private String name;
    public Monster(int arms, int eyes, int legs, String name) {
        this.arms = arms;
        this.eyes = eyes;
        this.legs = legs;
        this.name = name;
    }
    public setArms(int arms) {
        this.arms = arms;
    }
    public int getArms() {
        return arms;
    }
    public setEyes(int eyes) {
        this.eyes = eyes;
    }
    public int getEyes() {
        return eyes;
    }
    pubilc setLegs(int legs) {
        this.legs = legs;
    }
    public int getLegs() {
        return legs;
    }
    public setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Monster monster = new Monster(4, 2, 4, "Abomination");
        System.out.println("Monster Name: " + monster.getName());
        System.out.println("Arms: " + monster.getArms());
        System.out.println("Eyes: " + monster.getEyes());
        System.out.println("Legs: " + monster.getLegs());
    }
}
