public class RemoveSpaces {

    static void removeSpaces(String s){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                 ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "I am a Girl";
        String s2="How are you doing";
        removeSpaces(s);
        removeSpaces(s2);
    }
}
