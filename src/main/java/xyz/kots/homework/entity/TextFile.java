package xyz.kots.homework.entity;

import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class TextFile extends AbstractFile {
    public TextFile(String name) {
        super(name);
    }

    public TextFile(File file){
        super(file);
    }

    public List<String> lines() {
        List<String> lines = new LinkedList<>();
        File file = new File(this.name());

        try {

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(file)));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found");
        } catch (IOException ioe) {
            System.err.println("Could not read file");
        }

        return lines;
    }
}
