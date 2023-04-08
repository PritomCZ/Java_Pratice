import java.util.Scanner;

public class Pratice {
    public static void main(String[] args){
       int x;
       int i = 1;
        System.out.println("Enter any number");
        Scanner num = new Scanner(System.in);
        x = num.nextInt();

        while(i<x){
            System.out.println("the number is :"+i);
            ++i;
        }
    }
}
