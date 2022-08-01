import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        Map <String, String> newMap = new HashMap<String, String>();
        Map <Character,String> newMapEng = getEngMap();
        Map <Character, String> newMapRu = getRuMap();

        for (Map.Entry<Character,String> entry: newMapEng.entrySet())

        {
            System.out.println(entry.getKey() + "=");
            System.out.println((entry.getValue()));
        }

    }
    public static Map<Character, String> getEngMap(){
        Map <Character, String> eng = new HashMap<Character, String>();
        eng.put('a', "apple");
        eng.put('b',"book");
        eng.put('c',"cat");
        eng.put('d',"door");
        eng.put('e',"elephant");
        eng.put('f',"fish");
        eng.put('g',"girafe");
        eng.put('h',"house");
        eng.put('i',"ice-cream");
        eng.put('j',"jelly");
        eng.put('k',"kite");
        eng.put('l',"ladybird");
        eng.put('m',"mouse");
        eng.put('n',"newt");
        eng.put('o',"octopus");
        eng.put('p',"pig");
        eng.put('q',"queen");
        eng.put('r',"rocket");
        eng.put('s',"snake");
        eng.put('t',"teddybear");
        eng.put('u',"umbrella");
        eng.put('v',"");
        eng.put('w',"");
        eng.put('x',"");
        eng.put('y',"");
        eng.put('z',"");
    return eng;

        }

    public static  Map <Character, String> getRuMap() {
        Map<Character, String> ru = new HashMap<Character, String>();
        ru.put('a', "яблоко");
        ru.put('b', "книга");
        ru.put('c', "кот");
        ru.put('d', "дверь");
        ru.put('e', "слон");
        ru.put('f', "рыба");
        ru.put('g', "жираф");
        ru.put('h', "дом");
        ru.put('i', "мороженое");
        ru.put('j', "желе");
        ru.put('k', "змей");
        ru.put('l', "божья коровка");
        ru.put('m', "мышь");
        ru.put('n', "ящерица");
        ru.put('o', "осьминог");
        ru.put('p', "свинья");
        ru.put('q', "королева");
        ru.put('r', "ракета");
        ru.put('s', "змея");
        ru.put('t', "мишка Тедди");
        ru.put('u', "зонт");
        ru.put('v', "");
        ru.put('w', "");
        ru.put('x', "");
        ru.put('y', "");
        ru.put('z', "");
        return ru;
    }


}
