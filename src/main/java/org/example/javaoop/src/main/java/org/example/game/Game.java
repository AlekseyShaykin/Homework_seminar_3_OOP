package org.example.javaoop.src.main.java.org.example.game;

public interface Game {
    void start( Integer sizeWord, Integer maxTry);
    Answer inputAnswer(String value);
    GameStatus getGameStatus();
}
