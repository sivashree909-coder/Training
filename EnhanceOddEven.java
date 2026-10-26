class EnhanceOddEven{
    public static void main(String[] args){
        int max=Integer.MAX_VALUE;
        int arr[]={5,4,3,2,1};
        int sum=0;
        int even=0;
        int odd=0;
        for(int i:arr){
            sum+=i;
            if(i%2==0)
            {
                even=even+i;
            }
            else
            {
                odd=odd+i;
             }
         }
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);
    }
}