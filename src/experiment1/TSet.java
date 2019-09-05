/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author tiburilloma_sd2023
 */
public class TSet {

    private SortedSet<String> student = new TreeSet<String>();

    Scanner input = new Scanner(System.in);

    public void add() {
        System.out.println("\nPlease input Data");
        System.out.print("Name of Student: ");
        String name = input.nextLine();
        student.add(name);
        System.out.println("SUCCESSFULLY ADDED!\n");

    }

    public void display() {
        System.out.println("\n========LIST OF STUDENT===================");
        Iterator itr = student.iterator();
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println();
    }

    public void update() {
        System.out.println("\nPlease fill up data!");
        System.out.print("Name of Student: ");
        String name = input.nextLine();
        if (student.contains(name)) {
            student.remove(name);
            System.out.print("Edit name: ");
            String edit = input.nextLine();
            student.add(edit);
            System.out.println("STUDENT UPDATED!\n");
        } else {
            System.out.println("STUDENT NOT FOUND!\n");
        }

    }

    public void delete() {
        System.out.println("\nPlease input dATA");
        System.out.print("Name of student: ");
        String name = input.nextLine();
        if (student.contains(name)) {
            student.remove(name);
            System.out.println("STUDENT SUCCESSFULLY DELETED!\n");
        } else {
            System.out.println("STUDENT NOT FOUND!\n");
        }
    }
}
