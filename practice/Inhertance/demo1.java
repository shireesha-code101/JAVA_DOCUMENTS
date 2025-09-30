package practice.Inhertance;

import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        Scanner demo = new Scanner(System.in);
        int n = demo.nextInt();

        if (n % 2 != 0) {
            System.out.println("weird");
        }
        if (n % 2 == 0) {
            if (n > 2 && n < 5) {
                System.out.print("Not Weird");
            } else if (n > 6 && n < 20) {
                System.out.print("weird");
            } else if (n > 20) {
                System.out.println("not weird");

            }
        }

    }
}
