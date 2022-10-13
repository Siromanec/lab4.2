package lotr;

public class GameManager {
    /**
     * - methods: void fight(Character c1, Character c2) {
     *               to provide fight between to characters and explain via command
     *               line what happens during fight, till both of
     *               the characters are alive
     *             }
     *             */
    static boolean processFight(Character attacker, Character deffender){
        if (attacker.getHp() > 0) {
            attacker.kick(deffender);
            System.out.println(attacker + " kicks " + deffender);
            return true;
        }else{
            System.out.println(attacker + " has perished");
            return false;
        }

    }
    public static void fight(Character c1, Character c2){
        boolean bothAreAlive = true;
        while (bothAreAlive) {
            bothAreAlive = processFight(c1, c2);
            if (!bothAreAlive) break;
            bothAreAlive = processFight(c2, c1);
            if (!bothAreAlive) break;


        }
        }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        fight(c1, c2);
    }
    }

