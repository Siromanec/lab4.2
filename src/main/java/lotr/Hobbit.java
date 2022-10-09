package lotr;

public class Hobbit extends Character {
    /**
     * - attributes: int power=0, int hp=3
     * - methods: void kick(Character c) { toCry() }
     *   */
    public Hobbit(){
        super(0, 3);

    }
    public void kick(Character c) { toCry(); }
    void toCry(){
        System.out.println("（>﹏<）");
    };
}
