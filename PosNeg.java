import java.util.Scanner;
public class PosNeg{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the a value:");
int a=sc.nextInt();
if(a>0){
System.out.println("a is positive");
}else if(a==0){
System.out.println("0 is neither positive nor negative");
}else{
System.out.println("a is negative");
}
}
}