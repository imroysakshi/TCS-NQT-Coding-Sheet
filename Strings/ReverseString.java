public class ReverseString {

    static void reverse(String s){
        StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "I am a Girl";
        reverse(s);
    }
}
