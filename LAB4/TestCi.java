package Assignments.Lab4;

import java.util.Scanner;

public class TestCi {
    public static void main(String[] args) {
        CircularyLinkedList<String> list1= new CircularyLinkedList<>();
        CircularyLinkedList<String> list2= new CircularyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice=-1,choic=-1;

        while (choice != 0 && choic != 0)
        {
            System.out.print("\n\nPress 1 Enter List 1\nPress 2 to Enter List 2" +
                    "\nPress 3 to Check The Equalization of The 2 Lists \n\n");
            choic=in.nextInt();
            switch (choic) {
                case 1:
                    System.out.println(" 1 add first\n" +
                            "2 add last\n" +
                            "3 remove first\n" +
                            "4 rotate\n" +
                            "0 exit");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("input name");
                            list1.addFirst(in.next());
                            System.out.println("first= " + list1.first() +
                                    "\tlast= " + list1.last() + "\tsize= " + list1.size());
                            break;
                        case 2:
                            System.out.print("input name");
                            list1.addLast(in.next());
                            System.out.println("first= " + list1.first() +
                                    "\tlast= " + list1.last() + "\tsize= " + list1.size());
                            break;
                        case 3:
                            System.out.println("deleted name= " + list1.removeFirst());
                            System.out.println("first= " + list1.first() +
                                    "\tlast= " + list1.last() + "\tsize= " + list1.size());
                            break;
                        case 4:
                            list1.rotate();
                            System.out.println("first= " + list1.first() +
                                    "\tlast= " + list1.last() + "\tsize= " + list1.size());
                            break;
                        case 0:
                            System.exit(0);
                    }
                    break;

                case 2:
                    System.out.println(" 1 add first\n" +
                            "2 add last\n" +
                            "3 remove first\n" +
                            "4 rotate\n" +
                            "0 exit");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("input name");
                            list2.addFirst(in.next());
                            System.out.println("first= " + list2.first() +
                                    "\tlast= " + list2.last() + "\tsize= " + list2.size());
                            break;
                        case 2:
                            System.out.print("input name");
                            list2.addLast(in.next());
                            System.out.println("first= " + list2.first() +
                                    "\tlast= " + list2.last() + "\tsize= " + list2.size());
                            break;
                        case 3:
                            System.out.println("deleted name= " + list2.removeFirst());
                            System.out.println("first= " + list2.first() +
                                    "\tlast= " + list2.last() + "\tsize= " + list2.size());
                            break;
                        case 4:
                            list2.rotate();
                            System.out.println("first= " + list2.first() +
                                    "\tlast= " + list2.last() + "\tsize= " + list2.size());
                            break;
                        case 0:
                            System.exit(0);
                    }
                    break;

                case 3:
                    if (list2.equals(list1,list2) && list1.equals ( list1,list2 ))
                        System.out.println("The 2 Lists are equal ");
                    else{
                        System.out.println("The 2 Lists are not equal");
                        System.out.println (list1.equals(list1,list2) );
                        System.out.println (list2.equals(list1,list2) );
                    }
                    break;
            }
        }
    }
}
