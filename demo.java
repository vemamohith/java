class demo{
    public static void display(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +"  ");
    }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        int left=0, right=arr.length-1;        
        display(arr);  
        while(left < right){
         int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
         left++;
         right--;
        }
        System.out.println("\n");
        display(arr);
        int sum=0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                sum = sum+arr[i];
                
            }
        }
        System.out.println("\nsum "+ sum);
    }
}