package com.eshare.fileoperation.chapter2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Write2FileExample
 *
 * @author liangyh
 * @date 2018/8/6
 */
public class Write2FileExample {

    public static void main(String[] args){
        //Write to file using BufferedWriter
        Path path  = Paths.get("D:\\test.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path)){
                writer.write("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Write to file using Files.write()
        try {
            Files.write(Paths.get("D:\\test1.txt"),"Hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}