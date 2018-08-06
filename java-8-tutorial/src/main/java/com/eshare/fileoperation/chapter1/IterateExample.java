package com.eshare.fileoperation.chapter1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * IterateExample
 *
 * @author liangyh
 * @date 2018/8/6
 */
public class IterateExample {

    public static void main(String[] args){
        //List all files and sub-directories using Files.list()
        try {
            Files.list(Paths.get(".")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //List only files inside directory using filter expression
        try {
            Files.list(Paths.get(".")).filter(Files::isRegularFile).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //List files and sub-directories with Files.newDirectoryStream()
        try {
            Files.newDirectoryStream(Paths.get(".")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //List only files with Files.newDirectoryStream()
        try {
            Files.newDirectoryStream(Paths.get("."),path->path.toFile().isFile()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Find all hidden files in directory
        final File[] files = new File(".").listFiles(file->file.isHidden());
        for(File file:files){
            System.out.println(file.getName());
        }
    }
}