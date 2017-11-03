/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Class_Labs.Lab8;
/**
 * Created by RupGautam on 03/11/2017.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
// TASK #3 Add the file I/O import statement here

/**
 * This class reads numbers from a file, calculates the
 * mean and standard deviation, and writes the results
 * to a file.
 */
public class StatsDemo {
  // TASK #3 Add the throws clause
  public static void main(String[] args) throws IOException {
    double sum = 0; // The sum of the numbers
    int count = 0; // The number of numbers added
    double mean = 0; // The average of the numbers
    double stdDev = 0; // The standard deviation
    String line; // To hold a line from the file
    double difference; // The value and mean difference
    // Create an object of type Scanner
    Scanner keyboard = new Scanner(System.in);
    String filename; // The user input file name
    // Prompt the user and read in the file name
    System.out.println("This program calculates " +
        "statistics on a file " +
        "containing a series of numbers");
    System.out.print("Enter the file name: ");
    filename = keyboard.nextLine();
    // ADD LINES FOR TASK #4 HERE
    // Create a FileReader object passing it the filename
    FileReader fReader = new FileReader(filename);
    // Create a BufferedReader object passing FileReader
    // object
    BufferedReader input = new BufferedReader(fReader);
    // Perform a priming read to read the first line of
    // the file
    line = input.readLine();
    // Loop until you are at the end of the file
    while (line != null) {
      // Convert the line to a double value and add the
      // value to sum
      sum += Double.parseDouble(line);
      // Increment the counter
      count++;
      // Read a new line from the file
      line = input.readLine();
    }
    // Close the input file
    input.close();
    //Store the calculated mean
    mean = sum / count;


    fReader = new FileReader(filename);
    // Reconnect BufferedReader object passing
    // FileReader object
    input = new BufferedReader(fReader);
    // Reinitialize the sum of the numbers
    sum = 0;
    // Reinitialize the number of numbers added
    count = 0;
    // Perform a priming read to read the first line of
    // the file
    line = input.readLine();
    // Loop until you are at the end of the file
    while (line != null) {

      // Convert the line into a double value and
      // subtract the mean
      difference = Double.parseDouble(line) - mean;
      // Add the square of the difference to the sum
      sum += Math.pow(difference, 2);
      // Increment the counter
      count++;
      // Read a new line from the file
      line = input.readLine();
    }
    // Close the input file
    input.close();
    // Store the calculated standard deviation
    stdDev = Math.sqrt(sum / count);

    FileWriter fWriter = new FileWriter("Results.txt");
    // ADD LINES FOR TASK #3 HERE
    // Create a FileWriter object using "Results.txt"
    // Create a PrintWriter object passing the
    // FileWriter object
    PrintWriter output = new PrintWriter(fWriter);
    // Print the results to the output file
    output.printf("mean = %.3f\r\n", mean);
    output.printf("Standard deviation = %.3f\r\n", stdDev);
    // Close the output file
    output.close();
  }
}