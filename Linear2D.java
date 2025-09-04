import java.util.Scanner;

class linear{
    static int[] search(int[][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
public class Linear2D{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the values for index row "+i+" and "+j );
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int[] result=linear.search(arr,target);
        if(result[0]==-1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number "+target+" found at "+result[0]+","+result[1]);
        }
        sc.close();
        
    }
}