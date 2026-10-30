import java.util.Scanner;
public class Calculator{
    int a;
    int b;
    Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        System.out.println("Addition:"+(a+b));
    }
    void sub(){
        System.out.println("Subtraction:"+(a-b));
    }
    void mul(){
        System.out.println("Multiplication:"+(a*b));
    }
    void div(){
        System.out.println("Division:"+(a/b));
    }
    public static void main(String[] args){
        Calculator c=new Calculator(20,10);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
    