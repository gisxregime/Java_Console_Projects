import java.util.Arrays;
import java.util.Scanner;

public class selection {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        displaySelection(5,2,8,32,15);
    }

    public static void displaySelection(int... arr){
        for(int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void displayInsertion(int [] arr){
        f
        
    }
}