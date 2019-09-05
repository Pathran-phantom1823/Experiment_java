/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author tiburilloma_sd2023
 */
public class ArrList {

    private ArrayList<ArrayList<String>> accounts = new ArrayList<ArrayList<String>>();

    Scanner input = new Scanner(System.in);

    public void add() {
        ArrayList<String> account = new ArrayList<String>();
        System.out.println("\nPlease Fill UP your Information");
        System.out.print("ID NO.: ");
        account.add(input.nextLine());
        System.out.print("NAME: ");
        account.add(input.nextLine());
        System.out.print("COURSE: ");
        account.add(input.nextLine());
        accounts.add(account);
        System.out.println("SUCCESSFULLY ADDED!!!\n");
    }

    public void display() {
        System.out.println("\n===================== YOUR ACCOUNTS:=================");
        Iterator itr = accounts.iterator();
        while (itr.hasNext()) {
            System.out.println("\t" + itr.next());
        }
        System.out.println();
    }

    public void update() {
        boolean found = false;
        System.out.println("\nPlease fill up DATA");
        System.out.print("ID N0.: ");
        String id = input.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).get(0).equals(id)) {
                found = true;
                System.out.println(accounts.get(i));
                System.out.print("Edit NAME: ");
                String username = input.nextLine();
                System.out.print("Edit COURSE: ");
                String passw = input.nextLine();
                accounts.get(i).set(1, username);
                accounts.get(i).set(2, passw);
                break;
            }
        }
        if (found) {
            System.out.println("ACCOUNT UPDATED!!!\n");
        } else {
            System.out.println("ACCOUNT NOT FOUND!\n");
        }

    }

    public void delete() {
        boolean found = false;
        System.out.println("\nPlease fill up DATA");
        System.out.print("ID NO.: ");
        String id = input.nextLine();
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).get(0).equals(id)) {
                found = true;
                accounts.remove(i);
                break;
            }
        }
        if (found) {
            System.out.println("ACCOUNT IS DELETED!\n");

        } else {
            System.out.println("ACCOUNT NOT FOUND!\n");
        }
    }

}
