import java.util.Scanner;
import java.util.Arrays;
public class binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number for index "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element");
        int target=sc.nextInt();
       
        int result=binarySearch(arr,target);
        if(result==-1){
            System.out.println("Number not found");

        }else{
            System.out.println("Number "+target+" found at index "+result);
        }
        sc.close();



    }
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;

        

    }
    

}
