package com.company;
import java.util.LinkedList; //Need LinkedList library

public class Main {

    public static void main(String[] args) {
	// write your code here

        //create a linked list
        LinkedList<String> students = new LinkedList<>();

        //Add students to Linked List
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Sarah"); //add students name to the beginning of the list
        students.addLast("Hailey"); //add students name to the end of the list
        students.add(2,"Tara"); //add students name to the index specified

        String firstStudent = students.getFirst();  //Gets the first students name on the list
        System.out.println("First " + firstStudent); //Prints out the first students name on the list
        String lastStudent = students.getLast(); //Gets the last name on the list
        System.out.println("Last " + lastStudent); //Prints out the last students name on the list
        System.out.println(students.size()); //Prints out the size of the list
        System.out.println(students); //Prints out the full list

        String secondStudent = students.get(1); //gets the student at the specified index
        System.out.println("Second " + secondStudent); //prints the second student on the list because it is the index specified above

        int i = students.indexOf("Morgan"); //gets the specific INDEX of the array for Morgan
        System.out.println("Index of Morgan " + i); //prints out the index of Morgan to the screen

        students.removeFirst(); //removes first name on the list
        students.removeLast(); //removes last name on the list
        students.remove("Jamie"); //removes specific name from the list
        students.remove(1); //removes the name at a specific index
        System.out.println(students); //prints out a new students list based off the changes made

        boolean hasTaylor = students.contains("Taylor"); //searches and finds student named Taylor from the list
        System.out.println(hasTaylor); //prints out if the name is found on the list

        students.clear(); //clears the list out
        System.out.println(students); //prints out the cleared list


    }
}
