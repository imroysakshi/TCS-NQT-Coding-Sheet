public class CountInString {

    static void countChars(String s){
         int vowels=0;
         int consonants=0;
         int wSpace=0;
         String str=s.toLowerCase();
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
              vowels++;
            else if(s.charAt(i)==' ')
              wSpace++;
            else 
              consonants++;
         }
         System.out.println("Vowels: "+vowels);
         System.out.println("Consonants: "+consonants);
         System.out.println("White Spaces: "+wSpace);
    } 
    public static void main(String[] args) {
        String s = "Take u forward is Awesome";
        // String s = "race cars";
        countChars(s);
    }
}
