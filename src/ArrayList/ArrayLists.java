package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("Please tell number of item you add :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<String> item = new ArrayList<>();

        for(int i=0; i<num; i++){
            item.add(sc.next());

        }
        for(String itm : item){
            System.out.println(itm);

        }
        System.out.println(item.get(0));
    }
}
