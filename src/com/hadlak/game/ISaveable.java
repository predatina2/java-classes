package com.hadlak.game;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<Character> saveToList(List<Character> list);

    boolean updateFromList(List<Character> list);

    List<String> write();

    void read(List<String> savedValues);
}
