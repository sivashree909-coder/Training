import java.util.*;
public class StudentOops {
        String name;
    String department;
    int mark1;
    int mark2;
    void displayName(){
        System.out.println("Name:"+name);
    }
    void displaydepartment(){
        System.out.println("Department:"+department);
    }
    int totalMark(){
        return mark1+mark2;
    }

        public static void main(String[] args) {
        StudentOops s = new StudentOops();
        s.name = "Shree";
        s.department = "CSE";
        s.mark1 = 90;
        s.mark2 = 95;

        s.displayName();
        s.displaydepartment();
       int mark= s.totalMark();
         System.out.println("Mark:"+mark);
        }
}
