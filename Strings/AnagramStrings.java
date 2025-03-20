import java.util.HashMap;

public class AnagramStrings {

    static boolean checkIfAnagram(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2)
          return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n1;i++){
            hm.put(s1.charAt(i),hm.getOrDefault(s1.charAt(i), 0)+1);
        }

        for(int i=0;i<n1;i++){
            hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0)-1);
        }

        for(var entry: hm.entrySet()){
                if(entry.getValue()>0)
                   return false;
        }
        return true;

    }
    public static void main(String[] args) {
        // String s = "Take u forward is Awesome";
        String s1 = "race";
        String s2 = "care";
       System.out.println(checkIfAnagram(s1,s2)); 
    }
}
