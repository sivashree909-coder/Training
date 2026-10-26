import java.util.*;
class SecondSmallest{
    public static void main(String[] args){
        int arr[]={7,8,15,17,91,15,1};
        int min1=arr[0];
        int min2=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min1>arr[i]){
                min2=min1;
                min1=arr[i];
            }else if(min2<arr[i]){
                min2=arr[i];
            }
        }
        System.out.println(min2);
        }
    }
      