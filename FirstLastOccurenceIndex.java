import java.util.*;
class FirstLastOccurenceIndex{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int arr[]={10,20,30,40,20};
        int first=-1;
        int last=-1;
        int target=20;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                 if(first==-1){
                     first=i;
                 }
                last=i;
            }
        }
         System.out.println("first occurence:"+first);
         System.out.println("last occurence:"+last);
    }
}