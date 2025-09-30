package practice.Basicjava;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args){
        Scanner perc = new Scanner(System.in);
        System.out.print("enter the marks of subject 1");
        int marks = perc.nextInt();
        System.out.print("enter the marks of subject 2");
        int marks1 = perc.nextInt();
        System.out.print("enter the marks of subject 3");
        int marks2 = perc.nextInt();
        System.out.print("enter the marks of subject 4");
        int marks3 = perc.nextInt();
        System.out.print("enter the marks of subject 5");
        int marks4 = perc.nextInt();
        System.out.print("enter the marks of subject 6");
        int marks5 = perc.nextInt();
        int total = marks + marks1 + marks2 + marks3 + marks4 + marks5;
        double average = total/6;

        System.out.print("the percentage is" + average);
        perc.close();
    }


}
