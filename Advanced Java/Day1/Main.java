/*
    1.Write a Java program to:
Create an ArrayList of student names
Add at least 5 names
Display all names using a loop

2.Write a Java program to:
Store integers in an ArrayList
Count how many times a given number appears in the list

3.Write a Java program to:
Store employee ID and name using HashMap
Display all employee details
*/

import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");    
        studentNames.add("David");
        studentNames.add("Eve");

        System.out.println("Student Names:");
        for(String name : studentNames){
            System.out.println(name);
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        int count = 0;
        int target = 2;
        for(int num : numbers){
            if(num == target){
                count++;
            }
        }
        System.out.println("\nNumber " + target + " appears " + count + " times in the list.");


        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        System.out.println("\nEmployee Details:");
        for(Map.Entry<Integer, String> entry : employeeMap.entrySet()){
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

}