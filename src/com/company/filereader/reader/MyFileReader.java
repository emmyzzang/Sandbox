package com.company.filereader.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MyFileReader {

    public static String[] readFile(String fileName) {

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            String[] names = stream.toArray(String[]::new);

            return names;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
