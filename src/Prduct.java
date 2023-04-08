import java.util.Scanner;

public class Prduct {
    public static void main(String[] args){
        int year;
        System.out.println("Please give the year :");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if((year % 4 == 0) && (year % 100!=0) || (year % 400 ==0)){
            System.out.println("This year is leap year");
        }else{
            System.out.println("This year is not leap year");
        }



    }
}
