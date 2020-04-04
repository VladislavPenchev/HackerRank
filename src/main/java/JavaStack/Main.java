package JavaStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            String[] inputArgs = input.split("");
            for (String element : inputArgs) {
                stack.push(element);
            }
        }

    }
}
