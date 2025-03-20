import java.util.HashMap;

public class FrequencyCalculation {

    static void frequencyOfCharacters(String s){
          HashMap<Character,Integer> hm=new HashMap<>();
          for(int i=0;i<s.length();i++){
               if(s.charAt(i)==' ')
                  continue;
               hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
          }
          System.out.println(hm);

    }
    public static void main(String[] args) {
        String s = "Take u forward is Awesome";
        // String s = "race cars";
        frequencyOfCharacters(s);
    }
}
