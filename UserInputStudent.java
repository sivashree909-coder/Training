import java.util.Scanner;
public class UserInputStudent{
    String name;
    String department;
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.println("Name:"+name);
        String department=scan.nextLine();
         System.out.println("department:"+department);
    }
}