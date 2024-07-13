import java.util.HashMap;

public class IsUnique{
    public boolean checkUnique(String strToCheck){
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < strToCheck.length(); i ++){
            char c = strToCheck.charAt(i);  // c = character at 'i'th index
            int cnt = frequency.getOrDefault(c, 0) + 1;
            frequency.put(c, cnt);
            if (cnt > 1){   //If at anypoint frequency value is more than 1, meaning multiple encounter
                return false;
            }
        }

        return true;
    }
}