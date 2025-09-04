import java.util.Scanner;

public class deleteArray{
    static int[] delete(int[] arr,int index,int size){
        for(int i=index;i<size;i++){
            arr[i]=arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args){
      
    }
}