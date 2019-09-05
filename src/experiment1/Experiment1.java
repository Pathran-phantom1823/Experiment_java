
package experiment1;

import java.util.Scanner;


public class Experiment1 {
     public static void action(){
        System.out.println("\nACTIONS:\nEnter '1' to ADD\nEnter '2' to RETRIEVE\n"
                    + "Enter '3' to UPDATE\nEnter '4' to DELETE\nEnter '5' to EXIT\n");
        System.out.print("Enter your action: ");
    }

    public static void mainMenu() {
        OUTER:
        while (true) {
            System.out.println("\nOPTIONS:\nEnter '1' ARRAYIST(accounts)\nEnter '2' for "
                    + "PRIORITY QUEUE(subjects)\nEnter '3' for SORTED SET(students)\nEnter '4' to Exit\n");
            System.out.print("Enter your option: ");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    arrListOpt();
                    break;
                case 2:
                    pQueueOpt();
                    break;
                case 3:
                    tSetOpt();
                    break;
                case 4:
                    break OUTER;
                default:
                    System.out.println("Invalid Action!\n");
                    break;
            }
        }
    }
    

    public static void arrListOpt() {
        ArrList list = new ArrList();
        OUTER:
        while (true) {
            action();
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    list.update();
                    break;
                case 4:
                    list.delete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("INVALID ACTION!\n");
                    break;
            }
        }
    }
    
    public static void tSetOpt() {
        TSet set = new TSet();
        OUTER:
        while (true) {
            action();
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    set.add();
                    break;
                case 2:
                    set.display();
                    break;
                case 3:
                    set.update();
                    break;
                case 4:
                    set.delete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("Invalid Action!\n");
                    break;
            }
        }
    }
    
    public static void pQueueOpt() {
        PQueue que = new PQueue();
        OUTER:
        while (true) {
            action();
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    que.add();
                    break;
                case 2:
                    que.display();
                    break;
                case 3:
                    que.update();
                    break;
                case 4:
                    que.delete();
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("Invalid Action!\n");
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
       
        
        mainMenu();
        
        

    }
    
}
