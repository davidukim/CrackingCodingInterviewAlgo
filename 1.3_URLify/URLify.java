public class URLify {
    
    public char[] urlify(char[] stringToConv, int trueLength){
        int newPointer = 0; 
        int spaceCount = 0;

        for (int i = 0; i < trueLength; i ++){  // count number of spaces
            if (stringToConv[i] == ' ') spaceCount++;
        }

        newPointer = trueLength - 1 + 2 * spaceCount;

        for (int i = trueLength - 1; i >= 0; i--){
            if (stringToConv[i] == ' '){
                stringToConv[newPointer] = '0';
                stringToConv[newPointer-1] = '2';
                stringToConv[newPointer-2] = '%';
                newPointer -= 3;
            } else{
                stringToConv[newPointer] = stringToConv[i];
                newPointer -= 1;
            }
        }
        
        return stringToConv; 
    }
}
