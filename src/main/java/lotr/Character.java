package lotr;

import lombok.Getter;

@Getter
public abstract class Character implements BasicKick {
    /**
     *   - attributes: int power, int hp
     *   - methods: void kick(Character c), boolean isAlive()
     *
     * */
    int power;
    int hp;
    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;


    }
    boolean  isAlive(){
        return getHp() > 0;
    }
    @Override
    public String toString(){
        //Hobbit{hp=3, power=0}
        return this.getClass().getSimpleName()+"{hp="+getHp()+
                ", power=" + getPower() + "}";

    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }
}
