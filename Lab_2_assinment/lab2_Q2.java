package Lab_2_assinment;

import java.util.Arrays;

/**
 *** Created by Ahmed Al masadi on 19/01/2022.
 */
public class lab2_Q2 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("normal array :\n"+ Arrays.toString(arr));
        System.out.println("backup array :\n"+ Arrays.toString(backup_array(arr)));
    }
    public static int [] backup_array(int arr[]){
        int backup[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            backup[i]=arr[i];
        }
        return backup;
    }

}
