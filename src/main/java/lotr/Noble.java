package lotr;

import java.util.Random;


public abstract class Noble extends Character{
    /**  - methods: void kick(Character c) {
     *               decrease number of hp of the enemy by random
     *               number which will be in the range of his power
     *             }*/
    static Random random = new Random();

    public Noble(int min, int max){
        super(random.ints(min, max)
                .findFirst()
                .getAsInt(),
                random.ints(min, max)
                .findFirst()
                .getAsInt());
    }
    public void kick(Character c){
        c.setHp(c.getHp() - random.ints(0, getPower())
                .findFirst()
                .getAsInt());
    }
}
