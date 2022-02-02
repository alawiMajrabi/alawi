import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by user on 12/01/2022.
 */
public class Management {
    public static void main(String[] args) {
        Student [] team=new Student[3];
//        Student s1=new Student(1,"Ahmed");
//        team[0]=s1;
//        Student s2=new Student(2,"Mohammed");
//        team[1]=s2;
//        Student s3=new Student(3,"Asseel");
//        team[2]=s3;


        Scanner in=new Scanner(System.in);
        for (int i = 0; i <team.length ; i++) {
            Student s=new Student(in.nextInt(),in.next());
            team[i]=s;

        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i]);

        }
    }

}
