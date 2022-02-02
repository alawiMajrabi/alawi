package lab_3;

import java.util.Scanner;

/**
 * Created by user on 25/01/2022.
 */
public class TestSinglyList {
    public static void main(String[] args) {
        SinglyLinkedList<String> numList=new SinglyLinkedList<>();
//        numList.addFrist(1);
//        numList.addLast(2);
//        numList.addFrist(0);
        Scanner in=new Scanner(System.in);

        System.out.println("size of list= "+numList.size());
        System.out.println("First element of first= "+numList.first());
        System.out.println("last element of list= "+numList.last());
        for (int i = 0; i <5 ; i++) {
            numList.addLast(in.next());

        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(numList.removeFirst()+"\t");

        }
        System.out.println("size of list= "+numList.size());
        System.out.println("First element of first= "+numList.first());
        System.out.println("last element of list= "+numList.last());



    }
}
