import java.util.HashMap;

public class NonRepeatingCharacters {

    static void nonRepeatingChars(String s){
          HashMap<Character,Integer> hm=new HashMap<>();
          for(int i=0;i<s.length();i++){
              hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
          }
          
          for(var entry:hm.entrySet()){
            if(entry.getValue()<2){
                System.out.print(entry.getKey()+" ");
            }
          }
    }
    public static void main(String[] args) {
        // String s = "Take u forward is Awesome";
        String s = "race cars";
        nonRepeatingChars(s);
    }
}
