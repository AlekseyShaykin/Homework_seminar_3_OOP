package org.example.javaoop.src.main.java.org.example.game;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        String abc = "абвгдежзиклмнопрстуфхцчшщэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<String> alphabet = new ArrayList<String>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(String.valueOf(abcArray[i]));
        }
        return alphabet;
    }
}
