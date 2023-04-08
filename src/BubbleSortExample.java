import java.util.Scanner;

public class BubbleSortExample {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-1); j++){
                if(arr[j-1] >  arr[j]){

                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner cz = new Scanner(System.in);
        int arr[]= new int[7];
        System.out.println("Please enter 7 array number:");

        for(int i=0; i<arr.length; i++){
            arr[i] = cz.nextInt();
        }
        System.out.println();

        BubbleSortExample obj = new BubbleSortExample();
        obj.bubbleSort(arr);

        System.out.println("Array After Bubble Sort");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }
}
