package com.company.dataStructure;

import java.util.Arrays;

/**
 * Created by user on 19/01/2022.
 */
public class ArrayOpration {
    public static void main(String[] args) {
        int [] x={11,12,13,14,15};
        System.out.println(Arrays.toString(x));
//        System.out.println("after the reverse");
//        System.out.println(Arrays.toString(reverse(x)));
//        System.out.println("after the shiftLeft");
//        System.out.println(Arrays.toString(shiftLeft(x)));
        System.out.println("after the shiftright");
        System.out.println(Arrays.toString(shiftright(x)));


    }
    public static int[] shiftright(int[] a) {
        int t=a[a.length-1];

        for(int i=a.length-1;i>0;i-- ){
            a[i]=a[i-1];
        }
        a[0]=t;
        return a;
    }
    public static int[] shiftLeft(int[] a) {
        int t=a[0];

        for(int i=0;i<a.length/2;i++ ){
           a[i]=a[i+1];
        }
        a[a.length-1]=t;
        return a;
    }

    public static int[] reverse(int[] a) {
        int b;
        int n=a.length-1;
        for(int i=0;i<a.length/2;i++ ){
            b=a[i];
            a[i]=a[n];
            a[n]=b;
            n--;
        }
        return a;
    }

}
