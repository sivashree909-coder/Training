import java.util.Arrays;
class Anagrams{
    public static void main(String[] args) {
        String s="listen";
        String t="silent";
        char arr[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        String s1=new String(arr);
        String t1=new String(arr2);
        System.out.println(s1.equals(t1));
    }
}