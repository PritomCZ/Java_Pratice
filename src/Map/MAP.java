package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MAP {
    public static void main(String[] args) {
        System.out.println("Please enter your key and value :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<Integer,String> hashMap = new HashMap<>();

        for(int i=0; i<num;i++){
            hashMap.put(i, sc.next());

        }
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("key : "+entry.getKey()+"\t"+"Value : "+entry.getValue());
        }
    }
}
