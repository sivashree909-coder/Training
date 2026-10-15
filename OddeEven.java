import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=n;i++){
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