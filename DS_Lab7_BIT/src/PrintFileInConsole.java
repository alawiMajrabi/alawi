import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by user on 14/01/20.
 */
public class PrintFileInConsole {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedQueue<String>q= new LinkedQueue<>();
        Scanner in = new Scanner(System.in);
        System.out.println("input file path to print");
        for (int i = 0; i <3 ; i++) {
            q.enqueue(in.next());
        }
        while (!q.isEmpty())
        {
           Scanner fileScanner= new Scanner(new File(q.dequeue()));
            while (fileScanner.hasNextLine())
            {
                System.out.println(fileScanner.nextLine());
            }
        }
    }
}
