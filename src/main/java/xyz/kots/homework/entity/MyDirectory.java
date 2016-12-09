package xyz.kots.homework.entity;


import java.util.List;


public interface MyDirectory extends MyFile {

    void addFile(MyFile file);
    List<String> listNames();
    void init();
}
