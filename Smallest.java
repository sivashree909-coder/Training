import java.util.*;
class Smallest{
    public static void main(String[] args){
        int arr[]={7,8,15,17,91,15,1};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
        }
    }
      