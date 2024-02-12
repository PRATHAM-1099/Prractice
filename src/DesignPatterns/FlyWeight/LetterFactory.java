package DesignPatterns.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static final Map<Character, Letter> cCache = new HashMap<>();

    public static Letter createLetter(char c){
        if(cCache.containsKey(c)){
            return cCache.get(c);
        }
        else {
            DocumentCharacter dc = new DocumentCharacter(c,"Arial", 10);
            cCache.put(c,dc);
            return dc;
        }
    }

}
