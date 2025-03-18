public class RemoveAllVowelFromStr {

    static void removeVowel(String s){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                continue;
            else
                ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "Take u forward is Awesome";
        removeVowel(s);
    }
}
