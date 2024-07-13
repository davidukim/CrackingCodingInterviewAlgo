import java.util.HashMap;

public class PalinPermu {
    
    
    public boolean isPalinPermu(String strToCheck){
        HashMap<Character, Integer> occurrences = new HashMap<>();  // HashMap to hold number of character occurrences
        String filteredStr = strToCheck.replaceAll("[^a-zA-Z]", "").toLowerCase();
        boolean hasOddVal = false;

        for (int i = 0; i < filteredStr.length(); i ++){    // record the occurences in the map 
            char charAtIndex = filteredStr.charAt(i);
            occurrences.put(charAtIndex, occurrences.getOrDefault(charAtIndex, 0) + 1);
        }

        if (filteredStr.length()%2==0){ // if even string, all keys should have even values
            for (Integer value : occurrences.values()){
                if (!(value%2==0)) return false;
            }
        } else{ // if odd, only one key can have odd value
            for (Integer value : occurrences.values()){
                if (hasOddVal) return false;    // return false, when already one odd count of value exists
                if (!(value%2==0)) hasOddVal = true;
            }
        }

        return true;
    }
}
