public class RemoveAllVowelFromStr {

    static void removeVowel(String s){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                continue;
            else
                ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "Sakshi Roy";
        removeVowel(s);
    }
}
