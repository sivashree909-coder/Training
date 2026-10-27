import java.util.Scanner;
class Count{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int arr[]={10,20,10,40,20,20,10};
        int key=scan.nextInt();
        int count=0;
        for(int i:arr){
            if(i==key){
                count++;
    
            }
        }
        System.out.println(count);
    }
}
    