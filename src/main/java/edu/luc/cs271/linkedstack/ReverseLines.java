package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {
    public static void main(final String[] args) {
      final Scanner input = new Scanner(System.in);
      printReverse(input);
    }

    private static void printReverse(final Scanner input) {
      // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
      String inputLine = input.nextLine(); // Scanning input from users

      if (!inputLine.equals("")) {
        System.out.println(inputLine);
        printReverse(input);
        System.out.println(inputLine);
      }



    }

//  public static void main(final String[] args) {
//    // Complete read successive input lines until EOF, then print out in reverse order
//    LinkedStack<String> stackList = new LinkedStack<>();
//    System.out.println("Enter your input, and press enter after each word. " +
//            "\nOnce your input in complete, press enter to exit inputting mode");
//
//    final Scanner input = new Scanner(System.in);
//    while (input.hasNextLine()) {
//      final String line = input.nextLine();
//      if(line.equals(""))
//        break;
//      stackList.push(line);
//
//    }
//    System.out.println("Will your input print in reverse order: ");
//    while (!stackList.isEmpty()){
//        System.out.println(stackList.pop());
//    }
//
//
//  }
}
