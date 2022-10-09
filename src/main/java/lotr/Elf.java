package lotr;

public class Elf extends Character {
    /**
     * - attributes: int power=10, int hp=10
     * - methods: void kick(Character c) {
     *               kill everybody weaker than him,
     *               otherwise decrease the power of character by 1
     *             }*/
    public Elf(){
        super(10,10);
    }

    @Override
    public void kick(Character c) {
        if (this.power > c.getPower()){
            c.setHp(0);
        }
        else {
            this.power = power - 1;
        }
    }
}
