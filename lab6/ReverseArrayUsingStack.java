import java.util.Arrays;

/**
 * Created by user on 11/01/20.
 */
public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[]a={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        LinkedStack<Integer>s= new LinkedStack<>();
        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
          a[i]=  s.pop();
        }
        System.out.println("after reverse");
        System.out.println(Arrays.toString(a));

    }
}
