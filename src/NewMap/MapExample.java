package NewMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        System.out.println("Please Enter your key and value : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        HashMap<Integer,String> hashMap = new HashMap<>();
        for(int i = 0; i<value;i++){
            hashMap.put(i, sc.next());
        }
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("key : "+entry.getKey()+"\t"+"Value : "+entry.getValue());

        }
    }
}
