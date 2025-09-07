class Main {
    public static void main(String[] args) {
        int[][] arr={{20,12,32},{43,1,21},{22,31,22}};
        int max=0;
        int rich=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
                if(sum>max){
                    max=sum;
                    rich=i;
                }
            }
        }
        System.out.println(rich+1+" with "+max);
        
    }
}