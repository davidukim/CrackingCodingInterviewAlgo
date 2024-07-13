public class Main {
    public static void main(String[] args) {
        String myStr = "aabccccaaa";
        String myStr2 = "abc";
        String myStr3 = "abba";

        StrCompress strComp = new StrCompress();
        StrCompress strComp2 = new StrCompress();
        StrCompress strComp3 = new StrCompress();

        System.out.println(strComp.strComp(myStr)); 
        System.out.println(strComp2.strComp(myStr2));
        System.out.println(strComp3.strComp(myStr3));
    }
}
