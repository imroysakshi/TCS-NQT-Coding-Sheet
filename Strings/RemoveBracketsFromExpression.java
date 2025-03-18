public class RemoveBracketsFromExpression {

    static void removeBrackets(String s){
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)==')')
                continue;
            else
                ans.append(s.charAt(i));
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "(((a-b))+c)";
        removeBrackets(s);
     }
}
