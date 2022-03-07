package Lab_2_assinment;


import java.util.Arrays;

/**
 *** Created by Ahmed Al masadi on 19/01/2022.
 */
public class lab2Q1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("Array before reversing :\n"+Arrays.toString(arr));
       reverse(arr,arr.length);

    }
    public static void reverse(int[] arr,int size) {
        int []arr2=new int[size];
        int j=size;
        for(int i=0;i<size;i++ ){
            arr2[j-1]=arr[i];
            j--;
        }
            System.out.println("Array after reversing : \n"+Arrays.toString(arr2));

    }
    }

