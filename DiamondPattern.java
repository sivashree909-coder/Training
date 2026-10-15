import java.util.Scanner;
public class DiamondPattern{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n= scan.nextInt();
int k=1;
int space=n/2;
for(int i=0;i<n;i++){
for(int j=0;j<space;j++){
System.out.print(" ");
}
for(int j=0;j<k;j++){
System.out.print("*"+" ");
}
k+=i<n/2?2:-2;
space+=i<n/2?-1:1;
System.out.println();
}
}
}
