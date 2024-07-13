public class IsUnique{
    public boolean checkUnique(String strCheck){
        boolean[] checkExist = new boolean[258];

        for (int i = 0; i < strCheck.length(); i ++){
            if (checkExist[(int)strCheck.charAt(i)]){   //if exists in the ascii array
                return false;
            }
            checkExist[(int)strCheck.charAt(i)] = true; //update as seen
        }
        return true;
    }
}