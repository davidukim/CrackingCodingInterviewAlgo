public class StrCompress{
    public String strComp(String str){
        int count = 0;
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            count ++; 
            if (i + 1 == str.length()){
                compressed.append(str.charAt(i)).append(count);
                break;
            }

            if (str.charAt(i) != str.charAt(i + 1)){
                compressed.append(str.charAt(i)).append(count);
                count = 0;
            }
        }

        return str.length() < compressed.toString().length() ? str : compressed.toString();
    }
}