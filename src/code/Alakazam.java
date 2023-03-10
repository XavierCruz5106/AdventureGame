package code;

public class Alakazam extends Pokemon {
    public Alakazam(String name, int health, int energy, int level) {
        super(name, health, energy, level);

        this.attacks.add(new Attack("Psychic", 11, 0, "Poison"));
        this.attacks.add(new Attack("Nasty Plot", 25, 2, "Ghost"));
        this.attacks.add(new Attack("Future Sight", 35, 4, "Bug"));
    }

    String getType() {
        return "Psychic";
    }
}
