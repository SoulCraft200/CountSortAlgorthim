import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter the list size: ");
        int len = user.nextInt();
        int[] list = new int[len];
        for (int i = 0 ; i<list.length;i++){
            list[i] = rand.nextInt(1,len);
        }
        //System.out.println("Original list: "+ Arrays.toString(list));
        long time0 = System.currentTimeMillis();
        Steps(list);
        long time1 = System.currentTimeMillis();
        System.out.println(time1-time0);

    }
    public static void Steps(int[] list){
        int[] tempList = new int[list.length+1];
        for(int i : list){
            tempList[i] += 1;
        }
        for(int i = 0,j=0; i<list.length;i++){
            while (tempList[i] != 0){
                list[j]= i;
                j++;
                tempList[i]--;
            }
        }
    }
}
