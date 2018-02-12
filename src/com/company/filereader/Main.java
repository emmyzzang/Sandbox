package com.company.filereader;

import com.company.filereader.reader.MyFileReader;

import java.util.Random;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {


    public static void main(String[] args) {

        String firstNameFile = "/Users/emmyemme/Desktop/PI_JAVA1/DATA/FirstNames.txt";
        String middleNameFile = "/Users/emmyemme/Desktop/PI_JAVA1/DATA/MiddleNames.txt";
        String lastNameFile = "/Users/emmyemme/Desktop/PI_JAVA1/DATA/LastNames.txt";


        String[] firstNames = MyFileReader.readFile(firstNameFile)
        String[] middleNames = MyFileReader.readFile(middleNameFile);
        String[] lastNames = MyFileReader.readFile(lastNameFile);

        // Create Random Number Generator for firstNames, middleNames, lastNames
        Random rnd = new Random();


        // This represents an index between 0 and the array length
        int randomFirstNames = rnd.nextInt(firstNames.length - 1);
        int randomMiddleNames = rnd.nextInt(middleNames.length - 1);
        int randomLastNames = rnd.nextInt(lastNames.length - 1);


        // With Random Generator Access that Value and build a fullName String Ex. "First Middle Last"
        String fullName = firstNames[randomFirstNames] + " " + middleNames[randomMiddleNames] + " " + lastNames[randomLastNames];

        System.out.println(fullName);

        // Write to File /Users/emmyemme/Desktop/PI_JAVA1/DATA/RESULTS.txt
        String text = fullName;

        try {
            Files.write(Paths.get("/Users/emmyemme/Desktop/PI_JAVA1/DATA/RESULTS.txt"), text.getBytes());
        } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }

    }
}