import java.util.*;
class Arrayinput2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scan.nextInt();
        int mark[]=new int[n];
        for(int i=0;i<mark.length;i++){
            System.out.println("Enter the "+i+" index number");
            mark[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(mark));
    }
}