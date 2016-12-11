package xyz.kots.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.kots.homework.entity.MyDirectory;
import xyz.kots.homework.entity.SimpleDirectory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Main {

    private final static Logger LL = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        LL.debug("hello");

        InputFile inputFile = new InputFile("./resources/input.txt");
        inputFile.read();
        inputFile.print();

//        MyDirectory dir = new SimpleDirectory("./resources", null);
//        dir.init();
//        System.out.println(Arrays.toString(dir.listNames().toArray()));
    }
}
