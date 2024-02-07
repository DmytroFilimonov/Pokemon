
public class Pokemon {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int specialAttack;
    protected int specialDefense;
    protected int speed;

    public Pokemon(String name, int hp, int attack, int defense, int specialAttack, int specialDefense, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public void fight() {
        System.out.println(name + " вступает в бой!");
    }

    public void sleep() {
        System.out.println(name + " засыпает...");
    }
}

  class Charizard extends Pokemon {
    public Charizard() {
        super("Charizard", 78, 84, 78, 109, 85, 100);
    }
}

  class Blastoise extends Pokemon {
    public Blastoise() {
        super("Blastoise", 79, 83, 100, 85, 105, 78);
    }
}

  class PokemonTeam {
    private Pokemon[] team;

    public PokemonTeam(Pokemon[] team) {
        this.team = team;
    }

    public void performAction() {
        for (Pokemon pokemon : team) {
            pokemon.fight();
            pokemon.sleep();
            System.out.println();
        }
    }
}

  class Main {
    public static void main(String[] args) {
        Pokemon[] team1 = {
                new Charizard(),
                new Blastoise()
        };

        Pokemon[] team2 = {
                new Charizard(),
                new Blastoise()
        };

        PokemonTeam teamOne = new PokemonTeam(team1);
        PokemonTeam teamTwo = new PokemonTeam(team2);

        System.out.println("Команда 1:");
        teamOne.performAction();

        System.out.println("Команда 2:");
        teamTwo.performAction();
    }
}
