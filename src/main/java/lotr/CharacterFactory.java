package lotr;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.sql.Array;
import java.util.*;

import static org.reflections.scanners.Scanners.SubTypes;


public class CharacterFactory {
    /**
     *  - methods: Character createCharacter() {
     *               returns random instance of any existing character
     *             }
     *               */

    static Random random = new Random();
    static Reflections reflections = new Reflections("lotr");
    @SneakyThrows

    static public Character createCharacter(){
        Class<?> cls;
        Set<Class<?>> subTypes =
                reflections.get(SubTypes.of(Character.class).asClass());
        List<Class<?>> list = new ArrayList<>();
        for (Class<?> hero :
                subTypes) {
           if (!Modifier.isAbstract(hero.getModifiers())){
               list.add(hero);
           }
        }
        cls = list.get(random.nextInt(list.size()));
        Constructor<?> clsConstr = cls.getConstructor();
        return  (Character) clsConstr.newInstance();
    }
}
