

class Main {
    public static void main(String[] args) {
        int[] arr={12,1,32,431,56};
       // Solivng by cunting the digits
        int count=0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int n=0;
            while(num>0){
                n++;
                num=num/10;
                
            }
            if(n%2==0){
                count++;
            }
      
    }
    System.out.println(count);
    // Now Using String
    int count2=0;
    for(int i=0;i<arr.length;i++){
        String str=String.valueOf(arr[i]);
        if(str.length()%2==0){
            count2++;
        }
    }
    System.out.println(count2);
    
}
}