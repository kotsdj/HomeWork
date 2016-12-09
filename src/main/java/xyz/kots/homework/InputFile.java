package xyz.kots.homework;

import xyz.kots.homework.entity.TextFile;

import java.io.*;
import java.util.*;


public class InputFile {
    private final String fileName;
    private final Map<String, LinkedList<Object>> contents = new HashMap<String, LinkedList<Object>>();

    InputFile(String fileName) {
        this.fileName = fileName;
    }

    public void read() throws IOException {
        TextFile text = new TextFile(fileName);

        for (String line : text.lines()) {
            if (!line.isEmpty()) {
                String[] keyValue = line.split(" ");
                if (keyValue.length >= 1) {
                    if (contents.get(keyValue[0]) == null) {
                        contents.put(keyValue[0], new LinkedList<>());
                    }
                    for (int i = 1; i < keyValue.length; i++) {
                        List<Object> valuesList = contents.get(keyValue[0]);
                        try {
                            valuesList.add(Integer.valueOf(keyValue[i]));
                        } catch (NumberFormatException e) {
                            System.err.println(keyValue[i] + " is not a number");
                        }
                    }
                }
            }
        }
    }

    public void print() {
        for (Map.Entry<String, LinkedList<Object>> entry : contents.entrySet()) {
            System.out.println(entry.getKey() + " - " + Arrays.toString(entry.getValue().toArray()));
        }
    }
}
