package com.example.hadlak.game;

import java.util.List;

public interface Saveable {

    List<Character> saveToList(List<Character> list);

    boolean updateFromList(List<Character> list);

    List<String> write();

    boolean read(List<String> savedValues);
}
