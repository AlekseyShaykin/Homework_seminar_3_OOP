package org.example.javaoop.src.main.java.org.example.game;

import java.util.ArrayList;
import java.util.List;

public class WordGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        String abc = "abcdefghiklmnopqrstvxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<String> alphabet = new ArrayList<String>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(String.valueOf(abcArray[i]));
        }
        return alphabet;

    }
}
