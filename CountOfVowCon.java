class CountOfVowCon {
    public static void main(String[] args) {
        String s="HelloWorld";
            int vow=0;
            int consonants=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vow++; 
                }else{
                    consonants++;
                }
            }
        System.out.println("vowels:"+vow);
        System.out.println("Consonants:"+consonants);
    }
}