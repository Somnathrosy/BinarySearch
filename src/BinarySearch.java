import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int Is_Found(int[]array,int low,int high,int target){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if (array[mid]==target)
            return mid;
        else if(array[mid]<target)
            return Is_Found(array,mid+1,high,target);
        else
            return Is_Found(array,low,mid-1,target);
    }

    public static int search(int[]arr,int target){
        return Is_Found(arr,0, arr.length-1,target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[]{3,6,8,9,22,55,77,88,96};
        System.out.println("The given array "+ Arrays.toString(arr));
        System.out.println("Enter the Target Element ");
        int target = scanner.nextInt();
        int ans = search(arr,target);
        if(ans==-1)
            System.out.println("The Element is not Found in the Array");
        else
            System.out.println("The index of the "+target+" is found at "+ ans +" Index");
    }
}
