import java.util.HashMap;

class Solution {
//    public static char mostFrequentChar (String s) {
//
//      if(s.isBlank()){return ' ';}
//
//      HashMap<Character,Integer> counter = new HashMap<>();
//      char mostFreqChar = s.charAt(0);
//
//      int mostFreqTime = 1;
//
//      for(char c: s.toCharArray()){
//          counter.put(c,(counter.getOrDefault(c,0))+1);
//
//          if(counter.get(c)>mostFreqTime){
//              mostFreqChar = c;
//              mostFreqTime = counter.get(c);
//          }
//
//          else if(counter.get(c).equals(counter.get(mostFreqChar))){
//              mostFreqChar = s.charAt(Math.min(s.indexOf(c),s.indexOf(mostFreqChar)));
//          }
//      }
//
//
//      return mostFreqChar;
//    }

    public static char mostFrequentChar (String s) {

        if(s.isBlank()){return ' ';}

        HashMap<Character,Integer> counter = new HashMap<>();
        char mostFreqChar = s.charAt(0);

        int mostFreqTime = 1;

        for(char c: s.toCharArray()){
            counter.put(c,(counter.getOrDefault(c,0))+1);

            if(counter.get(c)>=mostFreqTime){
                mostFreqChar = c;
                mostFreqTime = counter.get(c);
            }


        }


        return mostFreqChar;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("boookeeper")); // -> 'e'
        System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
    }

  }
