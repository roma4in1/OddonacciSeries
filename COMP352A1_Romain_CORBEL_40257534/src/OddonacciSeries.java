// -----------------------------------------------------
// Assignment 1
// Written by: Romain Corbel 40257534
// -----------------------------------------------------
/**
 *Romain Corbel 40257534
 * COMP352
 * Assignment #1
 * 16/02/2024
 */

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;
/**
 * This class represents a OddanacciSeries
 * The parent class of all classes
 */

public class OddonacciSeries {

    /**
     @param totalNumbers The number inputted
     @param array array
     @param OddoOutFile text file to contain results
     */
    private static int totalNumbers = 5;

    public static int[] array = {1, 1, 1};

    private static String OddoOutFile = "src/OddoOut.txt";

    /**
     * This is the main method
     * @param args
     */
    public static void main(String[] args) {

        long startTime, endTime;

        createOutputFile(OddoOutFile);

// Linear Oddonacci Recursion (LINEAR TIME)
            for(int i = 0; i < 13; i++) {
                startTime = System.nanoTime();
                oddonacci_Linear(totalNumbers);
                endTime = System.nanoTime();
                writeToFile(OddoOutFile, "Linear Recursion for " + totalNumbers + " numbers = " + (endTime - startTime) + " Milliseconds");
            totalNumbers += 5;
            }
        // Tail_Linear Oddonacci Recursion (FASTER THAN BINARY)
        totalNumbers = 5;
        for(int i = 0; i < 13; i++) {
            startTime = System.nanoTime();
            oddonacci_tailLinear(totalNumbers);
            endTime = System.nanoTime();

            writeToFile(OddoOutFile, "Tail Linear Recursion for "+ totalNumbers +" numbers = " + (endTime - startTime) + " Milliseconds");
            totalNumbers += 5;
        }
// Oddonacci Binary Recursion (EXPONENTIAL TIME)
        totalNumbers = 5;
        for(int i = 0; i < 8; i++) {
        startTime = System.nanoTime();
        oddonacci_binary(totalNumbers);
        endTime = System.nanoTime();

        writeToFile(OddoOutFile, "Binary Recursion for "+ totalNumbers +" numbers = " + (endTime - startTime) + " Milliseconds");
        totalNumbers += 5;
    }


        System.out.println("Finished");

    }

    /**
      This method calculates the oddonacci recursively
      @param n input integer
      max length of the series
      @return The oddonacci value
     */

    public static int oddonacci_binary(int n) {
        if (n <= 3) {

            return 1;

        }

        return oddonacci_binary(n - 1) + oddonacci_binary(n - 2) + oddonacci_binary(n - 3);

    }
    /**
      This method is the tail linear recursion which invokes itself once as the very last statement.
      @param length_num total length of element in series.
      @return An array third position is the result
     */
    public static int[] oddonacci_tailLinear(int length_num) {
        if (length_num <= 3)
            return array;

        int temp = array[0];

        array[0] = array[1];

        array[1] = array[2];

        array[2] = temp + array[0] + array[1];

        return oddonacci_tailLinear(length_num - 1);

    }

    /**
      This method is the linear recursion which invokes itself once.
      @param length_num total length of element in series.
      @return Array with 3rd position of array is the result.
     */

    public static int[] oddonacci_Linear(int length_num) {

        int temp;

        int[] inputArr;

        if (length_num <= 3) {// return initial array with 1,1,1

            return new int[] { 1, 1, 1 };

        }
// recursive call

        inputArr = oddonacci_Linear(length_num - 1);

        temp = inputArr[0];

        inputArr[0] = inputArr[1];

        inputArr[1] = inputArr[2];

        inputArr[2] = temp + inputArr[0] + inputArr[1];

        return inputArr;

    }

    /**
     * This method creates output file
     * @param outputFileName
     */
    private static void createOutputFile(String outputFileName) {

        File resultsFile = new File(outputFileName);

// If already exists delete and create a new

        if (resultsFile.exists()) {

            resultsFile.delete();

            try {

                resultsFile.createNewFile();

            } catch (IOException e) {

                System.out.println("Output file not found" + e.getMessage());

            }

        }

    }

    /**
     * This method writes to the file
     * @param outputFileName
     * @param str
     */
    private static void writeToFile(String outputFileName, String str) {

        BufferedWriter out = null;

        try {

            out = new BufferedWriter(new FileWriter(outputFileName, true));

            out.write(str + "\n");

        } catch (IOException e1) {

            System.out.println("Writting to file failed." + e1.getMessage());

        } finally {

            try {

// close outputBuffer

                out.close();

            } catch (IOException e) {

                System.out.println("Output buffer can't close." + e.getMessage());

            }

        }

    }
}
