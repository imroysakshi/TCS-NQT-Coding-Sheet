public class SumOfNumInString {

    static int sumOfNum(String s){
        // StringBuilder temp=new StringBuilder();
        int sum=0;
        for(int i=0;i<s.length();i++){
             int n=s.length();
            if (Character.isDigit(s.charAt(i))) { 
                int num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++; 
                }
                sum += num; 
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s1 = "123xyz";
        String s2="1xyz23";
        String s3="xy23asdfg45iiii6p";
        System.out.println(sumOfNum(s1));
        System.out.println(sumOfNum(s2));
        System.out.println(sumOfNum(s3));
    }
}
