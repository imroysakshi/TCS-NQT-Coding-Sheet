public class CapitalizeFstLastletter {

    static void capitalizeLetter(String s){      
        StringBuilder ans = new StringBuilder(s);
        // int n = s.length();
        for(int i=0;i<s.length();i++){
            if(ans.charAt(i)>=65 && ans.charAt(i)<=90) continue;
            if(i==0 && ans.charAt(i)!=' '||i!=0 && ans.charAt(i-1)==' '){
                   ans.setCharAt(i, (char) (ans.charAt(i)-32));
            }
            if(i==ans.length()-1||i!=0 && ans.charAt(i+1)==' '){
                if(ans.charAt(i)>=97 && ans.charAt(i)<=122)
                   ans.setCharAt(i, (char)(ans.charAt(i)-32));
            }
        }
        System.out.println(ans.toString());
    }
    public static void main(String[] args) {
        String s = "i am a Girl";
        String s2="how are you doinG";
        capitalizeLetter(s);
        capitalizeLetter(s2);
    }
}
