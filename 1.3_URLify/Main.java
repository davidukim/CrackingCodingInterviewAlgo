import java.net.URL;

public class Main{
    public static void main(String[] args) {
        char[] myStr = "Mr Eagle I Eye            ".toCharArray();
        URLify urlifyClass =new URLify();

        System.out.println(urlifyClass.urlify(myStr, 14));
    }
}