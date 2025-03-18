public class RemoveCharsExceptAlphabet {

    static void removeChars(String s){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
               ans.append(s.charAt(i));
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
               ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "I am a Girl";
        removeChars(s);
    }
}
